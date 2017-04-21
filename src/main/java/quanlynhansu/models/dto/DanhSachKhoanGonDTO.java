package quanlynhansu.models.dto;

import java.io.Serializable;
import java.sql.Date;

public class DanhSachKhoanGonDTO implements Serializable {

	private static final long serialVersionUID = 4017633982899062559L;
	private int maCanBoKhoanGon;
	private int maDonVi;
	private String hoTenCanBo;
	private int soDienThoai;
	private int soCMND;
	private String diaChi;
	private Date ngayKyHopDong;

	public DanhSachKhoanGonDTO() {
	}

	public DanhSachKhoanGonDTO(int maCanBoKhoanGon, int maDonVi,
			String hoTenCanBo, int soDienThoai, int soCMND, String diaChi,
			Date ngayKyHopDong) {
		this.maCanBoKhoanGon = maCanBoKhoanGon;
		this.maDonVi = maDonVi;
		this.hoTenCanBo = hoTenCanBo;
		this.soDienThoai = soDienThoai;
		this.soCMND = soCMND;
		this.diaChi = diaChi;
		this.ngayKyHopDong = ngayKyHopDong;
	}

	public int getMaCanBoKhoanGon() {
		return maCanBoKhoanGon;
	}

	public void setMaCanBoKhoanGon(int maCanBoKhoanGon) {
		this.maCanBoKhoanGon = maCanBoKhoanGon;
	}

	public int getMaDonVi() {
		return maDonVi;
	}

	public void setMaDonVi(int maDonVi) {
		this.maDonVi = maDonVi;
	}

	public String getHoTenCanBo() {
		return hoTenCanBo;
	}

	public void setHoTenCanBo(String hoTenCanBo) {
		this.hoTenCanBo = hoTenCanBo;
	}

	public int getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(int soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public int getSoCMND() {
		return soCMND;
	}

	public void setSoCMND(int soCMND) {
		this.soCMND = soCMND;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Date getNgayKyHopDong() {
		return ngayKyHopDong;
	}

	public void setNgayKyHopDong(Date ngayKyHopDong) {
		this.ngayKyHopDong = ngayKyHopDong;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
