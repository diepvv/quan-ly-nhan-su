package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Component;

import quanlynhansu.model.dto.LoaiQuyetDinhDTO;
import quanlynhansu.model.entity.Loaiquyetdinh;
import quanlynhansu.repository.ILoaiQuyetDinhRepository;

@Component
public class LoaiQuyetDinhImpl implements ILoaiQuyetDinhService {
	@Autowired
	private ILoaiQuyetDinhRepository repo;

	@Autowired
	protected DozerBeanMapper mapper;

	@Override
	public ArrayList<LoaiQuyetDinhDTO> getAll() {
		ArrayList<LoaiQuyetDinhDTO> ketqua = new ArrayList<>();

		Iterable<Loaiquyetdinh> listFromDb = repo.findAll();

		for (Loaiquyetdinh d : listFromDb) {
			ketqua.add(mapper.map(d, LoaiQuyetDinhDTO.class));
		}
		return ketqua;
	}

	@Override
	public void delete(Integer id, Integer version) {
		Loaiquyetdinh entity = new Loaiquyetdinh();
		entity = repo.findOneByPkAndVersion(id, version);
		if (entity == null) {
			throw new OptimisticLockingFailureException(
					"Concurrent update error");
		}
		repo.delete(id);
	}

	@Override
	public LoaiQuyetDinhDTO getById(Integer id) {
		Loaiquyetdinh entity = repo.findOne(id);
		return mapper.map(entity, LoaiQuyetDinhDTO.class);
	}

	@Override
	public LoaiQuyetDinhDTO update(LoaiQuyetDinhDTO t) {
		addOrUpdate(t);
		return t;
	}

	@Override
	public LoaiQuyetDinhDTO insert(LoaiQuyetDinhDTO t) {
		addOrUpdate(t);
		return t;
	}

	private Loaiquyetdinh addOrUpdate(LoaiQuyetDinhDTO dto) {
		Loaiquyetdinh entity = new Loaiquyetdinh();

		if (dto.getPk() != null && dto.getPk().intValue() != -1) {
			entity = repo.findOneByPkAndVersion(dto.getPk(), dto.getVersion());
			if (entity == null) {
				throw new OptimisticLockingFailureException("Concurrent update error");
			}
		}
		mapper.map(dto, entity);
		return repo.save(entity);
	}
}
