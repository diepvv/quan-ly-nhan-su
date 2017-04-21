package quanlynhansu.rest;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.models.dto.NgachCongChucDTO;
import quanlynhansu.services.INgachCongChucService;

@RestController
@RequestMapping("/ngachCongChucService")
public class NgachCongChucRestController {
	@Autowired
	private INgachCongChucService ngachcongchuc;

	@GetMapping("/getAll")
	public List<NgachCongChucDTO> getAll() throws SQLException {
		return ngachcongchuc.getAll();
	}

	@GetMapping("/getById/{maNgachCongChuc}")
	public NgachCongChucDTO getById(@PathVariable String maNgachCongChuc)
			throws ParseException, SQLException {
		NgachCongChucDTO ncc = ngachcongchuc.getById(maNgachCongChuc);
		return ncc;
	}
}
