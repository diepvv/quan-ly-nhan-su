package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import quanlynhansu.model.dto.BacLuongDTO;
import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.dto.DanhSachThamNienDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.model.entity.Danhsachthamnien;
import quanlynhansu.repository.IDanhSachThamNienRepository;

@Service
@Transactional(rollbackFor = Throwable.class)
public class DanhSachThamNienServiceImpl implements IDanhSachThamNienService {
	@Autowired
	private IDanhSachThamNienRepository repo;
	@Autowired
	protected DozerBeanMapper mapper;

	@Override
	public ArrayList<DanhSachThamNienDTO> getAll() {
		ArrayList<DanhSachThamNienDTO> ketqua = new ArrayList<>();

		Iterable<Danhsachthamnien> listFromDb = repo.findAll();

		for (Danhsachthamnien d : listFromDb) {
			DonViChucNangDTO donViChucNangDto = mapper.map(d.getDonvichucnang(), DonViChucNangDTO.class);
			CanBoDTO canBoDto = mapper.map(d.getCanbo(), CanBoDTO.class);
			BacLuongDTO bacLuongDto = mapper.map(d.getBacluong(), BacLuongDTO.class);
			DanhSachThamNienDTO danhSachThamNienDto = mapper.map(d, DanhSachThamNienDTO.class);
			danhSachThamNienDto.setDonViChucNang(donViChucNangDto);
			danhSachThamNienDto.setCanBo(canBoDto);
			danhSachThamNienDto.setBacLuong(bacLuongDto);
			danhSachThamNienDto.setThoiDiemTangPhuCapTn(d.getThoiDiemTangPhuCapTn());
			danhSachThamNienDto.setTuNgay(d.getTuNgay());
			danhSachThamNienDto.setDenNgay(d.getDenNgay());
			ketqua.add(danhSachThamNienDto);
		}
		return ketqua;
	}

	@Override
	public void delete(Integer id) {
		repo.delete(id);
	}

	@Override
	public DanhSachThamNienDTO getById(Integer id) {
		Danhsachthamnien entity = repo.findOne(id);
		DanhSachThamNienDTO dto = mapper.map(entity, DanhSachThamNienDTO.class);
		dto.setThoiDiemTangPhuCapTn(entity.getThoiDiemTangPhuCapTn());
		dto.setTuNgay(entity.getTuNgay());
		dto.setDenNgay(entity.getDenNgay());
		return dto;
	}

	@Override
	public DanhSachThamNienDTO update(DanhSachThamNienDTO t) {
		addOrUpdate(t);
		return t;
	}

	@Override
	public DanhSachThamNienDTO insert(DanhSachThamNienDTO t) {
		addOrUpdate(t);
		return t;
	}

	private Danhsachthamnien addOrUpdate(DanhSachThamNienDTO dto) {
		Danhsachthamnien entity = new Danhsachthamnien();

		if (dto.getPk() != null && dto.getPk().intValue() != -1) {
			entity = repo.findOne(dto.getPk());
		}
		mapper.map(dto, entity);
		return repo.save(entity);
	}
}
