package quanlynhansu.model.dto;

import java.io.Serializable;

public class BoMonDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer pk;
	private String tenBoMon;

	public BoMonDTO() {
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getTenBoMon() {
		return tenBoMon;
	}

	public void setTenBoMon(String tenBoMon) {
		this.tenBoMon = tenBoMon;
	}

}
