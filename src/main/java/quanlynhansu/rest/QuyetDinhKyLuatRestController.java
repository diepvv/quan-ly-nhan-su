package quanlynhansu.rest;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.model.dto.QuyetDinhKyLuatDTO;
import quanlynhansu.service.IQuyetDinhKyLuatService;

@RestController
@RequestMapping("/quyetDinhKyLuatService")
public class QuyetDinhKyLuatRestController {
	@Autowired
	private IQuyetDinhKyLuatService quyetdinhkyluat;

	@GetMapping("/getAll")
	public List<QuyetDinhKyLuatDTO> getAll() throws SQLException {
		return quyetdinhkyluat.getAll();
	}

	@GetMapping("/getById/{pK}")
	public QuyetDinhKyLuatDTO getById(@PathVariable Integer pK)
			throws ParseException, SQLException {
		QuyetDinhKyLuatDTO ds = quyetdinhkyluat.getById(pK);
		return ds;
	}
}
