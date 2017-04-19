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
import org.springframework.web.bind.annotation.RequestMethod;

import quanlynhansu.models.dto.LoaiHopDongDTO;
import quanlynhansu.services.ILoaiHopDongService;

@Controller
@RequestMapping("/loaiHopDongController")
public class LoaiHopDongController {
	@Autowired
	private ILoaiHopDongService loaihopdong;

	@GetMapping("/show")
	public String show() {
		return "loaihopdong";
	}

	@RequestMapping(value = "/delete/{maLoaiHopDong}", method = RequestMethod.DELETE)
	public String delete(@PathVariable int maLoaiHopDong, Model model)
			throws SQLException {
		loaihopdong.delete(maLoaiHopDong);
		return "loaihopdong";
	}

	@PostMapping("/update")
	public String update(@RequestBody LoaiHopDongDTO lhd, Model model)
			throws SQLException {
		loaihopdong.update(lhd);
		return "loaihopdong";
	}

	@PostMapping("/add")
	public String insert(@RequestBody LoaiHopDongDTO lhd, Model model)
			throws SQLException {
		loaihopdong.insert(lhd);
		return "loaihopdong";
	}
}
