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
import quanlynhansu.model.dto.HopDongCanBoDTO;
import quanlynhansu.service.IDonViChucNangService;
import quanlynhansu.service.IHopDongCanBoService;

@RestController
@RequestMapping("/hopDongCanBoService")
public class HopDongCanBoRestController {
	@Autowired
	private IHopDongCanBoService hopdongcanbo;
	@Autowired
	private IDonViChucNangService donViChucNangService;

	@GetMapping("/getAll")
	public List<HopDongCanBoDTO> getAll() throws SQLException {
		return hopdongcanbo.getAll();
	}

	@GetMapping("/getById/{pK}")
	public HopDongCanBoDTO getById(@PathVariable Integer pK){
		HopDongCanBoDTO hd = hopdongcanbo.getById(pK);
		return hd;
	}
	
	@GetMapping("/getCanBoByDonViChucNang/{donViChucNangPk}")
	public Set<CanBoDTO> getCanBoByDonViChucNang(
			@PathVariable Integer donViChucNangPk) {
		return donViChucNangService.getCanBoByDonViChucNang(donViChucNangPk);
	}
}
