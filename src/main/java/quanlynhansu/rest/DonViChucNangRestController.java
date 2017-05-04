package quanlynhansu.rest;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.model.dto.DonViChucNangDTO;
import quanlynhansu.service.IDonViChucNangService;

@RestController
@RequestMapping("/donViChucNangService")
public class DonViChucNangRestController {

	@Autowired
	private IDonViChucNangService donvichucnang;

	@GetMapping("/getAll")
	public List<DonViChucNangDTO> getAll() throws SQLException {
		return donvichucnang.getAll();
	}

	@GetMapping("/getById/{pK}")
	public DonViChucNangDTO getById(@PathVariable Integer pK)
			throws ParseException, SQLException {
		DonViChucNangDTO dvcn = donvichucnang.getById(pK);
		return dvcn;
	}

}
