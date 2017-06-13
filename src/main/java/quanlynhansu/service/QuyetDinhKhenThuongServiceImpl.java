package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.model.dto.QuyetDinhKhenThuongDTO;
import quanlynhansu.model.entity.Canbo;
import quanlynhansu.model.entity.Donvichucnang;
import quanlynhansu.model.entity.Quyetdinhkhenthuong;
import quanlynhansu.repository.ICanBoRepository;
import quanlynhansu.repository.IDonViChucNangRepository;
import quanlynhansu.repository.IQuyetDinhKhenThuongRepository;

@Service
@Transactional(rollbackFor = Throwable.class)
public class QuyetDinhKhenThuongServiceImpl implements
		IQuyetDinhKhenThuongService {
	@Autowired
	private IQuyetDinhKhenThuongRepository repo;
	@Autowired
	protected DozerBeanMapper mapper;
	@Autowired
	private IDonViChucNangService donViChucNangService;
	@Autowired
	private IDonViChucNangRepository donViChucNangRepo;
	@Autowired
	private ICanBoRepository canBoRepo;

	@Override
	public ArrayList<QuyetDinhKhenThuongDTO> getAll() {
		ArrayList<QuyetDinhKhenThuongDTO> ketqua = new ArrayList<>();
		Iterable<Quyetdinhkhenthuong> listFromDb = repo.findAll();

		for (Quyetdinhkhenthuong d : listFromDb) {
			DonViChucNangDTO donViChucNangDto = mapper.map(
					d.getDonvichucnang(), DonViChucNangDTO.class);
			CanBoDTO canBoDto = mapper.map(d.getCanbo(), CanBoDTO.class);

			QuyetDinhKhenThuongDTO QuyetDinhKhenThuongDTO = mapper.map(d,
					QuyetDinhKhenThuongDTO.class);

			QuyetDinhKhenThuongDTO.setDonViChucNang(donViChucNangDto);
			QuyetDinhKhenThuongDTO.setCanBo(canBoDto);
			QuyetDinhKhenThuongDTO.setNgayKy(d.getNgayKy());

			ketqua.add(QuyetDinhKhenThuongDTO);
		}
		return ketqua;
	}

	@Override
	public void delete(Integer id, Integer version) {
		Quyetdinhkhenthuong entity = new Quyetdinhkhenthuong();
		entity = repo.findOneByPkAndVersion(id, version);
		if (entity == null) {
			throw new OptimisticLockingFailureException(
					"Concurrent update error");
		}
		repo.delete(id);
	}

	@Override
	public QuyetDinhKhenThuongDTO getById(Integer id) {
		Quyetdinhkhenthuong entity = repo.findOne(id);
		DonViChucNangDTO donViChucNangDto = mapper.map(
				entity.getDonvichucnang(), DonViChucNangDTO.class);
		donViChucNangDto.setCanBo(donViChucNangService
				.getCanBoByDonViChucNang(donViChucNangDto.getPk()));
		QuyetDinhKhenThuongDTO dto = mapper.map(entity,
				QuyetDinhKhenThuongDTO.class);
		dto.setDonViChucNang(donViChucNangDto);
		dto.setNgayKy(entity.getNgayKy());
		if (entity.getCanbo() != null) {
			CanBoDTO canDto = mapper.map(entity.getCanbo(), CanBoDTO.class);
			dto.setCanBo(canDto);
		}
		return dto;
	}

	@Override
	public QuyetDinhKhenThuongDTO update(QuyetDinhKhenThuongDTO t) {
		addOrUpdate(t);
		return t;
	}

	@Override
	public QuyetDinhKhenThuongDTO insert(QuyetDinhKhenThuongDTO t) {
		addOrUpdate(t);
		return t;
	}

	private Quyetdinhkhenthuong addOrUpdate(QuyetDinhKhenThuongDTO dto) {
		Quyetdinhkhenthuong entity = new Quyetdinhkhenthuong();

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
		return repo.save(entity);
	}
}
