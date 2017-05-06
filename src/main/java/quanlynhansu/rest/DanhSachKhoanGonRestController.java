package quanlynhansu.rest;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.model.dto.DanhSachKhoanGonDTO;
import quanlynhansu.service.IDanhSachKhoanGonService;

@RestController
@RequestMapping("/danhSachKhoanGonService")
public class DanhSachKhoanGonRestController {
	@Autowired
	private IDanhSachKhoanGonService danhsachkhoangon;

	@GetMapping("/getAll")
	public List<DanhSachKhoanGonDTO> getAll() throws SQLException {
		return danhsachkhoangon.getAll();
	}

	@GetMapping("/getById/{pK}")
	public DanhSachKhoanGonDTO getById(@PathVariable Integer pK)
			throws ParseException, SQLException {
		DanhSachKhoanGonDTO ds = danhsachkhoangon.getById(pK);
		return ds;
	}
}
