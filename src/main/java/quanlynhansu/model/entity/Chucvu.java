package quanlynhansu.model.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "chucvu")
@NamedQuery(name = "Chucvu.findAll", query = "SELECT c FROM Chucvu c")
public class Chucvu implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pk;
	private String tenChucVu;
	@Version
	@Column(name = "VERSION", nullable = false)
	private Integer version = 0;

	public Chucvu() {
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getTenChucVu() {
		return tenChucVu;
	}

	public void setTenChucVu(String tenChucVu) {
		this.tenChucVu = tenChucVu;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
