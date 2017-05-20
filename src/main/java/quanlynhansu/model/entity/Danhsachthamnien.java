package quanlynhansu.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "danhsachthamnien")
@NamedQuery(name = "Danhsachthamnien.findAll", query = "SELECT d FROM Danhsachthamnien d")
public class Danhsachthamnien implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pk;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "donViChucNangDstn_pk", foreignKey = @ForeignKey(name = "donViChucNangDstn_pk"))
	private Donvichucnang donvichucnang;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "canBoDstn_pk", foreignKey = @ForeignKey(name = "canBoDstn_pk"))
	private Canbo canbo;
	@Temporal(TemporalType.DATE)
	private Date mocTinhPhuCapTn;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bacLuongDstn_pk", foreignKey = @ForeignKey(name = "bacLuongDstn_pk"))
	private Bacluong bacluong;
	private float phuCapChucVu;
	private float vuotKhung;
	private float tongHeSoLuong;
	private float phuCapGiangVien;
	private Integer soThangBiGiamTru;
	@Temporal(TemporalType.DATE)
	private Date thoiDiemTangPhuCapTn;
	private String ghiChuThoiDiemTang;
	@Temporal(TemporalType.DATE)
	private Date tuNgay;
	@Temporal(TemporalType.DATE)
	private Date denNgay;
	private String ghiChuKhongPhuCapTn;
	@Version
	@Column(name = "VERSION", nullable = false)
	private Integer version = 0;

	public Danhsachthamnien() {
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public Donvichucnang getDonvichucnang() {
		return donvichucnang;
	}

	public void setDonvichucnang(Donvichucnang donvichucnang) {
		this.donvichucnang = donvichucnang;
	}

	public Canbo getCanbo() {
		return canbo;
	}

	public void setCanbo(Canbo canbo) {
		this.canbo = canbo;
	}

	public Date getMocTinhPhuCapTn() {
		return mocTinhPhuCapTn;
	}

	public void setMocTinhPhuCapTn(Date mocTinhPhuCapTn) {
		this.mocTinhPhuCapTn = mocTinhPhuCapTn;
	}

	public Bacluong getBacluong() {
		return bacluong;
	}

	public void setBacluong(Bacluong bacluong) {
		this.bacluong = bacluong;
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

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
