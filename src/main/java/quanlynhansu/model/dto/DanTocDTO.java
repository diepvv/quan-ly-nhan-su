package quanlynhansu.model.dto;

import java.io.Serializable;

public class DanTocDTO implements Serializable {
	private static final long serialVersionUID = -159413676766566667L;
	private int maDanToc;
	private String tenDanToc;

	public DanTocDTO() {
	}

	@Deprecated
	public DanTocDTO(int maDanToc, String tenDanToc) {
		this.maDanToc = maDanToc;
		this.tenDanToc = tenDanToc;
	}

	public int getMaDanToc() {
		return maDanToc;
	}

	public void setMaDanToc(int maDanToc) {
		this.maDanToc = maDanToc;
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

}
