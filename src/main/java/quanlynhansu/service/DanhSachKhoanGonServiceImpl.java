package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import quanlynhansu.model.dto.DanhSachKhoanGonDTO;
import quanlynhansu.model.entity.Danhsachkhoangon;
import quanlynhansu.repository.IDanhSachKhoanGonRepository;

@Component
public class DanhSachKhoanGonServiceImpl implements IDanhSachKhoanGonService {
	@Autowired
	private IDanhSachKhoanGonRepository repo;
	@Autowired
	protected DozerBeanMapper mapper;

	@Override
	public ArrayList<DanhSachKhoanGonDTO> getAll() {
		ArrayList<DanhSachKhoanGonDTO> ketqua = new ArrayList<>();

		Iterable<Danhsachkhoangon> listFromDb = repo.findAll();

		for (Danhsachkhoangon d : listFromDb) {
			ketqua.add(mapper.map(d, DanhSachKhoanGonDTO.class));
		}
		return ketqua;
	}

	@Override
	public void delete(Integer id) {
		repo.delete(id);
	}

	@Override
	public DanhSachKhoanGonDTO getById(Integer id) {
		Danhsachkhoangon entity = repo.findOne(id);
		return mapper.map(entity, DanhSachKhoanGonDTO.class);
	}

	@Override
	public DanhSachKhoanGonDTO update(DanhSachKhoanGonDTO t) {
		addOrUpdate(t);
		return t;
	}

	@Override
	public DanhSachKhoanGonDTO insert(DanhSachKhoanGonDTO t) {
		addOrUpdate(t);
		return t;
	}

	private Danhsachkhoangon addOrUpdate(DanhSachKhoanGonDTO dto) {
		Danhsachkhoangon entity = new Danhsachkhoangon();

		if (dto.getPk() != null && dto.getPk().intValue() != -1) {
			entity = repo.findOne(dto.getPk());
		}
		mapper.map(dto, entity);
		return repo.save(entity);
	}
}
