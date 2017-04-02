package quanlynhansu.models.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import quanlynhansu.models.CanBo;

@Component
public class CanboImp implements ICanBo {

	public List<CanBo> createListCB(int count) {
		List<CanBo> listCB = new ArrayList<CanBo>();
		for (int i = 0; i < count; i++) {
			listCB.add(new CanBo(i + 1, "Nguyen Van A", "Bo Mon Co Ban",
					"Giang Vien BMCB"));
		}
		return listCB;
	}
}
