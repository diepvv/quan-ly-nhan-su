package quanlynhansu.controller;

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
import quanlynhansu.model.dto.DanhSachThamNienDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.service.ICanBoService;
import quanlynhansu.service.IDanhSachThamNienService;
import quanlynhansu.service.IDonViChucNangService;

@Controller
@RequestMapping("/danhSachThamNienController")
public class DanhSachThamNienController {
	@Autowired
	private IDanhSachThamNienService danhSachThamNienService;
	@Autowired
	private IDonViChucNangService donViChucNangService;
	@Autowired
	private ICanBoService canBoService;

	@GetMapping("/show")
	public ModelAndView getdata() {
		ArrayList<DonViChucNangDTO> donViChucNangLists = donViChucNangService
				.getAll();
		ArrayList<CanBoDTO> canBoLists = canBoService.getAll();
		ModelAndView model = new ModelAndView("danhsachthamnien");
		model.addObject("donViChucNangLists", donViChucNangLists);
		model.addObject("canBoLists", canBoLists);
		return model;
	}

	@RequestMapping(value = "/delete/{pK}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Integer pK, Model model) {
		danhSachThamNienService.delete(pK);
		return "danhsachthamnien";
	}

	@PostMapping("/update")
	public String update(@RequestBody DanhSachThamNienDTO dstn, Model model) {
		danhSachThamNienService.update(dstn);
		return "danhsachthamnien";
	}

	@PostMapping("/add")
	public String insert(@RequestBody DanhSachThamNienDTO dstn, Model model) {
		danhSachThamNienService.insert(dstn);
		return "danhsachthamnien";
	}
}
