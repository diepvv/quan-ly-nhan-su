package quanlynhansu.services;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import quanlynhansu.models.dto.HopDongNganHanDTO;

public interface IHopDongNganHanService {
	List<HopDongNganHanDTO> createListHDNH(int count);

	public ArrayList<HopDongNganHanDTO> getAll() throws SQLException;

	boolean delete(int id) throws SQLException;

	public HopDongNganHanDTO getById(int id) throws SQLException;

	boolean update(HopDongNganHanDTO t) throws SQLException;

}
