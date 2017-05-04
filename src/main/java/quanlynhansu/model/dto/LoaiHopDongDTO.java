package quanlynhansu.model.dto;

import java.io.Serializable;

public class LoaiHopDongDTO implements Serializable {
	private static final long serialVersionUID = -763988430173346533L;
	private Integer pk;
	private String tenLoaiHopDong;

	public LoaiHopDongDTO() {
	}

	public LoaiHopDongDTO(Integer pk, String tenLoaiHopDong) {
		this.pk = pk;
		this.tenLoaiHopDong = tenLoaiHopDong;
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getTenLoaiHopDong() {
		return tenLoaiHopDong;
	}

	public void setTenLoaiHopDong(String tenLoaiHopDong) {
		this.tenLoaiHopDong = tenLoaiHopDong;
	}
}
