package quanlynhansu.service;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
	public Set<BacLuongDTO> getBacLuongByNgachCongChuc(Integer ngachCongChucPk) {
		return repo.findOne(ngachCongChucPk).getBacLuongs().stream()
				.map(entity -> mapper.map(entity, BacLuongDTO.class))
				.collect(Collectors.toSet());
	}

	@Override
	public void delete(Integer id) {
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
			entity = repo.findOne(dto.getPk());
		}
		mapper.map(dto, entity);
		return repo.save(entity);
	}
}
