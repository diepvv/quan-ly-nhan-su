package quanlynhansu.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import quanlynhansu.App;
import quanlynhansu.model.dto.DanTocDTO;

@Component
public class DanTocImpl implements IDanTocService {
	@Override
	public ArrayList<DanTocDTO> getAll() throws SQLException {
		ArrayList<DanTocDTO> ketqua = new ArrayList<>();
		// 1
		Connection connection = App.getConnection();
		// 2
		String sql = "SELECT * FROM dantoc";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		// 3 execute
		ResultSet re = preStatement.executeQuery();
		while (re.next()) {
			int maDanToc = re.getInt("maDanToc");
			String tenDanToc = re.getString("tenDanToc");
			DanTocDTO p = new DanTocDTO(maDanToc, tenDanToc);
			ketqua.add(p);
		}
		return ketqua;
	}

	@Override
	public boolean delete(int id) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "DELETE FROM dantoc WHERE maDanToc=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setInt(1, id);
		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}

	@Override
	public DanTocDTO getById(int id) throws SQLException {
		DanTocDTO cv = null;
		Connection connection = App.getConnection();
		String sql = "Select * from dantoc where maDanToc ='" + id + "'";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet re = preparedStatement.executeQuery();
		if (re.next()) {
			int maDanToc = re.getInt("maDanToc");
			String tenDanToc = re.getString("tenDanToc");
			cv = new DanTocDTO(maDanToc, tenDanToc);
		}
		return cv;
	}

	@Override
	public boolean update(DanTocDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "UPDATE dantoc SET tenDanToc=? WHERE maDanToc=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, t.getTenDanToc());
		preStatement.setInt(2, t.getMaDanToc());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;

	}

	@Override
	public boolean insert(DanTocDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "INSERT INTO dantoc VALUES(?,?)";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, null);
		preStatement.setString(2, t.getTenDanToc());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}
}
