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

import quanlynhansu.models.dto.BacLuongDTO;
import quanlynhansu.services.IBacLuongService;

@Controller
@RequestMapping("/bacLuongController")
public class BacLuongController {
	@Autowired
	private IBacLuongService bacluong;

	@GetMapping("/show")
	public String show() {
		return "bacluong";
	}

	@RequestMapping(value = "/delete/{maBacLuong}", method = RequestMethod.DELETE)
	public String delete(@PathVariable int maBacLuong, Model model)
			throws SQLException {
		bacluong.delete(maBacLuong);
		return "bacluong";
	}

	@PostMapping("/update")
	public String update(@RequestBody BacLuongDTO bl, Model model)
			throws SQLException {
		bacluong.update(bl);
		return "bacluong";
	}

	@PostMapping("/add")
	public String insert(@RequestBody BacLuongDTO bl, Model model)
			throws SQLException {
		bacluong.insert(bl);
		return "bacluong";
	}
}
