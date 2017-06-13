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

import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.model.dto.LoaiQuyetDinhDTO;
import quanlynhansu.model.dto.QuyetDinhDTO;
import quanlynhansu.service.IDonViChucNangService;
import quanlynhansu.service.ILoaiQuyetDinhService;
import quanlynhansu.service.IQuyetDinhService;

@Controller
@RequestMapping("/quyetDinhController")
public class QuyetDinhController {
	@Autowired
	private IQuyetDinhService quyetDinhService;
	@Autowired
	private IDonViChucNangService donViChucNangService;
	@Autowired
	private ILoaiQuyetDinhService loaiQuyetDinhService;

	@GetMapping("/show")
	public ModelAndView getdata() {
		ArrayList<DonViChucNangDTO> donViChucNanglists = donViChucNangService.getAll();
		ArrayList<LoaiQuyetDinhDTO> loaiQuyetDinhlists = loaiQuyetDinhService.getAll();
		ModelAndView model = new ModelAndView("quyetdinh");
		model.addObject("donViChucNanglists", donViChucNanglists);
		model.addObject("loaiQuyetDinhlists", loaiQuyetDinhlists);
		return model;
	}

	@RequestMapping(value = "/delete/{pK}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Integer pK, @RequestParam(value = "version") Integer version) {
		quyetDinhService.delete(pK, version);
		return "quyetdinh";
	}

	@PostMapping("/update")
	public String update(@RequestBody QuyetDinhDTO qd, Model model) throws SQLException {
		quyetDinhService.update(qd);
		return "quyetdinh";
	}

	@PostMapping("/add")
	public String insert(@RequestBody QuyetDinhDTO qd, Model model) throws SQLException {
		quyetDinhService.insert(qd);
		return "quyetdinh";
	}
}