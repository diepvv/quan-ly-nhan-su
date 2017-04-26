package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import quanlynhansu.model.dto.DanTocDTO;
import quanlynhansu.model.entity.Dantoc;
import quanlynhansu.repository.IDanTocRepository;

@Component
public class DanTocImpl implements IDanTocService {
	@Autowired
	private IDanTocRepository repo;

	@Autowired
	protected DozerBeanMapper mapper;

	@Override
	public ArrayList<DanTocDTO> getAll() {
		ArrayList<DanTocDTO> ketqua = new ArrayList<>();

		Iterable<Dantoc> listFromDb = repo.findAll();

		for (Dantoc d : listFromDb) {
			ketqua.add(mapper.map(d, DanTocDTO.class));
		}
		return ketqua;
	}

	@Override
	public void delete(Integer id) {
		repo.delete(id);
	}

	@Override
	public DanTocDTO getById(Integer id) {
		Dantoc entity = repo.findOne(id);
		return mapper.map(entity, DanTocDTO.class);
	}

	@Override
	public DanTocDTO update(DanTocDTO t) {
		addOrUpdate(t);
		return t;
	}

	@Override
	public DanTocDTO insert(DanTocDTO t) {
		addOrUpdate(t);
		return t;
	}

	private Dantoc addOrUpdate(DanTocDTO dto) {
		Dantoc entity = new Dantoc();

		if (dto.getPk() != null && dto.getPk().intValue() != -1) {
			entity = repo.findOne(dto.getPk());
		}
		mapper.map(dto, entity);
		return repo.save(entity);
	}
}
