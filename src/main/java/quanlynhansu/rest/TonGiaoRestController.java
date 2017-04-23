package quanlynhansu.rest;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.model.dto.TonGiaoDTO;
import quanlynhansu.service.ITonGiaoService;

@RestController
@RequestMapping("/tonGiaoService")
public class TonGiaoRestController {
	@Autowired
	private ITonGiaoService tongiao;

	@GetMapping("/getAll")
	public List<TonGiaoDTO> getAll() throws SQLException {
		return tongiao.getAll();
	}

	@GetMapping("/getById/{maTG}")
	public TonGiaoDTO getById(@PathVariable int maTG) throws ParseException,
			SQLException {
		TonGiaoDTO tg = tongiao.getById(maTG);
		return tg;
	}
}
