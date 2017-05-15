package quanlynhansu.service;

import java.util.ArrayList;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import quanlynhansu.model.dto.QueQuanDTO;
import quanlynhansu.model.entity.Quequan;
import quanlynhansu.repository.IQueQuanRepository;
@Component
public class QueQuanServiceImpl implements IQueQuanService {
	@Autowired
	private IQueQuanRepository repo;

	@Autowired
	protected DozerBeanMapper mapper;

	@Override
	public ArrayList<QueQuanDTO> getAll() {
		ArrayList<QueQuanDTO> ketqua = new ArrayList<>();

		Iterable<Quequan> listFromDb = repo.findAll();

		for (Quequan d : listFromDb) {
			ketqua.add(mapper.map(d, QueQuanDTO.class));
		}
		return ketqua;
	}
}
