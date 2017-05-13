package quanlynhansu.service;

import java.util.ArrayList;
import java.util.stream.Collectors;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import quanlynhansu.model.dto.BoMonDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.model.entity.Donvichucnang;
import quanlynhansu.repository.IDonViChucNangRepository;

@Component
public class DonViChucNangServiceImpl implements IDonViChucNangService {
	@Autowired
	private IDonViChucNangRepository repo;
	@Autowired
	protected DozerBeanMapper mapper;

	@Override
	public ArrayList<DonViChucNangDTO> getAll() {
		ArrayList<DonViChucNangDTO> ketqua = new ArrayList<>();

		Iterable<Donvichucnang> listFromDb = repo.findAll();

		for (Donvichucnang d : listFromDb) {
			DonViChucNangDTO donViChucNangDto = mapper.map(d,
					DonViChucNangDTO.class);
			donViChucNangDto.setBoMon(d.getBoMons().stream()
					.map(entity -> mapper.map(entity, BoMonDTO.class))
					.collect(Collectors.toSet()));
			ketqua.add(donViChucNangDto);
		}
		return ketqua;
	}

	@Override
	public void delete(Integer id) {
		repo.delete(id);
	}

	@Override
	public DonViChucNangDTO getById(Integer id) {
		Donvichucnang entity = repo.findOne(id);
		return mapper.map(entity, DonViChucNangDTO.class);
	}

	@Override
	public DonViChucNangDTO update(DonViChucNangDTO t) {
		addOrUpdate(t);
		return t;
	}

	@Override
	public DonViChucNangDTO insert(DonViChucNangDTO t) {
		addOrUpdate(t);
		return t;
	}

	private Donvichucnang addOrUpdate(DonViChucNangDTO dto) {
		Donvichucnang entity = new Donvichucnang();

		if (dto.getPk() != null && dto.getPk() != -1) {
			entity = repo.findOne(dto.getPk());
		}
		mapper.map(dto, entity);
		return repo.save(entity);
	}
}
