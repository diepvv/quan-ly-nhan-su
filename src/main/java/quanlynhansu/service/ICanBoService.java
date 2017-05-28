package quanlynhansu.service;

import java.util.ArrayList;
import java.util.Set;

import quanlynhansu.model.dto.CanBoDTO;

public interface ICanBoService {
	public ArrayList<CanBoDTO> getAll();

	void delete(Integer id, Integer version);

	public CanBoDTO getById(Integer id);

	CanBoDTO update(CanBoDTO t);

	CanBoDTO insert(CanBoDTO t);

	Set<CanBoDTO> getByGioiTinh(String cbGioiTinhs);
}
