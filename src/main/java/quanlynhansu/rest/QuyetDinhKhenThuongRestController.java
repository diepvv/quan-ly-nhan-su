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
import quanlynhansu.model.dto.QuyetDinhKhenThuongDTO;
import quanlynhansu.service.IDonViChucNangService;
import quanlynhansu.service.IQuyetDinhKhenThuongService;

@RestController
@RequestMapping("/quyetDinhKhenThuongService")
public class QuyetDinhKhenThuongRestController {
	@Autowired
	private IQuyetDinhKhenThuongService quyetdinhkhenthuong;
	@Autowired
	private IDonViChucNangService donViChucNangService;

	@GetMapping("/getAll")
	public List<QuyetDinhKhenThuongDTO> getAll() throws SQLException {
		return quyetdinhkhenthuong.getAll();
	}

	@GetMapping("/getById/{pK}")
	public QuyetDinhKhenThuongDTO getById(@PathVariable Integer pK)
			throws ParseException, SQLException {
		QuyetDinhKhenThuongDTO ds = quyetdinhkhenthuong.getById(pK);
		return ds;
	}
	
	@GetMapping("/getCanBoByDonViChucNang/{donViChucNangPk}")
	public Set<CanBoDTO> getCanBoByDonViChucNang(@PathVariable Integer donViChucNangPk) {
		return donViChucNangService.getCanBoByDonViChucNang(donViChucNangPk);
	}
}