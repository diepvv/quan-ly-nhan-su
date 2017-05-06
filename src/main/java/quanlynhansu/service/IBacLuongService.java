package quanlynhansu.service;

import java.util.ArrayList;

import quanlynhansu.model.dto.BacLuongDTO;

public interface IBacLuongService {
	public ArrayList<BacLuongDTO> getAll();

	void delete(Integer id);

	public BacLuongDTO getById(Integer id);

	BacLuongDTO update(BacLuongDTO t);

	BacLuongDTO insert(BacLuongDTO t);
}
