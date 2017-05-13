package quanlynhansu.model.dto;

import java.io.Serializable;
import java.util.Date;

public class QuaTrinhLuongDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer pk;
	private DonViChucNangDTO donViChucNang;
	private CanBoDTO canBo;
	private NgachCongChucDTO ngachCongChuc;
	private BacLuongDTO bacLuong;
	private Date thoiGianTinhHuong;
	private Integer phanTranPhuCap;
	private Date thoiGianTangLuong;
	private Date thoiGianChamLenLuong;
	private String lyDoChamLenLuong;
	private Date thoiGianLenLuongSom;
	private String lyDoLenLuongSom;
	private String ghiChu;

	public QuaTrinhLuongDTO() {
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

	public NgachCongChucDTO getNgachCongChuc() {
		return ngachCongChuc;
	}

	public void setNgachCongChuc(NgachCongChucDTO ngachCongChuc) {
		this.ngachCongChuc = ngachCongChuc;
	}

	public BacLuongDTO getBacLuong() {
		return bacLuong;
	}

	public void setBacLuong(BacLuongDTO bacLuong) {
		this.bacLuong = bacLuong;
	}

	public Date getThoiGianTinhHuong() {
		return thoiGianTinhHuong;
	}

	public void setThoiGianTinhHuong(Date thoiGianTinhHuong) {
		this.thoiGianTinhHuong = thoiGianTinhHuong;
	}

	public Integer getPhanTranPhuCap() {
		return phanTranPhuCap;
	}

	public void setPhanTranPhuCap(Integer phanTranPhuCap) {
		this.phanTranPhuCap = phanTranPhuCap;
	}

	public Date getThoiGianTangLuong() {
		return thoiGianTangLuong;
	}

	public void setThoiGianTangLuong(Date thoiGianTangLuong) {
		this.thoiGianTangLuong = thoiGianTangLuong;
	}

	public Date getThoiGianChamLenLuong() {
		return thoiGianChamLenLuong;
	}

	public void setThoiGianChamLenLuong(Date thoiGianChamLenLuong) {
		this.thoiGianChamLenLuong = thoiGianChamLenLuong;
	}

	public String getLyDoChamLenLuong() {
		return lyDoChamLenLuong;
	}

	public void setLyDoChamLenLuong(String lyDoChamLenLuong) {
		this.lyDoChamLenLuong = lyDoChamLenLuong;
	}

	public Date getThoiGianLenLuongSom() {
		return thoiGianLenLuongSom;
	}

	public void setThoiGianLenLuongSom(Date thoiGianLenLuongSom) {
		this.thoiGianLenLuongSom = thoiGianLenLuongSom;
	}

	public String getLyDoLenLuongSom() {
		return lyDoLenLuongSom;
	}

	public void setLyDoLenLuongSom(String lyDoLenLuongSom) {
		this.lyDoLenLuongSom = lyDoLenLuongSom;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

}
