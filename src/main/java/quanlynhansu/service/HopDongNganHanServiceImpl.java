package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
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
			HopDongNganHanDTO dto = mapper.map(h, HopDongNganHanDTO.class);
			dto.setNgayKy(h.getNgayKy());
			dto.setTuNgay(h.getTuNgay());
			dto.setDenNgay(h.getDenNgay());
			ketqua.add(dto);
		}

		return ketqua;
	}

	@Override
	public void delete(Integer id, Integer version) {
		Hopdongnganhan entity = new Hopdongnganhan();
		entity = repo.findOneByPkAndVersion(id, version);
		if (entity == null) {
			throw new OptimisticLockingFailureException(
					"Concurrent update error");
		}
		repo.delete(id);
	}

	@Override
	public HopDongNganHanDTO getById(Integer id) {
		Hopdongnganhan entity = repo.findOne(Integer.valueOf(id));
		HopDongNganHanDTO dto = mapper.map(entity, HopDongNganHanDTO.class);
		dto.setNgayKy(entity.getNgayKy());
		dto.setTuNgay(entity.getTuNgay());
		dto.setDenNgay(entity.getDenNgay());
		return dto;
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
			entity = repo.findOneByPkAndVersion(dto.getPk(), dto.getVersion());
			if (entity == null) {
				throw new OptimisticLockingFailureException(
						"Concurrent update error");
			}
		}
		mapper.map(dto, entity);
		return repo.save(entity);
	}
}
