package quanlynhansu.rest;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.model.dto.DanTocDTO;
import quanlynhansu.service.IDanTocService;

@RestController
@RequestMapping("/danTocService")
public class DanTocRestController {
	@Autowired
	private IDanTocService dantoc;

	@GetMapping("/getAll")
	public List<DanTocDTO> getAll() throws SQLException {
		return dantoc.getAll();
	}

	@GetMapping("/getById/{pK}")
	public DanTocDTO getById(@PathVariable Integer pK) throws ParseException,
			SQLException {
		DanTocDTO dt = dantoc.getById(pK);
		return dt;
	}
}
