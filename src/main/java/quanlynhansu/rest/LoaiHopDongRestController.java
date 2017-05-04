package quanlynhansu.rest;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.model.dto.LoaiHopDongDTO;
import quanlynhansu.service.ILoaiHopDongService;

@RestController
@RequestMapping("/loaiHopDongService")
public class LoaiHopDongRestController {
	@Autowired
	private ILoaiHopDongService loaihopdong;

	@GetMapping("/getAll")
	public List<LoaiHopDongDTO> getAll() throws SQLException {
		return loaihopdong.getAll();
	}

	@GetMapping("/getById/{pK}")
	public LoaiHopDongDTO getById(@PathVariable Integer pK)
			throws ParseException, SQLException {
		LoaiHopDongDTO lhd = loaihopdong.getById(pK);
		return lhd;
	}
}
