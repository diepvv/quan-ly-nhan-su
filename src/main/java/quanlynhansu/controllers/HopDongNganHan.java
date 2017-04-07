package quanlynhansu.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hopdongnganhan")
public class HopDongNganHan {
	@RequestMapping(method = RequestMethod.GET)
	public String showHDNganHan() {
		return "hopdongnganhan";
	}

}
