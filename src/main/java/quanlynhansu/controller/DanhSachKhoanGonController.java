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

import quanlynhansu.model.dto.DanhSachKhoanGonDTO;
import quanlynhansu.service.IDanhSachKhoanGonService;

@Controller
@RequestMapping("/danhSachKhoanGonController")
public class DanhSachKhoanGonController {
	@Autowired
	private IDanhSachKhoanGonService danhsachkhoangon;

	@GetMapping("/show")
	public String show() {
		return "danhsachkhoangon";
	}

	@RequestMapping(value = "/delete/{pK}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Integer pK, Model model)
			throws SQLException {
		danhsachkhoangon.delete(pK);
		return "danhsachkhoangon";
	}

	@PostMapping("/update")
	public String update(@RequestBody DanhSachKhoanGonDTO dskg, Model model)
			throws SQLException {
		danhsachkhoangon.update(dskg);
		return "danhsachkhoangon";
	}

	@PostMapping("/add")
	public String insert(@RequestBody DanhSachKhoanGonDTO dskg, Model model)
			throws SQLException {
		danhsachkhoangon.insert(dskg);
		return "danhsachkhoangon";
	}
}
