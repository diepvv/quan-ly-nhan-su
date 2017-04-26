package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import quanlynhansu.model.dto.HopDongNganHanDTO;
import quanlynhansu.model.entity.Hopdongnganhan;
import quanlynhansu.repository.IHopDongNganHanRepository;

@Component
public class HopDongNganHanServiceImpl implements IHopDongNganHanService {

	@Autowired
	private IHopDongNganHanRepository repo;

	@Autowired
	protected DozerBeanMapper mapper;

	@Override
	public ArrayList<HopDongNganHanDTO> getAll() {

		ArrayList<HopDongNganHanDTO> ketqua = new ArrayList<>();

		Iterable<Hopdongnganhan> listFromDb = repo.findAll();

		for (Hopdongnganhan h : listFromDb) {
			ketqua.add(mapper.map(h, HopDongNganHanDTO.class));
		}

		return ketqua;
	}

	@Override
	public void delete(int id) {
		repo.delete(Integer.valueOf(id));
	}

	@Override
	public HopDongNganHanDTO getById(int id) {
		Hopdongnganhan entity = repo.findOne(Integer.valueOf(id));
		return mapper.map(entity, HopDongNganHanDTO.class);
	}

	@Override
	public HopDongNganHanDTO update(HopDongNganHanDTO t) {
		addOrUpdate(t);
		return t;
	}

	@Override
	public HopDongNganHanDTO insert(HopDongNganHanDTO t) {
		addOrUpdate(t);
		return t;
	}

	private Hopdongnganhan addOrUpdate(HopDongNganHanDTO dto) {
		Hopdongnganhan entity = new Hopdongnganhan();
		if (dto.getPk() != null && dto.getPk().intValue() != -1) {
			entity = repo.findOne(Integer.valueOf(dto.getPk()));
		}

		mapper.map(dto, entity);

		return repo.save(entity);
	}
}
