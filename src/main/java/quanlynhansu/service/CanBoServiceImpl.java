package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.entity.Canbo;
import quanlynhansu.repository.ICanBoRepository;

@Component
public class CanBoServiceImpl implements ICanBoService {
	@Autowired
	private ICanBoRepository repo;

	@Autowired
	protected DozerBeanMapper mapper;

	@Override
	public ArrayList<CanBoDTO> getAll() {

		ArrayList<CanBoDTO> ketqua = new ArrayList<>();

		Iterable<Canbo> listFromDb = repo.findAll();

		for (Canbo h : listFromDb) {
			ketqua.add(mapper.map(h, CanBoDTO.class));
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
		return mapper.map(entity, CanBoDTO.class);
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
			entity = repo.findOne(dto.getPk());
		}
		mapper.map(dto, entity);

		return repo.save(entity);
	}

}
