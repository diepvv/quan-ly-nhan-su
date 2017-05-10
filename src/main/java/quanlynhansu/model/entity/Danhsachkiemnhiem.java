package quanlynhansu.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "danhsachkiemnhiem")
@NamedQuery(name = "Danhsachkiemnhiem.findAll", query = "SELECT d FROM Danhsachkiemnhiem d")
public class Danhsachkiemnhiem implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pk;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "donViChucNangDskn_pk", foreignKey = @ForeignKey(name = "donViChucNangDskn_pk"))
	private Donvichucnang donvichucnang;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "canBoDskn_pk", foreignKey = @ForeignKey(name = "canBoDskn_pk"))
	private Canbo canbo;
	private String chucVuKiemNhiem;
	@Temporal(TemporalType.DATE)
	private Date tuNgay;
	@Temporal(TemporalType.DATE)
	private Date denNgay;

	public Danhsachkiemnhiem() {
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

	public String getChucVuKiemNhiem() {
		return chucVuKiemNhiem;
	}

	public void setChucVuKiemNhiem(String chucVuKiemNhiem) {
		this.chucVuKiemNhiem = chucVuKiemNhiem;
	}

	public Date getTuNgay() {
		return tuNgay;
	}

	public void setTuNgay(Date tuNgay) {
		this.tuNgay = tuNgay;
	}

	public Date getDenNgay() {
		return denNgay;
	}

	public void setDenNgay(Date denNgay) {
		this.denNgay = denNgay;
	}

}
