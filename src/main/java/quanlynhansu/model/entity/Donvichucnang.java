package quanlynhansu.model.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "donvichucnang")
@NamedQuery(name = "Donvichucnang.findAll", query = "SELECT d FROM Donvichucnang d")
public class Donvichucnang implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pk;
	private String maDonVi;
	private String tenDonVi;
	@Version
	@Column(name = "VERSION", nullable = false)
	private Integer version = 0;
	@Fetch(FetchMode.SUBSELECT)
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "donvichucnang_bomon", joinColumns = @JoinColumn(name = "donViChucNang_pk", referencedColumnName = "pk", foreignKey = @ForeignKey(name = "FK_donvichucnang_bomon_donvichucnang")), inverseJoinColumns = @JoinColumn(name = "boMon_pk", referencedColumnName = "pk", foreignKey = @ForeignKey(name = "FK_donvichucnang_bomon_bomon")), uniqueConstraints = { @UniqueConstraint(name = "UK_donvichucnang_bomon", columnNames = {
			"donViChucNang_pk", "boMon_pk" }) })
	private Set<Bomon> boMons = new HashSet<>();

	@Fetch(FetchMode.SUBSELECT)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "donvichucnang", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<Canbo> canBos = new HashSet<>();

	public Donvichucnang() {
	}

	public Set<Bomon> getBoMons() {
		return boMons;
	}

	public void setBoMons(Set<Bomon> boMons) {
		this.boMons = boMons;
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getMaDonVi() {
		return maDonVi;
	}

	public void setMaDonVi(String maDonVi) {
		this.maDonVi = maDonVi;
	}

	public String getTenDonVi() {
		return tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
