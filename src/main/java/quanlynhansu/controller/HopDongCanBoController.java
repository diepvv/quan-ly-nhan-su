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
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.model.dto.HopDongCanBoDTO;
import quanlynhansu.model.dto.LoaiHopDongDTO;
import quanlynhansu.service.ICanBoService;
import quanlynhansu.service.IDonViChucNangService;
import quanlynhansu.service.IHopDongCanBoService;
import quanlynhansu.service.ILoaiHopDongService;

@Controller
@RequestMapping("/hopDongCanBoController")
public class HopDongCanBoController {
	@Autowired
	private IHopDongCanBoService hopDongCanBoService;
	@Autowired
	private IDonViChucNangService donViChucNangService;
	@Autowired
	private ICanBoService canBoService;
	@Autowired
	private ILoaiHopDongService loaiHopDongService;

	@GetMapping("/show")
	public ModelAndView getdata() {
		ArrayList<DonViChucNangDTO> donViChucNangLists = donViChucNangService.getAll();
		ArrayList<CanBoDTO> canBoLists = canBoService.getAll();
		ArrayList<LoaiHopDongDTO> loaiHopDongLists = loaiHopDongService.getAll();
		ModelAndView model = new ModelAndView("hopdongcanbo");
		model.addObject("donViChucNangLists", donViChucNangLists);
		model.addObject("canBoLists", canBoLists);
		model.addObject("loaiHopDongLists", loaiHopDongLists);
		return model;
	}

	@RequestMapping(value = "/delete/{pK}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Integer pK, Model model) throws SQLException {
		hopDongCanBoService.delete(pK);
		return "hopdongcanbo";
	}

	@PostMapping("/update")
	public String update(@RequestBody HopDongCanBoDTO hd, Model model) throws SQLException {
		hopDongCanBoService.update(hd);
		return "hopdongcanbo";
	}

	@PostMapping("/add")
	public String insert(@RequestBody HopDongCanBoDTO hd, Model model) throws SQLException {
		hopDongCanBoService.insert(hd);
		return "hopdongcanbo";
	}
}