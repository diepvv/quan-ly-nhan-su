package quanlynhansu.model.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "bacluong")
@NamedQuery(name = "Bacluong.findAll", query = "SELECT b FROM Bacluong b")
public class Bacluong implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pk;
	private Integer maBacLuong;
	private double heSoLuong;
	private double phuCapVuotKhung;

	public Bacluong() {
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public Integer getMaBacLuong() {
		return maBacLuong;
	}

	public void setMaBacLuong(Integer maBacLuong) {
		this.maBacLuong = maBacLuong;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}

	public double getPhuCapVuotKhung() {
		return phuCapVuotKhung;
	}

	public void setPhuCapVuotKhung(double phuCapVuotKhung) {
		this.phuCapVuotKhung = phuCapVuotKhung;
	}

}
