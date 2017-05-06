package quanlynhansu.rest;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import quanlynhansu.model.dto.BacLuongDTO;
import quanlynhansu.service.IBacLuongService;

@RestController
@RequestMapping("/bacLuongService")
public class BacLuongRestController {
	@Autowired
	private IBacLuongService bacluong;

	@GetMapping("/getAll")
	public List<BacLuongDTO> getAll() throws SQLException {
		return bacluong.getAll();
	}

	@GetMapping("/getById/{pK}")
	public BacLuongDTO getById(@PathVariable Integer pK) throws ParseException,
			SQLException {
		BacLuongDTO dt = bacluong.getById(pK);
		return dt;
	}
}
