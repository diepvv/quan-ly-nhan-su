package quanlynhansu.model.dto;

import java.io.Serializable;

public class NgachCongChucDTO implements Serializable {
	private static final long serialVersionUID = -3444123799992239424L;
	private Integer pk;
	private String maNgach;
	private String tenNgach;
	private Integer soNamNangBacLuong;

	public NgachCongChucDTO() {
	}

	public NgachCongChucDTO(Integer pk, String maNgach, String tenNgach,
			Integer soNamNangBacLuong) {
		this.pk = pk;
		this.maNgach = maNgach;
		this.tenNgach = tenNgach;
		this.soNamNangBacLuong = soNamNangBacLuong;
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
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

	public Integer getSoNamNangBacLuong() {
		return soNamNangBacLuong;
	}

	public void setSoNamNangBacLuong(Integer soNamNangBacLuong) {
		this.soNamNangBacLuong = soNamNangBacLuong;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}