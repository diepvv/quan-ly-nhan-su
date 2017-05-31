package quanlynhansu.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "danhsachkhoangon")
@NamedQuery(name = "Danhsachkhoangon.findAll", query = "SELECT d FROM Danhsachkhoangon d")
public class Danhsachkhoangon implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pk;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "donViChucNangDskg_pk", foreignKey = @ForeignKey(name = "donViChucNangDskg_pk"))
	private Donvichucnang donvichucnang;

	private String hoTenCanBo;
	private String soDienThoai;
	private String soCmnd;
	private String diaChi;
	@Temporal(TemporalType.DATE)
	private Date ngayKyHopDong;
	@Version
	@Column(name = "VERSION", nullable = false)
	private Integer version = 0;

	public Danhsachkhoangon() {
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

	public String getHoTenCanBo() {
		return hoTenCanBo;
	}

	public void setHoTenCanBo(String hoTenCanBo) {
		this.hoTenCanBo = hoTenCanBo;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getSoCmnd() {
		return soCmnd;
	}

	public void setSoCmnd(String soCmnd) {
		this.soCmnd = soCmnd;
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

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
