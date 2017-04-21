package quanlynhansu.services;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Component;

import quanlynhansu.App;
import quanlynhansu.models.dto.DanhSachKhoanGonDTO;

@Component
public class DanhSachKhoanGonServiceImpl implements IDanhSachKhoanGonService {
	@Override
	public ArrayList<DanhSachKhoanGonDTO> getAll() throws SQLException {
		ArrayList<DanhSachKhoanGonDTO> ketqua = new ArrayList<>();
		// 1
		Connection connection = App.getConnection();
		// 2
		String sql = "SELECT * FROM danhsachkhoangon";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		// 3 execute
		ResultSet re = preStatement.executeQuery();
		while (re.next()) {
			int maCanBoKhoanGon = re.getInt("maCanBoKhoanGon");
			int maDonVi = re.getInt("maDonVi");
			String hoTenCanBo = re.getString("hoTenCanBo");
			int soDienThoai = re.getInt("soDienThoai");
			int soCMND = re.getInt("soCMND");
			String diaChi = re.getString("diaChi");
			Date ngayKyHopDong = re.getDate("ngayKyHopDong");

			DanhSachKhoanGonDTO p = new DanhSachKhoanGonDTO(maCanBoKhoanGon,
					maDonVi, hoTenCanBo, soDienThoai, soCMND, diaChi,
					ngayKyHopDong);
			ketqua.add(p);
		}
		return ketqua;
	}

	@Override
	public boolean delete(int id) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "DELETE FROM danhsachkhoangon WHERE maCanBoKhoanGon=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setInt(1, id);
		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}

	@Override
	public DanhSachKhoanGonDTO getById(int id) throws SQLException {
		DanhSachKhoanGonDTO ds = null;
		Connection connection = App.getConnection();
		String sql = "Select * from danhsachkhoangon where maCanBoKhoanGon ='"
				+ id + "'";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		ResultSet re = preparedStatement.executeQuery();
		if (re.next()) {
			int maCanBoKhoanGon = re.getInt("maCanBoKhoanGon");
			int maDonVi = re.getInt("maDonVi");
			String hoTenCanBo = re.getString("hoTenCanBo");
			int soDienThoai = re.getInt("soDienThoai");
			int soCMND = re.getInt("soCMND");
			String diaChi = re.getString("diaChi");
			Date ngayKyHopDong = re.getDate("ngayKyHopDong");
			ds = new DanhSachKhoanGonDTO(maCanBoKhoanGon, maDonVi, hoTenCanBo,
					soDienThoai, soCMND, diaChi, ngayKyHopDong);
		}
		return ds;
	}

	@Override
	public boolean update(DanhSachKhoanGonDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "UPDATE danhsachkhoangon SET maDonVi=?, hoTenCanBo=?, soDienThoai=?, soCMND=?, diaChi=?, ngayKyHopDong=?  WHERE maCanBoKhoanGon=?";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setInt(1, t.getMaDonVi());
		preStatement.setString(2, t.getHoTenCanBo());
		preStatement.setInt(3, t.getSoDienThoai());
		preStatement.setInt(4, t.getSoCMND());
		preStatement.setString(5, t.getDiaChi());
		preStatement.setDate(6, t.getNgayKyHopDong());
		preStatement.setInt(7, t.getMaCanBoKhoanGon());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;

	}

	@Override
	public boolean insert(DanhSachKhoanGonDTO t) throws SQLException {
		boolean ketqua = false;
		Connection connection = App.getConnection();
		String sql = "INSERT INTO danhsachkhoangon VALUES(?,?,?,?,?,?,?)";
		PreparedStatement preStatement = connection.prepareStatement(sql);
		preStatement.setString(1, null);
		preStatement.setInt(2, t.getMaDonVi());
		preStatement.setString(3, t.getHoTenCanBo());
		preStatement.setInt(4, t.getSoDienThoai());
		preStatement.setInt(5, t.getSoCMND());
		preStatement.setString(6, t.getDiaChi());
		preStatement.setDate(7, t.getNgayKyHopDong());

		int check = preStatement.executeUpdate();
		if (check > 0) {
			ketqua = true;
		}
		return ketqua;
	}
}
