package quanlynhansu.model.dto;

import java.io.Serializable;
import java.util.Date;

public class HopDongNganHanDTO implements Serializable {
	private static final long serialVersionUID = 8020888727398957523L;
	private Integer pk;
	private String tenHopDong;
	private String tenNhanVien;
	private Date ngayKy;
	private Date tuNgay;
	private Date denNgay;
	private Integer version = 0;

	public HopDongNganHanDTO() {
	}

	public HopDongNganHanDTO(Integer pk, String tenHopDong, String tenNhanVien,
			Date ngayKy, Date tuNgay, Date denNgay) {
		this.pk = pk;
		this.tenHopDong = tenHopDong;
		this.tenNhanVien = tenNhanVien;
		this.ngayKy = ngayKy;
		this.tuNgay = tuNgay;
		this.denNgay = denNgay;
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
