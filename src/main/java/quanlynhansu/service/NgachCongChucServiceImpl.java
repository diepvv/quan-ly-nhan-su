package quanlynhansu.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import quanlynhansu.App;
import quanlynhansu.model.dto.NgachCongChucDTO;

@Component
public class NgachCongChucServiceImpl implements INgachCongChucService {
	@Override
	public ArrayList<NgachCongChucDTO> getAll() throws SQLException {
		ArrayList<NgachCongChucDTO> ketqua = new ArrayList<>();
		// 1
		Connection connection = App.getConnection();
		// 2
		String sql = "SELECT * FROM ngachcongchuc";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		// 3 execute
		ResultSet re = preStatement.executeQuery();
		while (re.next()) {
			String maNgach = re.getString("maNgach");
			String tenNgach = re.getString("tenNgach");
			int soNamNangBacLuong = re.getInt("soNamNangBacLuong");
			NgachCongChucDTO p = new NgachCongChucDTO(maNgach, tenNgach,
					soNamNangBacLuong);
			ketqua.add(p);
		}
		return ketqua;
	}

	@Override
	public boolean delete(String id) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "DELETE FROM ngachcongchuc WHERE maNgach=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, id);
		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}

	@Override
	public NgachCongChucDTO getById(String id) throws SQLException {
		NgachCongChucDTO ncc = null;
		Connection connection = App.getConnection();
		String sql = "Select * from ngachcongchuc where maNgach ='" + id + "'";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet re = preparedStatement.executeQuery();
		if (re.next()) {
			String maNgach = re.getString("maNgach");
			String tenNgach = re.getString("tenNgach");
			int soNamNangBacLuong = re.getInt("soNamNangBacLuong");
			ncc = new NgachCongChucDTO(maNgach, tenNgach, soNamNangBacLuong);
		}
		return ncc;
	}

	@Override
	public boolean update(NgachCongChucDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "UPDATE ngachcongchuc SET tenNgach=?, soNamNangBacLuong = ? WHERE maNgach=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, t.getTenNgach());
		preStatement.setInt(2, t.getSoNamNangBacLuong());
		preStatement.setString(3, t.getMaNgach());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;

	}

	@Override
	public boolean insert(NgachCongChucDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "INSERT INTO ngachcongchuc VALUES(?,?,?)";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, t.getMaNgach());
		preStatement.setString(2, t.getTenNgach());
		preStatement.setInt(3, t.getSoNamNangBacLuong());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}
}
