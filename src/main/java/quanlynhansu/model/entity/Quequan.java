package quanlynhansu.model.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "quequan")
@NamedQuery(name = "Quequan.findAll", query = "SELECT q FROM Quequan q")
public class Quequan implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pk;
	private String tenQueQuan;

	public Quequan() {
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getTenQueQuan() {
		return tenQueQuan;
	}

	public void setTenQueQuan(String tenQueQuan) {
		this.tenQueQuan = tenQueQuan;
	}
}
