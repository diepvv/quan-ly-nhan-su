package quanlynhansu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import quanlynhansu.model.dto.LoaiHopDongDTO;
import quanlynhansu.service.ILoaiHopDongService;

@Controller
@RequestMapping("/loaiHopDongController")
public class LoaiHopDongController {
	@Autowired
	private ILoaiHopDongService loaihopdong;

	@GetMapping("/show")
	public String show() {
		return "loaihopdong";
	}

	@RequestMapping(value = "/delete/{pK}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Integer pK, @RequestParam(value = "version") Integer version) {
		loaihopdong.delete(pK, version);
		return "loaihopdong";
	}

	@PostMapping("/update")
	public String update(@RequestBody LoaiHopDongDTO lhd, Model model) {
		loaihopdong.update(lhd);
		return "loaihopdong";
	}

	@PostMapping("/add")
	public String insert(@RequestBody LoaiHopDongDTO lhd, Model model) {
		loaihopdong.insert(lhd);
		return "loaihopdong";
	}
}