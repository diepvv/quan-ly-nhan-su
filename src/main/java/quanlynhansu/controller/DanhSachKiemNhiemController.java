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
import org.springframework.web.servlet.ModelAndView;

import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.dto.DanhSachKiemNhiemDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.service.ICanBoService;
import quanlynhansu.service.IDanhSachKiemNhiemService;
import quanlynhansu.service.IDonViChucNangService;

@Controller
@RequestMapping("/danhSachKiemNhiemController")
public class DanhSachKiemNhiemController {
	@Autowired
	private IDanhSachKiemNhiemService danhSachKiemNhiemService;
	@Autowired
	private IDonViChucNangService donViChucNangService;
	@Autowired
	private ICanBoService canBoService;
	

	@GetMapping("/show")
	public ModelAndView getdata() {
		ArrayList<DonViChucNangDTO> list = donViChucNangService.getAll();
		ArrayList<CanBoDTO> canBolists = canBoService.getAll();
		ModelAndView model = new ModelAndView("danhsachkiemnhiem");
		model.addObject("donViChucNangLists", list);
		model.addObject("canBolists", canBolists);
		return model;
	}

	@RequestMapping(value = "/delete/{pK}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Integer pK, Model model)
			throws SQLException {
		danhSachKiemNhiemService.delete(pK);
		return "danhsachkiemnhiem";
	}

	@PostMapping("/update")
	public String update(@RequestBody DanhSachKiemNhiemDTO dskm, Model model)
			throws SQLException {
		danhSachKiemNhiemService.update(dskm);
		return "danhsachkiemnhiem";
	}

	@PostMapping("/add")
	public String insert(@RequestBody DanhSachKiemNhiemDTO dskm, Model model)
			throws SQLException {
		danhSachKiemNhiemService.insert(dskm);
		return "danhsachkiemnhiem";
	}
}
