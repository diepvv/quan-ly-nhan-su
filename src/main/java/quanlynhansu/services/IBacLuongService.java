package quanlynhansu.services;

import java.sql.SQLException;
import java.util.ArrayList;

import quanlynhansu.models.dto.BacLuongDTO;

public interface IBacLuongService {
	public ArrayList<BacLuongDTO> getAll() throws SQLException;

	boolean delete(int id) throws SQLException;

	public BacLuongDTO getById(int id) throws SQLException;

	boolean update(BacLuongDTO t) throws SQLException;

	boolean insert(BacLuongDTO t) throws SQLException;
}
