/*
MySQL Data Transfer
Source Host: localhost
Source Database: quanlynhansu
Target Host: localhost
Target Database: quanlynhansu
Date: 5/16/2017 1:38:47 AM
*/

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
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for canbo
-- ----------------------------
DROP TABLE IF EXISTS `canbo`;
CREATE TABLE `canbo` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `soHieu` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `donViChucNang_pk` int(11) NOT NULL,
  `boMon_pk` int(11) DEFAULT NULL,
  `imageUrl` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ten` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `tenGoiKhac` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ngaySinh` date DEFAULT NULL,
  `gioiTinh` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `noiSinh` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `queQuan_pk` int(11) DEFAULT NULL,
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
  `phuCapChucVu` binary(255) DEFAULT NULL,
  `phuCapKhac` binary(255) DEFAULT NULL,
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
  `chieuCao` binary(11) DEFAULT NULL,
  `canNang` binary(11) DEFAULT NULL,
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
  KEY `queQuan_pk` (`queQuan_pk`),
  CONSTRAINT `queQuan_pk` FOREIGN KEY (`queQuan_pk`) REFERENCES `quequan` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `bacLuong_pk` FOREIGN KEY (`bacLuong_pk`) REFERENCES `bacluong` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `boMon_pk` FOREIGN KEY (`boMon_pk`) REFERENCES `bomon` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `chucVu_pk` FOREIGN KEY (`chucVu_pk`) REFERENCES `chucvu` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `danToc_pk` FOREIGN KEY (`danToc_pk`) REFERENCES `dantoc` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `donViChucNang_pk` FOREIGN KEY (`donViChucNang_pk`) REFERENCES `donvichucnang` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `ngachCongChuc_pk` FOREIGN KEY (`ngachCongChuc_pk`) REFERENCES `ngachcongchuc` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `tonGiao_pk` FOREIGN KEY (`tonGiao_pk`) REFERENCES `tongiao` (`pk`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

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
) ENGINE=InnoDB AUTO_INCREMENT=40 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

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
  `phuCapChucVu` binary(255) DEFAULT NULL,
  `vuotKhung` binary(255) DEFAULT NULL,
  `tongHeSoLuong` binary(255) DEFAULT NULL,
  `phuCapGiangVien` binary(255) DEFAULT NULL,
  `soThangBiGiamTru` int(11) DEFAULT NULL,
  `thoiDiemTangPhuCapTn` date DEFAULT NULL,
  `ghiChuThoiDiemTang` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tuNgay` date DEFAULT NULL,
  `denNgay` date DEFAULT NULL,
  `ghiChuKhongPhuCapTn` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`),
  KEY `bacLuongDstn_pk` (`bacLuongDstn_pk`),
  KEY `donViChucNangDstn_pk` (`donViChucNangDstn_pk`),
  KEY `canBoDstn_pk` (`canBoDstn_pk`),
  CONSTRAINT `bacLuongDstn_pk` FOREIGN KEY (`bacLuongDstn_pk`) REFERENCES `bacluong` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `canBoDstn_pk` FOREIGN KEY (`canBoDstn_pk`) REFERENCES `canbo` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `donViChucNangDstn_pk` FOREIGN KEY (`donViChucNangDstn_pk`) REFERENCES `donvichucnang` (`pk`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

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
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for donvichucnang_bomon
-- ----------------------------
DROP TABLE IF EXISTS `donvichucnang_bomon`;
CREATE TABLE `donvichucnang_bomon` (
  `donViChucNang_pk` int(11) NOT NULL,
  `boMon_pk` int(11) NOT NULL,
  PRIMARY KEY (`donViChucNang_pk`,`boMon_pk`),
  UNIQUE KEY `UK_38ga44by1w5vgpyqmci4t96mj` (`boMon_pk`),
  CONSTRAINT `FK_donvichucnang_bomon_bomon` FOREIGN KEY (`boMon_pk`) REFERENCES `bomon` (`pk`),
  CONSTRAINT `FK_donvichucnang_bomon_donvichucnang` FOREIGN KEY (`donViChucNang_pk`) REFERENCES `donvichucnang` (`pk`)
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
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `donViChucNangHdcb_pk` int(11) DEFAULT NULL,
  `canBoHdcn_pk` int(11) DEFAULT NULL,
  `maHopDong` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `tenHopDong` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `chucVu` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
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
  KEY `chucVuHdcb_pk` (`chucVu`),
  KEY `loaiHopDongHdcb_pk` (`loaiHopDongHdcb_pk`),
  CONSTRAINT `canBoHdcn_pk` FOREIGN KEY (`canBoHdcn_pk`) REFERENCES `canbo` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `donViChucNangHdcb_pk` FOREIGN KEY (`donViChucNangHdcb_pk`) REFERENCES `donvichucnang` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `loaiHopDongHdcb_pk` FOREIGN KEY (`loaiHopDongHdcb_pk`) REFERENCES `loaihopdong` (`pk`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

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
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

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
-- Table structure for quatrinhluong
-- ----------------------------
DROP TABLE IF EXISTS `quatrinhluong`;
CREATE TABLE `quatrinhluong` (
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
-- Table structure for quequan
-- ----------------------------
DROP TABLE IF EXISTS `quequan`;
CREATE TABLE `quequan` (
  `pk` int(11) NOT NULL AUTO_INCREMENT,
  `tenQueQuan` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`pk`)
) ENGINE=InnoDB AUTO_INCREMENT=65 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

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
  `noiDungQuyetDinh` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

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
  `tuNgay` date DEFAULT NULL,
  `denNgay` date DEFAULT NULL,
  `fileKy` char(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`pk`),
  KEY `donViChucNangQdkl_pk` (`donViChucNangQdkl_pk`),
  KEY `canBoQdkl_pk` (`canBoQdkl_pk`),
  CONSTRAINT `canBoQdkl_pk` FOREIGN KEY (`canBoQdkl_pk`) REFERENCES `canbo` (`pk`) ON UPDATE CASCADE,
  CONSTRAINT `donViChucNangQdkl_pk` FOREIGN KEY (`donViChucNangQdkl_pk`) REFERENCES `donvichucnang` (`pk`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

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
INSERT INTO `bomon` VALUES ('1', 'Vật lý', null);
INSERT INTO `bomon` VALUES ('2', 'Toán Giải tích', null);
INSERT INTO `bomon` VALUES ('3', 'Đường lối CM của Đảng CSVN', null);
INSERT INTO `bomon` VALUES ('4', 'Những NLCB của CN MácLênin', null);
INSERT INTO `bomon` VALUES ('5', 'Cơ lý thuyết', null);
INSERT INTO `bomon` VALUES ('6', 'Tư tưởng Hồ Chí Minh', null);
INSERT INTO `bomon` VALUES ('7', 'Anh văn', null);
INSERT INTO `bomon` VALUES ('8', 'Hình họa - VKT', null);
INSERT INTO `bomon` VALUES ('9', 'Toán đại số', null);
INSERT INTO `bomon` VALUES ('10', 'Thiết kế máy', null);
INSERT INTO `bomon` VALUES ('11', 'Máy xây dựng', null);
INSERT INTO `bomon` VALUES ('12', 'Cơ khí ô tô', null);
INSERT INTO `bomon` VALUES ('13', 'Công nghệ GTVT', null);
INSERT INTO `bomon` VALUES ('14', 'Điều khiển học', null);
INSERT INTO `bomon` VALUES ('15', 'Mạng máy tính', null);
INSERT INTO `bomon` VALUES ('16', 'Công nghệ phần mềm', null);
INSERT INTO `bomon` VALUES ('17', 'Kỹ thuật điện tử', null);
INSERT INTO `bomon` VALUES ('18', 'Kỹ thuật viễn thông', null);
INSERT INTO `canbo` VALUES ('1', 'CB012', '41', '2', null, 'Nguyen Van A', null, null, null, null, '1', '4', '1', null, null, null, null, null, null, null, null, '3', null, null, '1', null, null, '2.3', '2.5', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '1.71', '56.5', null, null, null, null, null, null, null, null);
INSERT INTO `canbo` VALUES ('2', 'CB011', '41', '1', '', 'Hoang Thi C', '', null, null, '', '5', '3', '2', '', null, '', '', '', '', '', null, '4', '', '', '2', null, null, '0.0', '0.0', '', '', '', '', null, null, '', '', '', '', null, null, '', null, null, '', '', null, '', '', '', '1.68', '60.0', '', '', '', '', '', null, null, null);
INSERT INTO `canbo` VALUES ('28', 'CB345', '41', '4', '', 'Vũ Văn Điệp', '', null, null, '', '4', '3', '3', '', null, '', '', '', '', '', null, '2', '', '', '3', null, null, '0.0', '0.0', '', '', '', '', null, null, '', '', '', '', null, null, '', null, null, '', '', null, '', '', '', '1.71', '65.0', '', '', '', '', '', null, null, null);
INSERT INTO `canbo` VALUES ('35', 'cb2', '41', '3', '', 'test', '', null, null, '', '7', '1', '6', '', null, '', '', '', '', '', null, '5', '', '', '4', null, null, '0.0', '0.0', '', '', '', '', null, null, '', '', '', '', null, null, '', null, null, '', '', null, '', '', '', '0.0', '0.0', '', '', '', '', '', null, null, null);
INSERT INTO `canbo` VALUES ('36', 'cb5', '41', '2', '', 'nguyen van b', 'abbc', '2017-05-23', null, 'ho chi minh', '5', '2', '2', '', null, '', '', '', '', '', null, '2', '', '', '5', null, null, '0.0', '0.0', '', '', 'dai hoc', '', '2017-05-10', null, '', '', 'anh van b', '', '2017-05-11', '2017-05-17', 'doan thanh nien hcm', '2017-05-08', '2017-05-05', '', '', null, '', '', '', '1.71', '46.0', '', '11221424', '', '', '', null, null, null);
INSERT INTO `canbo` VALUES ('38', 'cbgh4', '41', '4', '', 'nong van teo', 'no name', '2017-05-31', null, 'hà tĩnh', '34', '2', '2', '122134223', '2017-05-24', 'CA Hồ Chí Minh', '', 'bình thạnh', 'kỹ sư', 'Trường đại học giao thông vận tải phân hiệu TP Hồ Chí Minh', null, '2', 'Giảng dạy', 'Giảng viên', '6', null, null, '0.0', '0.0', '12/12', 'kỹ sư', 'thạc sĩ', 'thượng sĩ', '2017-05-29', '2017-05-22', 'Sơ cấp', 'kế toán vă thư', 'Anh văn', 'Tin học A', '2017-05-18', '2017-05-25', 'Đoàn thanh niên Cộng Sản Hồ Chí Minh', '2017-05-25', '2017-05-26', 'Thượng sĩ', 'Tiến sĩ', '2', 'Bằng khen thành phố', 'không', 'Tốt', '1.72', '67.0', 'B', '12342345', 'Hạng 5/5', 'Hộ nghèo', 'Lý luận đạo đức tốt', '2017-06-02', '2017-05-18', null);
INSERT INTO `canbo` VALUES ('51', 'BA982', '42', '10', '', 'Nguyễn Văn Hùng', '', null, '0', '', '45', '2', '2', '', null, '', '', '', '', 'Trường đại học giao thông vận tải phân hiệu TP Hồ Chí Minh', null, '7', 'Giảng dạy', 'Giảng viên', '7', null, null, '0.0', '0.0', '12/12', '', '', '', null, null, 'Sơ cấp', '', 'Anh văn', '', null, null, 'Đoàn thanh niên Cộng Sản Hồ Chí Minh', null, null, '', '', null, '', '', 'Tốt', '0.0', '0.0', null, '', '', '', '', null, null, null);
INSERT INTO `canbo` VALUES ('52', 'AH063', '42', '13', '', 'Lê Kiều Trinh', '', null, '1', '', '32', '3', '2', '13223232', '2017-05-11', '', '', '', '', 'Trường đại học giao thông vận tải phân hiệu TP Hồ Chí Minh', null, '2', 'Giảng dạy', 'Giảng viên', '4', null, null, '0.0', '0.0', '12/12', '', '', '', null, null, 'Sơ cấp', '', 'Anh văn', '', null, null, 'Đoàn thanh niên Cộng Sản Hồ Chí Minh', null, null, '', '', null, '', '', 'Tốt', '0.0', '0.0', 'AB', '', '', '', '', null, null, null);
INSERT INTO `canbo` VALUES ('53', 'CB932', '44', '16', '', 'Trần Hạnh Nhi', 'Nhi', '2017-05-23', '0', 'Lục Nam-Hà Tĩnh', '2', '4', '6', '122179867', '2015-05-12', 'C.A Hà Tĩnh', 'Phước Sơn', 'Hồ Chí Minh', 'Giảng viên Trường ĐH Tài Chính MakerTinh', 'Trường đại học giao thông vận tải phân hiệu TP Hồ Chí Minh', '2017-05-15', '8', 'Giảng dạy', 'Giảng viên', '8', null, '2017-05-15', '0.0', '0.0', '12/12', 'Đại học', 'abc', 'abcdf', '2017-05-18', '2017-05-17', 'Sơ cấp', 'nha nuoc', 'Anh văn', 'Tin A', '2017-05-23', '2017-06-02', 'Đoàn thanh niên Cộng Sản Hồ Chí Minh', '2017-05-30', '2017-05-17', 'Trung úy', 'Bằng khen thành đoàn', '2', 'Bằng khen thành phố', 'không', 'Tốt', '1.6', '56.0', 'B', 'BH545423432', '', 'Con hộ cận nghèo', 'Quá trình công tác tốt', null, null, null);
INSERT INTO `canbo` VALUES ('54', 'BC4', '44', '17', '', 'Dương Anh Đức', '', null, '0', '', '15', '2', '1', '', '2017-05-31', '', '', '', '', 'Trường đại học giao thông vận tải phân hiệu TP Hồ Chí Minh', null, '6', 'Giảng dạy', 'Giảng viên', '8', null, null, '0.0', '0.0', '12/12', '', '', '', null, null, 'Sơ cấp', '', 'Anh văn', '', null, null, 'Đoàn thanh niên Cộng Sản Hồ Chí Minh', null, null, '', '', null, '', '', 'Tốt', '0.0', '0.0', 'AB', '', '', '', '', null, null, null);
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
INSERT INTO `danhsachkhoangon` VALUES ('25', '11', 'Nguyen Van BC', '0972328674', '12323223', 'ha noi', '2017-05-11', null);
INSERT INTO `danhsachkhoangon` VALUES ('39', '12', 'Hoàng văn chung', '0982736256', '122134521', 'Mồ chí minh', '2017-05-20', null);
INSERT INTO `danhsachkiemnhiem` VALUES ('1', '15', '2', 'Chuyên viên ban đào tạo', '2017-05-11', '2017-05-25', null);
INSERT INTO `danhsachthamnien` VALUES ('1', '12', '2', '2017-05-18', '1', '1.2', '1.3', '4.8', '1.5', '1', '2017-05-12', 'Học nước ngoài', '2017-05-19', '2017-05-26', 'Không', null);
INSERT INTO `dantoc` VALUES ('1', 'Mường', null);
INSERT INTO `dantoc` VALUES ('2', 'Nùng', null);
INSERT INTO `dantoc` VALUES ('3', 'Kinh', null);
INSERT INTO `dantoc` VALUES ('4', 'Ê đê', null);
INSERT INTO `dantoc` VALUES ('5', 'Tày', null);
INSERT INTO `donvichucnang` VALUES ('10', 'BGD', 'Ban Giám Đốc', null);
INSERT INTO `donvichucnang` VALUES ('11', '01', 'Ban công tác chính trị và sinh viên', null);
INSERT INTO `donvichucnang` VALUES ('12', '02', 'Ban đào tạo', null);
INSERT INTO `donvichucnang` VALUES ('13', '03', 'Ban khảo thí và ĐBCL', null);
INSERT INTO `donvichucnang` VALUES ('14', '04', 'Ban Khoa học Công nghệ và Đối ngoại', null);
INSERT INTO `donvichucnang` VALUES ('15', '05', 'Ban Quản lý Ký túc xá', null);
INSERT INTO `donvichucnang` VALUES ('16', '06', 'Ban tài chính - Kế toán', null);
INSERT INTO `donvichucnang` VALUES ('17', '07', 'Ban Thiết bị quản trị', null);
INSERT INTO `donvichucnang` VALUES ('18', '08', 'Ban Tổ chức - Hành chính', null);
INSERT INTO `donvichucnang` VALUES ('19', '09', 'Ban Thanh tra', null);
INSERT INTO `donvichucnang` VALUES ('20', '10', 'Ban Thông tin thư viện', null);
INSERT INTO `donvichucnang` VALUES ('40', '11', 'Bộ môn Cầu - Hầm', null);
INSERT INTO `donvichucnang` VALUES ('41', '12', 'Bộ môn Cơ bản', null);
INSERT INTO `donvichucnang` VALUES ('42', '13', 'Bộ môn Cơ khí', null);
INSERT INTO `donvichucnang` VALUES ('43', '14', 'Bộ môn Công trình', null);
INSERT INTO `donvichucnang` VALUES ('44', '15', 'Bộ môn Điện - Điện tử', null);
INSERT INTO `donvichucnang` VALUES ('45', '16', 'Bộ môn Đường bộ', null);
INSERT INTO `donvichucnang` VALUES ('46', '17', 'BM. Giáo dục thể chất', null);
INSERT INTO `donvichucnang` VALUES ('47', '18', 'BM. Vận tải - Kinh tế', null);
INSERT INTO `donvichucnang` VALUES ('48', '19', 'Trung tâm ĐTTH và CGCN GTVT', null);
INSERT INTO `donvichucnang` VALUES ('49', '20', 'Bộ môn Ngoại ngữ', null);
INSERT INTO `donvichucnang` VALUES ('50', '21', 'Bộ môn Kết cấu', null);
INSERT INTO `donvichucnang_bomon` VALUES ('41', '1');
INSERT INTO `donvichucnang_bomon` VALUES ('41', '2');
INSERT INTO `donvichucnang_bomon` VALUES ('41', '3');
INSERT INTO `donvichucnang_bomon` VALUES ('41', '4');
INSERT INTO `donvichucnang_bomon` VALUES ('41', '5');
INSERT INTO `donvichucnang_bomon` VALUES ('41', '6');
INSERT INTO `donvichucnang_bomon` VALUES ('41', '7');
INSERT INTO `donvichucnang_bomon` VALUES ('41', '8');
INSERT INTO `donvichucnang_bomon` VALUES ('41', '9');
INSERT INTO `donvichucnang_bomon` VALUES ('42', '10');
INSERT INTO `donvichucnang_bomon` VALUES ('42', '11');
INSERT INTO `donvichucnang_bomon` VALUES ('42', '12');
INSERT INTO `donvichucnang_bomon` VALUES ('42', '13');
INSERT INTO `donvichucnang_bomon` VALUES ('44', '14');
INSERT INTO `donvichucnang_bomon` VALUES ('44', '15');
INSERT INTO `donvichucnang_bomon` VALUES ('44', '16');
INSERT INTO `donvichucnang_bomon` VALUES ('44', '17');
INSERT INTO `donvichucnang_bomon` VALUES ('44', '18');
INSERT INTO `hibernate_sequence` VALUES ('55');
INSERT INTO `hopdongcanbo` VALUES ('1', '19', '1', '2002/TCHC 2015', 'Hợp đồng thử việc', 'Cố vấn thanh tra', '4', '2017-05-12', '2017-05-12', '2017-05-26', 'Hợp đồng thử việc 2 tháng', '', null);
INSERT INTO `hopdongcanbo` VALUES ('2', '18', '28', '86/TCCB 2008', 'Hợp đồng lao động', 'Trưởng ban thư viện', '6', '2017-05-26', '2017-05-27', '2017-06-10', 'Hợp đồng 12 tháng', null, null);
INSERT INTO `hopdongnganhan` VALUES ('7', 'Tuyển dụng lao động', 'Nguyễn Văn A', '2017-04-10', '2017-04-10', '2017-04-20', null);
INSERT INTO `hopdongnganhan` VALUES ('14', 'Tuyển dụng bảo vệ', 'Nguyễn Văn Tí', '2017-04-09', '2017-04-13', '2017-04-20', null);
INSERT INTO `hopdongnganhan` VALUES ('17', 'Tuyển dụng nhân sự', 'Không Như Ngọc', '2017-04-14', '2017-04-15', '2017-04-29', null);
INSERT INTO `hopdongnganhan` VALUES ('18', 'Sửa Cửa Kính C2', 'Trần Thị Bình B', '2017-04-26', '2017-04-26', '2017-04-30', null);
INSERT INTO `hopdongnganhan` VALUES ('26', 'abc', 'asaaa', '2017-05-30', '2017-06-02', '2017-06-10', null);
INSERT INTO `hopdongnganhan` VALUES ('37', 'a', 'b', null, null, null, null);
INSERT INTO `kekhaitaisan` VALUES ('1', '15', '28', '2017-05-18', null, null);
INSERT INTO `kekhaitaisan` VALUES ('2', '13', '1', '2017-05-06', '', null);
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
INSERT INTO `quequan` VALUES ('1', 'An Giang');
INSERT INTO `quequan` VALUES ('2', 'Bà Rịa - Vũng Tàu');
INSERT INTO `quequan` VALUES ('3', 'Bạc Liêu');
INSERT INTO `quequan` VALUES ('4', 'Bắc Cạn');
INSERT INTO `quequan` VALUES ('5', 'Bắc Giang');
INSERT INTO `quequan` VALUES ('6', 'Bắc Ninh');
INSERT INTO `quequan` VALUES ('7', 'Bến Tre');
INSERT INTO `quequan` VALUES ('8', 'Bình Dương');
INSERT INTO `quequan` VALUES ('9', 'Bình Định');
INSERT INTO `quequan` VALUES ('10', 'Bình Phước');
INSERT INTO `quequan` VALUES ('11', 'Bình Thuận');
INSERT INTO `quequan` VALUES ('12', 'Cà Mau');
INSERT INTO `quequan` VALUES ('13', 'Cao Bằng');
INSERT INTO `quequan` VALUES ('14', 'Cần Thơ');
INSERT INTO `quequan` VALUES ('15', 'Đà Nẵng');
INSERT INTO `quequan` VALUES ('16', 'Đắk Lắk');
INSERT INTO `quequan` VALUES ('17', 'Đắk Nông');
INSERT INTO `quequan` VALUES ('18', 'Điện Biên');
INSERT INTO `quequan` VALUES ('19', 'Đồng Nai');
INSERT INTO `quequan` VALUES ('20', 'Đồng Tháp');
INSERT INTO `quequan` VALUES ('21', 'Gia Lai');
INSERT INTO `quequan` VALUES ('22', 'Hà Giang');
INSERT INTO `quequan` VALUES ('23', 'Hà Nam');
INSERT INTO `quequan` VALUES ('24', 'Hà Nội');
INSERT INTO `quequan` VALUES ('25', 'Hà Tây');
INSERT INTO `quequan` VALUES ('26', 'Hà Tĩnh');
INSERT INTO `quequan` VALUES ('27', 'Hải Dương');
INSERT INTO `quequan` VALUES ('28', 'Hải Phòng');
INSERT INTO `quequan` VALUES ('29', 'Hòa Bình');
INSERT INTO `quequan` VALUES ('30', 'Hồ Chí Minh');
INSERT INTO `quequan` VALUES ('31', 'Hậu Giang');
INSERT INTO `quequan` VALUES ('32', 'Hưng Yên');
INSERT INTO `quequan` VALUES ('33', 'Khánh Hòa');
INSERT INTO `quequan` VALUES ('34', 'Kiên Giang');
INSERT INTO `quequan` VALUES ('35', 'Kon Tum');
INSERT INTO `quequan` VALUES ('36', 'Lai Châu');
INSERT INTO `quequan` VALUES ('37', 'Lào Cai');
INSERT INTO `quequan` VALUES ('38', 'Lạng Sơn');
INSERT INTO `quequan` VALUES ('39', 'Lâm Đồng');
INSERT INTO `quequan` VALUES ('40', 'Long An');
INSERT INTO `quequan` VALUES ('41', 'Nam Định');
INSERT INTO `quequan` VALUES ('42', 'Nghệ An');
INSERT INTO `quequan` VALUES ('43', 'Ninh Bình');
INSERT INTO `quequan` VALUES ('44', 'Ninh Thuận');
INSERT INTO `quequan` VALUES ('45', 'Phú Thọ');
INSERT INTO `quequan` VALUES ('46', 'Phú Yên');
INSERT INTO `quequan` VALUES ('47', 'Quảng Bình');
INSERT INTO `quequan` VALUES ('48', 'Quảng Nam');
INSERT INTO `quequan` VALUES ('49', 'Quảng Ngãi');
INSERT INTO `quequan` VALUES ('50', 'Quảng Ninh');
INSERT INTO `quequan` VALUES ('51', 'Quảng Trị');
INSERT INTO `quequan` VALUES ('52', 'Sóc Trăng');
INSERT INTO `quequan` VALUES ('53', 'Sơn La');
INSERT INTO `quequan` VALUES ('54', 'Tây Ninh');
INSERT INTO `quequan` VALUES ('55', 'Thái Bình');
INSERT INTO `quequan` VALUES ('56', 'Thái Nguyên');
INSERT INTO `quequan` VALUES ('57', 'Thanh Hóa');
INSERT INTO `quequan` VALUES ('58', 'Thừa Thiên - Huế');
INSERT INTO `quequan` VALUES ('59', 'Tiền Giang');
INSERT INTO `quequan` VALUES ('60', 'Trà Vinh');
INSERT INTO `quequan` VALUES ('61', 'Tuyên Quang');
INSERT INTO `quequan` VALUES ('62', 'Vĩnh Long');
INSERT INTO `quequan` VALUES ('63', 'Vĩnh Phúc');
INSERT INTO `quequan` VALUES ('64', 'Yên Bái');
INSERT INTO `quyetdinh` VALUES ('1', '18', '1', '2222/QĐ-ĐHGTVT 2015', 'Bổ nhiệm vào ngạch chuyên viên', '3', 'Bổ nhiệm vào ngạch chuyên viên', '2017-05-18', '2017-05-19', '2017-05-31', 'PGS. Trần Đắc Sử', '', null);
INSERT INTO `quyetdinhkhenthuong` VALUES ('1', '16', '28', '1926/QĐ-UBND 2015', 'Tặng huy hiệu Thành phố Hồ Chí Minh', 'Tặng huy hiệu thành phố hồ chí minh cho ca nhân, đã có thành tích hoàn thành xuất sắc nhiệm vụ liên tục trong sự nghiệp xây dựng và bảo vệ Thành phố', '2017-05-23', 'Hứa Ngọc Thuận', '', null);
INSERT INTO `quyetdinhkyluat` VALUES ('1', '11', '1', '1792/TCCB 2007', 'Kỷ luật cán bộ', 'Khiển trách ông A sai phạm trong quyết toán tiền', '2017-05-11', 'Nguyễn Văn B', '2017-05-12', '2017-05-31', '', null);
INSERT INTO `quyetdinhkyluat` VALUES ('29', '12', '2', '1792/TCCB 2008', 'Kỷ luật cán bộ 2', 'Khiển trách', '2017-05-18', '', null, null, '', null);
INSERT INTO `tongiao` VALUES ('1', 'Phật giáo', null);
INSERT INTO `tongiao` VALUES ('2', 'Thiên chúa giáo', null);
INSERT INTO `tongiao` VALUES ('3', 'Không', null);
INSERT INTO `tongiao` VALUES ('5', 'Tin lành', null);
INSERT INTO `tongiao` VALUES ('6', 'Cao đài', null);
