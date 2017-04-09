package quanlynhansu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/canBoController")
public class CanBoController {
	@GetMapping("/show")
	public String showCanbo() {
		return "canbo";
	}

}
