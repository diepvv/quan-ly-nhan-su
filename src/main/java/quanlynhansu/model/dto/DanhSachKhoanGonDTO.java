package quanlynhansu.model.dto;

import java.io.Serializable;
import java.util.Date;

public class DanhSachKhoanGonDTO implements Serializable {

	private static final long serialVersionUID = 4017633982899062559L;
	private Integer pk;
	private Integer donViChucNangDskg_pk;
	private String hoTenCanBo;
	private String soDienThoai;
	private String soCmnd;
	private String diaChi;
	private Date ngayKyHopDong;

	public DanhSachKhoanGonDTO() {
	}

	@Deprecated
	public DanhSachKhoanGonDTO(Integer pk, Integer donViChucNangDskg_pk,
			String hoTenCanBo, String soDienThoai, String soCmnd,
			String diaChi, Date ngayKyHopDong) {
		super();
		this.pk = pk;
		this.donViChucNangDskg_pk = donViChucNangDskg_pk;
		this.hoTenCanBo = hoTenCanBo;
		this.soDienThoai = soDienThoai;
		this.soCmnd = soCmnd;
		this.diaChi = diaChi;
		this.ngayKyHopDong = ngayKyHopDong;
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public Integer getDonViChucNangDskg_pk() {
		return donViChucNangDskg_pk;
	}

	public void setDonViChucNangDskg_pk(Integer donViChucNangDskg_pk) {
		this.donViChucNangDskg_pk = donViChucNangDskg_pk;
	}

	public String getHoTenCanBo() {
		return hoTenCanBo;
	}

	public void setHoTenCanBo(String hoTenCanBo) {
		this.hoTenCanBo = hoTenCanBo;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getSoCmnd() {
		return soCmnd;
	}

	public void setSoCmnd(String soCmnd) {
		this.soCmnd = soCmnd;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public Date getNgayKyHopDong() {
		return ngayKyHopDong;
	}

	public void setNgayKyHopDong(Date ngayKyHopDong) {
		this.ngayKyHopDong = ngayKyHopDong;
	}

}
