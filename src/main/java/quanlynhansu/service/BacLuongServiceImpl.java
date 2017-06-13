package quanlynhansu.service;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import quanlynhansu.model.dto.BacLuongDTO;
import quanlynhansu.model.entity.Bacluong;
import quanlynhansu.repository.IBacLuongRepository;

@Component
public class BacLuongServiceImpl implements IBacLuongService{
	@Autowired
	private IBacLuongRepository repo;
	@Autowired
	protected DozerBeanMapper mapper;
	@Override
	public BacLuongDTO getHeSoLuongById(Integer bacLuongPk) {
		Bacluong bacLuongEntity = repo.findOne(bacLuongPk);
		BacLuongDTO bacLuongDto = mapper.map(bacLuongEntity, BacLuongDTO.class);
		return bacLuongDto;
	}
}
