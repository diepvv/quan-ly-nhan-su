package quanlynhansu.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "quyetdinh")
@NamedQuery(name = "Quyetdinh.findAll", query = "SELECT q FROM Quyetdinh q")
public class Quyetdinh implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pk;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "donViChucNangQd_pk", foreignKey = @ForeignKey(name = "donViChucNangQd_pk"))
	private Donvichucnang donvichucnang;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "canBoQd_pk", foreignKey = @ForeignKey(name = "canBoQd_pk"))
	private Canbo canbo;

	private String soQuyetDinh;
	private String tenQuyetDinh;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loaiQuyetDinhQd_pk", foreignKey = @ForeignKey(name = "loaiQuyetDinhQd_pk"))
	private Loaiquyetdinh loaiquyetdinh;

	private String noiDungQuyetDinh;
	@Temporal(TemporalType.DATE)
	private Date ngayKy;
	@Temporal(TemporalType.DATE)
	private Date tuNgay;
	@Temporal(TemporalType.DATE)
	private Date denNgay;
	private String nguoiKy;
	private String fileKy;
	@Version
	@Column(name = "VERSION", nullable = false)
	private Integer version = 0;

	public Quyetdinh() {
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

	public String getSoQuyetDinh() {
		return soQuyetDinh;
	}

	public void setSoQuyetDinh(String soQuyetDinh) {
		this.soQuyetDinh = soQuyetDinh;
	}

	public String getTenQuyetDinh() {
		return tenQuyetDinh;
	}

	public void setTenQuyetDinh(String tenQuyetDinh) {
		this.tenQuyetDinh = tenQuyetDinh;
	}

	public Loaiquyetdinh getLoaiquyetdinh() {
		return loaiquyetdinh;
	}

	public void setLoaiquyetdinh(Loaiquyetdinh loaiquyetdinh) {
		this.loaiquyetdinh = loaiquyetdinh;
	}

	public String getNoiDungQuyetDinh() {
		return noiDungQuyetDinh;
	}

	public void setNoiDungQuyetDinh(String noiDungQuyetDinh) {
		this.noiDungQuyetDinh = noiDungQuyetDinh;
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

	public String getNguoiKy() {
		return nguoiKy;
	}

	public void setNguoiKy(String nguoiKy) {
		this.nguoiKy = nguoiKy;
	}

	public String getFileKy() {
		return fileKy;
	}

	public void setFileKy(String fileKy) {
		this.fileKy = fileKy;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
