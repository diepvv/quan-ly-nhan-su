package quanlynhansu.service;

import java.sql.SQLException;
import java.util.ArrayList;

import quanlynhansu.model.dto.LoaiHopDongDTO;

public interface ILoaiHopDongService {
	public ArrayList<LoaiHopDongDTO> getAll() throws SQLException;

	boolean delete(int id) throws SQLException;

	public LoaiHopDongDTO getById(int id) throws SQLException;

	boolean update(LoaiHopDongDTO t) throws SQLException;

	boolean insert(LoaiHopDongDTO t) throws SQLException;
}
