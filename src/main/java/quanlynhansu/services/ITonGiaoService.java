package quanlynhansu.services;

import java.sql.SQLException;
import java.util.ArrayList;

import quanlynhansu.models.dto.TonGiaoDTO;

public interface ITonGiaoService {
	public ArrayList<TonGiaoDTO> getAll() throws SQLException;

	boolean delete(int id) throws SQLException;

	public TonGiaoDTO getById(int id) throws SQLException;

	boolean update(TonGiaoDTO t) throws SQLException;

	boolean insert(TonGiaoDTO t) throws SQLException;
}
