package quanlynhansu.model.dto;

import java.io.Serializable;

public class LoaiQuyetDinhDTO implements Serializable {
	private static final long serialVersionUID = -6209458097983841791L;
	private Integer pk;
	private String tenLoaiQuyetDinh;
	private Integer version = 0;

	public LoaiQuyetDinhDTO() {
	}

	@Deprecated
	public LoaiQuyetDinhDTO(Integer pk, String tenLoaiQuyetDinh) {
		super();
		this.pk = pk;
		this.tenLoaiQuyetDinh = tenLoaiQuyetDinh;
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getTenLoaiQuyetDinh() {
		return tenLoaiQuyetDinh;
	}

	public void setTenLoaiQuyetDinh(String tenLoaiQuyetDinh) {
		this.tenLoaiQuyetDinh = tenLoaiQuyetDinh;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
