package quanlynhansu.model.entity;

import java.io.Serializable;

import javax.persistence.*;

import java.util.Date;

/**
 * The persistent class for the hopdongnganhan database table.
 * 
 */
@Entity
@Table(name = "hopdongnganhan")
@NamedQuery(name = "Hopdongnganhan.findAll", query = "SELECT h FROM Hopdongnganhan h")
public class Hopdongnganhan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pk;

	@Temporal(TemporalType.DATE)
	private Date denNgay;

	@Temporal(TemporalType.DATE)
	private Date ngayKy;

	private String tenHopDong;

	private String tenNhanVien;

	@Temporal(TemporalType.DATE)
	private Date tuNgay;
	@Version
	@Column(name = "VERSION", nullable = false)
	private Integer version = 0;

	public Hopdongnganhan() {
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public Date getDenNgay() {
		return this.denNgay;
	}

	public void setDenNgay(Date denNgay) {
		this.denNgay = denNgay;
	}

	public Date getNgayKy() {
		return this.ngayKy;
	}

	public void setNgayKy(Date ngayKy) {
		this.ngayKy = ngayKy;
	}

	public String getTenHopDong() {
		return this.tenHopDong;
	}

	public void setTenHopDong(String tenHopDong) {
		this.tenHopDong = tenHopDong;
	}

	public String getTenNhanVien() {
		return this.tenNhanVien;
	}

	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}

	public Date getTuNgay() {
		return this.tuNgay;
	}

	public void setTuNgay(Date tuNgay) {
		this.tuNgay = tuNgay;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}