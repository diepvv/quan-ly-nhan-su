package quanlynhansu.rest;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.dto.QuyetDinhDTO;
import quanlynhansu.service.IDonViChucNangService;
import quanlynhansu.service.IQuyetDinhService;

@RestController
@RequestMapping("/quyetDinhService")
public class QuyetDinhRestController {
	@Autowired
	private IQuyetDinhService quyetdinh;
	@Autowired
	private IDonViChucNangService donViChucNangService;

	@GetMapping("/getAll")
	public List<QuyetDinhDTO> getAll() {
		return quyetdinh.getAll();
	}

	@GetMapping("/getById/{pK}")
	public QuyetDinhDTO getById(@PathVariable Integer pK) {
		QuyetDinhDTO qd = quyetdinh.getById(pK);
		return qd;
	}

	@GetMapping("/getCanBoByDonViChucNang/{donViChucNangPk}")
	public Set<CanBoDTO> getCanBoByDonViChucNang(@PathVariable Integer donViChucNangPk) {
		return donViChucNangService.getCanBoByDonViChucNang(donViChucNangPk);
	}
}
