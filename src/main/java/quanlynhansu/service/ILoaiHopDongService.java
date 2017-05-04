package quanlynhansu.service;

import java.util.ArrayList;

import quanlynhansu.model.dto.LoaiHopDongDTO;

public interface ILoaiHopDongService {
	public ArrayList<LoaiHopDongDTO> getAll();

	void delete(Integer id);

	public LoaiHopDongDTO getById(Integer id);

	LoaiHopDongDTO update(LoaiHopDongDTO t);

	LoaiHopDongDTO insert(LoaiHopDongDTO t);
}
