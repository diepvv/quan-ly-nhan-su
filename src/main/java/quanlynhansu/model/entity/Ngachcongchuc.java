package quanlynhansu.model.entity;

import java.io.Serializable;

import javax.persistence.*;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
