package quanlynhansu.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import quanlynhansu.App;
import quanlynhansu.models.dto.LoaiHopDongDTO;

@Component
public class LoaiHopDongImpl implements ILoaiHopDongService {
	@Override
	public ArrayList<LoaiHopDongDTO> getAll() throws SQLException {
		ArrayList<LoaiHopDongDTO> ketqua = new ArrayList<>();
		// 1
		Connection connection = App.getConnection();
		// 2
		String sql = "SELECT * FROM loaihopdong";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		// 3 execute
		ResultSet re = preStatement.executeQuery();
		while (re.next()) {
			int maLoaiHopDong = re.getInt("maLoaiHopDong");
			String tenLoaiHopDong = re.getString("tenLoaiHopDong");
			LoaiHopDongDTO p = new LoaiHopDongDTO(maLoaiHopDong, tenLoaiHopDong);
			ketqua.add(p);
		}
		return ketqua;
	}

	@Override
	public boolean delete(int id) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "DELETE FROM loaihopdong WHERE maLoaiHopDong=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setInt(1, id);
		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}

	@Override
	public LoaiHopDongDTO getById(int id) throws SQLException {
		LoaiHopDongDTO d = null;
		Connection connection = App.getConnection();
		String sql = "Select * from loaihopdong where maLoaiHopDong ='" + id
				+ "'";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet re = preparedStatement.executeQuery();
		if (re.next()) {
			int maLoaiHopDong = re.getInt("maLoaiHopDong");
			String tenLoaiHopDong = re.getString("tenLoaiHopDong");
			d = new LoaiHopDongDTO(maLoaiHopDong, tenLoaiHopDong);
		}
		return d;
	}

	@Override
	public boolean update(LoaiHopDongDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "UPDATE loaihopdong SET tenLoaiHopDong=? WHERE maLoaiHopDong=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, t.getTenLoaiHopDong());
		preStatement.setInt(2, t.getMaLoaiHopDong());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;

	}

	@Override
	public boolean insert(LoaiHopDongDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "INSERT INTO loaihopdong VALUES(?,?)";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, null);
		preStatement.setString(2, t.getTenLoaiHopDong());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}
}
