package quanlynhansu.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.models.CanBo;
import quanlynhansu.models.HopDongNganHan;
import quanlynhansu.models.repository.ICanBo;
import quanlynhansu.models.repository.IHopDongNganHan;

@RestController
public class CanBoRestController {

	@Autowired
	private ICanBo canbo;
	@Autowired
	private IHopDongNganHan hopdongnganhan;

	@RequestMapping(path = "/getCanBo", method = RequestMethod.GET)
	public List<CanBo> getCanBo() {
		return canbo.createListCB(100);
	}

	@RequestMapping(path = "/hopDongNganHan", method = RequestMethod.GET)
	public List<HopDongNganHan> getHDNH() {
		return hopdongnganhan.createListHDNH(100);
	}
}
