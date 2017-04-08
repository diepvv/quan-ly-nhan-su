package quanlynhansu.models.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import quanlynhansu.App;
import quanlynhansu.models.HopDongNganHan;

@Component
public class HopDongNganHanImp implements IHopDongNganHan {
	public List<HopDongNganHan> createListHDNH(int count) {

		List<HopDongNganHan> listHBNH = new ArrayList<HopDongNganHan>();
		for (int i = 0; i < count; i++) {
			listHBNH.add(new HopDongNganHan(i + 1, "Tuyển dụng lao động",
					"Nguyễn Văn A", null, null, null));
		}
		return listHBNH;
	}

	@Override
	public ArrayList<HopDongNganHan> getAll() throws SQLException {
		ArrayList<HopDongNganHan> ketqua = new ArrayList<>();
		// 1
		Connection connection = App.getConnection();

		// 2
		String sql = "SELECT * FROM hopdongnganhan";
		PreparedStatement preStatement = connection.prepareStatement(sql);

		// 3 execute
		ResultSet re = preStatement.executeQuery();
		while (re.next()) {
			int maHDNganHan = re.getInt("maHDNganHan");
			String tenHopDong = re.getString("tenHopDong");
			String tenNhanVien = re.getString("tenNhanVien");
			Date ngayKy = re.getDate("ngayKy");
			Date tuNgay = re.getDate("tuNgay");
			Date denNgay = re.getDate("denNgay");
			HopDongNganHan p = new HopDongNganHan(maHDNganHan, tenHopDong,
					tenNhanVien, ngayKy, tuNgay, denNgay);
			ketqua.add(p);
		}
		return ketqua;
	}

	@Override
	public boolean delete(int id) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "DELETE FROM hopdongnganhan WHERE maHDNganHan=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setInt(1, id);
		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}

	@Override
	public HopDongNganHan getById(int id) throws SQLException {
		HopDongNganHan h = null;
		Connection connection = App.getConnection();
		String sql = "Select * from hopdongnganhan where maHDNganHan ='" + id + "'";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet re = preparedStatement.executeQuery();
		if (re.next()) {
			int idHDNganHan = re.getInt("maHDNganHan");
			String tenHDNganHan = re.getString("tenHopDong");
			String tenNhanVien = re.getString("tenNhanVien");
			Date ngayKy = re.getDate("ngayKy");
			Date tuNgay = re.getDate("tuNgay");
			Date denNgay = re.getDate("denNgay");
			h = new HopDongNganHan(idHDNganHan, tenHDNganHan, tenNhanVien,
					ngayKy, tuNgay, denNgay);
		}
		return h;
	}

}
