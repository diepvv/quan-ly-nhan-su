package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.model.dto.QuyetDinhKyLuatDTO;
import quanlynhansu.model.entity.Quyetdinhkyluat;
import quanlynhansu.repository.IQuyetDinhKyLuatRepository;

@Service
@Transactional(rollbackFor = Throwable.class)
public class QuyetDinhKyLuatServiceImpl implements IQuyetDinhKyLuatService {
	@Autowired
	private IQuyetDinhKyLuatRepository repo;
	@Autowired
	protected DozerBeanMapper mapper;

	@Override
	public ArrayList<QuyetDinhKyLuatDTO> getAll() {
		ArrayList<QuyetDinhKyLuatDTO> ketqua = new ArrayList<>();

		Iterable<Quyetdinhkyluat> listFromDb = repo.findAll();

		for (Quyetdinhkyluat d : listFromDb) {
			DonViChucNangDTO donViChucNangDto = mapper.map(
					d.getDonvichucnang(), DonViChucNangDTO.class);
			CanBoDTO canBoDto = mapper.map(d.getCanbo(), CanBoDTO.class);

			QuyetDinhKyLuatDTO QuyetDinhKyLuatDTO = mapper.map(d,
					QuyetDinhKyLuatDTO.class);

			QuyetDinhKyLuatDTO.setDonViChucNang(donViChucNangDto);
			QuyetDinhKyLuatDTO.setCanBo(canBoDto);
			QuyetDinhKyLuatDTO.setNgayKy(d.getNgayKy());
			QuyetDinhKyLuatDTO.setTuNgay(d.getTuNgay());
			QuyetDinhKyLuatDTO.setDenNgay(d.getDenNgay());
			ketqua.add(QuyetDinhKyLuatDTO);
		}
		return ketqua;
	}

	@Override
	public void delete(Integer id) {
		repo.delete(id);
	}

	@Override
	public QuyetDinhKyLuatDTO getById(Integer id) {
		Quyetdinhkyluat entity = repo.findOne(id);
		QuyetDinhKyLuatDTO dto = mapper.map(entity, QuyetDinhKyLuatDTO.class);
		dto.setNgayKy(entity.getNgayKy());
		dto.setTuNgay(entity.getTuNgay());
		dto.setDenNgay(entity.getDenNgay());
		return dto;
	}

	@Override
	public QuyetDinhKyLuatDTO update(QuyetDinhKyLuatDTO t) {
		addOrUpdate(t);
		return t;
	}

	@Override
	public QuyetDinhKyLuatDTO insert(QuyetDinhKyLuatDTO t) {
		addOrUpdate(t);
		return t;
	}

	private Quyetdinhkyluat addOrUpdate(QuyetDinhKyLuatDTO dto) {
		Quyetdinhkyluat entity = new Quyetdinhkyluat();

		if (dto.getPk() != null && dto.getPk().intValue() != -1) {
			entity = repo.findOne(dto.getPk());
		}
		mapper.map(dto, entity);
		return repo.save(entity);
	}
}
