package quanlynhansu.model.dto;

import java.io.Serializable;

public class ChucVuDTO implements Serializable {
	private static final long serialVersionUID = 2354478821226203760L;
	private int maChucVu;
	private String tenChucVu;

	public ChucVuDTO() {
	}

	@Deprecated
	public ChucVuDTO(int maChucVu, String tenChucVu) {
		this.maChucVu = maChucVu;
		this.tenChucVu = tenChucVu;
	}

	public int getMaChucVu() {
		return maChucVu;
	}

	public void setMaChucVu(int maChucVu) {
		this.maChucVu = maChucVu;
	}

	public String getTenChucVu() {
		return tenChucVu;
	}

	public void setTenChucVu(String tenChucVu) {
		this.tenChucVu = tenChucVu;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
