package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.model.dto.KeKhaiTaiSanDTO;
import quanlynhansu.model.entity.Kekhaitaisan;
import quanlynhansu.repository.IKeKhaiTaiSanRepository;

@Service
@Transactional(rollbackFor = Throwable.class)
public class KeKhaiTaiSanServiceImpl implements IKeKhaiTaiSanService {
	@Autowired
	private IKeKhaiTaiSanRepository repo;
	@Autowired
	protected DozerBeanMapper mapper;

	@Override
	public ArrayList<KeKhaiTaiSanDTO> getAll() {
		ArrayList<KeKhaiTaiSanDTO> ketqua = new ArrayList<>();
		Iterable<Kekhaitaisan> listFromDb = repo.findAll();
		for (Kekhaitaisan d : listFromDb) {
			DonViChucNangDTO donViChucNangDto = mapper.map(d.getDonvichucnang(), DonViChucNangDTO.class);
			CanBoDTO canBoDto = mapper.map(d.getCanbo(), CanBoDTO.class);
			KeKhaiTaiSanDTO keKhaiTaiSanDto = mapper.map(d, KeKhaiTaiSanDTO.class);
			keKhaiTaiSanDto.setDonViChucNang(donViChucNangDto);
			keKhaiTaiSanDto.setCanBo(canBoDto);
			keKhaiTaiSanDto.setNgayKeKhai(d.getNgayKeKhai());
			ketqua.add(keKhaiTaiSanDto);
		}
		return ketqua;
	}

	@Override
	public void delete(Integer id) {
		repo.delete(id);
	}

	@Override
	public KeKhaiTaiSanDTO getById(Integer id) {
		Kekhaitaisan entity = repo.findOne(id);
		KeKhaiTaiSanDTO dto = mapper.map(entity, KeKhaiTaiSanDTO.class);
		dto.setNgayKeKhai(entity.getNgayKeKhai());
		return dto;
	}

	@Override
	public KeKhaiTaiSanDTO update(KeKhaiTaiSanDTO t) {
		addOrUpdate(t);
		return t;
	}

	@Override
	public KeKhaiTaiSanDTO insert(KeKhaiTaiSanDTO t) {
		addOrUpdate(t);
		return t;
	}

	private Kekhaitaisan addOrUpdate(KeKhaiTaiSanDTO dto) {
		Kekhaitaisan entity = new Kekhaitaisan();
		if (dto.getPk() != null && dto.getPk().intValue() != -1) {
			entity = repo.findOne(dto.getPk());
		}
		mapper.map(dto, entity);
		return repo.save(entity);
	}
}
