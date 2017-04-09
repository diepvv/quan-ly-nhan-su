package quanlynhansu.models.dto;

import java.io.Serializable;
import java.util.Date;

public class HopDongNganHanDTO implements Serializable {
	private static final long serialVersionUID = 8020888727398957523L;
	private int maHDNganHan;
	private String tenHopDong;
	private String tenNhanVien;
	private Date ngayKy;
	private Date tuNgay;
	private Date denNgay;

	public HopDongNganHanDTO() {
	}

	@Deprecated
	public HopDongNganHanDTO(int maHDNganHan, String tenHopDong,
			String tenNhanVien, Date ngayKy, Date tuNgay, Date denNgay) {
		this.maHDNganHan = maHDNganHan;
		this.tenHopDong = tenHopDong;
		this.tenNhanVien = tenNhanVien;
		this.ngayKy = ngayKy;
		this.tuNgay = tuNgay;
		this.denNgay = denNgay;
	}

	public int getMaHDNganHan() {
		return maHDNganHan;
	}

	public void setMaHDNganHan(int maHDNganHan) {
		this.maHDNganHan = maHDNganHan;
	}

	public String getTenHopDong() {
		return tenHopDong;
	}

	public void setTenHopDong(String tenHopDong) {
		this.tenHopDong = tenHopDong;
	}

	public String getTenNhanVien() {
		return tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public Date getNgayKy() {
		return ngayKy;
	}

	public void setNgayKy(Date ngayKy) {
		this.ngayKy = ngayKy;
	}

	public Date getTuNgay() {
		return tuNgay;
	}

	public void setTuNgay(Date tuNgay) {
		this.tuNgay = tuNgay;
	}

	public Date getDenNgay() {
		return denNgay;
	}

	public void setDenNgay(Date denNgay) {
		this.denNgay = denNgay;
	}

}
