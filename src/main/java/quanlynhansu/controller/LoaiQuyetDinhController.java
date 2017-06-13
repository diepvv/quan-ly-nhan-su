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
import org.springframework.web.bind.annotation.RequestParam;

import quanlynhansu.model.dto.LoaiQuyetDinhDTO;
import quanlynhansu.service.ILoaiQuyetDinhService;

@Controller
@RequestMapping("/loaiQuyetDinhController")
public class LoaiQuyetDinhController {
	@Autowired
	private ILoaiQuyetDinhService loaiquyetdinh;

	@GetMapping("/show")
	public String show() {
		return "loaiquyetdinh";
	}

	@RequestMapping(value = "/delete/{pK}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Integer pK, @RequestParam(value = "version") Integer version) {
		loaiquyetdinh.delete(pK, version);
		return "loaiquyetdinh";
	}

	@PostMapping("/update")
	public String update(@RequestBody LoaiQuyetDinhDTO lqd, Model model) throws SQLException {
		loaiquyetdinh.update(lqd);
		return "loaiquyetdinh";
	}

	@PostMapping("/add")
	public String insert(@RequestBody LoaiQuyetDinhDTO lqd, Model model) throws SQLException {
		loaiquyetdinh.insert(lqd);
		return "loaiquyetdinh";
	}
}