package quanlynhansu.service;

import java.sql.SQLException;
import java.util.ArrayList;

import quanlynhansu.model.dto.LoaiQuyetDinhDTO;

public interface ILoaiQuyetDinhService {
	public ArrayList<LoaiQuyetDinhDTO> getAll() throws SQLException;

	boolean delete(int id) throws SQLException;

	public LoaiQuyetDinhDTO getById(int id) throws SQLException;

	boolean update(LoaiQuyetDinhDTO t) throws SQLException;

	boolean insert(LoaiQuyetDinhDTO t) throws SQLException;
}
