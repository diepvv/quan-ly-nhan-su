package quanlynhansu.model.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "loaihopdong")
@NamedQuery(name = "Loaihopdong.findAll", query = "SELECT d FROM Loaihopdong d")
public class Loaihopdong implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pk;
	private String tenLoaiHopDong;
	@Version
	@Column(name = "VERSION", nullable = false)
	private Integer version = 0;

	public Loaihopdong() {
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getTenLoaiHopDong() {
		return tenLoaiHopDong;
	}

	public void setTenLoaiHopDong(String tenLoaiHopDong) {
		this.tenLoaiHopDong = tenLoaiHopDong;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
