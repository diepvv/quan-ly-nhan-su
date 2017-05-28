package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Component;

import quanlynhansu.model.dto.BacLuongDTO;
import quanlynhansu.model.dto.BoMonDTO;
import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.dto.ChucVuDTO;
import quanlynhansu.model.dto.DanTocDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.model.dto.NgachCongChucDTO;
import quanlynhansu.model.dto.QueQuanDTO;
import quanlynhansu.model.dto.TonGiaoDTO;
import quanlynhansu.model.entity.Bacluong;
import quanlynhansu.model.entity.Bomon;
import quanlynhansu.model.entity.Canbo;
import quanlynhansu.model.entity.Chucvu;
import quanlynhansu.model.entity.Dantoc;
import quanlynhansu.model.entity.Donvichucnang;
import quanlynhansu.model.entity.Ngachcongchuc;
import quanlynhansu.model.entity.Quequan;
import quanlynhansu.model.entity.Tongiao;
import quanlynhansu.repository.IBacLuongRepository;
import quanlynhansu.repository.IBoMonRepository;
import quanlynhansu.repository.ICanBoRepository;
import quanlynhansu.repository.IChucVuRepository;
import quanlynhansu.repository.IDanTocRepository;
import quanlynhansu.repository.IDonViChucNangRepository;
import quanlynhansu.repository.INgachCongChucRepository;
import quanlynhansu.repository.IQueQuanRepository;
import quanlynhansu.repository.ITonGiaoRepository;

@Component
public class CanBoServiceImpl implements ICanBoService {
	@Autowired
	private ICanBoRepository repo;
	@Autowired
	private IDonViChucNangRepository donViChucNangRepo;
	@Autowired
	private IBoMonRepository boMonRepository;
	@Autowired
	private IBacLuongRepository bacLuongRepository;
	@Autowired
	private IChucVuRepository chucVuRepository;
	@Autowired
	private IDanTocRepository danTocRepository;
	@Autowired
	private ITonGiaoRepository tonGiaoRepository;
	@Autowired
	private INgachCongChucRepository ngachCongChucRepository;
	@Autowired
	private IQueQuanRepository queQuanRepository;
	@Autowired
	private IDonViChucNangService donViChucNangService;
	@Autowired
	private INgachCongChucService ngachCongChucService;
	@Autowired
	protected DozerBeanMapper mapper;

	@Override
	public ArrayList<CanBoDTO> getAll() {
		ArrayList<CanBoDTO> ketqua = new ArrayList<>();
		Iterable<Canbo> listFromDb = repo.findAll();
		for (Canbo d : listFromDb) {
			DonViChucNangDTO donViChucNangDto = mapper.map(d.getDonvichucnang(), DonViChucNangDTO.class);
			ChucVuDTO chucVuDto = mapper.map(d.getChucvu(), ChucVuDTO.class);
			CanBoDTO canBoDto = mapper.map(d, CanBoDTO.class);
			canBoDto.setDonViChucNang(donViChucNangDto);
			canBoDto.setChucVu(chucVuDto);
			ketqua.add(canBoDto);
		}
		return ketqua;
	}

	@Override
	public void delete(Integer id) {
		repo.delete(Integer.valueOf(id));
	}

	@Override
	public CanBoDTO getById(Integer id) {
		Canbo entity = repo.findOne(Integer.valueOf(id));
		DonViChucNangDTO donViChucNangDto = mapper.map(entity.getDonvichucnang(), DonViChucNangDTO.class);
		donViChucNangDto.setBoMon(donViChucNangService.getBoMonByDonViChucNang(donViChucNangDto.getPk()));
		DanTocDTO danTocDto = mapper.map(entity.getDantoc(), DanTocDTO.class);
		TonGiaoDTO tonGiaoDto = mapper.map(entity.getTongiao(),TonGiaoDTO.class);
		ChucVuDTO chucVuDto = mapper.map(entity.getChucvu(), ChucVuDTO.class);
		NgachCongChucDTO ngachCongChucDto = mapper.map(entity.getNgachcongchuc(), NgachCongChucDTO.class);
		ngachCongChucDto.setBacLuong(ngachCongChucService.getBacLuongByNgachCongChuc(ngachCongChucDto.getPk()));
		QueQuanDTO queQuanDto = mapper.map(entity.getQuequan(),QueQuanDTO.class);

		CanBoDTO canBoDto = mapper.map(entity, CanBoDTO.class);
		canBoDto.setDonViChucNang(donViChucNangDto);
		canBoDto.setDanToc(danTocDto);
		canBoDto.setTonGiao(tonGiaoDto);
		canBoDto.setChucVu(chucVuDto);
		canBoDto.setNgachCongChuc(ngachCongChucDto);
		canBoDto.setQueQuan(queQuanDto);
		canBoDto.setNgaySinh(entity.getNgaySinh());
		canBoDto.setNgayCapCmnd(entity.getNgayCapCmnd());
		canBoDto.setNgayNhanHocVi(entity.getNgayNhanHocVi());
		canBoDto.setNgayNhanHocHam(entity.getNgayNhanHocHam());
		canBoDto.setNgayVaoDcsvnDuBi(entity.getNgayVaoDcsvnDuBi());
		canBoDto.setNgayVaoDcsvnChinhThuc(entity.getNgayVaoDcsvnChinhThuc());
		canBoDto.setNgayNhapNgu(entity.getNgayNhapNgu());
		canBoDto.setNgayXuatNgu(entity.getNgayXuatNgu());
		canBoDto.setNgayThoiViec(entity.getNgayThoiViec());
		canBoDto.setNgayVeHuu(entity.getNgayVeHuu());
		canBoDto.setNgayTuyenDung(entity.getNgayTuyenDung());
		canBoDto.setNgayHuong(entity.getNgayHuong());
		if (entity.getBomon() != null) {
			BoMonDTO boMonDto = mapper.map(entity.getBomon(), BoMonDTO.class);
			canBoDto.setBoMon(boMonDto);
		}
		if (entity.getBacluong() != null) {
			BacLuongDTO bacLuongDto = mapper.map(entity.getBacluong(), BacLuongDTO.class);
			canBoDto.setBacLuong(bacLuongDto);
		}
		return canBoDto;
	}

	@Override
	public CanBoDTO update(CanBoDTO t) {
		addOrUpdate(t);
		return t;
	}

	@Override
	public CanBoDTO insert(CanBoDTO t) {
		addOrUpdate(t);
		return t;
	}

	private Canbo addOrUpdate(CanBoDTO dto) {
		Canbo entity = new Canbo();
		if (dto.getPk() != null && dto.getPk() != -1) {
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
		if (dto.getBoMon() != null) {
			Bomon bomonEntity = boMonRepository.findOne(dto.getBoMon().getPk());
			entity.setBomon(bomonEntity);
		}
		if (dto.getChucVu() != null) {
			Chucvu chucvuEntity = chucVuRepository.findOne(dto.getChucVu().getPk());
			entity.setChucvu(chucvuEntity);
		}
		if (dto.getDanToc() != null) {
			Dantoc dantocEntity = danTocRepository.findOne(dto.getDanToc().getPk());
			entity.setDantoc(dantocEntity);
		}
		if (dto.getTonGiao() != null) {
			Tongiao tongiaoEntity = tonGiaoRepository.findOne(dto.getTonGiao().getPk());
			entity.setTongiao(tongiaoEntity);
		}
		if (dto.getNgachCongChuc() != null) {
			Ngachcongchuc ngachcongchucEntity = ngachCongChucRepository.findOne(dto.getNgachCongChuc().getPk());
			entity.setNgachcongchuc(ngachcongchucEntity);
		}
		if (dto.getQueQuan() != null) {
			Quequan quequanEntity = queQuanRepository.findOne(dto.getQueQuan().getPk());
			entity.setQuequan(quequanEntity);
		}
		if (dto.getBacLuong() != null) {
			Bacluong bacluongEntity = bacLuongRepository.findOne(dto.getBacLuong().getPk());
			entity.setBacluong(bacluongEntity);
		}
		return repo.save(entity);
	}

}
