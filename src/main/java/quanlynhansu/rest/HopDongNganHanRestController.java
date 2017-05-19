package quanlynhansu.rest;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.model.dto.HopDongNganHanDTO;
import quanlynhansu.service.IHopDongNganHanService;

@RestController
@RequestMapping("/hopDongNganHanService")
public class HopDongNganHanRestController {

	@Autowired
	private IHopDongNganHanService hopdongnganhan;

	@GetMapping("/getAll")
	public List<HopDongNganHanDTO> getAll() throws SQLException {
		return hopdongnganhan.getAll();
	}

	@GetMapping("/getById/{Pk}")
	public HopDongNganHanDTO getById(@PathVariable int Pk)
			throws ParseException, SQLException {
		HopDongNganHanDTO hdnh = hopdongnganhan.getById(Pk);
		return hdnh;
	}
}
