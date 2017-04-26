package quanlynhansu.service;

import java.sql.SQLException;
import java.util.ArrayList;

import quanlynhansu.model.dto.DanTocDTO;

public interface IDanTocService {
	public ArrayList<DanTocDTO> getAll() throws SQLException;

	void delete(Integer id) throws SQLException;

	public DanTocDTO getById(Integer id) throws SQLException;

	DanTocDTO update(DanTocDTO t) throws SQLException;

	DanTocDTO insert(DanTocDTO t) throws SQLException;
}
