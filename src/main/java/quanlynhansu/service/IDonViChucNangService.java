package quanlynhansu.service;

import java.util.ArrayList;

import quanlynhansu.model.dto.DonViChucNangDTO;

public interface IDonViChucNangService {
	public ArrayList<DonViChucNangDTO> getAll();

	void delete(Integer id);

	public DonViChucNangDTO getById(Integer id);

	DonViChucNangDTO update(DonViChucNangDTO t);

	DonViChucNangDTO insert(DonViChucNangDTO t);
}
