package quanlynhansu.services;

import java.sql.SQLException;
import java.util.ArrayList;

import quanlynhansu.models.dto.ChucVuDTO;

public interface IChucVuService {
	public ArrayList<ChucVuDTO> getAll() throws SQLException;

	boolean delete(int id) throws SQLException;

	public ChucVuDTO getById(int id) throws SQLException;

	boolean update(ChucVuDTO t) throws SQLException;

	boolean insert(ChucVuDTO t) throws SQLException;
}
