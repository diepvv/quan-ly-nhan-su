package quanlynhansu.service;

import java.util.ArrayList;
import java.util.Set;

import quanlynhansu.model.dto.BoMonDTO;
import quanlynhansu.model.dto.CanBoDTO;
import quanlynhansu.model.dto.DonViChucNangDTO;

public interface IDonViChucNangService {
	public ArrayList<DonViChucNangDTO> getAll();

	void delete(Integer id);

	public DonViChucNangDTO getById(Integer id);

	DonViChucNangDTO update(DonViChucNangDTO t);

	DonViChucNangDTO insert(DonViChucNangDTO t);

	Set<BoMonDTO> getBoMonByDonViChucNang(Integer donViChucNangPk);

	Set<CanBoDTO> getCanBoByDonViChucNang(Integer donViChucNangPk);
}
