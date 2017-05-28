package quanlynhansu.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/loginController")
public class LoginController {
    @RequestMapping(method = GET)
    public String loginShow(@RequestParam(defaultValue = "true", required = false) boolean result,
            Model model) {
        model.addAttribute("isFail", result);
        return "login";
    }
}
