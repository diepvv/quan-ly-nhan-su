package quanlynhansu.service;

import java.util.ArrayList;
import java.util.Set;
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
		DonViChucNangDTO donViChucNangDto = mapper.map(entity,
				DonViChucNangDTO.class);
		// lay donvichucnang voi id, va set BoMon voi id do thanh BoMonDTo de su
		// dung
		donViChucNangDto.setBoMon(entity.getBoMons().stream()
				.map(entity1 -> mapper.map(entity1, BoMonDTO.class))
				.collect(Collectors.toSet()));
		return donViChucNangDto;
	}

	@Override
	public Set<BoMonDTO> getBoMonByDonViChucNang(Integer donViChucNangPk) {
		return repo.findOne(donViChucNangPk).getBoMons().stream()
				.map(entity -> mapper.map(entity, BoMonDTO.class))
				.collect(Collectors.toSet());
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
