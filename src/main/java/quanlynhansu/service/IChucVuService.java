package quanlynhansu.service;

import java.util.ArrayList;

import quanlynhansu.model.dto.ChucVuDTO;

public interface IChucVuService {
	public ArrayList<ChucVuDTO> getAll();

	void delete(Integer id);

	public ChucVuDTO getById(Integer id);

	ChucVuDTO update(ChucVuDTO t);

	ChucVuDTO insert(ChucVuDTO t);
}
