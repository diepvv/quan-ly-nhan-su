package quanlynhansu.rest;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.models.dto.LoaiQuyetDinhDTO;
import quanlynhansu.services.ILoaiQuyetDinhService;

@RestController
@RequestMapping("/loaiQuyetDinhService")
public class LoaiQuyetDinhRestController {
	@Autowired
	private ILoaiQuyetDinhService loaiquyetdinh;

	@GetMapping("/getAll")
	public List<LoaiQuyetDinhDTO> getAll() throws SQLException {
		return loaiquyetdinh.getAll();
	}

	@GetMapping("/getById/{maLoaiQD}")
	public LoaiQuyetDinhDTO getById(@PathVariable int maLoaiQD)
			throws ParseException, SQLException {
		LoaiQuyetDinhDTO lqd = loaiquyetdinh.getById(maLoaiQD);
		return lqd;
	}
}