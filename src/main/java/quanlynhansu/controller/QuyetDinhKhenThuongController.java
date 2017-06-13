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
import quanlynhansu.model.dto.QuyetDinhKhenThuongDTO;
import quanlynhansu.service.IDonViChucNangService;
import quanlynhansu.service.IQuyetDinhKhenThuongService;

@Controller
@RequestMapping("/quyetDinhKhenThuongController")
public class QuyetDinhKhenThuongController {
	@Autowired
	private IQuyetDinhKhenThuongService quyetDinhKhenThuongService;
	@Autowired
	private IDonViChucNangService donViChucNangService;
	

	@GetMapping("/show")
	public ModelAndView getdata() {
		ArrayList<DonViChucNangDTO> donViChucNanglists = donViChucNangService.getAll();
		ModelAndView model = new ModelAndView("quyetdinhkhenthuong");
		model.addObject("donViChucNanglists", donViChucNanglists);
		return model;
	}

	@RequestMapping(value = "/delete/{pK}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Integer pK, @RequestParam(value = "version") Integer version) {
		quyetDinhKhenThuongService.delete(pK, version);
		return "quyetdinhkhenthuong";
	}

	@PostMapping("/update")
	public String update(@RequestBody QuyetDinhKhenThuongDTO qdkt, Model model) throws SQLException {
		quyetDinhKhenThuongService.update(qdkt);
		return "quyetdinhkhenthuong";
	}

	@PostMapping("/add")
	public String insert(@RequestBody QuyetDinhKhenThuongDTO qdkt, Model model) throws SQLException {
		quyetDinhKhenThuongService.insert(qdkt);
		return "quyetdinhkhenthuong";
	}
}