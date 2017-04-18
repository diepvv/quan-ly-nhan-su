package quanlynhansu.services;

import java.sql.SQLException;
import java.util.ArrayList;

import quanlynhansu.models.dto.DonViChucNangDTO;

public interface IDonViChucNangService {
	public ArrayList<DonViChucNangDTO> getAll() throws SQLException;

	boolean delete(int id) throws SQLException;

	public DonViChucNangDTO getById(int id) throws SQLException;

	boolean update(DonViChucNangDTO t) throws SQLException;

	boolean insert(DonViChucNangDTO t) throws SQLException;
}
