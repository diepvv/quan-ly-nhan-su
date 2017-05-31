package quanlynhansu.rest;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

	@GetMapping("/getByGioiTinh/{cbGioiTinhs}")
	public Set<CanBoDTO> getByGioiTinh(@PathVariable String cbGioiTinhs) {
		return canbo.getByGioiTinh(cbGioiTinhs);
	}

	@GetMapping("/getByDanToc/{cbDanTocs}")
	public Set<CanBoDTO> getByDanToc(@PathVariable Integer cbDanTocs) {
		return canbo.getByDanToc(cbDanTocs);
	}

	@GetMapping("/getByTonGiao/{cbTonGiaos}")
	public Set<CanBoDTO> getByTonGiao(@PathVariable Integer cbTonGiaos) {
		return canbo.getByTonGiao(cbTonGiaos);
	}

	@GetMapping("/getByChucVu/{cbChucVus}")
	public Set<CanBoDTO> getByChucVu(@PathVariable Integer cbChucVus) {
		return canbo.getByChucVu(cbChucVus);
	}

	@GetMapping("/getByChucDanh/{chucDanh}")
	public Set<CanBoDTO> getByChucDanh(@PathVariable String chucDanh) {
		return canbo.getByChucDanh(chucDanh);
	}

	@GetMapping("/getByBoMon/{cbDonViChucNangs}")
	public Set<CanBoDTO> getByDonViBoMon(
			@PathVariable Integer cbDonViChucNangs,
			@RequestParam(value = "boMon") Integer cbBoMons) {
		return canbo.getByDonViBoMon(cbDonViChucNangs, cbBoMons);
	}
	
	@GetMapping("/getByQueQuan/{cbQueQuans}")
	public Set<CanBoDTO> getByQueQuan(@PathVariable Integer cbQueQuans) {
		return canbo.getByQueQuan(cbQueQuans);
	}
	
	@GetMapping("/getByNgachCongChuc/{cbNgachCongChucs}")
	public Set<CanBoDTO> getByNgachCongChuc(@PathVariable Integer cbNgachCongChucs) {
		return canbo.getByNgachCongChuc(cbNgachCongChucs);
	}
	
	@GetMapping("/getByDonViChucNang/{txtDonViChucNangs}")
	public Set<CanBoDTO> getByDonViChucNang(@PathVariable Integer txtDonViChucNangs) {
		return canbo.getByDonViChucNang(txtDonViChucNangs);
	}
	
	
}
