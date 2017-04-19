package quanlynhansu.models.dto;

import java.io.Serializable;

public class BacLuongDTO implements Serializable {
	private static final long serialVersionUID = -6997037396889908918L;
	private int maBacLuong;
	private double heSoLuong;

	public BacLuongDTO() {
	}

	@Deprecated
	public BacLuongDTO(int maBacLuong, double heSoLuong) {
		this.maBacLuong = maBacLuong;
		this.heSoLuong = heSoLuong;
	}

	public int getMaBacLuong() {
		return maBacLuong;
	}

	public void setMaBacLuong(int maBacLuong) {
		this.maBacLuong = maBacLuong;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
