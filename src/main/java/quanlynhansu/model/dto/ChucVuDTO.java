package quanlynhansu.model.dto;

import java.io.Serializable;

public class ChucVuDTO implements Serializable {
	private static final long serialVersionUID = 2354478821226203760L;
	private Integer pk;
	private String tenChucVu;
	private Integer version = 0;

	public ChucVuDTO() {
	}

	public ChucVuDTO(Integer pk, String tenChucVu) {
		this.pk = pk;
		this.tenChucVu = tenChucVu;
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getTenChucVu() {
		return tenChucVu;
	}

	public void setTenChucVu(String tenChucVu) {
		this.tenChucVu = tenChucVu;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
