package quanlynhansu.model.dto;

import java.io.Serializable;
import java.util.Date;

public class DanhSachKiemNhiemDTO implements Serializable {
	private static final long serialVersionUID = 8127737771163857728L;
	private Integer pk;
	private DonViChucNangDTO donViChucNang;
	private CanBoDTO canBo;
	private String chucVuKiemNhiem;
	private Date tuNgay;
	private Date denNgay;

	public DanhSachKiemNhiemDTO() {
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

	public String getChucVuKiemNhiem() {
		return chucVuKiemNhiem;
	}

	public void setChucVuKiemNhiem(String chucVuKiemNhiem) {
		this.chucVuKiemNhiem = chucVuKiemNhiem;
	}

	public Date getTuNgay() {
		return tuNgay;
	}

	public void setTuNgay(Date tuNgay) {
		this.tuNgay = tuNgay;
	}

	public Date getDenNgay() {
		return denNgay;
	}

	public void setDenNgay(Date denNgay) {
		this.denNgay = denNgay;
	}

}
