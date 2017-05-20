package quanlynhansu.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "quatrinhluong")
@NamedQuery(name = "Quatrinhluong.findAll", query = "SELECT q FROM Quatrinhluong q")
public class Quatrinhluong implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pk;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "donViChucNangL_pk", foreignKey = @ForeignKey(name = "donViChucNangL_pk"))
	private Donvichucnang donvichucnang;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "canBoL_pk", foreignKey = @ForeignKey(name = "canBoL_pk"))
	private Canbo canbo;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "ngachCongChucL_pk", foreignKey = @ForeignKey(name = "ngachCongChucL_pk"))
	private Ngachcongchuc ngachcongchuc;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bacLuongL_pk", foreignKey = @ForeignKey(name = "bacLuongL_pk"))
	private Bacluong bacluong;

	@Temporal(TemporalType.DATE)
	private Date thoiGianTinhHuong;
	private Integer phanTranPhuCap;
	@Temporal(TemporalType.DATE)
	private Date thoiGianTangLuong;
	@Temporal(TemporalType.DATE)
	private Date thoiGianChamLenLuong;
	private String lyDoChamLenLuong;
	@Temporal(TemporalType.DATE)
	private Date thoiGianLenLuongSom;
	private String lyDoLenLuongSom;
	private String ghiChu;
	@Version
	@Column(name = "VERSION", nullable = false)
	private Integer version = 0;

	public Quatrinhluong() {
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

	public Ngachcongchuc getNgachcongchuc() {
		return ngachcongchuc;
	}

	public void setNgachcongchuc(Ngachcongchuc ngachcongchuc) {
		this.ngachcongchuc = ngachcongchuc;
	}

	public Bacluong getBacluong() {
		return bacluong;
	}

	public void setBacluong(Bacluong bacluong) {
		this.bacluong = bacluong;
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

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
