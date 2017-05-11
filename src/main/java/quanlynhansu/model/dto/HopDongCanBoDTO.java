package quanlynhansu.model.dto;

import java.io.Serializable;
import java.util.Date;

public class HopDongCanBoDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer pk;
	private DonViChucNangDTO donViChucNang;
	private CanBoDTO canBo;
	private String maHopDong;
	private String tenHopDong;
	private String chucVu;
	private LoaiHopDongDTO loaiHopDong;
	private Date ngayKy;
	private Date tuNgay;
	private Date denNgay;
	private String trichYeuNoiDung;
	private String fileHD;

	public HopDongCanBoDTO() {
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

	public String getMaHopDong() {
		return maHopDong;
	}

	public void setMaHopDong(String maHopDong) {
		this.maHopDong = maHopDong;
	}

	public String getTenHopDong() {
		return tenHopDong;
	}

	public void setTenHopDong(String tenHopDong) {
		this.tenHopDong = tenHopDong;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}

	public LoaiHopDongDTO getLoaiHopDong() {
		return loaiHopDong;
	}

	public void setLoaiHopDong(LoaiHopDongDTO loaiHopDong) {
		this.loaiHopDong = loaiHopDong;
	}

	public Date getNgayKy() {
		return ngayKy;
	}

	public void setNgayKy(Date ngayKy) {
		this.ngayKy = ngayKy;
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

	public String getTrichYeuNoiDung() {
		return trichYeuNoiDung;
	}

	public void setTrichYeuNoiDung(String trichYeuNoiDung) {
		this.trichYeuNoiDung = trichYeuNoiDung;
	}

	public String getFileHD() {
		return fileHD;
	}

	public void setFileHD(String fileHD) {
		this.fileHD = fileHD;
	}

}
