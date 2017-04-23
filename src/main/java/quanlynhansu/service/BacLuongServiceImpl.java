package quanlynhansu.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import quanlynhansu.App;
import quanlynhansu.model.dto.BacLuongDTO;

@Component
public class BacLuongServiceImpl implements IBacLuongService {
	@Override
	public ArrayList<BacLuongDTO> getAll() throws SQLException {
		ArrayList<BacLuongDTO> ketqua = new ArrayList<>();
		// 1
		Connection connection = App.getConnection();
		// 2
		String sql = "SELECT * FROM bacluong";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		// 3 execute
		ResultSet re = preStatement.executeQuery();
		while (re.next()) {
			int maBacLuong = re.getInt("maBacLuong");
			double heSoLuong = re.getDouble("heSoLuong");
			BacLuongDTO p = new BacLuongDTO(maBacLuong, heSoLuong);
			ketqua.add(p);
		}
		return ketqua;
	}

	@Override
	public boolean delete(int id) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "DELETE FROM bacluong WHERE maBacLuong=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setInt(1, id);
		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}

	@Override
	public BacLuongDTO getById(int id) throws SQLException {
		BacLuongDTO bl = null;
		Connection connection = App.getConnection();
		String sql = "Select * from bacluong where maBacLuong ='" + id + "'";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet re = preparedStatement.executeQuery();
		if (re.next()) {
			int maBacLuong = re.getInt("maBacLuong");
			double heSoLuong = re.getDouble("heSoLuong");
			bl = new BacLuongDTO(maBacLuong, heSoLuong);
		}
		return bl;
	}

	@Override
	public boolean update(BacLuongDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "UPDATE bacluong SET heSoLuong=? WHERE maBacLuong=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setDouble(1, t.getHeSoLuong());
		preStatement.setInt(2, t.getMaBacLuong());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;

	}

	@Override
	public boolean insert(BacLuongDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "INSERT INTO bacluong VALUES(?,?)";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, null);
		preStatement.setDouble(2, t.getHeSoLuong());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}
}
