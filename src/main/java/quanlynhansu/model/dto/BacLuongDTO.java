package quanlynhansu.model.dto;

import java.io.Serializable;

public class BacLuongDTO implements Serializable {
	private static final long serialVersionUID = -6997037396889908918L;
	private Integer pk;
	private Integer maBacLuong;
	private double heSoLuong;

	public BacLuongDTO() {
	}

	@Deprecated
	public BacLuongDTO(Integer pk, Integer maBacLuong, double heSoLuong) {
		super();
		this.pk = pk;
		this.maBacLuong = maBacLuong;
		this.heSoLuong = heSoLuong;
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

}