package quanlynhansu.model.dto;

import java.io.Serializable;

public class BacLuongDTO implements Serializable {
	private static final long serialVersionUID = -6997037396889908918L;
	private Integer pk;
	private Integer maBacLuong;
	private double heSoLuong;
	private double phuCapVuotKhung;

	public BacLuongDTO() {
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public Integer getMaBacLuong() {
		return maBacLuong;
	}

	public void setMaBacLuong(Integer maBacLuong) {
		this.maBacLuong = maBacLuong;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public double getPhuCapVuotKhung() {
		return phuCapVuotKhung;
	}

	public void setPhuCapVuotKhung(double phuCapVuotKhung) {
		this.phuCapVuotKhung = phuCapVuotKhung;
	}

}
