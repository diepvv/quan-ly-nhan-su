package quanlynhansu.model.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class DonViChucNangDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer pk;
	private String maDonVi;
	private String tenDonVi;
	private Integer version = 0;
	private Set<BoMonDTO> boMon = new HashSet<>();

	public DonViChucNangDTO() {
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getMaDonVi() {
		return maDonVi;
	}

	public void setMaDonVi(String maDonVi) {
		this.maDonVi = maDonVi;
	}

	public String getTenDonVi() {
		return tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Set<BoMonDTO> getBoMon() {
		return boMon;
	}

	public void setBoMon(Set<BoMonDTO> boMon) {
		this.boMon = boMon;
	}
}
