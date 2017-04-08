package quanlynhansu.controllers;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import quanlynhansu.models.repository.IHopDongNganHan;

@Controller
@RequestMapping("/hopdongnganhan")
public class HopDongNganHanController {
	@Autowired
	private IHopDongNganHan hopDongNganHan;
	@RequestMapping(method = RequestMethod.GET)
	public String showHDNganHan() {
		return "hopdongnganhan";
	}

	@RequestMapping(value = "/{maHDNganHan}", method = RequestMethod.DELETE)
	public String deleteHDNganHan(@PathVariable int maHDNganHan, Model model) throws SQLException {
		hopDongNganHan.delete(maHDNganHan);
		return "hopdongnganhan";
	}

}
