package quanlynhansu.service;

import java.util.ArrayList;

import quanlynhansu.model.dto.KeKhaiTaiSanDTO;

public interface IKeKhaiTaiSanService {
	public ArrayList<KeKhaiTaiSanDTO> getAll();

	void delete(Integer id);

	public KeKhaiTaiSanDTO getById(Integer id);

	KeKhaiTaiSanDTO update(KeKhaiTaiSanDTO t);

	KeKhaiTaiSanDTO insert(KeKhaiTaiSanDTO t);
}