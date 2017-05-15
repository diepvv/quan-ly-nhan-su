package quanlynhansu.model.dto;

import java.io.Serializable;

public class QueQuanDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer pk;
	private String tenQueQuan;

	public QueQuanDTO() {
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getTenQueQuan() {
		return tenQueQuan;
	}

	public void setTenQueQuan(String tenQueQuan) {
		this.tenQueQuan = tenQueQuan;
	}
}
