package quanlynhansu.rest;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.model.dto.DanhSachKiemNhiemDTO;
import quanlynhansu.service.IDanhSachKiemNhiemService;

@RestController
@RequestMapping("/danhSachKiemNhiemService")
public class DanhSachKiemNhiemRestController {
	@Autowired
	private IDanhSachKiemNhiemService danhsachkiemnhiem;

	@GetMapping("/getAll")
	public List<DanhSachKiemNhiemDTO> getAll() throws SQLException {
		return danhsachkiemnhiem.getAll();
	}

	@GetMapping("/getById/{pK}")
	public DanhSachKiemNhiemDTO getById(@PathVariable Integer pK)
			throws ParseException, SQLException {
		DanhSachKiemNhiemDTO ds = danhsachkiemnhiem.getById(pK);
		return ds;
	}
}
