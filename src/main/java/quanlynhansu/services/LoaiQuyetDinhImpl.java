package quanlynhansu.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import quanlynhansu.App;
import quanlynhansu.models.dto.LoaiQuyetDinhDTO;

@Component
public class LoaiQuyetDinhImpl implements ILoaiQuyetDinhService {
	@Override
	public ArrayList<LoaiQuyetDinhDTO> getAll() throws SQLException {
		ArrayList<LoaiQuyetDinhDTO> ketqua = new ArrayList<>();
		// 1
		Connection connection = App.getConnection();
		// 2
		String sql = "SELECT * FROM loaiquyetdinh";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		// 3 execute
		ResultSet re = preStatement.executeQuery();
		while (re.next()) {
			int maLoaiQuyetDinh = re.getInt("maLoaiQuyetDinh");
			String tenLoaiQuyetDinh = re.getString("tenLoaiQuyetDinh");
			LoaiQuyetDinhDTO p = new LoaiQuyetDinhDTO(maLoaiQuyetDinh,
					tenLoaiQuyetDinh);
			ketqua.add(p);
		}
		return ketqua;
	}

	@Override
	public boolean delete(int id) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "DELETE FROM loaiquyetdinh WHERE maLoaiQuyetDinh=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setInt(1, id);
		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}

	@Override
	public LoaiQuyetDinhDTO getById(int id) throws SQLException {
		LoaiQuyetDinhDTO d = null;
		Connection connection = App.getConnection();
		String sql = "Select * from loaiquyetdinh where maLoaiQuyetDinh ='"
				+ id + "'";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet re = preparedStatement.executeQuery();
		if (re.next()) {
			int maLoaiQuyetDinh = re.getInt("maLoaiQuyetDinh");
			String tenLoaiQuyetDinh = re.getString("tenLoaiQuyetDinh");
			d = new LoaiQuyetDinhDTO(maLoaiQuyetDinh, tenLoaiQuyetDinh);
		}
		return d;
	}

	@Override
	public boolean update(LoaiQuyetDinhDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "UPDATE loaiquyetdinh SET tenLoaiQuyetDinh=? WHERE maLoaiQuyetDinh=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, t.getTenLoaiQuyetDinh());
		preStatement.setInt(2, t.getMaLoaiQuyetDinh());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;

	}

	@Override
	public boolean insert(LoaiQuyetDinhDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "INSERT INTO loaiquyetdinh VALUES(?,?)";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, null);
		preStatement.setString(2, t.getTenLoaiQuyetDinh());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}
}
