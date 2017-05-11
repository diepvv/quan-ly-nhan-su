package quanlynhansu.rest;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.model.dto.HopDongCanBoDTO;
import quanlynhansu.service.IHopDongCanBoService;

@RestController
@RequestMapping("/hopDongCanBoService")
public class HopDongCanBoRestController {
	@Autowired
	private IHopDongCanBoService hopdongcanbo;

	@GetMapping("/getAll")
	public List<HopDongCanBoDTO> getAll() throws SQLException {
		return hopdongcanbo.getAll();
	}

	@GetMapping("/getById/{Pk}")
	public HopDongCanBoDTO getById(@PathVariable Integer Pk)
			throws ParseException, SQLException {
		HopDongCanBoDTO hd = hopdongcanbo.getById(Pk);
		return hd;
	}
}
