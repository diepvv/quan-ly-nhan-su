package quanlynhansu.model.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

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
@Table(name = "ngachcongchuc")
@NamedQuery(name = "Ngachcongchuc.findAll", query = "SELECT n FROM Ngachcongchuc n")
public class Ngachcongchuc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pk;

	private String maNgach;
	private String tenNgach;
	private Integer soNamNangBacLuong;
	@Version
	@Column(name = "VERSION", nullable = false)
	private Integer version = 0;
	@Fetch(FetchMode.SUBSELECT)
	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "ngachcongchuc_bacluong", joinColumns = @JoinColumn(name = "ngachCongChuc_pk", referencedColumnName = "pk", foreignKey = @ForeignKey(name = "FK_ngachcongchuc_bacluong_ngachcongchuc")), inverseJoinColumns = @JoinColumn(name = "bacLuong_pk", referencedColumnName = "pk", foreignKey = @ForeignKey(name = "FK_ngachcongchuc_bacluong_bacluong")), uniqueConstraints = { @UniqueConstraint(name = "UK_ngachcongchuc_bacluong", columnNames = {
			"ngachCongChuc_pk", "bacLuong_pk" }) })
	private Set<Bacluong> bacLuongs = new HashSet<>();

	public Ngachcongchuc() {
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getMaNgach() {
		return maNgach;
	}

	public void setMaNgach(String maNgach) {
		this.maNgach = maNgach;
	}

	public String getTenNgach() {
		return tenNgach;
	}

	public void setTenNgach(String tenNgach) {
		this.tenNgach = tenNgach;
	}

	public Integer getSoNamNangBacLuong() {
		return soNamNangBacLuong;
	}

	public void setSoNamNangBacLuong(Integer soNamNangBacLuong) {
		this.soNamNangBacLuong = soNamNangBacLuong;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Set<Bacluong> getBacLuongs() {
		return bacLuongs;
	}

	public void setBacLuongs(Set<Bacluong> bacLuongs) {
		this.bacLuongs = bacLuongs;
	}

}
