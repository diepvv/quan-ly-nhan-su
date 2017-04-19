package quanlynhansu.rest;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.models.dto.LoaiHopDongDTO;
import quanlynhansu.services.ILoaiHopDongService;

@RestController
@RequestMapping("/loaiHopDongService")
public class LoaiHopDongRestController {
	@Autowired
	private ILoaiHopDongService loaihopdong;

	@GetMapping("/getAll")
	public List<LoaiHopDongDTO> getAll() throws SQLException {
		return loaihopdong.getAll();
	}

	@GetMapping("/getById/{maLoaiHD}")
	public LoaiHopDongDTO getById(@PathVariable int maLoaiHD)
			throws ParseException, SQLException {
		LoaiHopDongDTO lhd = loaihopdong.getById(maLoaiHD);
		return lhd;
	}
}
