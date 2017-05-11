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
import quanlynhansu.model.dto.KeKhaiTaiSanDTO;
import quanlynhansu.service.ICanBoService;
import quanlynhansu.service.IDonViChucNangService;
import quanlynhansu.service.IKeKhaiTaiSanService;

@Controller
@RequestMapping("/keKhaiTaiSanController")
public class KeKhaiTaiSanController {
	@Autowired
	private IKeKhaiTaiSanService keKhaiTaiSanService;
	@Autowired
	private IDonViChucNangService donViChucNangService;
	@Autowired
	private ICanBoService canBoService;

	@GetMapping("/show")
	public ModelAndView getdata() {
		ArrayList<DonViChucNangDTO> donViChucNangLists = donViChucNangService.getAll();
		ArrayList<CanBoDTO> canBoLists = canBoService.getAll();
		ModelAndView model = new ModelAndView("kekhaitaisan");
		model.addObject("donViChucNangLists", donViChucNangLists);
		model.addObject("canBoLists", canBoLists);
		return model;
	}

	@RequestMapping(value = "/delete/{pK}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Integer pK, Model model)
			throws SQLException {
		keKhaiTaiSanService.delete(pK);
		return "kekhaitaisan";
	}

	@PostMapping("/update")
	public String update(@RequestBody KeKhaiTaiSanDTO qdkl, Model model)
			throws SQLException {
		keKhaiTaiSanService.update(qdkl);
		return "kekhaitaisan";
	}

	@PostMapping("/add")
	public String insert(@RequestBody KeKhaiTaiSanDTO qdkl, Model model)
			throws SQLException {
		keKhaiTaiSanService.insert(qdkl);
		return "kekhaitaisan";
	}
}
