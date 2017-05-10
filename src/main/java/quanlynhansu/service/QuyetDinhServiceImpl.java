package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.model.dto.LoaiQuyetDinhDTO;
import quanlynhansu.model.dto.QuyetDinhDTO;
import quanlynhansu.model.entity.Quyetdinh;
import quanlynhansu.repository.IQuyetDinhRepository;

@Service
@Transactional(rollbackFor = Throwable.class)
public class QuyetDinhServiceImpl implements IQuyetDinhService {
	@Autowired
	private IQuyetDinhRepository repo;
	@Autowired
	protected DozerBeanMapper mapper;

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
	public void delete(Integer id) {
		repo.delete(id);
	}

	@Override
	public QuyetDinhDTO getById(Integer id) {
		Quyetdinh entity = repo.findOne(id);
		QuyetDinhDTO dto = mapper.map(entity, QuyetDinhDTO.class);
		dto.setNgayKy(entity.getNgayKy());
		dto.setTuNgay(entity.getTuNgay());
		dto.setDenNgay(entity.getDenNgay());
		return dto;
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
			entity = repo.findOne(dto.getPk());
		}
		mapper.map(dto, entity);
		return repo.save(entity);
	}
}
