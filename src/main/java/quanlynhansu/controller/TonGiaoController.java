package quanlynhansu.controller;

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

import quanlynhansu.model.dto.TonGiaoDTO;
import quanlynhansu.service.ITonGiaoService;

@Controller
@RequestMapping("/tonGiaoController")
public class TonGiaoController {
	@Autowired
	private ITonGiaoService tongiao;

	@GetMapping("/show")
	public String show() {
		return "tongiao";
	}

	@RequestMapping(value = "/delete/{pK}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Integer pK, @RequestParam(value = "version") Integer version) {
		tongiao.delete(pK, version);
		return "tongiao";
	}

	@PostMapping("/update")
	public String update(@RequestBody TonGiaoDTO tg, Model model) {
		tongiao.update(tg);
		return "tongiao";
	}

	@PostMapping("/add")
	public String insert(@RequestBody TonGiaoDTO tg, Model model) {
		tongiao.insert(tg);
		return "tongiao";
	}
}
