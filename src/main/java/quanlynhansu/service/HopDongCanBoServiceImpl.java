package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.model.dto.HopDongCanBoDTO;
import quanlynhansu.model.dto.LoaiHopDongDTO;
import quanlynhansu.model.entity.Hopdongcanbo;
import quanlynhansu.repository.IHopDongCanBoRepository;

@Service
@Transactional(rollbackFor = Throwable.class)
public class HopDongCanBoServiceImpl implements IHopDongCanBoService {
	@Autowired
	private IHopDongCanBoRepository repo;
	@Autowired
	protected DozerBeanMapper mapper;

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
	public void delete(Integer id) {
		repo.delete(id);
	}

	@Override
	public HopDongCanBoDTO getById(Integer id) {
		Hopdongcanbo entity = repo.findOne(id);
		HopDongCanBoDTO dto = mapper.map(entity, HopDongCanBoDTO.class);
		dto.setNgayKy(entity.getNgayKy());
		dto.setTuNgay(entity.getTuNgay());
		dto.setDenNgay(entity.getDenNgay());
		return dto;
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
			entity = repo.findOne(dto.getPk());
		}
		mapper.map(dto, entity);
		return repo.save(entity);
	}
}
