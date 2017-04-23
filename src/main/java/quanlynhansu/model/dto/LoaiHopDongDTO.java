package quanlynhansu.model.dto;

import java.io.Serializable;

public class LoaiHopDongDTO implements Serializable {
	private static final long serialVersionUID = -763988430173346533L;
	private int maLoaiHopDong;
	private String tenLoaiHopDong;

	public LoaiHopDongDTO() {
	}

	@Deprecated
	public LoaiHopDongDTO(int maLoaiHopDong, String tenLoaiHopDong) {
		this.maLoaiHopDong = maLoaiHopDong;
		this.tenLoaiHopDong = tenLoaiHopDong;
	}

	public int getMaLoaiHopDong() {
		return maLoaiHopDong;
	}

	public void setMaLoaiHopDong(int maLoaiHopDong) {
		this.maLoaiHopDong = maLoaiHopDong;
	}

	public String getTenLoaiHopDong() {
		return tenLoaiHopDong;
	}

	public void setTenLoaiHopDong(String tenLoaiHopDong) {
		this.tenLoaiHopDong = tenLoaiHopDong;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
