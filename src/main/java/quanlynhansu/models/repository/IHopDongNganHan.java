package quanlynhansu.models.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import quanlynhansu.models.HopDongNganHan;

public interface IHopDongNganHan {
	List<HopDongNganHan> createListHDNH(int count);

	public ArrayList<HopDongNganHan> getAll() throws SQLException;

	boolean delete(int id) throws SQLException;

	public HopDongNganHan getById(int id) throws SQLException;

}
