package quanlynhansu.services;

import java.sql.SQLException;
import java.util.ArrayList;

import quanlynhansu.models.dto.NgachCongChucDTO;

public interface INgachCongChucService {
	public ArrayList<NgachCongChucDTO> getAll() throws SQLException;

	boolean delete(String id) throws SQLException;

	public NgachCongChucDTO getById(String id) throws SQLException;

	boolean update(NgachCongChucDTO t) throws SQLException;

	boolean insert(NgachCongChucDTO t) throws SQLException;
}
