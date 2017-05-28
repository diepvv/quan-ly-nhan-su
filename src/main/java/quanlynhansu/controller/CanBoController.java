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
import quanlynhansu.model.dto.ChucVuDTO;
import quanlynhansu.model.dto.DanTocDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.model.dto.NgachCongChucDTO;
import quanlynhansu.model.dto.QueQuanDTO;
import quanlynhansu.model.dto.TonGiaoDTO;
import quanlynhansu.service.ICanBoService;
import quanlynhansu.service.IChucVuService;
import quanlynhansu.service.IDanTocService;
import quanlynhansu.service.IDonViChucNangService;
import quanlynhansu.service.INgachCongChucService;
import quanlynhansu.service.IQueQuanService;
import quanlynhansu.service.ITonGiaoService;

@Controller
@RequestMapping("/canBoController")
public class CanBoController {
	@Autowired
	private ICanBoService canBoService;
	@Autowired
	private IDonViChucNangService donViChucNangService;
	@Autowired
	private ITonGiaoService tonGiaoService;
	@Autowired
	private IDanTocService danTocService;
	@Autowired
	private IChucVuService chucVuService;
	@Autowired
	private IQueQuanService queQuanService;
	@Autowired
	private INgachCongChucService ngachCongChucService;

	@GetMapping("/show")
	public ModelAndView getdata() {
		ArrayList<DonViChucNangDTO> list = donViChucNangService.getAll();
		ArrayList<TonGiaoDTO> tonGiaoLists = tonGiaoService.getAll();
		ArrayList<DanTocDTO> danTocLists = danTocService.getAll();
		ArrayList<ChucVuDTO> chucVuLists = chucVuService.getAll();
		ArrayList<NgachCongChucDTO> ngachCongChucLists = ngachCongChucService
				.getAll();
		ArrayList<QueQuanDTO> queQuanLists = queQuanService.getAll();
		ModelAndView model = new ModelAndView("canbo");
		model.addObject("donViChucNangLists", list);
		model.addObject("tonGiaoLists", tonGiaoLists);
		model.addObject("danTocLists", danTocLists);
		model.addObject("chucVuLists", chucVuLists);
		model.addObject("ngachCongChucLists", ngachCongChucLists);
		model.addObject("queQuanLists", queQuanLists);
		return model;
	}

	@RequestMapping(value = "/delete/{pK}", method = RequestMethod.DELETE)
	public String delete(
			@PathVariable(value = "pK") Integer pK,
			@RequestParam(value = "version") Integer version) {
		canBoService.delete(pK, version);
		return "canbo";
	}

	@PostMapping("/update")
	public String update(@RequestBody CanBoDTO dskg, Model model)
			throws SQLException {
		canBoService.update(dskg);
		return "canbo";
	}

	@PostMapping("/add")
	public String insert(@RequestBody CanBoDTO dskg, Model model)
			throws SQLException {
		canBoService.insert(dskg);
		return "canbo";
	}
}