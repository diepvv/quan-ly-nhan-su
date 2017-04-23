package quanlynhansu.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import quanlynhansu.App;
import quanlynhansu.model.dto.ChucVuDTO;

@Component
public class ChucVuImpl implements IChucVuService {
	@Override
	public ArrayList<ChucVuDTO> getAll() throws SQLException {
		ArrayList<ChucVuDTO> ketqua = new ArrayList<>();
		// 1
		Connection connection = App.getConnection();
		// 2
		String sql = "SELECT * FROM chucvu";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		// 3 execute
		ResultSet re = preStatement.executeQuery();
		while (re.next()) {
			int maChucVu = re.getInt("maChucVu");
			String tenChucVu = re.getString("tenChucVu");
			ChucVuDTO p = new ChucVuDTO(maChucVu, tenChucVu);
			ketqua.add(p);
		}
		return ketqua;
	}

	@Override
	public boolean delete(int id) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "DELETE FROM chucvu WHERE maChucVu=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setInt(1, id);
		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}

	@Override
	public ChucVuDTO getById(int id) throws SQLException {
		ChucVuDTO cv = null;
		Connection connection = App.getConnection();
		String sql = "Select * from chucvu where maChucVu ='" + id + "'";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet re = preparedStatement.executeQuery();
		if (re.next()) {
			int maChucVu = re.getInt("maChucVu");
			String tenChucVu = re.getString("tenChucVu");
			cv = new ChucVuDTO(maChucVu, tenChucVu);
		}
		return cv;
	}

	@Override
	public boolean update(ChucVuDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "UPDATE chucvu SET tenChucVu=? WHERE maChucVu=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, t.getTenChucVu());
		preStatement.setInt(2, t.getMaChucVu());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;

	}

	@Override
	public boolean insert(ChucVuDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "INSERT INTO chucvu VALUES(?,?)";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, null);
		preStatement.setString(2, t.getTenChucVu());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}
}
