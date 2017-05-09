$(document).ready(function() {
		var canBoService = "/canBoService";
		var canBoController = "/canBoController";
		var table = $('#canBoTable').DataTable({
			"sAjaxSource" : "/canBoService/getAll",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"aoColumnDefs": [ 
			      {
			      "aTargets": [ 0 ],
			      "mData": "soHieu"
			      },
			      {
				  "aTargets": [ 1 ],
				  "mData": "ten"
				  },
				  {
				  "aTargets": [ 2 ],
				  "mData": "donViChucNang_pk"
				  },
				  {
					"aTargets": [ 3 ],
					"mData": "chucVu_pk"
				   },
				  {
			       "targets": -1,
			       "data": null,
			       "defaultContent": "<button type='button' class='btn btn-info btn-lg' data-toggle='modal' id='btnDel'>Xóa</button>"
			      },
			      {
				   "targets": -2,
				   "data": null,
				   "defaultContent": "<button type='button' class='btn btn-info btn-lg' data-toggle='modal'  id='btnChiTiet'>Chi Tiết</button>"
				  },
			],
			scrollY : "600px",
			scrollCollapse: true,
			dom: 'Blfrtip',
			buttons: [
			          'excel',
			          'pdf',
			          'print',
			          {
			             text: 'Chọn Theo Đơn Vị',
			             action: function ( e, dt, node, config ) {
		                     $('#DonViForm').modal('show');
			             },
			          },
			          {
				             text: 'Quản Lý Cán Bộ',
				             action: function ( e, dt, node, config ) {
			                     $('#QuanLyCanBoForm').modal('show');
				             },
				      },
			          {
		                 text: 'Thêm Cán Bộ',
		                 action: function ( e, dt, node, config ) {
		                	 var txtPk = $(pk);
		                	 var txtSoHieu = $( soHieu);
		                	 var txtDonViChucNang_pk = $( donViChucNang_pk);
		                	 var txtBoMon_pk = $( boMon_pk);
		                	 var txtImageUrl = $( imageUrl);
		                	 var txtTen = $( ten);
		                	 var txtTenGoiKhac = $( tenGoiKhac);
		                	 var txtNgaySinh = $( ngaySinh);
		                	 var txtGioiTinh = $( gioiTinh);
		                	 var txtNoiSinh = $( noiSinh);
		                	 var txtQueQuan = $( queQuan);
		                	 var txtDanToc_pk = $( danToc_pk);
		                	 var txtTonGiao_pk = $( tonGiao_pk);
		                	 var txtSoCmnd = $( soCmnd);
		                	 var txtNgayCapCmnd = $( ngayCapCmnd);
		                	 var txtNoiCapCmnd = $( noiCapCmnd);
		                	 var txtNoiDKHoKhauThuongTru = $( noiDKHoKhauThuongTru);
		                	 var txtNoiOHienNay = $( noiOHienNay);
		                	 var txtNgheNghiepKhiTuyenDung = $( ngheNghiepKhiTuyenDung);
		                	 var txtCoQuanTuyenDung = $( coQuanTuyenDung);
		                	 var txtNgayTuyenDung = $(ngayTuyenDung);
		                	 var txtChucVu_pk = $(chucVu_pk);
		                	 var txtCongViecDuocGiao = $( congViecDuocGiao);
		                	 var txtChucDanh = $(chucDanh);
		                	 var txtNgachCongChuc_pk = $( ngachCongChuc_pk);
		                	 var txtBacLuong_pk = $( bacLuong_pk);
		                	 var txtNgayHuong = $(ngayHuong);
		                	 var txtPhuCapChucVu = $( phuCapChucVu);
		                	 var txtPhuCapKhac = $( phuCapKhac);
		                	 var txtTrinhDoGiaoDucPt = $(trinhDoGiaoDucPt);
		                	 var txtTrinhDoChuyenMon = $(trinhDoChuyenMon);
		                	 var txtHocVi = $( hocVi);
		                	 var txtHocHam = $(hocHam);
		                	 var txtNgayNhanHocVi = $(ngayNhanHocVi);
		                	 var txtNgayNhanHocHam = $(ngayNhanHocHam);
		                	 var txtLyLuanChinhTri = $(lyLuanChinhTri);
		                	 var txtQuanLyNhaNuoc = $( quanLyNhaNuoc);
		                	 var txtNgoaiNgu = $( ngoaiNgu);
		                	 var txtTinHoc = $( tinHoc);
		                	 var txtNgayVaoDcsvnDuBi = $(ngayVaoDcsvnDuBi);
		                	 var txtNgayVaoDcsvnChinhThuc = $(ngayVaoDcsvnChinhThuc);
		                	 var txtThamGiaToChucCtxh = $(thamGiaToChucCtxh);
		                	 var txtNgayNhapNgu = $(ngayNhapNgu);
		                	 var txtNgayXuatNgu = $(ngayXuatNgu);
		                	 var txtQuanHamCaoNhat = $(quanHamCaoNhat);
		                	 var txtDanhHieuPhongTang = $( danhHieuPhongTang);
		                	 var txtSoTruongCongTac = $(soTruongCongTac);
		                	 var txtKhenThuong = $(khenThuong);
		                	 var txtKyLuat = $(kyLuat);
		                	 var txtTinhTrangSucKhoe = $(tinhTrangSucKhoe);
		                	 var txtChieuCao = $(chieuCao);
		                	 var txtCanNang = $( canNang);
		                	 var txtNhomMau = $(nhomMau);
		                	 var txtSoBaoHiemXh = $(soBaoHiemXh);
		                	 var txtLaThuongBinh = $( laThuongBinh);
		                	 var txtLaConGiaDinhChinhSach = $( laConGiaDinhChinhSach);
		                	 var txtNhanXet = $( nhanXet);
		                	 var txtNgayVeHuu = $( ngayVeHuu);
		                	 var txtNgayThoiViec = $( ngayThoiViec);
		                	 
		                	 txtPk.val(-1);
		                	 txtSoHieu.val("");
		                	 txtDonViChucNang_pk.val("");
		                	 txtBoMon_pk.val("");
		                	 txtImageUrl.val("");
		                	 txtTen.val("");
		                	 txtTenGoiKhac.val("");
		                	 txtNgaySinh.val("");
		                	 txtGioiTinh.val("");
		                	 txtNoiSinh.val("");
		                	 txtQueQuan.val("");
		                	 txtDanToc_pk.val("");
		                	 txtTonGiao_pk.val("");
		                	 txtSoCmnd.val("");
		                	 txtNgayCapCmnd.val("");
		                	 txtNoiCapCmnd.val("");
		                	 txtNoiDKHoKhauThuongTru.val("");
		                	 txtNoiOHienNay.val("");
		                	 txtNgheNghiepKhiTuyenDung.val("");
		                	 txtCoQuanTuyenDung.val("");
		                	 txtNgayTuyenDung.val("");
		                	 txtChucVu_pk.val("");
		                	 txtCongViecDuocGiao.val("");
		                	 txtChucDanh.val("");
		                	 txtNgachCongChuc_pk.val("");
		                	 txtBacLuong_pk.val("");
		                	 txtNgayHuong.val("");
		                	 txtPhuCapChucVu.val("");
		                	 txtPhuCapKhac.val("");
		                	 txtTrinhDoGiaoDucPt.val("");
		                	 txtTrinhDoChuyenMon.val("");
		                	 txtHocVi.val("");
		                	 txtHocHam.val("");
		                	 txtNgayNhanHocVi.val("");
		                	 txtNgayNhanHocHam.val("");
		                	 txtLyLuanChinhTri.val("");
		                	 txtQuanLyNhaNuoc.val("");
		                	 txtNgoaiNgu.val("");
		                	 txtTinHoc.val("");
		                	 txtNgayVaoDcsvnDuBi.val("");
		                	 txtNgayVaoDcsvnChinhThuc.val("");
		                	 txtThamGiaToChucCtxh.val("");
		                	 txtNgayNhapNgu.val("");
		                	 txtNgayXuatNgu.val("");
		                	 txtQuanHamCaoNhat.val("");
		                	 txtDanhHieuPhongTang.val("");
		                	 txtSoTruongCongTac.val("");
		                	 txtKhenThuong.val("");
		                	 txtKyLuat.val("");
		                	 txtTinhTrangSucKhoe.val("");
		                	 txtChieuCao.val("");
		                	 txtCanNang.val("");
		                	 txtNhomMau.val("");
		                	 txtSoBaoHiemXh.val("");
		                	 txtLaThuongBinh.val("");
		                	 txtLaConGiaDinhChinhSach.val("");
		                	 txtNhanXet.val("");
		                	 txtNgayVeHuu.val("");
		                	 txtNgayThoiViec.val("");
		                     $('#CAPNHAPCANBO').modal('show');
		                 },
		              },
		              {
			                 text: 'Thống Kê',
			                 action: function ( e, dt, node, config ) {
			                     $('#thongKeForm').modal('show');
			                 },
			          }
			          ],
		    colReorder: true,
		    select: true,
		    "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
            }
		});
	
		$('#canBoTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnChiTiet" == id){
		         var data = table.row($(this).parents('tr')).data();
		         var pK = data['pk'];
		         var txtPk = $(pk);
	           	 var txtSoHieu = $(soHieu);
	           	 var txtDonViChucNang_pk = $(donViChucNang_pk);
	           	 var txtBoMon_pk = $(boMon_pk);
	           	 var txtImageUrl = $(imageUrl);
	           	 var txtTen = $(ten);
	           	 var txtTenGoiKhac = $(tenGoiKhac);
	           	 var txtNgaySinh = $(ngaySinh);
	           	 var txtGioiTinh = $(gioiTinh);
	           	 var txtNoiSinh = $(noiSinh);
	           	 var txtQueQuan = $(queQuan);
	           	 var txtDanToc_pk = $(danToc_pk);
	           	 var txtTonGiao_pk = $(tonGiao_pk);
	           	 var txtSoCmnd = $(soCmnd);
	           	 var txtNgayCapCmnd = $(ngayCapCmnd);
	           	 var txtNoiCapCmnd = $(noiCapCmnd);
	           	 var txtNoiDKHoKhauThuongTru = $(noiDKHoKhauThuongTru);
	           	 var txtNoiOHienNay = $(noiOHienNay);
	           	 var txtNgheNghiepKhiTuyenDung = $(ngheNghiepKhiTuyenDung);
	           	 var txtCoQuanTuyenDung = $(coQuanTuyenDung);
	           	 var txtNgayTuyenDung = $(ngayTuyenDung);
	           	 var txtChucVu_pk = $(chucVu_pk);
	           	 var txtCongViecDuocGiao = $( congViecDuocGiao);
	           	 var txtChucDanh = $(chucDanh);
	           	 var txtNgachCongChuc_pk = $(ngachCongChuc_pk);
	           	 var txtBacLuong_pk = $( bacLuong_pk);
	           	 var txtNgayHuong = $(ngayHuong);
	           	 var txtPhuCapChucVu = $(phuCapChucVu);
	           	 var txtPhuCapKhac = $(phuCapKhac);
	           	 var txtTrinhDoGiaoDucPt = $(trinhDoGiaoDucPt);
	           	 var txtTrinhDoChuyenMon = $(trinhDoChuyenMon);
	           	 var txtHocVi = $(hocVi);
	           	 var txtHocHam = $(hocHam);
	           	 var txtNgayNhanHocVi = $(ngayNhanHocVi);
	           	 var txtNgayNhanHocHam = $(ngayNhanHocHam);
	           	 var txtLyLuanChinhTri = $(lyLuanChinhTri);
	           	 var txtQuanLyNhaNuoc = $(quanLyNhaNuoc);
	           	 var txtNgoaiNgu = $(ngoaiNgu);
	           	 var txtTinHoc = $(tinHoc);
	           	 var txtNgayVaoDcsvnDuBi = $(ngayVaoDcsvnDuBi);
	           	 var txtNgayVaoDcsvnChinhThuc = $(ngayVaoDcsvnChinhThuc);
	           	 var txtThamGiaToChucCtxh = $(thamGiaToChucCtxh);
	           	 var txtNgayNhapNgu = $(ngayNhapNgu);
	           	 var txtNgayXuatNgu = $(ngayXuatNgu);
	           	 var txtQuanHamCaoNhat = $(quanHamCaoNhat);
	           	 var txtDanhHieuPhongTang = $(danhHieuPhongTang);
	           	 var txtSoTruongCongTac = $(soTruongCongTac);
	           	 var txtKhenThuong = $(khenThuong);
	           	 var txtKyLuat = $(kyLuat);
	           	 var txtTinhTrangSucKhoe = $(tinhTrangSucKhoe);
	           	 var txtChieuCao = $(chieuCao);
	           	 var txtCanNang = $(canNang);
	           	 var txtNhomMau = $(nhomMau);
	           	 var txtSoBaoHiemXh = $(soBaoHiemXh);
	           	 var txtLaThuongBinh = $(laThuongBinh);
	           	 var txtLaConGiaDinhChinhSach = $(laConGiaDinhChinhSach);
	           	 var txtNhanXet = $(nhanXet);
	           	 var txtNgayVeHuu = $(ngayVeHuu);
	           	 var txtNgayThoiViec = $(ngayThoiViec);
	           	 $.ajax({  
                    url: canBoService+"/getById/"+pK,  
                    type: 'GET',  
                    success: function (res) {
                    	 txtPk.val(pK);
                    	 txtSoHieu.val(res.soHieu);
	                	 txtDonViChucNang_pk.val(res.donViChucNang_pk);
	                	 txtBoMon_pk.val(res.boMon_pk);
	                	 txtImageUrl.val(res.imageUrl);
	                	 txtTen.val(res.ten);
	                	 txtTenGoiKhac.val(res.tenGoiKhac);
	                	 txtNgaySinh.val(res.ngaySinh);
	                	 txtGioiTinh.val(res.gioiTinh);
	                	 txtNoiSinh.val(res.noiSinh);
	                	 txtQueQuan.val(res.queQuan);
	                	 txtDanToc_pk.val(res.danToc_pk);
	                	 txtTonGiao_pk.val(res.tonGiao_pk);
	                	 txtSoCmnd.val(res.soCmnd);
	                	 txtNgayCapCmnd.val(res.ngayCapCmnd);
	                	 txtNoiCapCmnd.val(res.noiCapCmnd);
	                	 txtNoiDKHoKhauThuongTru.val(res.noiDKHoKhauThuongTru);
	                	 txtNoiOHienNay.val(res.noiOHienNay);
	                	 txtNgheNghiepKhiTuyenDung.val(res.ngheNghiepKhiTuyenDung);
	                	 txtCoQuanTuyenDung.val(res.coQuanTuyenDung);
	                	 txtNgayTuyenDung.val(res.ngayTuyenDung);
	                	 txtChucVu_pk.val(res.chucVu_pk);
	                	 txtCongViecDuocGiao.val(res.congViecDuocGiao);
	                	 txtChucDanh.val(res.chucDanh);
	                	 txtNgachCongChuc_pk.val(res.ngachCongChuc_pk);
	                	 txtBacLuong_pk.val(res.bacLuong_pk);
	                	 txtNgayHuong.val(res.ngayHuong);
	                	 txtPhuCapChucVu.val(res.phuCapChucVu);
	                	 txtPhuCapKhac.val(res.phuCapKhac);
	                	 txtTrinhDoGiaoDucPt.val(res.trinhDoGiaoDucPt);
	                	 txtTrinhDoChuyenMon.val(res.trinhDoChuyenMon);
	                	 txtHocVi.val(res.hocVi);
	                	 txtHocHam.val(res.hocHam);
	                	 txtNgayNhanHocVi.val(res.ngayNhanHocVi);
	                	 txtNgayNhanHocHam.val(res.ngayNhanHocHam);
	                	 txtLyLuanChinhTri.val(res.lyLuanChinhTri);
	                	 txtQuanLyNhaNuoc.val(res.quanLyNhaNuoc);
	                	 txtNgoaiNgu.val(res.ngoaiNgu);
	                	 txtTinHoc.val(res.tinHoc);
	                	 txtNgayVaoDcsvnDuBi.val(res.ngayVaoDcsvnDuBi);
	                	 txtNgayVaoDcsvnChinhThuc.val(res.ngayVaoDcsvnChinhThuc);
	                	 txtThamGiaToChucCtxh.val(res.thamGiaToChucCtxh);
	                	 txtNgayNhapNgu.val(res.ngayNhapNgu);
	                	 txtNgayXuatNgu.val(res.ngayXuatNgu);
	                	 txtQuanHamCaoNhat.val(res.quanHamCaoNhat);
	                	 txtDanhHieuPhongTang.val(res.danhHieuPhongTang);
	                	 txtSoTruongCongTac.val(res.soTruongCongTac);
	                	 txtKhenThuong.val(res.khenThuong);
	                	 txtKyLuat.val(res.kyLuat);
	                	 txtTinhTrangSucKhoe.val(res.tinhTrangSucKhoe);
	                	 txtChieuCao.val(res.chieuCao);
	                	 txtCanNang.val(res.canNang);
	                	 txtNhomMau.val(res.nhomMau);
	                	 txtSoBaoHiemXh.val(res.soBaoHiemXh);
	                	 txtLaThuongBinh.val(res.laThuongBinh);
	                	 txtLaConGiaDinhChinhSach.val(res.laConGiaDinhChinhSach);
	                	 txtNhanXet.val(res.nhanXet);
	                	 txtNgayVeHuu.val(res.ngayVeHuu);
	                	 txtNgayThoiViec.val(res.ngayThoiViec);
	                	 $('#ChiTietCanBoForm').modal('show');
                    }
                 });
			}
	    });
		
		$('#canBoTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnDel" == id){
		        var data = table.row($(this).parents('tr')).data();
		        check = confirm("Bạn có chắc chắn muốn xóa đối tượng : " + data['ten'])
		        var pK = data['pk'];
		        if(check==true){
	            	$.ajax({  
	                    url: canBoController+"/delete/"+pK,  
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();	                    }  
	                });
	            }
			}
	    });
		$("button#btnCapNhapSoYeuLyLich").click(function(e) {
			 var endpointUrl = '/canBoController/add';
			 var txtPk = $(pk);
	       	 var txtSoHieu = $(soHieu);
	       	 var txtDonViChucNang_pk = $(donViChucNang_pk);
	       	 var txtBoMon_pk = $(boMon_pk);
	       	 var txtImageUrl = $(imageUrl);
	       	 var txtTen = $(ten);
	       	 var txtTenGoiKhac = $(tenGoiKhac);
	       	 var txtNgaySinh = $(ngaySinh);
	       	 var txtGioiTinh = $(gioiTinh);
	       	 var txtNoiSinh = $(noiSinh);
	       	 var txtQueQuan = $(queQuan);
	       	 var txtDanToc_pk = $(danToc_pk);
	       	 var txtTonGiao_pk = $(tonGiao_pk);
	       	 var txtSoCmnd = $(soCmnd);
	       	 var txtNgayCapCmnd = $(ngayCapCmnd);
	       	 var txtNoiCapCmnd = $(noiCapCmnd);
	       	 var txtNoiDKHoKhauThuongTru = $(noiDKHoKhauThuongTru);
	       	 var txtNoiOHienNay = $(noiOHienNay);
	       	 var txtNgheNghiepKhiTuyenDung = $(ngheNghiepKhiTuyenDung);
	       	 var txtCoQuanTuyenDung = $(coQuanTuyenDung);
	       	 var txtNgayTuyenDung = $(ngayTuyenDung);
	       	 var txtChucVu_pk = $(chucVu_pk);
	       	 var txtCongViecDuocGiao = $(congViecDuocGiao);
	       	 var txtChucDanh = $(chucDanh);
	       	 var txtNgachCongChuc_pk = $(ngachCongChuc_pk);
	       	 var txtBacLuong_pk = $(bacLuong_pk);
	       	 var txtNgayHuong = $(ngayHuong);
	       	 var txtPhuCapChucVu = $(phuCapChucVu);
	       	 var txtPhuCapKhac = $(phuCapKhac);
	       	 var txtTrinhDoGiaoDucPt = $(trinhDoGiaoDucPt);
	       	 var txtTrinhDoChuyenMon = $(trinhDoChuyenMon);
	       	 var txtHocVi = $( hocVi);
	       	 var txtHocHam = $(hocHam);
	       	 var txtNgayNhanHocVi = $(ngayNhanHocVi);
	       	 var txtNgayNhanHocHam = $(ngayNhanHocHam);
	       	 var txtLyLuanChinhTri = $(lyLuanChinhTri);
	       	 var txtQuanLyNhaNuoc = $(quanLyNhaNuoc);
	       	 var txtNgoaiNgu = $(ngoaiNgu);
	       	 var txtTinHoc = $(tinHoc);
	       	 var txtNgayVaoDcsvnDuBi = $(ngayVaoDcsvnDuBi);
	       	 var txtNgayVaoDcsvnChinhThuc = $(ngayVaoDcsvnChinhThuc);
	       	 var txtThamGiaToChucCtxh = $(thamGiaToChucCtxh);
	       	 var txtNgayNhapNgu = $(ngayNhapNgu);
	       	 var txtNgayXuatNgu = $(ngayXuatNgu);
	       	 var txtQuanHamCaoNhat = $(quanHamCaoNhat);
	       	 var txtDanhHieuPhongTang = $(danhHieuPhongTang);
	       	 var txtSoTruongCongTac = $(soTruongCongTac);
	       	 var txtKhenThuong = $(khenThuong);
	       	 var txtKyLuat = $(kyLuat);
	       	 var txtTinhTrangSucKhoe = $(tinhTrangSucKhoe);
	       	 var txtChieuCao = $(chieuCao);
	       	 var txtCanNang = $(canNang);
	       	 var txtNhomMau = $(nhomMau);
	       	 var txtSoBaoHiemXh = $(soBaoHiemXh);
	       	 var txtLaThuongBinh = $(laThuongBinh);
	       	 var txtLaConGiaDinhChinhSach = $(laConGiaDinhChinhSach);
	       	 var txtNhanXet = $(nhanXet);
	       	 var txtNgayVeHuu = $(ngayVeHuu);
	       	 var txtNgayThoiViec = $(ngayThoiViec);
	       	 
	       	 var json = new Object();
	         json.pk = txtPk.val();
	       	 json.soHieu = txtSoHieu.val();
	       	 json.donViChucNang_pk = txtDonViChucNang_pk.val();
	       	 json.boMon_pk = txtBoMon_pk.val();
	       	 json.imageUrl = txtImageUrl.val();
	       	 json.ten = txtTen.val();
	       	 json.tenGoiKhac = txtTenGoiKhac.val();
	       	 json.ngaySinh = txtNgaySinh.val();
	       	 json.gioiTinh = txtGioiTinh.val();
	       	 json.noiSinh = txtNoiSinh.val();
	       	 json.queQuan = txtQueQuan.val();
	       	 json.danToc_pk = txtDanToc_pk.val();
	       	 json.tonGiao_pk = txtTonGiao_pk.val();
	       	 json.soCmnd = txtSoCmnd.val();
	       	 json.ngayCapCmnd = txtNgayCapCmnd.val();
	       	 json.noiCapCmnd = txtNoiCapCmnd.val();
	       	 json.noiDKHoKhauThuongTru = txtNoiDKHoKhauThuongTru.val();
	       	 json.noiOHienNay = txtNoiOHienNay.val();
	       	 json.ngheNghiepKhiTuyenDung = txtNgheNghiepKhiTuyenDung.val();
	       	 json.coQuanTuyenDung = txtCoQuanTuyenDung.val();
	       	 json.ngayTuyenDung = txtNgayTuyenDung.val();
	       	 json.chucVu_pk = txtChucVu_pk.val();
	       	 json.congViecDuocGiao = txtCongViecDuocGiao.val();
	       	 json.chucDanh = txtChucDanh.val();
	       	 json.ngachCongChuc_pk = txtNgachCongChuc_pk.val();
	       	 json.bacLuong_pk = txtBacLuong_pk.val();
	       	 json.ngayHuong = txtNgayHuong.val();
	       	 json.phuCapChucVu = txtPhuCapChucVu.val();
	       	 json.phuCapChucVu = txtPhuCapKhac.val();
	       	 json.trinhDoGiaoDucPt = txtTrinhDoGiaoDucPt.val();
	       	 json.trinhDoChuyenMon = txtTrinhDoChuyenMon.val();
	       	 json.hocVi = txtHocVi.val();
	       	 json.hocHam = txtHocHam.val();
	       	 json.ngayNhanHocVi = txtNgayNhanHocVi.val();
	       	 json.ngayNhanHocHam = txtNgayNhanHocHam.val();
	       	 json.lyLuanChinhTri = txtLyLuanChinhTri.val();
	       	 json.quanLyNhaNuoc = txtQuanLyNhaNuoc.val();
	       	 json.ngoaiNgu = txtNgoaiNgu.val();
	       	 json.tinHoc = txtTinHoc.val();
	       	 json.ngayVaoDcsvnDuBi = txtNgayVaoDcsvnDuBi.val();
	       	 json.ngayVaoDcsvnChinhThuc = txtNgayVaoDcsvnChinhThuc.val();
	       	 json.thamGiaToChucCtxh = txtThamGiaToChucCtxh.val();
	       	 json.ngayNhapNgu = txtNgayNhapNgu.val();
	       	 json.ngayXuatNgu = txtNgayXuatNgu.val();
	       	 json.quanHamCaoNhat = txtQuanHamCaoNhat.val();
	       	 json.danhHieuPhongTang = txtDanhHieuPhongTang.val();
	       	 json.soTruongCongTac = txtSoTruongCongTac.val();
	       	 json.khenThuong = txtKhenThuong.val();
	       	 json.kyLuat = txtKyLuat.val();
	       	 json.tinhTrangSucKhoe = txtTinhTrangSucKhoe.val();
	       	 json.chieuCao = txtChieuCao.val();
	       	 json.canNang = txtCanNang.val();
	       	 json.nhomMau = txtNhomMau.val();
	       	 json.soBaoHiemXh = txtSoBaoHiemXh.val();
	       	 json.laThuongBinh = txtLaThuongBinh.val();
	       	 json.laConGiaDinhChinhSach = txtLaConGiaDinhChinhSach.val();
	       	 json.nhanXet = txtNhanXet.val();
	       	 json.ngayVeHuu = txtNgayVeHuu.val();
	       	 json.ngayThoiViec = txtNgayThoiViec.val();
	       	 if(txtPk.val() != -1){
            	var endpointUrl = '/canBoController/update';
             }
             $.ajax({
                type : "POST",
                contentType: "application/json; charset=utf-8",
                data : JSON.stringify(json),
                url : endpointUrl,
                success : function(msg) {
                     table.ajax.reload();
                },
                error : function() {
                      alert("Cập nhập không thành công");
                }
             });
		});
		
		$("button#btnXacNhan").click(function(e) {
			alert($(hidTieuChi).val());
		});
		
		$("button#btnXacNhanChiTietCanBo").click(function(e) {
			alert($(hidTieuChiChiTietCanBo).val());
		});
		
		$("button#btnXacNhanQuanLyCanBo").click(function(e) {
			alert($(hidTieuChiQLCB).val());
		});
});

/*  datepicker*/
$.fn.datepicker.defaults.format = "yyyy-mm-dd";
$('.datepicker').datepicker({
		 	startDate: '-3d'
});