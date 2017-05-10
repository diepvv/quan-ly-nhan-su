package quanlynhansu.model.dto;

import java.io.Serializable;
import java.util.Date;

public class QuyetDinhDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer pk;
	private DonViChucNangDTO donViChucNang;
	private CanBoDTO canBo;
	private String soQuyetDinh;
	private String tenQuyetDinh;
	private LoaiQuyetDinhDTO loaiQuyetDinh;
	private String noiDungQuyetDinh;
	private Date ngayKy;
	private Date tuNgay;
	private Date denNgay;
	private String nguoiKy;
	private String fileKy;

	public QuyetDinhDTO() {
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public DonViChucNangDTO getDonViChucNang() {
		return donViChucNang;
	}

	public void setDonViChucNang(DonViChucNangDTO donViChucNang) {
		this.donViChucNang = donViChucNang;
	}

	public CanBoDTO getCanBo() {
		return canBo;
	}

	public void setCanBo(CanBoDTO canBo) {
		this.canBo = canBo;
	}

	public String getSoQuyetDinh() {
		return soQuyetDinh;
	}

	public void setSoQuyetDinh(String soQuyetDinh) {
		this.soQuyetDinh = soQuyetDinh;
	}

	public String getTenQuyetDinh() {
		return tenQuyetDinh;
	}

	public void setTenQuyetDinh(String tenQuyetDinh) {
		this.tenQuyetDinh = tenQuyetDinh;
	}

	public LoaiQuyetDinhDTO getLoaiQuyetDinh() {
		return loaiQuyetDinh;
	}

	public void setLoaiQuyetDinh(LoaiQuyetDinhDTO loaiQuyetDinh) {
		this.loaiQuyetDinh = loaiQuyetDinh;
	}

	public String getNoiDungQuyetDinh() {
		return noiDungQuyetDinh;
	}

	public void setNoiDungQuyetDinh(String noiDungQuyetDinh) {
		this.noiDungQuyetDinh = noiDungQuyetDinh;
	}

	public Date getNgayKy() {
		return ngayKy;
	}

	public void setNgayKy(Date ngayKy) {
		this.ngayKy = ngayKy;
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

	public String getNguoiKy() {
		return nguoiKy;
	}

	public void setNguoiKy(String nguoiKy) {
		this.nguoiKy = nguoiKy;
	}

	public String getFileKy() {
		return fileKy;
	}

	public void setFileKy(String fileKy) {
		this.fileKy = fileKy;
	}
}
