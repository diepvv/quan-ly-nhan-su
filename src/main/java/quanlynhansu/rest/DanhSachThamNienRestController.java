package quanlynhansu.rest;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.model.dto.DanhSachThamNienDTO;
import quanlynhansu.service.IDanhSachThamNienService;

@RestController
@RequestMapping("/danhSachThamNienService")
public class DanhSachThamNienRestController {
	@Autowired
	private IDanhSachThamNienService danhsachthamnien;

	@GetMapping("/getAll")
	public List<DanhSachThamNienDTO> getAll() throws SQLException {
		return danhsachthamnien.getAll();
	}

	@GetMapping("/getById/{pK}")
	public DanhSachThamNienDTO getById(@PathVariable Integer pK)
			throws ParseException, SQLException {
		DanhSachThamNienDTO ds = danhsachthamnien.getById(pK);
		return ds;
	}
}
