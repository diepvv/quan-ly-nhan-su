package quanlynhansu.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.model.dto.KeKhaiTaiSanDTO;
import quanlynhansu.service.IKeKhaiTaiSanService;

@RestController
@RequestMapping("/keKhaiTaiSanService")
public class KeKhaiTaiSanRestController {
	@Autowired
	private IKeKhaiTaiSanService kekhaitaisan;

	@GetMapping("/getAll")
	public List<KeKhaiTaiSanDTO> getAll() {
		return kekhaitaisan.getAll();
	}

	@GetMapping("/getById/{pK}")
	public KeKhaiTaiSanDTO getById(@PathVariable Integer pK) {
		KeKhaiTaiSanDTO ts = kekhaitaisan.getById(pK);
		return ts;
	}
}
