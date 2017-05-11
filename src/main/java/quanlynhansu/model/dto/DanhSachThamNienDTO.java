package quanlynhansu.model.dto;

import java.io.Serializable;
import java.util.Date;

public class DanhSachThamNienDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer pk;
	private DonViChucNangDTO donViChucNang;
	private CanBoDTO canBo;
	private Date mocTinhPhuCapTn;
	private BacLuongDTO bacLuong;
	private float phuCapChucVu;
	private float vuotKhung;
	private float tongHeSoLuong;
	private float phuCapGiangVien;
	private Integer soThangBiGiamTru;
	private Date thoiDiemTangPhuCapTn;
	private String ghiChuThoiDiemTang;
	private Date tuNgay;
	private Date denNgay;
	private String ghiChuKhongPhuCapTn;

	public DanhSachThamNienDTO() {
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

	public Date getMocTinhPhuCapTn() {
		return mocTinhPhuCapTn;
	}

	public void setMocTinhPhuCapTn(Date mocTinhPhuCapTn) {
		this.mocTinhPhuCapTn = mocTinhPhuCapTn;
	}

	public BacLuongDTO getBacLuong() {
		return bacLuong;
	}

	public void setBacLuong(BacLuongDTO bacLuong) {
		this.bacLuong = bacLuong;
	}

	public float getPhuCapChucVu() {
		return phuCapChucVu;
	}

	public void setPhuCapChucVu(float phuCapChucVu) {
		this.phuCapChucVu = phuCapChucVu;
	}

	public float getVuotKhung() {
		return vuotKhung;
	}

	public void setVuotKhung(float vuotKhung) {
		this.vuotKhung = vuotKhung;
	}

	public float getTongHeSoLuong() {
		return tongHeSoLuong;
	}

	public void setTongHeSoLuong(float tongHeSoLuong) {
		this.tongHeSoLuong = tongHeSoLuong;
	}

	public float getPhuCapGiangVien() {
		return phuCapGiangVien;
	}

	public void setPhuCapGiangVien(float phuCapGiangVien) {
		this.phuCapGiangVien = phuCapGiangVien;
	}

	public Integer getSoThangBiGiamTru() {
		return soThangBiGiamTru;
	}

	public void setSoThangBiGiamTru(Integer soThangBiGiamTru) {
		this.soThangBiGiamTru = soThangBiGiamTru;
	}

	public Date getThoiDiemTangPhuCapTn() {
		return thoiDiemTangPhuCapTn;
	}

	public void setThoiDiemTangPhuCapTn(Date thoiDiemTangPhuCapTn) {
		this.thoiDiemTangPhuCapTn = thoiDiemTangPhuCapTn;
	}

	public String getGhiChuThoiDiemTang() {
		return ghiChuThoiDiemTang;
	}

	public void setGhiChuThoiDiemTang(String ghiChuThoiDiemTang) {
		this.ghiChuThoiDiemTang = ghiChuThoiDiemTang;
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

	public String getGhiChuKhongPhuCapTn() {
		return ghiChuKhongPhuCapTn;
	}

	public void setGhiChuKhongPhuCapTn(String ghiChuKhongPhuCapTn) {
		this.ghiChuKhongPhuCapTn = ghiChuKhongPhuCapTn;
	}
}
