package quanlynhansu.services;

import java.sql.SQLException;
import java.util.ArrayList;

import quanlynhansu.models.dto.DanTocDTO;

public interface IDanTocService {
	public ArrayList<DanTocDTO> getAll() throws SQLException;

	boolean delete(int id) throws SQLException;

	public DanTocDTO getById(int id) throws SQLException;

	boolean update(DanTocDTO t) throws SQLException;

	boolean insert(DanTocDTO t) throws SQLException;
}
