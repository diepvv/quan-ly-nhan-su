package quanlynhansu.model.dto;

import java.io.Serializable;

public class LoaiQuyetDinhDTO implements Serializable {
	private static final long serialVersionUID = -6209458097983841791L;
	private int maLoaiQuyetDinh;
	private String tenLoaiQuyetDinh;

	public LoaiQuyetDinhDTO() {
	}

	@Deprecated
	public LoaiQuyetDinhDTO(int maLoaiQuyetDinh, String tenLoaiQuyetDinh) {
		this.maLoaiQuyetDinh = maLoaiQuyetDinh;
		this.tenLoaiQuyetDinh = tenLoaiQuyetDinh;
	}

	public int getMaLoaiQuyetDinh() {
		return maLoaiQuyetDinh;
	}

	public void setMaLoaiQuyetDinh(int maLoaiQuyetDinh) {
		this.maLoaiQuyetDinh = maLoaiQuyetDinh;
	}

	public String getTenLoaiQuyetDinh() {
		return tenLoaiQuyetDinh;
	}

	public void setTenLoaiQuyetDinh(String tenLoaiQuyetDinh) {
		this.tenLoaiQuyetDinh = tenLoaiQuyetDinh;
	}

}
