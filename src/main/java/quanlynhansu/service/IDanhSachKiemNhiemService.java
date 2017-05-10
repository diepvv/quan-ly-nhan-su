package quanlynhansu.service;

import java.util.ArrayList;

import quanlynhansu.model.dto.DanhSachKiemNhiemDTO;

public interface IDanhSachKiemNhiemService {
	public ArrayList<DanhSachKiemNhiemDTO> getAll();

	void delete(Integer id);

	public DanhSachKiemNhiemDTO getById(Integer id);

	DanhSachKiemNhiemDTO update(DanhSachKiemNhiemDTO t);

	DanhSachKiemNhiemDTO insert(DanhSachKiemNhiemDTO t);
}
