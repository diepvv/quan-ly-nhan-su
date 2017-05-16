package quanlynhansu.rest;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.model.dto.BacLuongDTO;
import quanlynhansu.model.dto.BoMonDTO;
import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.service.ICanBoService;
import quanlynhansu.service.IDonViChucNangService;
import quanlynhansu.service.INgachCongChucService;

@RestController
@RequestMapping("/canBoService")
public class CanBoRestController {
	@Autowired
	private IDonViChucNangService donViChucNangService;
	@Autowired
	private INgachCongChucService ngachCongChucService;
	@Autowired
	private ICanBoService canbo;

	@GetMapping("/getAll")
	public List<CanBoDTO> getAll() {
		return canbo.getAll();
	}

	@GetMapping("/getBoMonByDonViChucNang/{donViChucNangPk}")
	public Set<BoMonDTO> getBoMonByDonViChucNang(
			@PathVariable Integer donViChucNangPk) {
		return donViChucNangService.getBoMonByDonViChucNang(donViChucNangPk);
	}

	@GetMapping("/getById/{pK}")
	public CanBoDTO getById(@PathVariable Integer pK) {
		CanBoDTO dt = canbo.getById(pK);
		return dt;
	}

	@GetMapping("/getBacLuongByNgachCongChuc/{ngachCongChucPk}")
	public Set<BacLuongDTO> getBacLuongByNgachCongChuc(
			@PathVariable Integer ngachCongChucPk) {
		return ngachCongChucService.getBacLuongByNgachCongChuc(ngachCongChucPk);
	}
}
