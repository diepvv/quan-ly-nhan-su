package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.dto.ChucVuDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.model.entity.Canbo;
import quanlynhansu.model.entity.Donvichucnang;
import quanlynhansu.repository.ICanBoRepository;
import quanlynhansu.repository.IDonViChucNangRepository;

@Component
public class CanBoServiceImpl implements ICanBoService {
	@Autowired
	private ICanBoRepository repo;
	@Autowired
	private IDonViChucNangRepository donViChucNangRepo;

	@Autowired
	protected DozerBeanMapper mapper;

	@Override
	public ArrayList<CanBoDTO> getAll() {

		ArrayList<CanBoDTO> ketqua = new ArrayList<>();

		Iterable<Canbo> listFromDb = repo.findAll();

		for (Canbo d : listFromDb) {
			DonViChucNangDTO donViChucNangDto = mapper.map(d.getDonvichucnang(), DonViChucNangDTO.class);
			ChucVuDTO chucVuDto = mapper.map(d.getChucvu(), ChucVuDTO.class);
			CanBoDTO canBoDto =  mapper.map(d, CanBoDTO.class);
			canBoDto.setDonViChucNang(donViChucNangDto);
			canBoDto.setChucVu(chucVuDto);
			ketqua.add(canBoDto);
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
		if(dto.getDonViChucNang()!=null){
			Donvichucnang donViChucNangEntity = donViChucNangRepo.findOne(dto.getDonViChucNang().getPk());
			entity.setDonvichucnang(donViChucNangEntity);
		}
		return repo.save(entity);
	}

}
