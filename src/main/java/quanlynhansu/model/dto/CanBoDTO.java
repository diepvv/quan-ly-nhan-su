package quanlynhansu.model.dto;

import java.io.Serializable;
import java.util.Date;

public class CanBoDTO implements Serializable {
	private static final long serialVersionUID = 7660631391091782293L;
	private Integer pk;
	private String soHieu;
	private Integer donViChucNang_pk;
	private Integer boMon_pk;
	private String imageUrl;
	private String ten;
	private String tenGoiKhac;
	private Date ngaySinh;
	private Integer gioiTinh;
	private String noiSinh;
	private String queQuan;
	private Integer danToc_pk;
	private Integer tonGiao_pk;
	private String soCmnd;
	private Date ngayCapCmnd;
	private String noiCapCmnd;
	private String noiDKHoKhauThuongTru;
	private String noiOHienNay;
	private String ngheNghiepKhiTuyenDung;
	private String coQuanTuyenDung;
	private Date ngayTuyenDung;
	private Integer chucVu_pk;
	private String congViecDuocGiao;
	private String chucDanh;
	private Integer ngachCongChuc_pk;
	private Integer bacLuong_pk;
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

	public CanBoDTO() {
	}

	@Deprecated
	public CanBoDTO(Integer pk, String soHieu, Integer donViChucNang_pk,
			Integer boMon_pk, String imageUrl, String ten, String tenGoiKhac,
			Date ngaySinh, Integer gioiTinh, String noiSinh, String queQuan,
			Integer danToc_pk, Integer tonGiao_pk, String soCmnd,
			Date ngayCapCmnd, String noiCapCmnd, String noiDKHoKhauThuongTru,
			String noiOHienNay, String ngheNghiepKhiTuyenDung,
			String coQuanTuyenDung, Date ngayTuyenDung, Integer chucVu_pk,
			String congViecDuocGiao, String chucDanh, Integer ngachCongChuc_pk,
			Integer bacLuong_pk, Date ngayHuong, double phuCapChucVu,
			double phuCapKhac, String trinhDoGiaoDucPt,
			String trinhDoChuyenMon, String hocVi, String hocHam,
			Date ngayNhanHocVi, Date ngayNhanHocHam, String lyLuanChinhTri,
			String quanLyNhaNuoc, String ngoaiNgu, String tinHoc,
			Date ngayVaoDcsvnDuBi, Date ngayVaoDcsvnChinhThuc,
			String thamGiaToChucCtxh, Date ngayNhapNgu, Date ngayXuatNgu,
			String quanHamCaoNhat, String danhHieuPhongTang,
			Integer soTruongCongTac, String khenThuong, String kyLuat,
			String tinhTrangSucKhoe, double chieuCao, double canNang,
			String nhomMau, String soBaoHiemXh, String laThuongBinh,
			String laConGiaDinhChinhSach, String nhanXet, Date ngayVeHuu,
			Date ngayThoiViec) {
		this.pk = pk;
		this.soHieu = soHieu;
		this.donViChucNang_pk = donViChucNang_pk;
		this.boMon_pk = boMon_pk;
		this.imageUrl = imageUrl;
		this.ten = ten;
		this.tenGoiKhac = tenGoiKhac;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.noiSinh = noiSinh;
		this.queQuan = queQuan;
		this.danToc_pk = danToc_pk;
		this.tonGiao_pk = tonGiao_pk;
		this.soCmnd = soCmnd;
		this.ngayCapCmnd = ngayCapCmnd;
		this.noiCapCmnd = noiCapCmnd;
		this.noiDKHoKhauThuongTru = noiDKHoKhauThuongTru;
		this.noiOHienNay = noiOHienNay;
		this.ngheNghiepKhiTuyenDung = ngheNghiepKhiTuyenDung;
		this.coQuanTuyenDung = coQuanTuyenDung;
		this.ngayTuyenDung = ngayTuyenDung;
		this.chucVu_pk = chucVu_pk;
		this.congViecDuocGiao = congViecDuocGiao;
		this.chucDanh = chucDanh;
		this.ngachCongChuc_pk = ngachCongChuc_pk;
		this.bacLuong_pk = bacLuong_pk;
		this.ngayHuong = ngayHuong;
		this.phuCapChucVu = phuCapChucVu;
		this.phuCapKhac = phuCapKhac;
		this.trinhDoGiaoDucPt = trinhDoGiaoDucPt;
		this.trinhDoChuyenMon = trinhDoChuyenMon;
		this.hocVi = hocVi;
		this.hocHam = hocHam;
		this.ngayNhanHocVi = ngayNhanHocVi;
		this.ngayNhanHocHam = ngayNhanHocHam;
		this.lyLuanChinhTri = lyLuanChinhTri;
		this.quanLyNhaNuoc = quanLyNhaNuoc;
		this.ngoaiNgu = ngoaiNgu;
		this.tinHoc = tinHoc;
		this.ngayVaoDcsvnDuBi = ngayVaoDcsvnDuBi;
		this.ngayVaoDcsvnChinhThuc = ngayVaoDcsvnChinhThuc;
		this.thamGiaToChucCtxh = thamGiaToChucCtxh;
		this.ngayNhapNgu = ngayNhapNgu;
		this.ngayXuatNgu = ngayXuatNgu;
		this.quanHamCaoNhat = quanHamCaoNhat;
		this.danhHieuPhongTang = danhHieuPhongTang;
		this.soTruongCongTac = soTruongCongTac;
		this.khenThuong = khenThuong;
		this.kyLuat = kyLuat;
		this.tinhTrangSucKhoe = tinhTrangSucKhoe;
		this.chieuCao = chieuCao;
		this.canNang = canNang;
		this.nhomMau = nhomMau;
		this.soBaoHiemXh = soBaoHiemXh;
		this.laThuongBinh = laThuongBinh;
		this.laConGiaDinhChinhSach = laConGiaDinhChinhSach;
		this.nhanXet = nhanXet;
		this.ngayVeHuu = ngayVeHuu;
		this.ngayThoiViec = ngayThoiViec;
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

	public Integer getDonViChucNang_pk() {
		return donViChucNang_pk;
	}

	public void setDonViChucNang_pk(Integer donViChucNang_pk) {
		this.donViChucNang_pk = donViChucNang_pk;
	}

	public Integer getBoMon_pk() {
		return boMon_pk;
	}

	public void setBoMon_pk(Integer boMon_pk) {
		this.boMon_pk = boMon_pk;
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

	public Integer getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(Integer gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getNoiSinh() {
		return noiSinh;
	}

	public void setNoiSinh(String noiSinh) {
		this.noiSinh = noiSinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public Integer getDanToc_pk() {
		return danToc_pk;
	}

	public void setDanToc_pk(Integer danToc_pk) {
		this.danToc_pk = danToc_pk;
	}

	public Integer getTonGiao_pk() {
		return tonGiao_pk;
	}

	public void setTonGiao_pk(Integer tonGiao_pk) {
		this.tonGiao_pk = tonGiao_pk;
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

	public Integer getChucVu_pk() {
		return chucVu_pk;
	}

	public void setChucVu_pk(Integer chucVu_pk) {
		this.chucVu_pk = chucVu_pk;
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

	public Integer getNgachCongChuc_pk() {
		return ngachCongChuc_pk;
	}

	public void setNgachCongChuc_pk(Integer ngachCongChuc_pk) {
		this.ngachCongChuc_pk = ngachCongChuc_pk;
	}

	public Integer getBacLuong_pk() {
		return bacLuong_pk;
	}

	public void setBacLuong_pk(Integer bacLuong_pk) {
		this.bacLuong_pk = bacLuong_pk;
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
}
