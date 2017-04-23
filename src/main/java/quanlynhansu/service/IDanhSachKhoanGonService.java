package quanlynhansu.service;

import java.sql.SQLException;
import java.util.ArrayList;

import quanlynhansu.model.dto.DanhSachKhoanGonDTO;

public interface IDanhSachKhoanGonService {
	public ArrayList<DanhSachKhoanGonDTO> getAll() throws SQLException;

	boolean delete(int id) throws SQLException;

	public DanhSachKhoanGonDTO getById(int id) throws SQLException;

	boolean update(DanhSachKhoanGonDTO t) throws SQLException;

	boolean insert(DanhSachKhoanGonDTO t) throws SQLException;
}
