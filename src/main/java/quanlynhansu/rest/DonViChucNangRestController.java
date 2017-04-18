package quanlynhansu.rest;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.models.dto.DonViChucNangDTO;
import quanlynhansu.services.IDonViChucNangService;

@RestController
@RequestMapping("/donViChucNangService")
public class DonViChucNangRestController {

	@Autowired
	private IDonViChucNangService donvichucnang;

	@GetMapping("/getAll")
	public List<DonViChucNangDTO> getAll() throws SQLException {
		return donvichucnang.getAll();
	}

	@GetMapping("/getById/{maDonViChucNang}")
	public DonViChucNangDTO getById(@PathVariable int maDonViChucNang)
			throws ParseException, SQLException {
		DonViChucNangDTO dvcn = donvichucnang.getById(maDonViChucNang);
		return dvcn;
	}

}
