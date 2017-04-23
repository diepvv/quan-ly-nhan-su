package quanlynhansu.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import quanlynhansu.App;
import quanlynhansu.model.dto.TonGiaoDTO;

@Component
public class TonGiaoImpl implements ITonGiaoService {
	@Override
	public ArrayList<TonGiaoDTO> getAll() throws SQLException {
		ArrayList<TonGiaoDTO> ketqua = new ArrayList<>();
		// 1
		Connection connection = App.getConnection();
		// 2
		String sql = "SELECT * FROM tongiao";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		// 3 execute
		ResultSet re = preStatement.executeQuery();
		while (re.next()) {
			int maTonGiao = re.getInt("maTonGiao");
			String tenTonGiao = re.getString("tenTonGiao");
			TonGiaoDTO p = new TonGiaoDTO(maTonGiao, tenTonGiao);
			ketqua.add(p);
		}
		return ketqua;
	}

	@Override
	public boolean delete(int id) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "DELETE FROM tongiao WHERE maTonGiao=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setInt(1, id);
		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}

	@Override
	public TonGiaoDTO getById(int id) throws SQLException {
		TonGiaoDTO cv = null;
		Connection connection = App.getConnection();
		String sql = "Select * from tongiao where maTonGiao ='" + id + "'";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet re = preparedStatement.executeQuery();
		if (re.next()) {
			int maTonGiao = re.getInt("maTonGiao");
			String tenTonGiao = re.getString("tenTonGiao");
			cv = new TonGiaoDTO(maTonGiao, tenTonGiao);
		}
		return cv;
	}

	@Override
	public boolean update(TonGiaoDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "UPDATE tongiao SET tenTonGiao=? WHERE maTonGiao=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, t.getTenTonGiao());
		preStatement.setInt(2, t.getMaTonGiao());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;

	}

	@Override
	public boolean insert(TonGiaoDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "INSERT INTO tongiao VALUES(?,?)";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, null);
		preStatement.setString(2, t.getTenTonGiao());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}
}
