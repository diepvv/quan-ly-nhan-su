package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.dto.DanhSachKiemNhiemDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.model.entity.Canbo;
import quanlynhansu.model.entity.Danhsachkiemnhiem;
import quanlynhansu.model.entity.Donvichucnang;
import quanlynhansu.repository.ICanBoRepository;
import quanlynhansu.repository.IDanhSachKiemNhiemRepository;
import quanlynhansu.repository.IDonViChucNangRepository;

@Service
@Transactional(rollbackFor = Throwable.class)
public class DanhSachKiemNhiemServiceImpl implements IDanhSachKiemNhiemService {
	@Autowired
	private IDanhSachKiemNhiemRepository repo;
	@Autowired
	protected DozerBeanMapper mapper;
	@Autowired
	private IDonViChucNangService donViChucNangService;
	@Autowired
	private IDonViChucNangRepository donViChucNangRepo;
	@Autowired
	private ICanBoRepository canBoRepo;

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
	public void delete(Integer id, Integer version) {
		Danhsachkiemnhiem entity = new Danhsachkiemnhiem();
		entity = repo.findOneByPkAndVersion(id, version);
		if (entity == null) {
			throw new OptimisticLockingFailureException(
					"Concurrent update error");
		}
		repo.delete(id);
	}

	@Override
	public DanhSachKiemNhiemDTO getById(Integer id) {
		Danhsachkiemnhiem entity = repo.findOne(id);
		
		DonViChucNangDTO donViChucNangDto = mapper.map(entity.getDonvichucnang(), DonViChucNangDTO.class);
		donViChucNangDto.setCanBo(donViChucNangService.getCanBoByDonViChucNang(donViChucNangDto.getPk()));
		
		DanhSachKiemNhiemDTO danhSachKiemNhiemDto = mapper.map(entity, DanhSachKiemNhiemDTO.class);
		danhSachKiemNhiemDto.setDonViChucNang(donViChucNangDto);
		danhSachKiemNhiemDto.setTuNgay(entity.getTuNgay());
		danhSachKiemNhiemDto.setDenNgay(entity.getDenNgay());
		if (entity.getCanbo() != null) {
			CanBoDTO canDto = mapper.map(entity.getCanbo(), CanBoDTO.class);
			danhSachKiemNhiemDto.setCanBo(canDto);
		}
		return danhSachKiemNhiemDto;
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
