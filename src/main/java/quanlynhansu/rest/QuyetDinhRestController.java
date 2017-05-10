package quanlynhansu.rest;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.model.dto.QuyetDinhDTO;
import quanlynhansu.service.IQuyetDinhService;

@RestController
@RequestMapping("/quyetDinhService")
public class QuyetDinhRestController {
	@Autowired
	private IQuyetDinhService quyetdinh;

	@GetMapping("/getAll")
	public List<QuyetDinhDTO> getAll() throws SQLException {
		return quyetdinh.getAll();
	}

	@GetMapping("/getById/{pK}")
	public QuyetDinhDTO getById(@PathVariable Integer pK)
			throws ParseException, SQLException {
		QuyetDinhDTO ds = quyetdinh.getById(pK);
		return ds;
	}
}
