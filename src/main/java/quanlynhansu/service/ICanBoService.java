package quanlynhansu.service;

import java.util.ArrayList;

import quanlynhansu.model.dto.CanBoDTO;

public interface ICanBoService {
	public ArrayList<CanBoDTO> getAll();

	void delete(Integer id);

	public CanBoDTO getById(Integer id);

	CanBoDTO update(CanBoDTO t);

	CanBoDTO insert(CanBoDTO t);
}
