package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.model.dto.LoaiQuyetDinhDTO;
import quanlynhansu.model.dto.QuyetDinhDTO;
import quanlynhansu.model.entity.Canbo;
import quanlynhansu.model.entity.Donvichucnang;
import quanlynhansu.model.entity.Loaiquyetdinh;
import quanlynhansu.model.entity.Quyetdinh;
import quanlynhansu.repository.ICanBoRepository;
import quanlynhansu.repository.IDonViChucNangRepository;
import quanlynhansu.repository.ILoaiQuyetDinhRepository;
import quanlynhansu.repository.IQuyetDinhRepository;

@Service
@Transactional(rollbackFor = Throwable.class)
public class QuyetDinhServiceImpl implements IQuyetDinhService {
	@Autowired
	private IQuyetDinhRepository repo;
	@Autowired
	protected DozerBeanMapper mapper;
	@Autowired
	private IDonViChucNangService donViChucNangService;
	@Autowired
	private IDonViChucNangRepository donViChucNangRepo;
	@Autowired
	private ICanBoRepository canBoRepo;
	@Autowired
	private ILoaiQuyetDinhRepository loaiQuyetDinhRepo;

	@Override
	public ArrayList<QuyetDinhDTO> getAll() {
		ArrayList<QuyetDinhDTO> ketqua = new ArrayList<>();

		Iterable<Quyetdinh> listFromDb = repo.findAll();

		for (Quyetdinh d : listFromDb) {
			DonViChucNangDTO donViChucNangDto = mapper.map(d.getDonvichucnang(), DonViChucNangDTO.class);
			CanBoDTO canBoDto = mapper.map(d.getCanbo(), CanBoDTO.class);
			LoaiQuyetDinhDTO loaiQuyetDinhDTO = mapper.map(d.getLoaiquyetdinh(), LoaiQuyetDinhDTO.class);
			QuyetDinhDTO QuyetDinhDTO = mapper.map(d, QuyetDinhDTO.class);
			QuyetDinhDTO.setDonViChucNang(donViChucNangDto);
			QuyetDinhDTO.setCanBo(canBoDto);
			QuyetDinhDTO.setLoaiQuyetDinh(loaiQuyetDinhDTO);
			QuyetDinhDTO.setNgayKy(d.getNgayKy());
			QuyetDinhDTO.setTuNgay(d.getTuNgay());
			QuyetDinhDTO.setDenNgay(d.getDenNgay());
			ketqua.add(QuyetDinhDTO);
		}
		return ketqua;
	}

	@Override
	public void delete(Integer id , Integer version) {
		Quyetdinh entity = new Quyetdinh();
		entity = repo.findOneByPkAndVersion(id, version);
		if(entity == null){
			throw new OptimisticLockingFailureException("Concurrent update error");
		}
		repo.delete(id);
	}

	@Override
	public QuyetDinhDTO getById(Integer id) {
		Quyetdinh entity = repo.findOne(id);
		DonViChucNangDTO donViChucNangDto = mapper.map(entity.getDonvichucnang(), DonViChucNangDTO.class);
		donViChucNangDto.setCanBo(donViChucNangService.getCanBoByDonViChucNang(donViChucNangDto.getPk()));
		LoaiQuyetDinhDTO loaiQuyetDinhDto = mapper.map(entity.getLoaiquyetdinh(), LoaiQuyetDinhDTO.class);
		QuyetDinhDTO quyetDinhDto = mapper.map(entity, QuyetDinhDTO.class);
		quyetDinhDto.setDonViChucNang(donViChucNangDto);
		quyetDinhDto.setLoaiQuyetDinh(loaiQuyetDinhDto);
		quyetDinhDto.setNgayKy(entity.getNgayKy());
		quyetDinhDto.setTuNgay(entity.getTuNgay());
		quyetDinhDto.setDenNgay(entity.getDenNgay());
		if (entity.getCanbo() != null) {
			CanBoDTO canDto = mapper.map(entity.getCanbo(), CanBoDTO.class);
			quyetDinhDto.setCanBo(canDto);
		}
		return quyetDinhDto;
	}

	@Override
	public QuyetDinhDTO update(QuyetDinhDTO t) {
		addOrUpdate(t);
		return t;
	}

	@Override
	public QuyetDinhDTO insert(QuyetDinhDTO t) {
		addOrUpdate(t);
		return t;
	}

	private Quyetdinh addOrUpdate(QuyetDinhDTO dto) {
		Quyetdinh entity = new Quyetdinh();
		if (dto.getPk() != null && dto.getPk().intValue() != -1) {
			entity = repo.findOneByPkAndVersion(dto.getPk(), dto.getVersion());
			if (entity == null) {
				throw new OptimisticLockingFailureException("Concurrent update error");
			}
		}
		mapper.map(dto, entity);
		if (dto.getDonViChucNang() != null) {
			Donvichucnang donViChucNangEntity = donViChucNangRepo.findOne(dto.getDonViChucNang().getPk());
			entity.setDonvichucnang(donViChucNangEntity);
		}
		if (dto.getCanBo() != null) {
			Canbo canBoEntity = canBoRepo.findOne(dto.getCanBo().getPk());
			entity.setCanbo(canBoEntity);
		}
		if(dto.getLoaiQuyetDinh() != null){
			Loaiquyetdinh loaiquyetdinhEntity = loaiQuyetDinhRepo.findOne(dto.getLoaiQuyetDinh().getPk());
			entity.setLoaiquyetdinh(loaiquyetdinhEntity);
		}
		return repo.save(entity);
	}
}
