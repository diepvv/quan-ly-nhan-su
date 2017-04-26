package quanlynhansu.model.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "dantoc")
@NamedQuery(name = "Dantoc.findAll", query = "SELECT d FROM Dantoc d")
public class Dantoc implements Serializable {
	private static final long serialVersionUID = -654521177995353456L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pk;
	private String tenDanToc;

	public Dantoc() {
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getTenDanToc() {
		return tenDanToc;
	}

	public void setTenDanToc(String tenDanToc) {
		this.tenDanToc = tenDanToc;
	}

}
