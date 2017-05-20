package quanlynhansu.model.dto;

import java.io.Serializable;
import java.util.Date;

public class CanBoDTO implements Serializable {
	public static final long serialVersionUID = 7660631391091782293L;
	private Integer pk;
	private String soHieu;
	private DonViChucNangDTO donViChucNang;
	private BoMonDTO boMon;
	private String imageUrl;
	private String ten;
	private String tenGoiKhac;
	private Date ngaySinh;
	private String gioiTinh;
	private String noiSinh;
	private QueQuanDTO queQuan;
	private DanTocDTO danToc;
	private TonGiaoDTO tonGiao;
	private String soCmnd;
	private Date ngayCapCmnd;
	private String noiCapCmnd;
	private String noiDKHoKhauThuongTru;
	private String noiOHienNay;
	private String ngheNghiepKhiTuyenDung;
	private String coQuanTuyenDung;
	private Date ngayTuyenDung;
	private ChucVuDTO chucVu;
	private String congViecDuocGiao;
	private String chucDanh;
	private NgachCongChucDTO ngachCongChuc;
	private BacLuongDTO bacLuong;
	private Date ngayHuong;
	private double phuCapChucVu;
	private double phuCapKhac;
	private String trinhDoGiaoDucPt;
	private String trinhDoChuyenMon;
	private String hocVi;
	private String hocHam;
	private Date ngayNhanHocVi;
	private Date ngayNhanHocHam;
	private String lyLuanChinhTri;
	private String quanLyNhaNuoc;
	private String ngoaiNgu;
	private String tinHoc;
	private Date ngayVaoDcsvnDuBi;
	private Date ngayVaoDcsvnChinhThuc;
	private String thamGiaToChucCtxh;
	private Date ngayNhapNgu;
	private Date ngayXuatNgu;
	private String quanHamCaoNhat;
	private String danhHieuPhongTang;
	private Integer soTruongCongTac;
	private String khenThuong;
	private String kyLuat;
	private String tinhTrangSucKhoe;
	private double chieuCao;
	private double canNang;
	private String nhomMau;
	private String soBaoHiemXh;
	private String laThuongBinh;
	private String laConGiaDinhChinhSach;
	private String nhanXet;
	private Date ngayVeHuu;
	private Date ngayThoiViec;
	private Integer version = 0;

	public CanBoDTO() {
	}

	public Integer getPk() {
		return pk;
	}

	public void setPk(Integer pk) {
		this.pk = pk;
	}

	public String getSoHieu() {
		return soHieu;
	}

	public void setSoHieu(String soHieu) {
		this.soHieu = soHieu;
	}

	public DonViChucNangDTO getDonViChucNang() {
		return donViChucNang;
	}

	public void setDonViChucNang(DonViChucNangDTO donViChucNang) {
		this.donViChucNang = donViChucNang;
	}

	public BoMonDTO getBoMon() {
		return boMon;
	}

	public void setBoMon(BoMonDTO boMon) {
		this.boMon = boMon;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getTenGoiKhac() {
		return tenGoiKhac;
	}

	public void setTenGoiKhac(String tenGoiKhac) {
		this.tenGoiKhac = tenGoiKhac;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNoiSinh() {
		return noiSinh;
	}

	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}

	public QueQuanDTO getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(QueQuanDTO queQuan) {
		this.queQuan = queQuan;
	}

	public DanTocDTO getDanToc() {
		return danToc;
	}

	public void setDanToc(DanTocDTO danToc) {
		this.danToc = danToc;
	}

	public TonGiaoDTO getTonGiao() {
		return tonGiao;
	}

	public void setTonGiao(TonGiaoDTO tonGiao) {
		this.tonGiao = tonGiao;
	}

	public String getSoCmnd() {
		return soCmnd;
	}

	public void setSoCmnd(String soCmnd) {
		this.soCmnd = soCmnd;
	}

	public Date getNgayCapCmnd() {
		return ngayCapCmnd;
	}

	public void setNgayCapCmnd(Date ngayCapCmnd) {
		this.ngayCapCmnd = ngayCapCmnd;
	}

	public String getNoiCapCmnd() {
		return noiCapCmnd;
	}

	public void setNoiCapCmnd(String noiCapCmnd) {
		this.noiCapCmnd = noiCapCmnd;
	}

	public String getNoiDKHoKhauThuongTru() {
		return noiDKHoKhauThuongTru;
	}

	public void setNoiDKHoKhauThuongTru(String noiDKHoKhauThuongTru) {
		this.noiDKHoKhauThuongTru = noiDKHoKhauThuongTru;
	}

	public String getNoiOHienNay() {
		return noiOHienNay;
	}

	public void setNoiOHienNay(String noiOHienNay) {
		this.noiOHienNay = noiOHienNay;
	}

	public String getNgheNghiepKhiTuyenDung() {
		return ngheNghiepKhiTuyenDung;
	}

	public void setNgheNghiepKhiTuyenDung(String ngheNghiepKhiTuyenDung) {
		this.ngheNghiepKhiTuyenDung = ngheNghiepKhiTuyenDung;
	}

	public String getCoQuanTuyenDung() {
		return coQuanTuyenDung;
	}

	public void setCoQuanTuyenDung(String coQuanTuyenDung) {
		this.coQuanTuyenDung = coQuanTuyenDung;
	}

	public Date getNgayTuyenDung() {
		return ngayTuyenDung;
	}

	public void setNgayTuyenDung(Date ngayTuyenDung) {
		this.ngayTuyenDung = ngayTuyenDung;
	}

	public ChucVuDTO getChucVu() {
		return chucVu;
	}

	public void setChucVu(ChucVuDTO chucVu) {
		this.chucVu = chucVu;
	}

	public String getCongViecDuocGiao() {
		return congViecDuocGiao;
	}

	public void setCongViecDuocGiao(String congViecDuocGiao) {
		this.congViecDuocGiao = congViecDuocGiao;
	}

	public String getChucDanh() {
		return chucDanh;
	}

	public void setChucDanh(String chucDanh) {
		this.chucDanh = chucDanh;
	}

	public NgachCongChucDTO getNgachCongChuc() {
		return ngachCongChuc;
	}

	public void setNgachCongChuc(NgachCongChucDTO ngachCongChuc) {
		this.ngachCongChuc = ngachCongChuc;
	}

	public BacLuongDTO getBacLuong() {
		return bacLuong;
	}

	public void setBacLuong(BacLuongDTO bacLuong) {
		this.bacLuong = bacLuong;
	}

	public Date getNgayHuong() {
		return ngayHuong;
	}

	public void setNgayHuong(Date ngayHuong) {
		this.ngayHuong = ngayHuong;
	}

	public double getPhuCapChucVu() {
		return phuCapChucVu;
	}

	public void setPhuCapChucVu(double phuCapChucVu) {
		this.phuCapChucVu = phuCapChucVu;
	}

	public double getPhuCapKhac() {
		return phuCapKhac;
	}

	public void setPhuCapKhac(double phuCapKhac) {
		this.phuCapKhac = phuCapKhac;
	}

	public String getTrinhDoGiaoDucPt() {
		return trinhDoGiaoDucPt;
	}

	public void setTrinhDoGiaoDucPt(String trinhDoGiaoDucPt) {
		this.trinhDoGiaoDucPt = trinhDoGiaoDucPt;
	}

	public String getTrinhDoChuyenMon() {
		return trinhDoChuyenMon;
	}

	public void setTrinhDoChuyenMon(String trinhDoChuyenMon) {
		this.trinhDoChuyenMon = trinhDoChuyenMon;
	}

	public String getHocVi() {
		return hocVi;
	}

	public void setHocVi(String hocVi) {
		this.hocVi = hocVi;
	}

	public String getHocHam() {
		return hocHam;
	}

	public void setHocHam(String hocHam) {
		this.hocHam = hocHam;
	}

	public Date getNgayNhanHocVi() {
		return ngayNhanHocVi;
	}

	public void setNgayNhanHocVi(Date ngayNhanHocVi) {
		this.ngayNhanHocVi = ngayNhanHocVi;
	}

	public Date getNgayNhanHocHam() {
		return ngayNhanHocHam;
	}

	public void setNgayNhanHocHam(Date ngayNhanHocHam) {
		this.ngayNhanHocHam = ngayNhanHocHam;
	}

	public String getLyLuanChinhTri() {
		return lyLuanChinhTri;
	}

	public void setLyLuanChinhTri(String lyLuanChinhTri) {
		this.lyLuanChinhTri = lyLuanChinhTri;
	}

	public String getQuanLyNhaNuoc() {
		return quanLyNhaNuoc;
	}

	public void setQuanLyNhaNuoc(String quanLyNhaNuoc) {
		this.quanLyNhaNuoc = quanLyNhaNuoc;
	}

	public String getNgoaiNgu() {
		return ngoaiNgu;
	}

	public void setNgoaiNgu(String ngoaiNgu) {
		this.ngoaiNgu = ngoaiNgu;
	}

	public String getTinHoc() {
		return tinHoc;
	}

	public void setTinHoc(String tinHoc) {
		this.tinHoc = tinHoc;
	}

	public Date getNgayVaoDcsvnDuBi() {
		return ngayVaoDcsvnDuBi;
	}

	public void setNgayVaoDcsvnDuBi(Date ngayVaoDcsvnDuBi) {
		this.ngayVaoDcsvnDuBi = ngayVaoDcsvnDuBi;
	}

	public Date getNgayVaoDcsvnChinhThuc() {
		return ngayVaoDcsvnChinhThuc;
	}

	public void setNgayVaoDcsvnChinhThuc(Date ngayVaoDcsvnChinhThuc) {
		this.ngayVaoDcsvnChinhThuc = ngayVaoDcsvnChinhThuc;
	}

	public String getThamGiaToChucCtxh() {
		return thamGiaToChucCtxh;
	}

	public void setThamGiaToChucCtxh(String thamGiaToChucCtxh) {
		this.thamGiaToChucCtxh = thamGiaToChucCtxh;
	}

	public Date getNgayNhapNgu() {
		return ngayNhapNgu;
	}

	public void setNgayNhapNgu(Date ngayNhapNgu) {
		this.ngayNhapNgu = ngayNhapNgu;
	}

	public Date getNgayXuatNgu() {
		return ngayXuatNgu;
	}

	public void setNgayXuatNgu(Date ngayXuatNgu) {
		this.ngayXuatNgu = ngayXuatNgu;
	}

	public String getQuanHamCaoNhat() {
		return quanHamCaoNhat;
	}

	public void setQuanHamCaoNhat(String quanHamCaoNhat) {
		this.quanHamCaoNhat = quanHamCaoNhat;
	}

	public String getDanhHieuPhongTang() {
		return danhHieuPhongTang;
	}

	public void setDanhHieuPhongTang(String danhHieuPhongTang) {
		this.danhHieuPhongTang = danhHieuPhongTang;
	}

	public Integer getSoTruongCongTac() {
		return soTruongCongTac;
	}

	public void setSoTruongCongTac(Integer soTruongCongTac) {
		this.soTruongCongTac = soTruongCongTac;
	}

	public String getKhenThuong() {
		return khenThuong;
	}

	public void setKhenThuong(String khenThuong) {
		this.khenThuong = khenThuong;
	}

	public String getKyLuat() {
		return kyLuat;
	}

	public void setKyLuat(String kyLuat) {
		this.kyLuat = kyLuat;
	}

	public String getTinhTrangSucKhoe() {
		return tinhTrangSucKhoe;
	}

	public void setTinhTrangSucKhoe(String tinhTrangSucKhoe) {
		this.tinhTrangSucKhoe = tinhTrangSucKhoe;
	}

	public double getChieuCao() {
		return chieuCao;
	}

	public void setChieuCao(double chieuCao) {
		this.chieuCao = chieuCao;
	}

	public double getCanNang() {
		return canNang;
	}

	public void setCanNang(double canNang) {
		this.canNang = canNang;
	}

	public String getNhomMau() {
		return nhomMau;
	}

	public void setNhomMau(String nhomMau) {
		this.nhomMau = nhomMau;
	}

	public String getSoBaoHiemXh() {
		return soBaoHiemXh;
	}

	public void setSoBaoHiemXh(String soBaoHiemXh) {
		this.soBaoHiemXh = soBaoHiemXh;
	}

	public String getLaThuongBinh() {
		return laThuongBinh;
	}

	public void setLaThuongBinh(String laThuongBinh) {
		this.laThuongBinh = laThuongBinh;
	}

	public String getLaConGiaDinhChinhSach() {
		return laConGiaDinhChinhSach;
	}

	public void setLaConGiaDinhChinhSach(String laConGiaDinhChinhSach) {
		this.laConGiaDinhChinhSach = laConGiaDinhChinhSach;
	}

	public String getNhanXet() {
		return nhanXet;
	}

	public void setNhanXet(String nhanXet) {
		this.nhanXet = nhanXet;
	}

	public Date getNgayVeHuu() {
		return ngayVeHuu;
	}

	public void setNgayVeHuu(Date ngayVeHuu) {
		this.ngayVeHuu = ngayVeHuu;
	}

	public Date getNgayThoiViec() {
		return ngayThoiViec;
	}

	public void setNgayThoiViec(Date ngayThoiViec) {
		this.ngayThoiViec = ngayThoiViec;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

}
