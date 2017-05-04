package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import quanlynhansu.model.dto.ChucVuDTO;
import quanlynhansu.model.entity.Chucvu;
import quanlynhansu.repository.IChucVuRepository;

@Component
public class ChucVuImpl implements IChucVuService {
	@Autowired
	private IChucVuRepository repo;
	
	@Autowired
	protected DozerBeanMapper mapper;

	@Override
	public ArrayList<ChucVuDTO> getAll() {
		ArrayList<ChucVuDTO> ketqua = new ArrayList<>();

		Iterable<Chucvu> listFromDb = repo.findAll();

		for (Chucvu d : listFromDb) {
			ketqua.add(mapper.map(d, ChucVuDTO.class));
		}
		return ketqua;
	}

	@Override
	public void delete(Integer id) {
		repo.delete(id);
	}

	@Override
	public ChucVuDTO getById(Integer id) {
		Chucvu entity = repo.findOne(id);
		return mapper.map(entity, ChucVuDTO.class);
	}

	@Override
	public ChucVuDTO update(ChucVuDTO t) {
		addOrUpdate(t);
		return t;
	}

	@Override
	public ChucVuDTO insert(ChucVuDTO t) {
		addOrUpdate(t);
		return t;
	}

	private Chucvu addOrUpdate(ChucVuDTO dto) {
		Chucvu entity = new Chucvu();

		if (dto.getPk() != null && dto.getPk() != -1) {
			entity = repo.findOne(dto.getPk());
		}
		mapper.map(dto, entity);
		return repo.save(entity);
	}
}
