/*
MySQL Data Transfer
Source Host: localhost
Source Database: quanlynhansu
Target Host: localhost
Target Database: quanlynhansu
Date: 5/6/2017 6:38:50 PM
*/

create database quanlynhansu;
use quanlynhansu;

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for bacluong
-- ----------------------------
DROP TABLE IF EXISTS `bacluong`;
CREATE TABLE `bacluong` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `maBacLuong` int(11) DEFAULT NULL,
  `heSoLuong` binary(11) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for bomon
-- ----------------------------
DROP TABLE IF EXISTS `bomon`;
CREATE TABLE `bomon` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `tenBoMon` char(255) COLLATE utf8_unicode_ci NOT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for canbo
-- ----------------------------
DROP TABLE IF EXISTS `canbo`;
CREATE TABLE `canbo` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `soHieu` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `donViChucNang_pk` int(11) DEFAULT NULL,
  `boMon_pk` int(11) DEFAULT NULL,
  `imageUrl` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ten` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `tenGoiKhac` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngaySinh` date DEFAULT NULL,
  `gioiTinh` tinyint(1) DEFAULT NULL,
  `noiSinh` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `queQuan` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `danToc_pk` int(11) DEFAULT NULL,
  `tonGiao_pk` int(11) DEFAULT NULL,
  `soCmnd` varchar(30) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayCapCmnd` date DEFAULT NULL,
  `noiCapCmnd` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `noiDKHoKhauThuongTru` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `noiOHienNay` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngheNghiepKhiTuyenDung` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `coQuanTuyenDung` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayTuyenDung` date DEFAULT NULL,
  `chucVu_pk` int(11) DEFAULT NULL,
  `congViecDuocGiao` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `chucDanh` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngachCongChuc_pk` int(11) DEFAULT NULL,
  `bacLuong_pk` int(11) DEFAULT NULL,
  `ngayHuong` date DEFAULT NULL,
  `phuCapChucVu` double DEFAULT NULL,
  `phuCapKhac` double DEFAULT NULL,
  `trinhDoGiaoDucPt` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `trinhDoChuyenMon` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `hocVi` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `hocHam` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayNhanHocVi` date DEFAULT NULL,
  `ngayNhanHocHam` date DEFAULT NULL,
  `lyLuanChinhTri` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `quanLyNhaNuoc` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngoaiNgu` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tinHoc` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayVaoDcsvnDuBi` date DEFAULT NULL,
  `ngayVaoDcsvnChinhThuc` date DEFAULT NULL,
  `thamGiaToChucCtxh` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayNhapNgu` date DEFAULT NULL,
  `ngayXuatNgu` date DEFAULT NULL,
  `quanHamCaoNhat` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `danhHieuPhongTang` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `soTruongCongTac` int(11) DEFAULT NULL,
  `khenThuong` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `kyLuat` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tinhTrangSucKhoe` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `chieuCao` double(11,0) DEFAULT NULL,
  `canNang` double(11,0) DEFAULT NULL,
  `nhomMau` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `soBaoHiemXh` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `laThuongBinh` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `laConGiaDinhChinhSach` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nhanXet` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayVeHuu` date DEFAULT NULL,
  `ngayThoiViec` date DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`),
  KEY `danToc_pk` (`danToc_pk`),
  KEY `tonGiao_pk` (`tonGiao_pk`),
  KEY `chucVu_pk` (`chucVu_pk`),
  KEY `ngachCongChuc_pk` (`ngachCongChuc_pk`),
  KEY `bacLuong_pk` (`bacLuong_pk`),
  KEY `donViChucNang_pk` (`donViChucNang_pk`),
  KEY `boMon_pk` (`boMon_pk`),
  CONSTRAINT `bacLuong_pk` FOREIGN KEY (`bacLuong_pk`) REFERENCES `bacluong` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `boMon_pk` FOREIGN KEY (`boMon_pk`) REFERENCES `bomon` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `chucVu_pk` FOREIGN KEY (`chucVu_pk`) REFERENCES `chucvu` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `danToc_pk` FOREIGN KEY (`danToc_pk`) REFERENCES `dantoc` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `donViChucNang_pk` FOREIGN KEY (`donViChucNang_pk`) REFERENCES `donvichucnang` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `ngachCongChuc_pk` FOREIGN KEY (`ngachCongChuc_pk`) REFERENCES `ngachcongchuc` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `tonGiao_pk` FOREIGN KEY (`tonGiao_pk`) REFERENCES `tongiao` (`pk`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for chucvu
-- ----------------------------
DROP TABLE IF EXISTS `chucvu`;
CREATE TABLE `chucvu` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `tenChucVu` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for danhsachkhoangon
-- ----------------------------
DROP TABLE IF EXISTS `danhsachkhoangon`;
CREATE TABLE `danhsachkhoangon` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `donViChucNangDskg_pk` int(11) DEFAULT NULL,
  `hoTenCanBo` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `soDienThoai` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `soCmnd` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `diaChi` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayKyHopDong` date DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`),
  KEY `donViChucNangDskg_pk` (`donViChucNangDskg_pk`),
  CONSTRAINT `donViChucNangDskg_pk` FOREIGN KEY (`donViChucNangDskg_pk`) REFERENCES `donvichucnang` (`pk`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for danhsachkiemnhiem
-- ----------------------------
DROP TABLE IF EXISTS `danhsachkiemnhiem`;
CREATE TABLE `danhsachkiemnhiem` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `donViChucNangDskn_pk` int(11) DEFAULT NULL,
  `canBoDskn_pk` int(11) DEFAULT NULL,
  `chucVuKiemNhiem` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tuNgay` date DEFAULT NULL,
  `denNgay` date DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`),
  KEY `donViChucNangDskn_pk` (`donViChucNangDskn_pk`),
  KEY `canBoDskn_pk` (`canBoDskn_pk`),
  CONSTRAINT `canBoDskn_pk` FOREIGN KEY (`canBoDskn_pk`) REFERENCES `canbo` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `donViChucNangDskn_pk` FOREIGN KEY (`donViChucNangDskn_pk`) REFERENCES `donvichucnang` (`pk`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for danhsachthamnien
-- ----------------------------
DROP TABLE IF EXISTS `danhsachthamnien`;
CREATE TABLE `danhsachthamnien` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `donViChucNangDstn_pk` int(11) DEFAULT NULL,
  `canBoDstn_pk` int(11) DEFAULT NULL,
  `mocTinhPhuCapTn` date DEFAULT NULL,
  `bacLuongDstn_pk` int(11) DEFAULT NULL,
  `phuCapChucVu` double DEFAULT NULL,
  `vuotKhung` double DEFAULT NULL,
  `tongHeSoLuong` double DEFAULT NULL,
  `phuCapGiangVien` double DEFAULT NULL,
  `soThangBiGiamTru` int(11) DEFAULT NULL,
  `thoiDiemTangPhuCapTn` date DEFAULT NULL,
  `ghiChuThoiDiemTang` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tuNgayKhongPhuCapTn` date DEFAULT NULL,
  `denNgayKhongPhuCapTn` date DEFAULT NULL,
  `ghiChuKhongPhuCapTn` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`),
  KEY `bacLuongDstn_pk` (`bacLuongDstn_pk`),
  KEY `donViChucNangDstn_pk` (`donViChucNangDstn_pk`),
  KEY `canBoDstn_pk` (`canBoDstn_pk`),
  CONSTRAINT `bacLuongDstn_pk` FOREIGN KEY (`bacLuongDstn_pk`) REFERENCES `bacluong` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `canBoDstn_pk` FOREIGN KEY (`canBoDstn_pk`) REFERENCES `canbo` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `donViChucNangDstn_pk` FOREIGN KEY (`donViChucNangDstn_pk`) REFERENCES `donvichucnang` (`pk`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for dantoc
-- ----------------------------
DROP TABLE IF EXISTS `dantoc`;
CREATE TABLE `dantoc` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `tenDanToc` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for donvichucnang
-- ----------------------------
DROP TABLE IF EXISTS `donvichucnang`;
CREATE TABLE `donvichucnang` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `maDonVi` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tenDonVi` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for donvichucnang_bomon
-- ----------------------------
DROP TABLE IF EXISTS `donvichucnang_bomon`;
CREATE TABLE `donvichucnang_bomon` (
  `donViChucNang_pk` int(11) NOT NULL,
  `boMon_pk` int(11) NOT NULL,
  PRIMARY KEY (`donViChucNang_pk`,`boMon_pk`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for hibernate_sequence
-- ----------------------------
DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for hopdongcanbo
-- ----------------------------
DROP TABLE IF EXISTS `hopdongcanbo`;
CREATE TABLE `hopdongcanbo` (
  `pk` int(11) NOT NULL,
  `donViChucNangHdcb_pk` int(11) DEFAULT NULL,
  `canBoHdcn_pk` int(11) DEFAULT NULL,
  `tenHopDong` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `chucVuHdcb_pk` int(11) DEFAULT NULL,
  `loaiHopDongHdcb_pk` int(11) DEFAULT NULL,
  `ngayKy` date DEFAULT NULL,
  `tuNgay` date DEFAULT NULL,
  `denNgay` date DEFAULT NULL,
  `trichYeuNoiDung` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fileHD` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`),
  KEY `donViChucNangHdcb_pk` (`donViChucNangHdcb_pk`),
  KEY `canBoHdcn_pk` (`canBoHdcn_pk`),
  KEY `chucVuHdcb_pk` (`chucVuHdcb_pk`),
  KEY `loaiHopDongHdcb_pk` (`loaiHopDongHdcb_pk`),
  CONSTRAINT `canBoHdcn_pk` FOREIGN KEY (`canBoHdcn_pk`) REFERENCES `canbo` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `chucVuHdcb_pk` FOREIGN KEY (`chucVuHdcb_pk`) REFERENCES `chucvu` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `donViChucNangHdcb_pk` FOREIGN KEY (`donViChucNangHdcb_pk`) REFERENCES `donvichucnang` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `loaiHopDongHdcb_pk` FOREIGN KEY (`loaiHopDongHdcb_pk`) REFERENCES `loaihopdong` (`pk`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for hopdongnganhan
-- ----------------------------
DROP TABLE IF EXISTS `hopdongnganhan`;
CREATE TABLE `hopdongnganhan` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `tenHopDong` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tenNhanVien` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayKy` date DEFAULT NULL,
  `tuNgay` date DEFAULT NULL,
  `denNgay` date DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for kekhaitaisan
-- ----------------------------
DROP TABLE IF EXISTS `kekhaitaisan`;
CREATE TABLE `kekhaitaisan` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `donViChucNangKkts_pk` int(11) DEFAULT NULL,
  `canBoKkts_pk` int(11) DEFAULT NULL,
  `ngayKeKhai` date DEFAULT NULL,
  `fileKeKhai` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`),
  KEY `donViChucNangKkts_pk` (`donViChucNangKkts_pk`),
  KEY `canBoKkts_pk` (`canBoKkts_pk`),
  CONSTRAINT `canBoKkts_pk` FOREIGN KEY (`canBoKkts_pk`) REFERENCES `canbo` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `donViChucNangKkts_pk` FOREIGN KEY (`donViChucNangKkts_pk`) REFERENCES `donvichucnang` (`pk`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for loaihopdong
-- ----------------------------
DROP TABLE IF EXISTS `loaihopdong`;
CREATE TABLE `loaihopdong` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `tenLoaiHopDong` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for loaiquyetdinh
-- ----------------------------
DROP TABLE IF EXISTS `loaiquyetdinh`;
CREATE TABLE `loaiquyetdinh` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `tenLoaiQuyetDinh` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for luong
-- ----------------------------
DROP TABLE IF EXISTS `luong`;
CREATE TABLE `luong` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `donViChucNangL_pk` int(11) DEFAULT NULL,
  `canBoL_pk` int(11) DEFAULT NULL,
  `ngachCongChucL_pk` int(11) DEFAULT NULL,
  `bacLuongL_pk` int(11) DEFAULT NULL,
  `thoiGianTinhHuong` date DEFAULT NULL,
  `phanTranPhuCap` int(11) DEFAULT NULL,
  `thoiGianTangLuong` date DEFAULT NULL,
  `thoiGianChamLenLuong` date DEFAULT NULL,
  `lyDoChamLenLuong` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `thoiGianLenLuongSom` date DEFAULT NULL,
  `lyDoLenLuongSom` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ghiChu` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`),
  KEY `donViChucNangL_pk` (`donViChucNangL_pk`),
  KEY `canBoL_pk` (`canBoL_pk`),
  KEY `ngachCongChucL_pk` (`ngachCongChucL_pk`),
  KEY `bacLuongL_pk` (`bacLuongL_pk`),
  CONSTRAINT `bacLuongL_pk` FOREIGN KEY (`bacLuongL_pk`) REFERENCES `bacluong` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `canBoL_pk` FOREIGN KEY (`canBoL_pk`) REFERENCES `canbo` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `donViChucNangL_pk` FOREIGN KEY (`donViChucNangL_pk`) REFERENCES `donvichucnang` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `ngachCongChucL_pk` FOREIGN KEY (`ngachCongChucL_pk`) REFERENCES `ngachcongchuc` (`pk`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for ngachcongchuc
-- ----------------------------
DROP TABLE IF EXISTS `ngachcongchuc`;
CREATE TABLE `ngachcongchuc` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `maNgach` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tenNgach` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `soNamNangBacLuong` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for quanhegiadinh
-- ----------------------------
DROP TABLE IF EXISTS `quanhegiadinh`;
CREATE TABLE `quanhegiadinh` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `canBoQhgd_pk` int(11) DEFAULT NULL,
  `moiQuanHe` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `hoTen` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `namSinh` date DEFAULT NULL,
  `queQuan` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`),
  KEY `canBoQhgd_pk` (`canBoQhgd_pk`),
  CONSTRAINT `canBoQhgd_pk` FOREIGN KEY (`canBoQhgd_pk`) REFERENCES `canbo` (`pk`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for quatrinhcongtac
-- ----------------------------
DROP TABLE IF EXISTS `quatrinhcongtac`;
CREATE TABLE `quatrinhcongtac` (
  `pk` int(11) NOT NULL,
  `donViChucNangQtct_pk` int(11) DEFAULT NULL,
  `canBoQtct_pk` int(11) DEFAULT NULL,
  `noiDungCongTac` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `congTacTuNgay` date DEFAULT NULL,
  `congTacDenNgay` date DEFAULT NULL,
  `ghiChu` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nguoiKy` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`),
  KEY `donViChucNangQtct_pk` (`donViChucNangQtct_pk`),
  KEY `canBoQtct_pk` (`canBoQtct_pk`),
  CONSTRAINT `canBoQtct_pk` FOREIGN KEY (`canBoQtct_pk`) REFERENCES `canbo` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `donViChucNangQtct_pk` FOREIGN KEY (`donViChucNangQtct_pk`) REFERENCES `donvichucnang` (`pk`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for quatrinhdaotao
-- ----------------------------
DROP TABLE IF EXISTS `quatrinhdaotao`;
CREATE TABLE `quatrinhdaotao` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `donViChucNangQtdt_pk` int(11) DEFAULT NULL,
  `canBoQtdt_pk` int(11) DEFAULT NULL,
  `donViDaoTao` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `hinhThucDaoTao` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `chuyenNganhDaoTao` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tenBangCap` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `hinhThucDihoc` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tuNgay` date DEFAULT NULL,
  `denNgay` date DEFAULT NULL,
  `ghichu` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`),
  KEY `canBoQtdt_pk` (`canBoQtdt_pk`),
  KEY `donViChucNangQtdt_pk` (`donViChucNangQtdt_pk`),
  CONSTRAINT `canBoQtdt_pk` FOREIGN KEY (`canBoQtdt_pk`) REFERENCES `canbo` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `donViChucNangQtdt_pk` FOREIGN KEY (`donViChucNangQtdt_pk`) REFERENCES `donvichucnang` (`pk`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for quyetdinh
-- ----------------------------
DROP TABLE IF EXISTS `quyetdinh`;
CREATE TABLE `quyetdinh` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `donViChucNangQd_pk` int(11) DEFAULT NULL,
  `canBoQd_pk` int(11) DEFAULT NULL,
  `soQuyetDinh` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tenQuyetDinh` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `loaiQuyetDinhQd_pk` int(11) DEFAULT NULL,
  `noidungQD` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayKy` date DEFAULT NULL,
  `tuNgay` date DEFAULT NULL,
  `denNgay` date DEFAULT NULL,
  `nguoiKy` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fileKy` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`),
  KEY `donViChucNangQd_pk` (`donViChucNangQd_pk`),
  KEY `canBoQd_pk` (`canBoQd_pk`),
  KEY `loaiQuyetDinhQd_pk` (`loaiQuyetDinhQd_pk`),
  CONSTRAINT `canBoQd_pk` FOREIGN KEY (`canBoQd_pk`) REFERENCES `canbo` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `donViChucNangQd_pk` FOREIGN KEY (`donViChucNangQd_pk`) REFERENCES `donvichucnang` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `loaiQuyetDinhQd_pk` FOREIGN KEY (`loaiQuyetDinhQd_pk`) REFERENCES `loaiquyetdinh` (`pk`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for quyetdinhkhenthuong
-- ----------------------------
DROP TABLE IF EXISTS `quyetdinhkhenthuong`;
CREATE TABLE `quyetdinhkhenthuong` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `donViChucNangQdkt_pk` int(11) DEFAULT NULL,
  `canBoQdkt_pk` int(11) DEFAULT NULL,
  `soQuyetDinh` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tenQuyetDinh` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `noiDungQuyetDinh` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayKy` date DEFAULT NULL,
  `nguoiKy` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fileKy` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`),
  KEY `donViChucNangQdkt_pk` (`donViChucNangQdkt_pk`),
  KEY `canBoQdkt_pk` (`canBoQdkt_pk`),
  CONSTRAINT `canBoQdkt_pk` FOREIGN KEY (`canBoQdkt_pk`) REFERENCES `canbo` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `donViChucNangQdkt_pk` FOREIGN KEY (`donViChucNangQdkt_pk`) REFERENCES `donvichucnang` (`pk`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for quyetdinhkyluat
-- ----------------------------
DROP TABLE IF EXISTS `quyetdinhkyluat`;
CREATE TABLE `quyetdinhkyluat` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `donViChucNangQdkl_pk` int(11) DEFAULT NULL,
  `canBoQdkl_pk` int(11) DEFAULT NULL,
  `soQuyetDinh` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tenQuyetDinh` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `noiDungQuyetDinh` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngayKy` date DEFAULT NULL,
  `nguoiKy` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `fileKy` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`),
  KEY `donViChucNangQdkl_pk` (`donViChucNangQdkl_pk`),
  KEY `canBoQdkl_pk` (`canBoQdkl_pk`),
  CONSTRAINT `canBoQdkl_pk` FOREIGN KEY (`canBoQdkl_pk`) REFERENCES `canbo` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `donViChucNangQdkl_pk` FOREIGN KEY (`donViChucNangQdkl_pk`) REFERENCES `donvichucnang` (`pk`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for tongiao
-- ----------------------------
DROP TABLE IF EXISTS `tongiao`;
CREATE TABLE `tongiao` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `tenTonGiao` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `bacluong` VALUES ('1', '1', '2.3', null);
INSERT INTO `bacluong` VALUES ('2', '2', '3', null);
INSERT INTO `bacluong` VALUES ('3', '3', '2', null);
INSERT INTO `bacluong` VALUES ('4', '4', '3', null);
INSERT INTO `bacluong` VALUES ('5', '5', '3', null);
INSERT INTO `bacluong` VALUES ('6', '6', '4', null);
INSERT INTO `bacluong` VALUES ('7', '7', '4', null);
INSERT INTO `bacluong` VALUES ('8', '8', '5', null);
INSERT INTO `bacluong` VALUES ('9', '9', '5', null);
INSERT INTO `bacluong` VALUES ('10', '10', '6.5', null);
INSERT INTO `bacluong` VALUES ('11', '11', '6', null);
INSERT INTO `chucvu` VALUES ('1', 'Giảng viên BM. Cầu hầm', null);
INSERT INTO `chucvu` VALUES ('2', 'Giảng viên BM. Cơ khí ô tô', null);
INSERT INTO `chucvu` VALUES ('3', 'Giảng viên BM. Cơ bản', null);
INSERT INTO `chucvu` VALUES ('4', 'Giảng viên BM. Vận tải - Kinh tế', null);
INSERT INTO `chucvu` VALUES ('5', 'Giảng viên BM. Điện - Điện tử', null);
INSERT INTO `chucvu` VALUES ('6', 'Giảng viên BM. Công trình', null);
INSERT INTO `chucvu` VALUES ('7', 'Giảng viên chính BM. Đường bộ', null);
INSERT INTO `chucvu` VALUES ('8', 'Giảng viên BM. Toán Giải tích', null);
INSERT INTO `chucvu` VALUES ('9', 'Giảng viên tập sự BM. GDTC', null);
INSERT INTO `chucvu` VALUES ('10', 'Chuyên viên Ban CTCT và SV', null);
INSERT INTO `chucvu` VALUES ('11', 'Nhân viên Ban CTCT và SV', null);
INSERT INTO `chucvu` VALUES ('12', 'Chuyên viên Ban Khoa học CN và ĐN', null);
INSERT INTO `chucvu` VALUES ('13', 'Chuyên viên Ban TTTV', null);
INSERT INTO `chucvu` VALUES ('14', 'Nhân viên ban TCHC', null);
INSERT INTO `danhsachkhoangon` VALUES ('1', '10', 'Nguyen Van A', '0989777777', '122189876', 'Ho Chi Minh', '2017-05-07', null);
INSERT INTO `dantoc` VALUES ('1', 'Mường', null);
INSERT INTO `dantoc` VALUES ('2', 'Nùng', null);
INSERT INTO `dantoc` VALUES ('3', 'Kinh', null);
INSERT INTO `dantoc` VALUES ('4', 'Ê đê', null);
INSERT INTO `dantoc` VALUES ('5', 'Tày', null);
INSERT INTO `donvichucnang` VALUES ('10', 'BGD', 'Ban Giám Đốc', null);
INSERT INTO `donvichucnang` VALUES ('11', '01', 'Ban công tác chính trị và sinh viên', null);
INSERT INTO `donvichucnang` VALUES ('12', '02', 'Ban đào tạo', null);
INSERT INTO `donvichucnang` VALUES ('13', '03', 'Ban khảo thí và kiểm định chất lượng', null);
INSERT INTO `donvichucnang` VALUES ('14', '04', 'Ban khoa học công nghệ và đối ngoại', null);
INSERT INTO `donvichucnang` VALUES ('15', '05', 'Ban quản lý Ký túc xá', null);
INSERT INTO `donvichucnang` VALUES ('16', '06', 'Ban tài chính - kế toán', null);
INSERT INTO `donvichucnang` VALUES ('17', '07', 'Ban thiết bị quản trị', null);
INSERT INTO `donvichucnang` VALUES ('18', '08', 'Ban Tổ chức - Hành chính', null);
INSERT INTO `donvichucnang` VALUES ('19', '09', 'Ban Thanh tra', null);
INSERT INTO `donvichucnang` VALUES ('20', '10', 'Ban thông tin thư viện', null);
INSERT INTO `hibernate_sequence` VALUES ('25');
INSERT INTO `hopdongnganhan` VALUES ('7', 'Tuyển dụng lao động', 'Nguyễn Văn A', '2017-04-10', '2017-04-10', '2017-04-20', null);
INSERT INTO `hopdongnganhan` VALUES ('14', 'Tuyển dụng bảo vệ', 'Nguyễn Văn Tí', '2017-04-09', '2017-04-13', '2017-04-20', null);
INSERT INTO `hopdongnganhan` VALUES ('17', 'Tuyển dụng nhân sự', 'Không Như Ngọc', '2017-04-14', '2017-04-15', '2017-04-29', null);
INSERT INTO `hopdongnganhan` VALUES ('18', 'Sửa Cửa Kính C2', 'Trần Thị Bình B', '2017-04-26', '2017-04-26', '2017-04-30', null);
INSERT INTO `loaihopdong` VALUES ('1', 'Hợp đồng làm việc không xác định thời hạn', null);
INSERT INTO `loaihopdong` VALUES ('2', 'Hợp đồng lao động 12 tháng', null);
INSERT INTO `loaihopdong` VALUES ('3', 'Hợp đồng thử việc', null);
INSERT INTO `loaihopdong` VALUES ('4', 'Hợp đồng lao động 3 tháng', null);
INSERT INTO `loaihopdong` VALUES ('5', 'Hợp đồng lao động 5 tháng', null);
INSERT INTO `loaihopdong` VALUES ('6', 'Hợp đồng lao động 24tháng', null);
INSERT INTO `loaihopdong` VALUES ('7', 'Hợp đồng lao động 36 tháng', null);
INSERT INTO `loaiquyetdinh` VALUES ('1', 'Bổ nhiệm chức vu', null);
INSERT INTO `loaiquyetdinh` VALUES ('2', 'Điều chuyển', null);
INSERT INTO `loaiquyetdinh` VALUES ('3', 'Bổ nhiệm viên chức / Công chức', null);
INSERT INTO `loaiquyetdinh` VALUES ('4', 'Cử đi học thạc sĩ trong nước', null);
INSERT INTO `loaiquyetdinh` VALUES ('5', 'Cử đi học NCS nước ngoài', null);
INSERT INTO `loaiquyetdinh` VALUES ('6', 'Cử đi bồi dưỡng nghiệp vụ', null);
INSERT INTO `loaiquyetdinh` VALUES ('7', 'Cử đi công tác', null);
INSERT INTO `loaiquyetdinh` VALUES ('8', 'Công nhận kết quả thi tuyển', null);
INSERT INTO `loaiquyetdinh` VALUES ('9', 'Cửu đi học NCS nước ngoài(Gia hạn)', null);
INSERT INTO `loaiquyetdinh` VALUES ('10', 'Cử đi học thạc sĩ nước ngoài', null);
INSERT INTO `loaiquyetdinh` VALUES ('11', 'Nâng bậc lương', null);
INSERT INTO `loaiquyetdinh` VALUES ('12', 'Nâng lương trước thời hạn', null);
INSERT INTO `ngachcongchuc` VALUES ('1', '01002', 'Chuyên viên chính trị', '3');
INSERT INTO `ngachcongchuc` VALUES ('2', '01003', 'Chuyên viên', '2');
INSERT INTO `ngachcongchuc` VALUES ('3', '01004', 'Cán sự', '2');
INSERT INTO `ngachcongchuc` VALUES ('4', '01006', 'Nhân viên đánh máy', '2');
INSERT INTO `ngachcongchuc` VALUES ('5', '01007', 'Nhân viên kỹ thuật', '2');
INSERT INTO `ngachcongchuc` VALUES ('6', '01009', 'Nhân viên tạp vụ', '2');
INSERT INTO `ngachcongchuc` VALUES ('7', '01010', 'Nhân viên lái xe', '2');
INSERT INTO `ngachcongchuc` VALUES ('8', '01011', 'Bảo vệ tuần tra', '3');
INSERT INTO `ngachcongchuc` VALUES ('9', '06031', 'Kế toán viên', '3');
INSERT INTO `tongiao` VALUES ('1', 'Phật giáo', null);
INSERT INTO `tongiao` VALUES ('2', 'Thiên chúa giáo', null);
INSERT INTO `tongiao` VALUES ('3', 'Không', null);
INSERT INTO `tongiao` VALUES ('5', 'Tin lành', null);
INSERT INTO `tongiao` VALUES ('6', 'Cao đài', null);
