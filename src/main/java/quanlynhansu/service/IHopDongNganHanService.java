package quanlynhansu.service;

import java.sql.SQLException;
import java.util.ArrayList;

import quanlynhansu.model.dto.HopDongNganHanDTO;

public interface IHopDongNganHanService {

    ArrayList<HopDongNganHanDTO> getAll() throws SQLException;

    void delete(int id) throws SQLException;

    HopDongNganHanDTO getById(int id) throws SQLException;

    HopDongNganHanDTO update(HopDongNganHanDTO t) throws SQLException;

    HopDongNganHanDTO insert(HopDongNganHanDTO t) throws SQLException;
}
