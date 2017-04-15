package quanlynhansu.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import quanlynhansu.App;
import quanlynhansu.models.dto.HopDongNganHanDTO;

@Component
public class HopDongNganHanServiceImpl implements IHopDongNganHanService {
	public List<HopDongNganHanDTO> createListHDNH(int count) {

		List<HopDongNganHanDTO> listHBNH = new ArrayList<HopDongNganHanDTO>();
		for (int i = 0; i < count; i++) {
			listHBNH.add(new HopDongNganHanDTO(i + 1, "Tuyển dụng lao động",
					"Nguyễn Văn A", null, null, null));
		}
		return listHBNH;
	}

	@Override
	public ArrayList<HopDongNganHanDTO> getAll() throws SQLException {
		ArrayList<HopDongNganHanDTO> ketqua = new ArrayList<>();
		// 1
		Connection connection = App.getConnection();

		// 2
		String sql = "SELECT * FROM HOPDONGNGANHAN";
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
			HopDongNganHanDTO p = new HopDongNganHanDTO(maHDNganHan,
					tenHopDong, tenNhanVien, ngayKy, tuNgay, denNgay);
			ketqua.add(p);
		}
		return ketqua;
	}

	@Override
	public boolean delete(int id) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "DELETE FROM HOPDONGNGANHAN WHERE maHDNganHan=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setInt(1, id);
		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}

	@Override
	public HopDongNganHanDTO getById(int id) throws SQLException {
		HopDongNganHanDTO h = null;
		Connection connection = App.getConnection();
		String sql = "Select * from HOPDONGNGANHAN where maHDNganHan ='" + id
				+ "'";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet re = preparedStatement.executeQuery();
		if (re.next()) {
			int idHDNganHan = re.getInt("maHDNganHan");
			String tenHDNganHan = re.getString("tenHopDong");
			String tenNhanVien = re.getString("tenNhanVien");
			Date ngayKy = re.getDate("ngayKy");
			Date tuNgay = re.getDate("tuNgay");
			Date denNgay = re.getDate("denNgay");
			h = new HopDongNganHanDTO(idHDNganHan, tenHDNganHan, tenNhanVien,
					ngayKy, tuNgay, denNgay);
		}
		return h;
	}

	@Override
	public boolean update(HopDongNganHanDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "UPDATE HOPDONGNGANHAN SET tenHopDong=?, tenNhanVien=?, ngayKy=?, tuNgay=?, denNgay=? WHERE maHDNganHan=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, t.getTenHopDong());
		preStatement.setString(2, t.getTenNhanVien());
		preStatement.setDate(3, t.getNgayKy());
		preStatement.setDate(4, t.getTuNgay());
		preStatement.setDate(5, t.getDenNgay());
		preStatement.setInt(6, t.getMaHDNganHan());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;

	}

	@Override
	public boolean insert(HopDongNganHanDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "INSERT INTO HOPDONGNGANHAN VALUES(?,?,?,?,?,?)";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, null);
		preStatement.setString(2, t.getTenHopDong());
		preStatement.setString(3, t.getTenNhanVien());
		preStatement.setDate(4, t.getNgayKy());
		preStatement.setDate(5, t.getTuNgay());
		preStatement.setDate(6, t.getDenNgay());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}

}
