package quanlynhansu.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/loginController")
public class LoginController {
	@RequestMapping(method = GET)
	public String loginShow() {
		return "login";
	}
}
