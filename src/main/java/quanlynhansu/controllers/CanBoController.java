package quanlynhansu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/canbo")
public class CanBoController {
	@RequestMapping(method = RequestMethod.GET)
	public String showCanbo() {
		return "canbo";
	}

}
