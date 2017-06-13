package quanlynhansu.rest;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.dto.QuyetDinhKyLuatDTO;
import quanlynhansu.service.IDonViChucNangService;
import quanlynhansu.service.IQuyetDinhKyLuatService;

@RestController
@RequestMapping("/quyetDinhKyLuatService")
public class QuyetDinhKyLuatRestController {
	@Autowired
	private IQuyetDinhKyLuatService quyetdinhkyluat;
	@Autowired
	private IDonViChucNangService donViChucNangService;

	@GetMapping("/getAll")
	public List<QuyetDinhKyLuatDTO> getAll() {
		return quyetdinhkyluat.getAll();
	}

	@GetMapping("/getById/{pK}")
	public QuyetDinhKyLuatDTO getById(@PathVariable Integer pK){
		QuyetDinhKyLuatDTO ds = quyetdinhkyluat.getById(pK);
		return ds;
	}
	
	@GetMapping("/getCanBoByDonViChucNang/{donViChucNangPk}")
	public Set<CanBoDTO> getCanBoByDonViChucNang(@PathVariable Integer donViChucNangPk) {
		return donViChucNangService.getCanBoByDonViChucNang(donViChucNangPk);
	}
}
