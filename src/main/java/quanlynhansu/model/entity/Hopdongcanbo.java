package quanlynhansu.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "hopdongcanbo")
@NamedQuery(name = "Hopdongcanbo.findAll", query = "SELECT h FROM Hopdongcanbo h")
public class Hopdongcanbo implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pk;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "donViChucNangHdcb_pk", foreignKey = @ForeignKey(name = "donViChucNangHdcb_pk"))
	private Donvichucnang donvichucnang;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "canBoHdcn_pk", foreignKey = @ForeignKey(name = "canBoHdcn_pk"))
	private Canbo canbo;
	private String maHopDong;
	private String tenHopDong;
	private String chucVu;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loaiHopDongHdcb_pk", foreignKey = @ForeignKey(name = "loaiHopDongHdcb_pk"))
	private Loaihopdong loaihopdong;
	@Temporal(TemporalType.DATE)
	private Date ngayKy;
	@Temporal(TemporalType.DATE)
	private Date tuNgay;
	@Temporal(TemporalType.DATE)
	private Date denNgay;
	private String trichYeuNoiDung;
	private String fileHD;
	@Version
	@Column(name = "VERSION", nullable = false)
	private Integer version = 0;

	public Hopdongcanbo() {
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

	public Loaihopdong getLoaihopdong() {
		return loaihopdong;
	}

	public void setLoaihopdong(Loaihopdong loaihopdong) {
		this.loaihopdong = loaihopdong;
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

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
