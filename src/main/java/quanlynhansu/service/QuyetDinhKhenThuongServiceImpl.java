package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.model.dto.QuyetDinhKhenThuongDTO;
import quanlynhansu.model.entity.Quyetdinhkhenthuong;
import quanlynhansu.repository.IQuyetDinhKhenThuongRepository;

@Service
@Transactional(rollbackFor = Throwable.class)
public class QuyetDinhKhenThuongServiceImpl implements
		IQuyetDinhKhenThuongService {
	@Autowired
	private IQuyetDinhKhenThuongRepository repo;
	@Autowired
	protected DozerBeanMapper mapper;

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
	public void delete(Integer id) {
		repo.delete(id);
	}

	@Override
	public QuyetDinhKhenThuongDTO getById(Integer id) {
		Quyetdinhkhenthuong entity = repo.findOne(id);
		QuyetDinhKhenThuongDTO dto = mapper.map(entity,
				QuyetDinhKhenThuongDTO.class);
		dto.setNgayKy(entity.getNgayKy());
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
			entity = repo.findOne(dto.getPk());
		}
		mapper.map(dto, entity);
		return repo.save(entity);
	}
}
