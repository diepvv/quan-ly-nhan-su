package quanlynhansu.model.dto;

import java.io.Serializable;
import java.sql.Date;

public class DanhSachKhoanGonDTO implements Serializable {

    private static final long serialVersionUID = 4017633982899062559L;
    private Integer pk;
    private DonViChucNangDTO donViChucNang;
    private String hoTenCanBo;
    private String soDienThoai;
    private String soCmnd;
    private String diaChi;
    private Date ngayKyHopDong;

    public DanhSachKhoanGonDTO() {
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
