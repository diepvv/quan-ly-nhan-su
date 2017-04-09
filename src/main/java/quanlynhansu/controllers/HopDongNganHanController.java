package quanlynhansu.controllers;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import quanlynhansu.models.dto.HopDongNganHanDTO;
import quanlynhansu.services.IHopDongNganHanService;

@Controller
@RequestMapping("/hopDongNganHanController")
public class HopDongNganHanController {
	@Autowired
	private IHopDongNganHanService hopDongNganHan;

	@GetMapping("/show")
	public String show() {
		return "hopdongnganhan";
	}

	@GetMapping("/delete/{maHDNganHan}")
	public String delete(@PathVariable int maHDNganHan, Model model)
			throws SQLException {
		hopDongNganHan.delete(maHDNganHan);
		return "hopdongnganhan";
	}

	@PostMapping("/update")
	public String update(@RequestBody HopDongNganHanDTO hd, Model model)
			throws SQLException {
		hopDongNganHan.update(hd);
		System.out.println("aaaaaaaaaa");
		return "hopdongnganhan";
	}

}
