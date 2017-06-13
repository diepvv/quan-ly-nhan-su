package quanlynhansu.service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.OptimisticLockingFailureException;
import org.springframework.stereotype.Component;

import quanlynhansu.model.dto.BacLuongDTO;
import quanlynhansu.model.dto.NgachCongChucDTO;
import quanlynhansu.model.entity.Ngachcongchuc;
import quanlynhansu.repository.INgachCongChucRepository;

@Component
public class NgachCongChucServiceImpl implements INgachCongChucService {
	@Autowired
	private INgachCongChucRepository repo;
	@Autowired
	protected DozerBeanMapper mapper;

	@Override
	public ArrayList<NgachCongChucDTO> getAll() {
		ArrayList<NgachCongChucDTO> ketqua = new ArrayList<>();

		Iterable<Ngachcongchuc> listFromDb = repo.findAll();

		for (Ngachcongchuc d : listFromDb) {
			ketqua.add(mapper.map(d, NgachCongChucDTO.class));
		}
		return ketqua;
	}

	@Override
	public NgachCongChucDTO getNgachCongChucById(Integer ngachCongChucPk) {
		Ngachcongchuc ngachCongChucEntity = repo.findOne(ngachCongChucPk);
		NgachCongChucDTO ngachCongChucDto = mapper.map(ngachCongChucEntity, NgachCongChucDTO.class);
		Set<BacLuongDTO> bacLuongDto = new HashSet<BacLuongDTO>();
		bacLuongDto = ngachCongChucEntity.getBacLuongs().stream()
				.map(entity -> mapper.map(entity, BacLuongDTO.class))
				.collect(Collectors.toSet());
		ngachCongChucDto.setBacLuong(bacLuongDto);
		return ngachCongChucDto;
	}

	@Override
	public void delete(Integer id, Integer version) {
		Ngachcongchuc entity = new Ngachcongchuc();
		entity = repo.findOneByPkAndVersion(id, version);
		if (entity == null) {
			throw new OptimisticLockingFailureException(
					"Concurrent update error");
		}
		repo.delete(id);
	}

	@Override
	public NgachCongChucDTO getById(Integer id) {
		Ngachcongchuc entity = repo.findOne(id);
		return mapper.map(entity, NgachCongChucDTO.class);
	}

	@Override
	public NgachCongChucDTO update(NgachCongChucDTO t) {
		addOrUpdate(t);
		return t;
	}

	@Override
	public NgachCongChucDTO insert(NgachCongChucDTO t) {
		addOrUpdate(t);
		return t;
	}

	private Ngachcongchuc addOrUpdate(NgachCongChucDTO dto) {
		Ngachcongchuc entity = new Ngachcongchuc();

		if (dto.getPk() != null && dto.getPk() != -1) {
			entity = repo.findOneByPkAndVersion(dto.getPk(), dto.getVersion());
			if (entity == null) {
				throw new OptimisticLockingFailureException("Concurrent update error");
			};
		}
		mapper.map(dto, entity);
		return repo.save(entity);
	}
}
