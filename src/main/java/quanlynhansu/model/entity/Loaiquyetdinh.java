package quanlynhansu.model.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "loaiquyetdinh")
@NamedQuery(name = "Loaiquyetdinh.findAll", query = "SELECT l FROM Loaiquyetdinh l")
public class Loaiquyetdinh implements Serializable {
	private static final long serialVersionUID = -9214791584187680657L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pk;
	private String tenLoaiQuyetDinh;

	public Loaiquyetdinh() {
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getTenLoaiQuyetDinh() {
		return tenLoaiQuyetDinh;
	}

	public void setTenLoaiQuyetDinh(String tenLoaiQuyetDinh) {
		this.tenLoaiQuyetDinh = tenLoaiQuyetDinh;
	}

}
