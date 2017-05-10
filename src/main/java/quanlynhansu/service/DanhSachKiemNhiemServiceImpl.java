package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.dto.DanhSachKiemNhiemDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.model.entity.Danhsachkiemnhiem;
import quanlynhansu.repository.IDanhSachKiemNhiemRepository;

@Service
@Transactional(rollbackFor = Throwable.class)
public class DanhSachKiemNhiemServiceImpl implements IDanhSachKiemNhiemService {
	@Autowired
	private IDanhSachKiemNhiemRepository repo;
	@Autowired
	protected DozerBeanMapper mapper;

	@Override
	public ArrayList<DanhSachKiemNhiemDTO> getAll() {
		ArrayList<DanhSachKiemNhiemDTO> ketqua = new ArrayList<>();

		Iterable<Danhsachkiemnhiem> listFromDb = repo.findAll();

		for (Danhsachkiemnhiem d : listFromDb) {
			DonViChucNangDTO donViChucNangDto = mapper.map(d.getDonvichucnang(), DonViChucNangDTO.class);
			CanBoDTO canBoDTO = mapper.map(d.getCanbo(), CanBoDTO.class);
			DanhSachKiemNhiemDTO danhSachKiemNhiemDto = mapper.map(d, DanhSachKiemNhiemDTO.class);
			danhSachKiemNhiemDto.setDonViChucNang(donViChucNangDto);
			danhSachKiemNhiemDto.setCanBo(canBoDTO);
			danhSachKiemNhiemDto.setTuNgay(d.getTuNgay());
			danhSachKiemNhiemDto.setDenNgay(d.getDenNgay());
			ketqua.add(danhSachKiemNhiemDto);
		}
		return ketqua;
	}

	@Override
	public void delete(Integer id) {
		repo.delete(id);
	}

	@Override
	public DanhSachKiemNhiemDTO getById(Integer id) {
		Danhsachkiemnhiem entity = repo.findOne(id);
		DanhSachKiemNhiemDTO dto = mapper.map(entity, DanhSachKiemNhiemDTO.class);
		dto.setTuNgay(entity.getTuNgay());
		dto.setDenNgay(entity.getDenNgay());
		return dto;
	}

	@Override
	public DanhSachKiemNhiemDTO update(DanhSachKiemNhiemDTO t) {
		addOrUpdate(t);
		return t;
	}

	@Override
	public DanhSachKiemNhiemDTO insert(DanhSachKiemNhiemDTO t) {
		addOrUpdate(t);
		return t;
	}

	private Danhsachkiemnhiem addOrUpdate(DanhSachKiemNhiemDTO dto) {
		Danhsachkiemnhiem entity = new Danhsachkiemnhiem();

		if (dto.getPk() != null && dto.getPk().intValue() != -1) {
			entity = repo.findOne(dto.getPk());
		}
		mapper.map(dto, entity);
		return repo.save(entity);
	}
}
