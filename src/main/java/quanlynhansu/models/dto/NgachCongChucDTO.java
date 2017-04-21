package quanlynhansu.models.dto;

import java.io.Serializable;

public class NgachCongChucDTO implements Serializable {
	private static final long serialVersionUID = -3444123799992239424L;
	private String maNgach;
	private String tenNgach;
	private int soNamNangBacLuong;

	public NgachCongChucDTO() {
	}

	public NgachCongChucDTO(String maNgach, String tenNgach,
			int soNamNangBacLuong) {
		this.maNgach = maNgach;
		this.tenNgach = tenNgach;
		this.soNamNangBacLuong = soNamNangBacLuong;
	}

	public String getMaNgach() {
		return maNgach;
	}

	public void setMaNgach(String maNgach) {
		this.maNgach = maNgach;
	}

	public String getTenNgach() {
		return tenNgach;
	}

	public void setTenNgach(String tenNgach) {
		this.tenNgach = tenNgach;
	}

	public int getSoNamNangBacLuong() {
		return soNamNangBacLuong;
	}

	public void setSoNamNangBacLuong(int soNamNangBacLuong) {
		this.soNamNangBacLuong = soNamNangBacLuong;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
