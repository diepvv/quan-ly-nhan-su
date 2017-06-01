package quanlynhansu.rest;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.dto.DanhSachKiemNhiemDTO;
import quanlynhansu.service.IDanhSachKiemNhiemService;
import quanlynhansu.service.IDonViChucNangService;

@RestController
@RequestMapping("/danhSachKiemNhiemService")
public class DanhSachKiemNhiemRestController {
	@Autowired
	private IDanhSachKiemNhiemService danhsachkiemnhiem;
	@Autowired
	private IDonViChucNangService donViChucNangService;

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

	@GetMapping("/getCanBoByDonViChucNang/{donViChucNangPk}")
	public Set<CanBoDTO> getCanBoByDonViChucNang(
			@PathVariable Integer donViChucNangPk) {
		return donViChucNangService.getCanBoByDonViChucNang(donViChucNangPk);
	}
}
