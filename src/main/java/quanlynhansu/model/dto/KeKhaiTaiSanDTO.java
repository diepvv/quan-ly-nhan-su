package quanlynhansu.model.dto;

import java.io.Serializable;
import java.util.Date;

public class KeKhaiTaiSanDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer pk;
	private DonViChucNangDTO donViChucNang;
	private CanBoDTO canBo;
	private Date ngayKeKhai;
	private String fileKeKhai;

	public KeKhaiTaiSanDTO() {
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public DonViChucNangDTO getDonViChucNang() {
		return donViChucNang;
	}

	public void setDonViChucNang(DonViChucNangDTO donViChucNang) {
		this.donViChucNang = donViChucNang;
	}

	public CanBoDTO getCanBo() {
		return canBo;
	}

	public void setCanBo(CanBoDTO canBo) {
		this.canBo = canBo;
	}

	public Date getNgayKeKhai() {
		return ngayKeKhai;
	}

	public void setNgayKeKhai(Date ngayKeKhai) {
		this.ngayKeKhai = ngayKeKhai;
	}

	public String getFileKeKhai() {
		return fileKeKhai;
	}

	public void setFileKeKhai(String fileKeKhai) {
		this.fileKeKhai = fileKeKhai;
	}
}
