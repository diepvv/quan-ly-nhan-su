package quanlynhansu.model.dto;

import java.io.Serializable;

public class DanTocDTO implements Serializable {
	private static final long serialVersionUID = -159413676766566667L;
	private Integer pk;
	private String tenDanToc;
	private Integer version = 0;

	public DanTocDTO() {
	}

	@Deprecated
	public DanTocDTO(Integer pk, String tenDanToc) {
		this.pk = pk;
		this.tenDanToc = tenDanToc;
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getTenDanToc() {
		return tenDanToc;
	}

	public void setTenDanToc(String tenDanToc) {
		this.tenDanToc = tenDanToc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
