package quanlynhansu.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.models.CanBo;
import quanlynhansu.models.repository.ICanBo;

@RestController
public class CanBoRestController {

	@Autowired
	private ICanBo canbo;

	@RequestMapping(path = "/getCanBo", method = RequestMethod.GET)
	public List<CanBo> getCanBo() {
		return canbo.createListCB(100);
	}
}
