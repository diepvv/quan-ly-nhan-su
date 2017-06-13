package quanlynhansu.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "quyetdinhkhenthuong")
@NamedQuery(name = "Quyetdinhkhenthuong.findAll", query = "SELECT q FROM Quyetdinhkhenthuong q")
public class Quyetdinhkhenthuong implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pk;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "donViChucNangQdkt_pk", foreignKey = @ForeignKey(name = "donViChucNangQdkt_pk"))
	private Donvichucnang donvichucnang;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "canBoQdkt_pk", foreignKey = @ForeignKey(name = "canBoQdkt_pk"))
	private Canbo canbo;

	private String soQuyetDinh;
	private String tenQuyetDinh;
	private String noiDungQuyetDinh;
	@Temporal(TemporalType.DATE)
	private Date ngayKy;
	private String nguoiKy;
	private String fileKy;
	@Version
	@Column(name = "VERSION", nullable = false)
	private Integer version = 0;

	public Quyetdinhkhenthuong() {
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
