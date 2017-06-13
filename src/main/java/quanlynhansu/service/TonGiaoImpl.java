package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Component;

import quanlynhansu.model.dto.TonGiaoDTO;
import quanlynhansu.model.entity.Tongiao;
import quanlynhansu.repository.ITonGiaoRepository;

@Component
public class TonGiaoImpl implements ITonGiaoService {
	@Autowired
	private ITonGiaoRepository repo;

	@Autowired
	protected DozerBeanMapper mapper;

	@Override
	public ArrayList<TonGiaoDTO> getAll() {
		ArrayList<TonGiaoDTO> ketqua = new ArrayList<>();

		Iterable<Tongiao> listFromDb = repo.findAll();

		for (Tongiao d : listFromDb) {
			ketqua.add(mapper.map(d, TonGiaoDTO.class));
		}
		return ketqua;
	}

	@Override
	public void delete(Integer id, Integer version) {
		Tongiao entity = new Tongiao();
		entity = repo.findOneByPkAndVersion(id, version);
		if (entity == null) {
			throw new OptimisticLockingFailureException(
					"Concurrent update error");
		}
		repo.delete(id);
	}

	@Override
	public TonGiaoDTO getById(Integer id) {
		Tongiao entity = repo.findOne(id);
		return mapper.map(entity, TonGiaoDTO.class);
	}

	@Override
	public TonGiaoDTO update(TonGiaoDTO t) {
		addOrUpdate(t);
		return t;
	}

	@Override
	public TonGiaoDTO insert(TonGiaoDTO t) {
		addOrUpdate(t);
		return t;
	}

	private Tongiao addOrUpdate(TonGiaoDTO dto) {
		Tongiao entity = new Tongiao();

		if (dto.getPk() != null && dto.getPk() != -1) {
			entity = repo.findOneByPkAndVersion(dto.getPk(), dto.getVersion());
			if (entity == null) {
				throw new OptimisticLockingFailureException("Concurrent update error");
			}
		}
		mapper.map(dto, entity);
		return repo.save(entity);
	}
}
