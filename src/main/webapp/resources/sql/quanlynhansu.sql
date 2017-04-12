/*
MySQL Data Transfer
Source Host: localhost
Source Database: quanlynhansu
Target Host: localhost
Target Database: quanlynhansu
Date: 4/13/2017 12:27:29 AM
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for bacluong
-- ----------------------------
DROP TABLE IF EXISTS `bacluong`;
CREATE TABLE `bacluong` (
  `maBacLuong` int(11) NOT NULL,
  `heSoLuong` double DEFAULT NULL,
  PRIMARY KEY (`maBacLuong`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for canbo
-- ----------------------------
DROP TABLE IF EXISTS `canbo`;
CREATE TABLE `canbo` (
  `maCanBo` int(11) NOT NULL AUTO_INCREMENT,
  `soHieuCanBo` char(255) COLLATE utf8_unicode_ci NOT NULL,
  `maDonVi` int(11) DEFAULT NULL,
  `anhCanBo` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tenCanbo` char(255) COLLATE utf8_unicode_ci NOT NULL,
  `tenGoiKhac` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngaySinh` date DEFAULT NULL,
  `gioiTinh` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `noiSinh` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `queQuan` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `maDanToc` int(11) DEFAULT NULL,
  `maTonGiao` int(11) DEFAULT NULL,
  `soCMND` int(11) DEFAULT NULL,
  `ngayCapCMND` date DEFAULT NULL,
  `noiCapCMND` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `noiDKHoKhauThuongTru` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `noiOHienNay` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngheNghiepKhiTuyendung` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `coQuanTuyenDung` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayTuyenDung` date DEFAULT NULL,
  `maChucVu` int(11) DEFAULT NULL,
  `congViecDuocGiao` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `chucDanh` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `maNgachCongChuc` int(11) DEFAULT NULL,
  `maBacLuong` int(11) DEFAULT NULL,
  `ngayHuong` date DEFAULT NULL,
  `phuCapChucVu` double DEFAULT NULL,
  `phuCapKhac` double DEFAULT NULL,
  `trinhDoGiaoDucPT` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `trinhDoChuyenMon` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `hocVi` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `hocHam` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayNhanHocVi` date DEFAULT NULL,
  `ngayNhanHocHam` date DEFAULT NULL,
  `lyLuanChinhTri` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `quanLyNhaNuoc` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngoaiNgu` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tinHoc` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayVaoDCSVNDubi` date DEFAULT NULL,
  `ngayVaoDCSVNChinhthuc` date DEFAULT NULL,
  `ngayThamGiaToChucCTXH` date DEFAULT NULL,
  `ngayNhapNgu` date DEFAULT NULL,
  `ngayXuatNgu` date DEFAULT NULL,
  `quanHamCaoNhat` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `danhHieuPhongTang` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `soTruongCongTac` int(11) DEFAULT NULL,
  `khenThuong` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `KyLuat` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tinhTrangSucKhoe` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `chieuCao` double DEFAULT NULL,
  `canNang` int(11) DEFAULT NULL,
  `nhomMau` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `soBaoHiemXH` int(11) DEFAULT NULL,
  `laThuongBinh` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `laConGiaDinhChinhSach` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nhanXet` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayVeHuu` date DEFAULT NULL,
  `ngayThoiViec` date DEFAULT NULL,
  PRIMARY KEY (`maCanBo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for canbokhoangon
-- ----------------------------
DROP TABLE IF EXISTS `canbokhoangon`;
CREATE TABLE `canbokhoangon` (
  `maCanBoKhoanGon` int(11) NOT NULL AUTO_INCREMENT,
  `maDonVi` int(11) DEFAULT NULL,
  `hoTenCanBo` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `soDienThoai` int(11) DEFAULT NULL,
  `soCMND` int(11) DEFAULT NULL,
  `diaChi` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayKyHopDong` date DEFAULT NULL,
  PRIMARY KEY (`maCanBoKhoanGon`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for canbokiemnhiem
-- ----------------------------
DROP TABLE IF EXISTS `canbokiemnhiem`;
CREATE TABLE `canbokiemnhiem` (
  `maCanBoKiemNhiem` int(11) NOT NULL AUTO_INCREMENT,
  `maDonVi` int(11) DEFAULT NULL,
  `maCanBo` int(11) DEFAULT NULL,
  `chucVuKiemNhiem` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tuNgay` date DEFAULT NULL,
  `denNgay` date DEFAULT NULL,
  PRIMARY KEY (`maCanBoKiemNhiem`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for canbothamnien
-- ----------------------------
DROP TABLE IF EXISTS `canbothamnien`;
CREATE TABLE `canbothamnien` (
  `maCanBoThamNien` int(11) NOT NULL AUTO_INCREMENT,
  `maDonVi` int(11) DEFAULT NULL,
  `maCanBo` int(11) DEFAULT NULL,
  `mocTinhPhuCapThamNien` date DEFAULT NULL,
  `maBacLuong` int(11) DEFAULT NULL,
  `phuCapChucVu` double DEFAULT NULL,
  `vuotKhung` double DEFAULT NULL,
  `tongHeSoLuong` double DEFAULT NULL,
  `phuCapGiangVien` double DEFAULT NULL,
  `soThangBiGiamTru` int(11) DEFAULT NULL,
  `thoiDiemTangPCTN` date DEFAULT NULL,
  `ghiChuThoiDiemTang` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tuNgayKhongPCTN` date DEFAULT NULL,
  `denNgayKhongPCTN` date DEFAULT NULL,
  `ghiChuKhongPCTN` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`maCanBoThamNien`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for chucvu
-- ----------------------------
DROP TABLE IF EXISTS `chucvu`;
CREATE TABLE `chucvu` (
  `maChucVu` int(11) NOT NULL AUTO_INCREMENT,
  `tenChucVu` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`maChucVu`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for dantoc
-- ----------------------------
DROP TABLE IF EXISTS `dantoc`;
CREATE TABLE `dantoc` (
  `maDanToc` int(11) NOT NULL AUTO_INCREMENT,
  `tenDanToc` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`maDanToc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for donvichucnang
-- ----------------------------
DROP TABLE IF EXISTS `donvichucnang`;
CREATE TABLE `donvichucnang` (
  `maDonVi` int(11) NOT NULL AUTO_INCREMENT,
  `tenDonVi` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`maDonVi`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for hopdongcanbo
-- ----------------------------
DROP TABLE IF EXISTS `hopdongcanbo`;
CREATE TABLE `hopdongcanbo` (
  `maHDCanBo` int(11) DEFAULT NULL,
  `maDonVi` int(11) DEFAULT NULL,
  `maCanBo` int(11) DEFAULT NULL,
  `tenHopDong` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `maChucVu` int(11) DEFAULT NULL,
  `maLoaiHopDong` int(11) DEFAULT NULL,
  `ngayKy` date DEFAULT NULL,
  `tuNgay` date DEFAULT NULL,
  `denNgay` date DEFAULT NULL,
  `trichYeuNoiDung` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fileHD` char(255) COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for hopdongnganhan
-- ----------------------------
DROP TABLE IF EXISTS `hopdongnganhan`;
CREATE TABLE `hopdongnganhan` (
  `maHDNganHan` int(11) NOT NULL AUTO_INCREMENT,
  `tenHopDong` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tenNhanVien` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayKy` date DEFAULT NULL,
  `tuNgay` date DEFAULT NULL,
  `denNgay` date DEFAULT NULL,
  PRIMARY KEY (`maHDNganHan`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for kekhaitaisan
-- ----------------------------
DROP TABLE IF EXISTS `kekhaitaisan`;
CREATE TABLE `kekhaitaisan` (
  `maKeKhai` int(11) NOT NULL AUTO_INCREMENT,
  `maDonVi` int(11) DEFAULT NULL,
  `maCanBo` int(11) DEFAULT NULL,
  `ngayKeKhai` date DEFAULT NULL,
  `fileKeKhai` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`maKeKhai`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for loaihopdong
-- ----------------------------
DROP TABLE IF EXISTS `loaihopdong`;
CREATE TABLE `loaihopdong` (
  `maLoaiHopDong` int(11) NOT NULL AUTO_INCREMENT,
  `tenLoaiHopDong` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`maLoaiHopDong`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for loaiquyetdinh
-- ----------------------------
DROP TABLE IF EXISTS `loaiquyetdinh`;
CREATE TABLE `loaiquyetdinh` (
  `maLoaiQuyetDinh` int(11) NOT NULL AUTO_INCREMENT,
  `tenLoaiQuyetDinh` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`maLoaiQuyetDinh`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for luong
-- ----------------------------
DROP TABLE IF EXISTS `luong`;
CREATE TABLE `luong` (
  `maLuong` int(11) NOT NULL AUTO_INCREMENT,
  `maDonVi` int(11) DEFAULT NULL,
  `maCanBo` int(11) DEFAULT NULL,
  `maNgachCongChuc` int(11) DEFAULT NULL,
  `maBacLuong` int(11) DEFAULT NULL,
  `thoiGianTinhHuong` date DEFAULT NULL,
  `phanTranPhuCap` int(11) DEFAULT NULL,
  `thoiGianTangLuong` date DEFAULT NULL,
  `thoiGianChamLenLuong` date DEFAULT NULL,
  `lyDoChamLenLuong` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `thoiGianLenLuongSom` date DEFAULT NULL,
  `lyDoLenLuongSom` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ghiChu` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`maLuong`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for ngachcongchuc
-- ----------------------------
DROP TABLE IF EXISTS `ngachcongchuc`;
CREATE TABLE `ngachcongchuc` (
  `maNgachCongChuc` char(255) COLLATE utf8_unicode_ci NOT NULL,
  `tenNgachCongChuc` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `soNamNangBacLuong` int(11) DEFAULT NULL,
  PRIMARY KEY (`maNgachCongChuc`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for quanhegiadinh
-- ----------------------------
DROP TABLE IF EXISTS `quanhegiadinh`;
CREATE TABLE `quanhegiadinh` (
  `maQuanHeGD` int(11) NOT NULL AUTO_INCREMENT,
  `maCanBo` int(11) DEFAULT NULL,
  `moiQuanHe` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `hoTen` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `namSinh` date DEFAULT NULL,
  `queQuan` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`maQuanHeGD`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for quatrinhcongtac
-- ----------------------------
DROP TABLE IF EXISTS `quatrinhcongtac`;
CREATE TABLE `quatrinhcongtac` (
  `maQuaTrinhCongTac` int(11) NOT NULL AUTO_INCREMENT,
  `maDonVi` int(11) DEFAULT NULL,
  `maCanBo` int(11) DEFAULT NULL,
  `noiDungCongTac` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `congTacTuNgay` date DEFAULT NULL,
  `congTacDenNgay` date DEFAULT NULL,
  `ghiChu` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nguoiKy` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`maQuaTrinhCongTac`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for quatrinhdaotao
-- ----------------------------
DROP TABLE IF EXISTS `quatrinhdaotao`;
CREATE TABLE `quatrinhdaotao` (
  `maQuaTrinhDaoTao` int(11) NOT NULL AUTO_INCREMENT,
  `maDonVi` int(11) DEFAULT NULL,
  `maCanBo` int(11) DEFAULT NULL,
  `donViDaoTao` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `hinhThucDaoTao` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `chuyenNganhDaoTao` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tenBangCap` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `hinhThucDihoc` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tuNgay` date DEFAULT NULL,
  `denNgay` date DEFAULT NULL,
  `ghichu` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`maQuaTrinhDaoTao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for quyetdinh
-- ----------------------------
DROP TABLE IF EXISTS `quyetdinh`;
CREATE TABLE `quyetdinh` (
  `maQuyetDinh` int(11) NOT NULL AUTO_INCREMENT,
  `maDonVi` int(11) DEFAULT NULL,
  `maCanBo` int(11) DEFAULT NULL,
  `soQuyetDinh` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tenQuyetDinh` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `maLoaiQuyetDinh` int(11) DEFAULT NULL,
  `noidungQD` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayKy` date DEFAULT NULL,
  `tuNgay` date DEFAULT NULL,
  `denNgay` date DEFAULT NULL,
  `nguoiKy` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fileKy` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`maQuyetDinh`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for quyetdinhkhenthuong
-- ----------------------------
DROP TABLE IF EXISTS `quyetdinhkhenthuong`;
CREATE TABLE `quyetdinhkhenthuong` (
  `maQDKhenThuong` int(11) NOT NULL AUTO_INCREMENT,
  `maDonVi` int(11) DEFAULT NULL,
  `maCanBo` int(11) DEFAULT NULL,
  `soQuyetDinh` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tenQuyetDinh` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `noiDungQuyetDinh` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayKy` date DEFAULT NULL,
  `nguoiKy` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fileKy` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`maQDKhenThuong`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for quyetdinhkyluat
-- ----------------------------
DROP TABLE IF EXISTS `quyetdinhkyluat`;
CREATE TABLE `quyetdinhkyluat` (
  `maQDKyLuat` int(11) NOT NULL AUTO_INCREMENT,
  `maDonVi` int(11) DEFAULT NULL,
  `maCanBo` int(11) DEFAULT NULL,
  `soQuyetDinh` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tenQuyetDinh` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `noiDungQuyetDinh` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayKy` date DEFAULT NULL,
  `nguoiKy` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fileKy` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`maQDKyLuat`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tongiao
-- ----------------------------
DROP TABLE IF EXISTS `tongiao`;
CREATE TABLE `tongiao` (
  `maTonGiao` int(11) NOT NULL AUTO_INCREMENT,
  `tenTonGiao` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`maTonGiao`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `hopdongnganhan` VALUES ('7', 'Tuyển dụng lao động', 'Messi 1', '2017-04-10', '2017-04-10', '2017-04-20');
INSERT INTO `hopdongnganhan` VALUES ('14', 'Chặt cây C2', 'Nguyễn Văn Tèo', '2017-04-09', '2017-04-13', '2017-04-20');
