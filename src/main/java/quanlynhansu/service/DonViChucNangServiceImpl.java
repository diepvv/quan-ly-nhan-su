package quanlynhansu.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import quanlynhansu.App;
import quanlynhansu.model.dto.DonViChucNangDTO;

@Component
public class DonViChucNangServiceImpl implements IDonViChucNangService {
	@Override
	public ArrayList<DonViChucNangDTO> getAll() throws SQLException {
		ArrayList<DonViChucNangDTO> ketqua = new ArrayList<>();
		// 1
		Connection connection = App.getConnection();
		// 2
		String sql = "SELECT * FROM donvichucnang";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		// 3 execute
		ResultSet re = preStatement.executeQuery();
		while (re.next()) {
			int maDonVi = re.getInt("maDonVi");
			String tenDonVi = re.getString("tenDonVi");
			DonViChucNangDTO p = new DonViChucNangDTO(maDonVi, tenDonVi);
			ketqua.add(p);
		}
		return ketqua;
	}

	@Override
	public boolean delete(int id) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "DELETE FROM donvichucnang WHERE maDonVi=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setInt(1, id);
		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}

	@Override
	public DonViChucNangDTO getById(int id) throws SQLException {
		DonViChucNangDTO d = null;
		Connection connection = App.getConnection();
		String sql = "Select * from donvichucnang where maDonVi ='" + id + "'";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet re = preparedStatement.executeQuery();
		if (re.next()) {
			int maDonVi = re.getInt("maDonVi");
			String tenDonVi = re.getString("tenDonVi");
			d = new DonViChucNangDTO(maDonVi, tenDonVi);
		}
		return d;
	}

	@Override
	public boolean update(DonViChucNangDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "UPDATE donvichucnang SET tenDonVi=? WHERE maDonVi=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, t.gettenDonVi());
		preStatement.setInt(2, t.getmaDonVi());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;

	}

	@Override
	public boolean insert(DonViChucNangDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "INSERT INTO donvichucnang VALUES(?,?)";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, null);
		preStatement.setString(2, t.gettenDonVi());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}
}
