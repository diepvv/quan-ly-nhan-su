package quanlynhansu.rest;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.models.dto.ChucVuDTO;
import quanlynhansu.services.IChucVuService;

@RestController
@RequestMapping("/chucVuService")
public class ChucVuRestController {
	@Autowired
	private IChucVuService chucvu;

	@GetMapping("/getAll")
	public List<ChucVuDTO> getAll() throws SQLException {
		return chucvu.getAll();
	}

	@GetMapping("/getById/{maCV}")
	public ChucVuDTO getById(@PathVariable int maCV) throws ParseException,
			SQLException {
		ChucVuDTO cv = chucvu.getById(maCV);
		return cv;
	}
}
