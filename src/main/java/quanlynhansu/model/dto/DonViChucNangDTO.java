package quanlynhansu.model.dto;

import java.io.Serializable;

public class DonViChucNangDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer pk;
	private String maDonVi;
	private String tenDonVi;

	public DonViChucNangDTO() {
	}

	@Deprecated
	public DonViChucNangDTO(Integer pk, String maDonVi, String tenDonVi) {
		this.pk = pk;
		this.maDonVi = maDonVi;
		this.tenDonVi = tenDonVi;
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getMaDonVi() {
		return maDonVi;
	}

	public void setMaDonVi(String maDonVi) {
		this.maDonVi = maDonVi;
	}

	public String getTenDonVi() {
		return tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}