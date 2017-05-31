package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import quanlynhansu.model.dto.DanhSachKhoanGonDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.model.entity.Danhsachkhoangon;
import quanlynhansu.model.entity.Donvichucnang;
import quanlynhansu.repository.IDanhSachKhoanGonRepository;
import quanlynhansu.repository.IDonViChucNangRepository;

@Service
@Transactional(rollbackFor = Throwable.class)
public class DanhSachKhoanGonServiceImpl implements IDanhSachKhoanGonService {
	@Autowired
	private IDanhSachKhoanGonRepository repo;
	@Autowired
	protected DozerBeanMapper mapper;
	@Autowired
	private IDonViChucNangRepository donViChucNangRepo;

	@Override
	public ArrayList<DanhSachKhoanGonDTO> getAll() {
		ArrayList<DanhSachKhoanGonDTO> ketqua = new ArrayList<>();

		Iterable<Danhsachkhoangon> listFromDb = repo.findAll();

		for (Danhsachkhoangon d : listFromDb) {
			DonViChucNangDTO donViChucNangDto = mapper.map(
					d.getDonvichucnang(), DonViChucNangDTO.class);
			DanhSachKhoanGonDTO danhSachKhoanGonDto = mapper.map(d,
					DanhSachKhoanGonDTO.class);
			danhSachKhoanGonDto.setDonViChucNang(donViChucNangDto);
			danhSachKhoanGonDto.setNgayKyHopDong(d.getNgayKyHopDong());
			ketqua.add(danhSachKhoanGonDto);
		}
		return ketqua;
	}

	@Override
	public void delete(Integer id, Integer version) {
		Danhsachkhoangon entity = new Danhsachkhoangon();
		entity = repo.findOneByPkAndVersion(id, version);
		if (entity == null) {
				throw new OptimisticLockingFailureException("Concurrent update error");
		}
		repo.delete(id);
	}

	@Override
	public DanhSachKhoanGonDTO getById(Integer id) {
		Danhsachkhoangon entity = repo.findOne(id);
		DonViChucNangDTO donViChucNangDto = mapper.map(
				entity.getDonvichucnang(), DonViChucNangDTO.class);
		DanhSachKhoanGonDTO danhSachKhoanGondto = mapper.map(entity,
				DanhSachKhoanGonDTO.class);
		danhSachKhoanGondto.setDonViChucNang(donViChucNangDto);
		danhSachKhoanGondto.setNgayKyHopDong(entity.getNgayKyHopDong());
		return danhSachKhoanGondto;
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
			entity = repo.findOneByPkAndVersion(dto.getPk(), dto.getVersion());
			if (entity == null) {
				throw new OptimisticLockingFailureException(
						"Concurrent update error");
			}
		}
		mapper.map(dto, entity);
		if (dto.getDonViChucNang() != null) {
			Donvichucnang donViChucNangEntity = donViChucNangRepo.findOne(dto
					.getDonViChucNang().getPk());
			entity.setDonvichucnang(donViChucNangEntity);
		}
		return repo.save(entity);
	}
}
