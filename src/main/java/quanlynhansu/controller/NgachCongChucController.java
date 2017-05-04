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

import quanlynhansu.model.dto.NgachCongChucDTO;
import quanlynhansu.service.INgachCongChucService;

@Controller
@RequestMapping("/ngachCongChucController")
public class NgachCongChucController {
	@Autowired
	private INgachCongChucService ngachcongchuc;

	@GetMapping("/show")
	public String show() {
		return "ngachcongchuc";
	}

	@RequestMapping(value = "/delete/{pK}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Integer pK, Model model)
			throws SQLException {
		ngachcongchuc.delete(pK);
		return "ngachcongchuc";
	}

	@PostMapping("/update")
	public String update(@RequestBody NgachCongChucDTO ncc, Model model)
			throws SQLException {
		ngachcongchuc.update(ncc);
		return "ngachcongchuc";
	}

	@PostMapping("/add")
	public String insert(@RequestBody NgachCongChucDTO ncc, Model model)
			throws SQLException {
		ngachcongchuc.insert(ncc);
		return "ngachcongchuc";
	}
}
