package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.model.dto.HopDongCanBoDTO;
import quanlynhansu.model.dto.LoaiHopDongDTO;
import quanlynhansu.model.entity.Canbo;
import quanlynhansu.model.entity.Donvichucnang;
import quanlynhansu.model.entity.Hopdongcanbo;
import quanlynhansu.model.entity.Loaihopdong;
import quanlynhansu.repository.ICanBoRepository;
import quanlynhansu.repository.IDonViChucNangRepository;
import quanlynhansu.repository.IHopDongCanBoRepository;
import quanlynhansu.repository.ILoaiHopDongRepository;

@Service
@Transactional(rollbackFor = Throwable.class)
public class HopDongCanBoServiceImpl implements IHopDongCanBoService {
	@Autowired
	private IHopDongCanBoRepository repo;
	@Autowired
	protected DozerBeanMapper mapper;
	@Autowired
	private IDonViChucNangService donViChucNangService;
	@Autowired
	private IDonViChucNangRepository donViChucNangRepo;
	@Autowired
	private ICanBoRepository canBoRepo;
	@Autowired
	private ILoaiHopDongRepository loaiHopDongRepo;

	@Override
	public ArrayList<HopDongCanBoDTO> getAll() {
		ArrayList<HopDongCanBoDTO> ketqua = new ArrayList<>();
		Iterable<Hopdongcanbo> listFromDb = repo.findAll();

		for (Hopdongcanbo d : listFromDb) {
			DonViChucNangDTO donViChucNangDto = mapper.map(d.getDonvichucnang(), DonViChucNangDTO.class);
			CanBoDTO canBoDto = mapper.map(d.getCanbo(), CanBoDTO.class);
			LoaiHopDongDTO loaiHopDongDto = mapper.map(d.getLoaihopdong(), LoaiHopDongDTO.class);
			HopDongCanBoDTO HopDongCanBoDTO = mapper.map(d, HopDongCanBoDTO.class);
			HopDongCanBoDTO.setDonViChucNang(donViChucNangDto);
			HopDongCanBoDTO.setCanBo(canBoDto);
			HopDongCanBoDTO.setLoaiHopDong(loaiHopDongDto);
			HopDongCanBoDTO.setNgayKy(d.getNgayKy());
			HopDongCanBoDTO.setTuNgay(d.getTuNgay());
			HopDongCanBoDTO.setDenNgay(d.getDenNgay());
			ketqua.add(HopDongCanBoDTO);
		}
		return ketqua;
	}

	@Override
	public void delete(Integer id, Integer version) {
		Hopdongcanbo entity = new Hopdongcanbo();
		entity = repo.findOneByPkAndVersion(id, version);
		if(entity == null){
			throw new OptimisticLockingFailureException("Concurrent update error");
		}
		repo.delete(id);
	}

	@Override
	public HopDongCanBoDTO getById(Integer id) {
		Hopdongcanbo entity = repo.findOne(id);
		DonViChucNangDTO donViChucNangDto = mapper.map(entity.getDonvichucnang(), DonViChucNangDTO.class);
		donViChucNangDto.setCanBo(donViChucNangService.getCanBoByDonViChucNang(donViChucNangDto.getPk()));
		LoaiHopDongDTO loaiHopDongDto = mapper.map(entity.getLoaihopdong(), LoaiHopDongDTO.class);
		
		HopDongCanBoDTO hopDongCanBoDto = mapper.map(entity, HopDongCanBoDTO.class);
		hopDongCanBoDto.setDonViChucNang(donViChucNangDto);
		hopDongCanBoDto.setLoaiHopDong(loaiHopDongDto);
		hopDongCanBoDto.setNgayKy(entity.getNgayKy());
		hopDongCanBoDto.setTuNgay(entity.getTuNgay());
		hopDongCanBoDto.setDenNgay(entity.getDenNgay());
		if (entity.getCanbo() != null) {
			CanBoDTO canDto = mapper.map(entity.getCanbo(), CanBoDTO.class);
			hopDongCanBoDto.setCanBo(canDto);
		}
		return hopDongCanBoDto;
	}

	@Override
	public HopDongCanBoDTO update(HopDongCanBoDTO t) {
		addOrUpdate(t);
		return t;
	}

	@Override
	public HopDongCanBoDTO insert(HopDongCanBoDTO t) {
		addOrUpdate(t);
		return t;
	}

	private Hopdongcanbo addOrUpdate(HopDongCanBoDTO dto) {
		Hopdongcanbo entity = new Hopdongcanbo();
		
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
		if(dto.getLoaiHopDong() != null){
			Loaihopdong loaiHopDongEntity = loaiHopDongRepo.findOne(dto.getLoaiHopDong().getPk());
			entity.setLoaihopdong(loaiHopDongEntity);
		}
		return repo.save(entity);
	}
}
