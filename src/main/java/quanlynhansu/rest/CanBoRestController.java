package quanlynhansu.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.service.ICanBoService;

@RestController
@RequestMapping("/canBoService")
public class CanBoRestController {

	@Autowired
	private ICanBoService canbo;

	@GetMapping("/getAll")
	public List<CanBoDTO> getAll() {
		return canbo.createListCB(100);
	}
}
