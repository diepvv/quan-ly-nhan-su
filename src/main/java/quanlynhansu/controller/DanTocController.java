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
import org.springframework.web.bind.annotation.RequestParam;

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

	@RequestMapping(value = "/delete/{pK}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Integer pK, @RequestParam(value = "version") Integer version) {
		dantoc.delete(pK, version);
		return "dantoc";
	}

	@PostMapping("/update")
	public String update(@RequestBody DanTocDTO dt, Model model) {
		dantoc.update(dt);
		return "dantoc";
	}

	@PostMapping("/add")
	public String insert(@RequestBody DanTocDTO dt, Model model) {
		dantoc.insert(dt);
		return "dantoc";
	}
}
