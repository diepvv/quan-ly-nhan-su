package quanlynhansu.models.dto;

import java.io.Serializable;

public class DonViChucNangDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private int maDonVi;
	private String tenDonVi;

	public DonViChucNangDTO() {
	}

	@Deprecated
	public DonViChucNangDTO(int maDonVi, String tenDonVi) {
		this.maDonVi = maDonVi;
		this.tenDonVi = tenDonVi;
	}

	public int getmaDonVi() {
		return maDonVi;
	}

	public void setmaDonVi(int maDonVi) {
		this.maDonVi = maDonVi;
	}

	public String gettenDonVi() {
		return tenDonVi;
	}

	public void settenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

}
