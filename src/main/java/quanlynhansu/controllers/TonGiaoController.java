package quanlynhansu.controllers;

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

import quanlynhansu.models.dto.TonGiaoDTO;
import quanlynhansu.services.ITonGiaoService;

@Controller
@RequestMapping("/tonGiaoController")
public class TonGiaoController {
	@Autowired
	private ITonGiaoService tongiao;

	@GetMapping("/show")
	public String show() {
		return "tongiao";
	}

	@RequestMapping(value = "/delete/{maTonGiao}", method = RequestMethod.DELETE)
	public String delete(@PathVariable int maTonGiao, Model model)
			throws SQLException {
		tongiao.delete(maTonGiao);
		return "tongiao";
	}

	@PostMapping("/update")
	public String update(@RequestBody TonGiaoDTO tg, Model model)
			throws SQLException {
		tongiao.update(tg);
		return "tongiao";
	}

	@PostMapping("/add")
	public String insert(@RequestBody TonGiaoDTO tg, Model model)
			throws SQLException {
		tongiao.insert(tg);
		return "tongiao";
	}
}
