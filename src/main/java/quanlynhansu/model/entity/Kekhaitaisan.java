package quanlynhansu.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "kekhaitaisan")
@NamedQuery(name = "Kekhaitaisan.findAll", query = "SELECT t FROM Kekhaitaisan t")
public class Kekhaitaisan implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pk;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "donViChucNangKkts_pk", foreignKey = @ForeignKey(name = "donViChucNangKkts_pk"))
	private Donvichucnang donvichucnang;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "canBoKkts_pk", foreignKey = @ForeignKey(name = "canBoKkts_pk"))
	private Canbo canbo;
	@Temporal(TemporalType.DATE)
	private Date ngayKeKhai;
	private String fileKeKhai;
	@Version
	@Column(name = "VERSION", nullable = false)
	private Integer version = 0;
	public Kekhaitaisan() {
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

	public Date getNgayKeKhai() {
		return ngayKeKhai;
	}

	public void setNgayKeKhai(Date ngayKeKhai) {
		this.ngayKeKhai = ngayKeKhai;
	}

	public String getFileKeKhai() {
		return fileKeKhai;
	}

	public void setFileKeKhai(String fileKeKhai) {
		this.fileKeKhai = fileKeKhai;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
}
