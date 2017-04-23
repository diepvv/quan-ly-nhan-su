package quanlynhansu.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import quanlynhansu.model.dto.HopDongNganHanDTO;
import quanlynhansu.service.IHopDongNganHanService;

@Controller
@RequestMapping("/hopDongNganHanController")
public class HopDongNganHanController {
	@Autowired
	private IHopDongNganHanService hopDongNganHan;

	@GetMapping("/show")
	public String show() {
		return "hopdongnganhan";
	}

	@RequestMapping(value = "/delete/{maHDNganHan}", method = RequestMethod.DELETE)
	public String delete(@PathVariable int maHDNganHan, Model model)
			throws SQLException {
		hopDongNganHan.delete(maHDNganHan);
		return "hopdongnganhan";
	}

	@PostMapping("/update")
	public String update(@RequestBody HopDongNganHanDTO hd, Model model)
			throws SQLException {
		hopDongNganHan.update(hd);
		return "hopdongnganhan";
	}
	
	@PostMapping("/add")
	public String insert(@RequestBody HopDongNganHanDTO hd, Model model)
			throws SQLException {
		hopDongNganHan.insert(hd);
		return "hopdongnganhan";
	}

}
