package quanlynhansu.service;

import java.util.ArrayList;

import quanlynhansu.model.dto.DanhSachThamNienDTO;

public interface IDanhSachThamNienService {
	public ArrayList<DanhSachThamNienDTO> getAll();

	void delete(Integer id);

	public DanhSachThamNienDTO getById(Integer id);

	DanhSachThamNienDTO update(DanhSachThamNienDTO t);

	DanhSachThamNienDTO insert(DanhSachThamNienDTO t);
}
