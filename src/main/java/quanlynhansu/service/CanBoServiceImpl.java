package quanlynhansu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import quanlynhansu.model.dto.CanBoDTO;

@Component
public class CanBoServiceImpl implements ICanBoService {

	public List<CanBoDTO> createListCB(int count) {
		List<CanBoDTO> listCB = new ArrayList<CanBoDTO>();
		for (int i = 0; i < count; i++) {
			listCB.add(new CanBoDTO(i + 1, "Nguyen Van A", "Bo Mon Co Ban",
					"Giang Vien BMCB"));
		}
		return listCB;
	}
}
