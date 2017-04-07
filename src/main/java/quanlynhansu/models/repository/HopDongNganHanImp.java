package quanlynhansu.models.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import quanlynhansu.models.HopDongNganHan;

@Component
public class HopDongNganHanImp implements IHopDongNganHan {
	public List<HopDongNganHan> createListHDNH(int count) {
		List<HopDongNganHan> listHBNH = new ArrayList<HopDongNganHan>();
		for (int i = 0; i < count; i++) {
			listHBNH.add(new HopDongNganHan(i + 1, "Tuyển dụng lao động",
					"Nguyễn Văn A", null, null, null));
		}
		return listHBNH;
	}
}
