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

import quanlynhansu.model.dto.DanTocDTO;
import quanlynhansu.service.IDanTocService;

@Controller
@RequestMapping("/danTocController")
public class DanTocController {
	@Autowired
	private IDanTocService dantoc;

	@GetMapping("/show")
	public String show() {
		return "dantoc";
	}

	@RequestMapping(value = "/delete/{maDanToc}", method = RequestMethod.DELETE)
	public String delete(@PathVariable int maDanToc, Model model)
			throws SQLException {
		dantoc.delete(maDanToc);
		return "dantoc";
	}

	@PostMapping("/update")
	public String update(@RequestBody DanTocDTO dt, Model model)
			throws SQLException {
		dantoc.update(dt);
		return "dantoc";
	}

	@PostMapping("/add")
	public String insert(@RequestBody DanTocDTO cv, Model model)
			throws SQLException {
		dantoc.insert(cv);
		return "dantoc";
	}
}
