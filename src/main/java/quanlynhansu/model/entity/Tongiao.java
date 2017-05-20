package quanlynhansu.model.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "tongiao")
@NamedQuery(name = "Tongiao.findAll", query = "SELECT t FROM Tongiao t")
public class Tongiao implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pk;
	private String tenTonGiao;
	@Version
	@Column(name = "VERSION", nullable = false)
	private Integer version = 0;

	public Tongiao() {
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getTenTonGiao() {
		return tenTonGiao;
	}

	public void setTenTonGiao(String tenTonGiao) {
		this.tenTonGiao = tenTonGiao;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
