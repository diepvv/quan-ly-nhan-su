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

import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.model.dto.QuyetDinhKyLuatDTO;
import quanlynhansu.service.ICanBoService;
import quanlynhansu.service.IDonViChucNangService;
import quanlynhansu.service.IQuyetDinhKyLuatService;

@Controller
@RequestMapping("/quyetDinhKyLuatController")
public class QuyetDinhKyLuatController {
	@Autowired
	private IQuyetDinhKyLuatService quyetDinhKyLuatService;
	@Autowired
	private IDonViChucNangService donViChucNangService;

	@GetMapping("/show")
	public ModelAndView getdata() {
		ArrayList<DonViChucNangDTO> donViChucNanglists = donViChucNangService.getAll();
		ModelAndView model = new ModelAndView("quyetdinhkyluat");
		model.addObject("donViChucNanglists", donViChucNanglists);
		return model;
	}

	@RequestMapping(value = "/delete/{pK}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Integer pK, @RequestParam(value = "version") Integer version) {
		quyetDinhKyLuatService.delete(pK, version);
		return "quyetdinhkyluat";
	}

	@PostMapping("/update")
	public String update(@RequestBody QuyetDinhKyLuatDTO qdkl, Model model) throws SQLException {
		quyetDinhKyLuatService.update(qdkl);
		return "quyetdinhkyluat";
	}

	@PostMapping("/add")
	public String insert(@RequestBody QuyetDinhKyLuatDTO qdkl, Model model) throws SQLException {
		quyetDinhKyLuatService.insert(qdkl);
		return "quyetdinhkyluat";
	}
}