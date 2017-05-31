package quanlynhansu.controller;

import java.sql.SQLException;
import java.util.ArrayList;

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
import org.springframework.web.servlet.ModelAndView;

import quanlynhansu.model.dto.DanhSachKhoanGonDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.service.IDanhSachKhoanGonService;
import quanlynhansu.service.IDonViChucNangService;

@Controller
@RequestMapping("/danhSachKhoanGonController")
public class DanhSachKhoanGonController {
	@Autowired
	private IDanhSachKhoanGonService danhSachKhoanGonService;
	@Autowired
	private IDonViChucNangService donViChucNangService;

	@GetMapping("/show")
	public ModelAndView getdata() {
		ArrayList<DonViChucNangDTO> list = donViChucNangService.getAll();
		ModelAndView model = new ModelAndView("danhsachkhoangon");
		model.addObject("donViChucNangLists", list);
		return model;
	}

	@RequestMapping(value = "/delete/{pK}", method = RequestMethod.DELETE)
	public String delete(@PathVariable(value = "pK") Integer pK,
			@RequestParam(value = "version") Integer version) {
		danhSachKhoanGonService.delete(pK, version);
		return "danhsachkhoangon";
	}

	@PostMapping("/update")
	public String update(@RequestBody DanhSachKhoanGonDTO dskg, Model model)
			throws SQLException {
		danhSachKhoanGonService.update(dskg);
		return "danhsachkhoangon";
	}

	@PostMapping("/add")
	public String insert(@RequestBody DanhSachKhoanGonDTO dskg, Model model)
			throws SQLException {
		danhSachKhoanGonService.insert(dskg);
		return "danhsachkhoangon";
	}
}