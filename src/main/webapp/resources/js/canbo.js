$(document).ready(function() {
		var canBoService = "/canBoService";
		var canBoController = "/canBoController";
		
		var thongKeUrl="/getAll";
	
		var table = $('#canBoTable').DataTable({
			"sAjaxSource" : "/canBoService" + thongKeUrl,
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
				  "mData": "donViChucNang.tenDonVi"
				  },
				  {
					"aTargets": [ 3 ],
					"mData": "chucVu.tenChucVu"
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
			          {
			        	 extend: 'excel',
			        	 exportOptions: {
	                          columns: [0, 1, 2, 3]
	                     },
			          },
			          {
				         extend: 'pdf',
				         exportOptions: {
		                      columns: [0, 1, 2, 3]
		                 },
				      },
				      {
					     extend: 'print',
					     exportOptions: {
			                  columns: [0, 1, 2, 3]
			             },
					  },
			          {
			             text: 'Chọn Theo Đơn Vị',
			             action: function ( e, dt, node, config ) {
		                     $('#DonViForm').modal('show');
			             },
			          },
			          {
		                 text: 'Thêm Cán Bộ',
		                 action: function ( e, dt, node, config ) {
		                	 var txtPk = $(pk);
		                	 var txtVersion = $(version);
		                	 var txtSoHieu = $(soHieu);
		                	 var txtDonViChucNang_pk = $(donViChucNang_pk);
		                	 var txtBoMon_pk = $(boMon_pk);
		                	 var txtImageUrl = $(imageUrl);
		                	 var txtTen = $( ten);
		                	 var txtTenGoiKhac = $(tenGoiKhac);
		                	 var txtNgaySinh = $(ngaySinh);
		                	 var txtGioiTinh = $(gioiTinh);
		                	 var txtNoiSinh = $( noiSinh);
		                	 var txtQueQuan = $(queQuan_pk);
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
		                	 txtVersion.val("");
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
		                	 txtCoQuanTuyenDung.val("Trường đại học giao thông vận tải phân hiệu TP Hồ Chí Minh");
		                	 txtNgayTuyenDung.val("");
		                	 txtChucVu_pk.val("");
		                	 txtCongViecDuocGiao.val("Giảng dạy");
		                	 txtChucDanh.val("Giảng viên");
		                	 txtNgachCongChuc_pk.val("");
		                	 txtBacLuong_pk.val("");
		                	 txtNgayHuong.val("");
		                	 txtPhuCapChucVu.val("");
		                	 txtPhuCapKhac.val("");
		                	 txtTrinhDoGiaoDucPt.val("12/12");
		                	 txtTrinhDoChuyenMon.val("");
		                	 txtHocVi.val("");
		                	 txtHocHam.val("");
		                	 txtNgayNhanHocVi.val("");
		                	 txtNgayNhanHocHam.val("");
		                	 txtLyLuanChinhTri.val("Sơ cấp");
		                	 txtQuanLyNhaNuoc.val("");
		                	 txtNgoaiNgu.val("Anh văn");
		                	 txtTinHoc.val("");
		                	 txtNgayVaoDcsvnDuBi.val("");
		                	 txtNgayVaoDcsvnChinhThuc.val("");
		                	 txtThamGiaToChucCtxh.val("Đoàn thanh niên Cộng Sản Hồ Chí Minh");
		                	 txtNgayNhapNgu.val("");
		                	 txtNgayXuatNgu.val("");
		                	 txtQuanHamCaoNhat.val("");
		                	 txtDanhHieuPhongTang.val("");
		                	 txtSoTruongCongTac.val("");
		                	 txtKhenThuong.val("");
		                	 txtKyLuat.val("");
		                	 txtTinhTrangSucKhoe.val("Tốt");
		                	 txtChieuCao.val("");
		                	 txtCanNang.val("");
		                	 txtNhomMau.val("");
		                	 txtSoBaoHiemXh.val("");
		                	 txtLaThuongBinh.val("");
		                	 txtLaConGiaDinhChinhSach.val("");
		                	 txtNhanXet.val("");
		                	 txtNgayVeHuu.val("");
		                	 txtNgayThoiViec.val("");
		                     $('#themCanBoForm').modal('show');
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
		         var txtVersion = $(version);
	           	 var txtSoHieu = $(soHieu);
	           	 var txtDonViChucNang_pk = $(donViChucNang_pk);
	           	 var txtBoMon_pk = $(boMon_pk);
	           	 var txtImageUrl = $(imageUrl);
	           	 var txtTen = $(ten);
	           	 var txtTenGoiKhac = $(tenGoiKhac);
	           	 var txtNgaySinh = $(ngaySinh);
	           	 var txtGioiTinh = $(gioiTinh);
	           	 var txtNoiSinh = $(noiSinh);
	           	 var txtQueQuan = $(queQuan_pk);
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
                    	 txtVersion.val(res.version);
                    	 txtSoHieu.val(res.soHieu);
	                	 txtDonViChucNang_pk.val(res.donViChucNang.pk);
	                	 if(res.boMon!=null){
	                		 var toAppend = '';
	                         $.each(res.donViChucNang.boMon,function(i,o){
	                        	 if(o.pk==res.boMon.pk){
	                        		 toAppend += '<option value='+o.pk+' selected>'+o.tenBoMon+'</option>';
	                        	 } else {	                        		 
	                        		 toAppend += '<option value='+o.pk+'>'+o.tenBoMon+'</option>';
	                        	 }
	                        });
	                         txtBoMon_pk.empty();
	                         txtBoMon_pk.append(toAppend);
	                	 }
	                	 txtImageUrl.val(res.imageUrl);
	                	 txtTen.val(res.ten);
	                	 txtTenGoiKhac.val(res.tenGoiKhac);
	                	 txtNgaySinh.val(res.ngaySinh);
	                	 txtGioiTinh.val(res.gioiTinh);
	                	 txtNoiSinh.val(res.noiSinh);
	                	 txtQueQuan.val(res.queQuan.pk);
	                	 txtDanToc_pk.val(res.danToc.pk);
	                	 txtTonGiao_pk.val(res.tonGiao.pk);
	                	 txtSoCmnd.val(res.soCmnd);
	                	 txtNgayCapCmnd.val(res.ngayCapCmnd);
	                	 txtNoiCapCmnd.val(res.noiCapCmnd);
	                	 txtNoiDKHoKhauThuongTru.val(res.noiDKHoKhauThuongTru);
	                	 txtNoiOHienNay.val(res.noiOHienNay);
	                	 txtNgheNghiepKhiTuyenDung.val(res.ngheNghiepKhiTuyenDung);
	                	 txtCoQuanTuyenDung.val(res.coQuanTuyenDung);
	                	 txtNgayTuyenDung.val(res.ngayTuyenDung);
	                	 txtChucVu_pk.val(res.chucVu.pk);
	                	 txtCongViecDuocGiao.val(res.congViecDuocGiao);
	                	 txtChucDanh.val(res.chucDanh);
	                	 txtNgachCongChuc_pk.val(res.ngachCongChuc.pk);
	                	 if(res.bacLuong!=null){
	                		 var toAppend = '';
	                         $.each(res.ngachCongChuc.bacLuong,function(i,o){
	                        	 if(o.pk==res.bacLuong.pk){
	                        		 toAppend += '<option value='+o.pk+' selected>'+o.maBacLuong+'</option>';
	                        	 } else {	                        		 
	                        		 toAppend += '<option value='+o.pk+'>'+o.maBacLuong+'</option>';
	                        	 }
	                        });
	                         txtBacLuong_pk.empty();
	                         txtBacLuong_pk.append(toAppend);
	                	 }
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
	       	 var txtQueQuan = $(queQuan_pk);
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
	       	 var txtVersion = $(version);
	       	 
	       	 var x = document.forms["formTest"]["soCmnd"].value;
	         if (isNaN(x)) 
	         {
	           alert("Số chứng minh nhân dân chỉ được nhập số");
	           return false;
	         }
	       	 
	       	 var json = new Object();
	         json.pk = txtPk.val();
	       	 json.soHieu = txtSoHieu.val();
	       	 json.donViChucNang = new Object();
	       	 json.donViChucNang.pk = txtDonViChucNang_pk.val();
	       	 json.boMon = new Object();
	       	 json.boMon.pk = txtBoMon_pk.val();
	       	 json.imageUrl = txtImageUrl.val();
	       	 json.ten = txtTen.val();
	       	 json.tenGoiKhac = txtTenGoiKhac.val();
	       	 json.ngaySinh = txtNgaySinh.val();
	       	 json.gioiTinh = txtGioiTinh.val();
	       	 json.noiSinh = txtNoiSinh.val();
	       	 json.queQuan = new Object();
	       	 json.queQuan.pk = txtQueQuan.val();
	       	 json.danToc = new Object();
	       	 json.danToc.pk = txtDanToc_pk.val();
	       	 json.tonGiao = new Object();
	       	 json.tonGiao.pk = txtTonGiao_pk.val();
	       	 json.soCmnd = txtSoCmnd.val();
	       	 json.ngayCapCmnd = txtNgayCapCmnd.val();
	       	 json.noiCapCmnd = txtNoiCapCmnd.val();
	       	 json.noiDKHoKhauThuongTru = txtNoiDKHoKhauThuongTru.val();
	       	 json.noiOHienNay = txtNoiOHienNay.val();
	       	 json.ngheNghiepKhiTuyenDung = txtNgheNghiepKhiTuyenDung.val();
	       	 json.coQuanTuyenDung = txtCoQuanTuyenDung.val();
	       	 json.ngayTuyenDung = txtNgayTuyenDung.val();
	       	 json.chucVu = new Object();
	       	 json.chucVu.pk = txtChucVu_pk.val();
	       	 json.congViecDuocGiao = txtCongViecDuocGiao.val();
	       	 json.chucDanh = txtChucDanh.val();
	       	 json.ngachCongChuc = new Object();
	       	 json.ngachCongChuc.pk = txtNgachCongChuc_pk.val();
	       	 json.bacLuong = new Object();
	       	 json.bacLuong.pk = txtBacLuong_pk.val();
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
	       	 json.version = txtVersion.val();
	       	 if(txtPk.val() != -1){
            	 endpointUrl = '/canBoController/update';
             }
	       	 
	       	 var invalidFields = $("#formTest").find(":invalid");
             if(invalidFields.length == 0){
       		 $.ajax({
                type : "POST",
                contentType: "application/json; charset=utf-8",
                data : JSON.stringify(json),
                url : endpointUrl,
                success : function(msg) {
                	// close modal dialog
        			 $('#themCanBoForm').modal('toggle');
        			// $('#ChiTietCanBoForm').modal('toggle');
                     table.ajax.reload();
                },
                error: function (data, textStatus, xhr) {
        			alert(data.responseText);
        		}
             });
            }else {
            	$("#formTest").submit();
            }
            
		});
		
		$("#themCanBoForm").on('hidden.bs.modal', function () {
            $("#formTest").find('.has-error').removeClass("has-error");
            $("#formTest").find('.has-feedback').removeClass("has-feedback");
        });
		
		$("#ChiTietCanBoForm").on('hidden.bs.modal', function () {
            $("#formTest").find('.has-error').removeClass("has-error");
            $("#formTest").find('.has-feedback').removeClass("has-feedback");
        });
		
		$("button#btnXacNhanThongKe").click(function(e) {
			thongKeUrl = "/" + $(hidTieuChi).val() + "/5";
			alert(thongKeUrl);
			table.sAjaxSource = thongKeUrl;
//			table.ajax.reload();
		});
		
		$("button#btnXacNhanChiTietCanBo").click(function(e) {
			alert($(hidTieuChiChiTietCanBo).val());
		});
		
		
		//TODO
		changeDonViChucNang = function(){
			var donViChucNangPk = $(donViChucNang_pk).val();
			 $.ajax({  
                 url: canBoService+"/getBoMonByDonViChucNang/"+donViChucNangPk,  
                 type: 'GET',  
                 success: function (res) {
                	 var toAppend = '';
                     $.each(res,function(i,o){
                    	 toAppend += '<option value='+o.pk+'>'+o.tenBoMon+'</option>';
                    });
                   $('#boMon_pk').empty();
                   $('#boMon_pk').append(toAppend);
                 }
			 });
		}
		
		changeNgachCongChuc = function(){
			var ngachCongChucPk = $(ngachCongChuc_pk).val();
			 $.ajax({  
                url: canBoService+"/getBacLuongByNgachCongChuc/"+ngachCongChucPk,  
                type: 'GET',  
                success: function (res) {
               	 var toAppend = '';
                    $.each(res,function(i,o){
                   	 toAppend += '<option value='+o.pk+'>'+o.maBacLuong+'</option>';
                   });
                  $('#bacLuong_pk').empty();
                  $('#bacLuong_pk').append(toAppend);
                }
			 });
		}
		
});

/*  datepicker*/
$.fn.datepicker.defaults.format = "yyyy-mm-dd";
$('.datepicker').datepicker({
		 	startDate: '-3d'
});