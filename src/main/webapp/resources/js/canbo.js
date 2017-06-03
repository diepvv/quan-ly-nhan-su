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
			buttons: [{
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
		                	 var txtPkAdd = $(pkAdd);
		                	 var txtVersionAdd = $(versionAdd);
		                	 var txtSoHieuAdd = $(soHieuAdd);
		                	 var txtDonViChucNang_pkAdd = $(donViChucNang_pkAdd);
		                	 var txtBoMon_pkAdd = $(boMon_pkAdd);
		                	 var txtImageUrlAdd = $(imageUrlAdd);
		                	 var txtTenAdd = $( tenAdd);
		                	 var txtTenGoiKhacAdd = $(tenGoiKhacAdd);
		                	 var txtNgaySinhAdd = $(ngaySinhAdd);
		                	 var txtGioiTinhAdd = $(gioiTinhAdd);
		                	 var txtNoiSinhAdd = $( noiSinhAdd);
		                	 var txtQueQuanAdd = $(queQuan_pkAdd);
		                	 var txtDanToc_pkAdd = $( danToc_pkAdd);
		                	 var txtTonGiao_pkAdd = $( tonGiao_pkAdd);
		                	 var txtSoCmndAdd = $( soCmndAdd);
		                	 var txtNgayCapCmndAdd = $( ngayCapCmndAdd);
		                	 var txtNoiCapCmndAdd = $( noiCapCmndAdd);
		                	 var txtNoiDKHoKhauThuongTruAdd = $( noiDKHoKhauThuongTruAdd);
		                	 var txtNoiOHienNayAdd = $( noiOHienNayAdd);
		                	 var txtNgheNghiepKhiTuyenDungAdd = $( ngheNghiepKhiTuyenDungAdd);
		                	 var txtCoQuanTuyenDungAdd = $( coQuanTuyenDungAdd);
		                	 var txtNgayTuyenDungAdd = $(ngayTuyenDungAdd);
		                	 var txtChucVu_pkAdd = $(chucVu_pkAdd);
		                	 var txtCongViecDuocGiaoAdd = $( congViecDuocGiaoAdd);
		                	 var txtChucDanhAdd = $(chucDanhAdd);
		                	 var txtNgachCongChuc_pkAdd = $( ngachCongChuc_pkAdd);
		                	 var txtBacLuong_pkAdd = $( bacLuong_pkAdd);
		                	 var txtNgayHuongAdd = $(ngayHuongAdd);
		                	 var txtPhuCapChucVuAdd = $( phuCapChucVuAdd);
		                	 var txtPhuCapKhacAdd = $( phuCapKhacAdd);
		                	 var txtTrinhDoGiaoDucPtAdd = $(trinhDoGiaoDucPtAdd);
		                	 var txtTrinhDoChuyenMonAdd = $(trinhDoChuyenMonAdd);
		                	 var txtHocViAdd = $( hocViAdd);
		                	 var txtHocHamAdd = $(hocHamAdd);
		                	 var txtNgayNhanHocViAdd = $(ngayNhanHocViAdd);
		                	 var txtNgayNhanHocHamAdd = $(ngayNhanHocHamAdd);
		                	 var txtLyLuanChinhTriAdd = $(lyLuanChinhTriAdd);
		                	 var txtQuanLyNhaNuocAdd = $( quanLyNhaNuocAdd);
		                	 var txtNgoaiNguAdd = $( ngoaiNguAdd);
		                	 var txtTinHocAdd = $( tinHocAdd);
		                	 var txtNgayVaoDcsvnDuBiAdd = $(ngayVaoDcsvnDuBiAdd);
		                	 var txtNgayVaoDcsvnChinhThucAdd = $(ngayVaoDcsvnChinhThucAdd);
		                	 var txtThamGiaToChucCtxhAdd = $(thamGiaToChucCtxhAdd);
		                	 var txtNgayNhapNguAdd = $(ngayNhapNguAdd);
		                	 var txtNgayXuatNguAdd = $(ngayXuatNguAdd);
		                	 var txtQuanHamCaoNhatAdd = $(quanHamCaoNhatAdd);
		                	 var txtDanhHieuPhongTangAdd = $( danhHieuPhongTangAdd);
		                	 var txtSoTruongCongTacAdd = $(soTruongCongTacAdd);
		                	 var txtKhenThuongAdd = $(khenThuongAdd);
		                	 var txtKyLuatAdd = $(kyLuatAdd);
		                	 var txtTinhTrangSucKhoeAdd = $(tinhTrangSucKhoeAdd);
		                	 var txtChieuCaoAdd = $(chieuCaoAdd);
		                	 var txtCanNangAdd = $( canNangAdd);
		                	 var txtNhomMauAdd = $(nhomMauAdd);
		                	 var txtSoBaoHiemXhAdd = $(soBaoHiemXhAdd);
		                	 var txtLaThuongBinhAdd = $( laThuongBinhAdd);
		                	 var txtLaConGiaDinhChinhSachAdd = $( laConGiaDinhChinhSachAdd);
		                	 var txtNhanXetAdd = $( nhanXetAdd);
		                	 var txtNgayVeHuuAdd = $( ngayVeHuuAdd);
		                	 var txtNgayThoiViecAdd = $( ngayThoiViecAdd);
		                	 
		                	 txtPkAdd.val(-1);
		                	 txtVersionAdd.val("");
		                	 txtSoHieuAdd.val("");
		                	 txtDonViChucNang_pkAdd.val("");
		                	 txtBoMon_pkAdd.val("");
		                	 txtImageUrlAdd.val("");
		                	 txtTenAdd.val("");
		                	 txtTenGoiKhacAdd.val("");
		                	 txtNgaySinhAdd.val("");
		                	 txtGioiTinhAdd.val("");
		                	 txtNoiSinhAdd.val("");
		                	 txtQueQuanAdd.val("");
		                	 txtDanToc_pkAdd.val("");
		                	 txtTonGiao_pkAdd.val("");
		                	 txtSoCmndAdd.val("");
		                	 txtNgayCapCmndAdd.val("");
		                	 txtNoiCapCmndAdd.val("");
		                	 txtNoiDKHoKhauThuongTruAdd.val("");
		                	 txtNoiOHienNayAdd.val("");
		                	 txtNgheNghiepKhiTuyenDungAdd.val("");
		                	 txtCoQuanTuyenDungAdd.val("Trường đại học giao thông vận tải phân hiệu TP Hồ Chí Minh");
		                	 txtNgayTuyenDungAdd.val("");
		                	 txtChucVu_pkAdd.val("");
		                	 txtCongViecDuocGiaoAdd.val("Giảng dạy");
		                	 txtChucDanhAdd.val("Giảng viên");
		                	 txtNgachCongChuc_pkAdd.val("");
		                	 txtBacLuong_pkAdd.val("");
		                	 txtNgayHuongAdd.val("");
		                	 txtPhuCapChucVuAdd.val("");
		                	 txtPhuCapKhacAdd.val("");
		                	 txtTrinhDoGiaoDucPtAdd.val("12/12");
		                	 txtTrinhDoChuyenMonAdd.val("");
		                	 txtHocViAdd.val("");
		                	 txtHocHamAdd.val("");
		                	 txtNgayNhanHocViAdd.val("");
		                	 txtNgayNhanHocHamAdd.val("");
		                	 txtLyLuanChinhTriAdd.val("Sơ cấp");
		                	 txtQuanLyNhaNuocAdd.val("");
		                	 txtNgoaiNguAdd.val("Anh văn");
		                	 txtTinHocAdd.val("");
		                	 txtNgayVaoDcsvnDuBiAdd.val("");
		                	 txtNgayVaoDcsvnChinhThucAdd.val("");
		                	 txtThamGiaToChucCtxhAdd.val("Đoàn thanh niên Cộng Sản Hồ Chí Minh");
		                	 txtNgayNhapNguAdd.val("");
		                	 txtNgayXuatNguAdd.val("");
		                	 txtQuanHamCaoNhatAdd.val("");
		                	 txtDanhHieuPhongTangAdd.val("");
		                	 txtSoTruongCongTacAdd.val("");
		                	 txtKhenThuongAdd.val("");
		                	 txtKyLuatAdd.val("");
		                	 txtTinhTrangSucKhoeAdd.val("Tốt");
		                	 txtChieuCaoAdd.val("");
		                	 txtCanNangAdd.val("");
		                	 txtNhomMauAdd.val("");
		                	 txtSoBaoHiemXhAdd.val("");
		                	 txtLaThuongBinhAdd.val("");
		                	 txtLaConGiaDinhChinhSachAdd.val("");
		                	 txtNhanXetAdd.val("");
		                	 txtNgayVeHuuAdd.val("");
		                	 txtNgayThoiViecAdd.val("");
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
            },
            initComplete: function () {
                this.api().columns().every( function () {
                    var column = this;
                    var select = $('<select><option value=""></option></select>')
                        .appendTo( $(column.footer()).empty() )
                        .on( 'change', function () {
                            var val = $.fn.dataTable.util.escapeRegex(
                                $(this).val()
                            );
     
                            column
                                .search( val ? '^'+val+'$' : '', true, false )
                                .draw();
                        } );
     
                    column.data().unique().sort().each( function ( d, j ) {
                        select.append( '<option value="'+d+'">'+d+'</option>' )
                    } );
                } );
            }
		});
		
		$("button#btnXacNhanThongKe").click(function(e) {
			thongKeUrl = "";
			if($(hidTieuChi).val() == "canBo"){
				var cbPhanLoaiCanBos = $(cbPhanLoaiCanBo).val();
				thongKeUrl = canBoService + "/getAll";
			}else if($(hidTieuChi).val() == "gioiTinh"){
				var cbGioiTinhs = $(cbGioiTinh).val();
				thongKeUrl = canBoService + "/getByGioiTinh/" + cbGioiTinhs;
			}else if($(hidTieuChi).val() == "danToc"){
				var cbDanTocs = $(cbDanToc).val();
				thongKeUrl = canBoService + "/getByDanToc/" + cbDanTocs;
			}else if($(hidTieuChi).val() == "tonGiao"){
				var cbTonGiaos = $(cbTonGiao).val();
				thongKeUrl = canBoService + "/getByTonGiao/" + cbTonGiaos;
			}else if($(hidTieuChi).val() == "chucVu"){
				var cbChucVus = $(cbChucVu).val();
				thongKeUrl = canBoService + "/getByChucVu/" + cbChucVus;
			}else if($(hidTieuChi).val() == "chucDanh"){
				var chucDanh = $(txtChucDanh).val();
				thongKeUrl = canBoService + "/getByChucDanh/" + chucDanh;
			}else if($(hidTieuChi).val() == "boMonChuyenMon"){
				var cbDonViChucNangs = $(cbDonViChucNang).val();
				var cbBoMons = $(cbBoMon).val();
				thongKeUrl = canBoService + "/getByBoMon/"+cbDonViChucNangs+"?boMon="+cbBoMons;
			}else if($(hidTieuChi).val() == "queQuan"){
				var cbQueQuans = $(cbQueQuan).val();
				thongKeUrl = canBoService + "/getByQueQuan/" + cbQueQuans;
			}else if($(hidTieuChi).val() == "ngachCongChuc"){
				var cbNgachCongChucs = $(cbNgachCongChuc).val();
				thongKeUrl = canBoService + "/getByNgachCongChuc/" + cbNgachCongChucs;
			}
			table.ajax.url(thongKeUrl);
			table.ajax.reload();
		});
		
		$("button#btnXacNhanDonViCongTac").click(function(e) {
			var txtDonViChucNangs = $(txtThongKeDonViChucNang).val();
			thongKeUrl = canBoService + "/getByDonViChucNang/" + txtDonViChucNangs;
			table.ajax.url(thongKeUrl);
			table.ajax.reload();
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
		        var version = data['version'];
		        if(check==true){
	            	$.ajax({  
	                    url: canBoController+"/delete/"+pK+"?version="+version,  
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();
	                    },
	                    error: function (data, textStatus, xhr) {
	            			alert(data.responseText);
	            		}  
	                });
	            }
			}
	    });
		
		$("button#btnCapNhapSoYeuLyLich").click(function(e) {
			 var endpointUrl = '/canBoController/update';
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
	       	 
	       	 var invalidFields = $("#formTest").find(":invalid");
             if(invalidFields.length == 0){
       		 $.ajax({
                type : "POST",
                contentType: "application/json; charset=utf-8",
                data : JSON.stringify(json),
                url : endpointUrl,
                success : function(msg) {
                	// close modal dialog
        			//$('#themCanBoForm').modal('toggle');
                	alert("Sửa thành công");
        			$('#ChiTietCanBoForm').modal('toggle');
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
		
		$("button#btnThemCanBo").click(function(e) {
			 var endpointUrl = '/canBoController/add';
			 var txtPkAdd = $(pkAdd);
        	 var txtSoHieuAdd = $(soHieuAdd);
        	 var txtDonViChucNang_pkAdd = $(donViChucNang_pkAdd);
        	 var txtBoMon_pkAdd = $(boMon_pkAdd);
        	 var txtImageUrlAdd = $(imageUrlAdd);
        	 var txtTenAdd = $( tenAdd);
        	 var txtTenGoiKhacAdd = $(tenGoiKhacAdd);
        	 var txtNgaySinhAdd = $(ngaySinhAdd);
        	 var txtGioiTinhAdd = $(gioiTinhAdd);
        	 var txtNoiSinhAdd = $( noiSinhAdd);
        	 var txtQueQuanAdd = $(queQuan_pkAdd);
        	 var txtDanToc_pkAdd = $( danToc_pkAdd);
        	 var txtTonGiao_pkAdd = $( tonGiao_pkAdd);
        	 var txtSoCmndAdd = $( soCmndAdd);
        	 var txtNgayCapCmndAdd = $( ngayCapCmndAdd);
        	 var txtNoiCapCmndAdd = $( noiCapCmndAdd);
        	 var txtNoiDKHoKhauThuongTruAdd = $( noiDKHoKhauThuongTruAdd);
        	 var txtNoiOHienNayAdd = $( noiOHienNayAdd);
        	 var txtNgheNghiepKhiTuyenDungAdd = $( ngheNghiepKhiTuyenDungAdd);
        	 var txtCoQuanTuyenDungAdd = $( coQuanTuyenDungAdd);
        	 var txtNgayTuyenDungAdd = $(ngayTuyenDungAdd);
        	 var txtChucVu_pkAdd = $(chucVu_pkAdd);
        	 var txtCongViecDuocGiaoAdd = $( congViecDuocGiaoAdd);
        	 var txtChucDanhAdd = $(chucDanhAdd);
        	 var txtNgachCongChuc_pkAdd = $( ngachCongChuc_pkAdd);
        	 var txtBacLuong_pkAdd = $( bacLuong_pkAdd);
        	 var txtNgayHuongAdd = $(ngayHuongAdd);
        	 var txtPhuCapChucVuAdd = $( phuCapChucVuAdd);
        	 var txtPhuCapKhacAdd = $( phuCapKhacAdd);
        	 var txtTrinhDoGiaoDucPtAdd = $(trinhDoGiaoDucPtAdd);
        	 var txtTrinhDoChuyenMonAdd = $(trinhDoChuyenMonAdd);
        	 var txtHocViAdd = $( hocViAdd);
        	 var txtHocHamAdd = $(hocHamAdd);
        	 var txtNgayNhanHocViAdd = $(ngayNhanHocViAdd);
        	 var txtNgayNhanHocHamAdd = $(ngayNhanHocHamAdd);
        	 var txtLyLuanChinhTriAdd = $(lyLuanChinhTriAdd);
        	 var txtQuanLyNhaNuocAdd = $( quanLyNhaNuocAdd);
        	 var txtNgoaiNguAdd = $( ngoaiNguAdd);
        	 var txtTinHocAdd = $( tinHocAdd);
        	 var txtNgayVaoDcsvnDuBiAdd = $(ngayVaoDcsvnDuBiAdd);
        	 var txtNgayVaoDcsvnChinhThucAdd = $(ngayVaoDcsvnChinhThucAdd);
        	 var txtThamGiaToChucCtxhAdd = $(thamGiaToChucCtxhAdd);
        	 var txtNgayNhapNguAdd = $(ngayNhapNguAdd);
        	 var txtNgayXuatNguAdd = $(ngayXuatNguAdd);
        	 var txtQuanHamCaoNhatAdd = $(quanHamCaoNhatAdd);
        	 var txtDanhHieuPhongTangAdd = $( danhHieuPhongTangAdd);
        	 var txtSoTruongCongTacAdd = $(soTruongCongTacAdd);
        	 var txtKhenThuongAdd = $(khenThuongAdd);
        	 var txtKyLuatAdd = $(kyLuatAdd);
        	 var txtTinhTrangSucKhoeAdd = $(tinhTrangSucKhoeAdd);
        	 var txtChieuCaoAdd = $(chieuCaoAdd);
        	 var txtCanNangAdd = $( canNangAdd);
        	 var txtNhomMauAdd = $(nhomMauAdd);
        	 var txtSoBaoHiemXhAdd = $(soBaoHiemXhAdd);
        	 var txtLaThuongBinhAdd = $( laThuongBinhAdd);
        	 var txtLaConGiaDinhChinhSachAdd = $( laConGiaDinhChinhSachAdd);
        	 var txtNhanXetAdd = $( nhanXetAdd);
        	 var txtNgayVeHuuAdd = $( ngayVeHuuAdd);
        	 var txtNgayThoiViecAdd = $( ngayThoiViecAdd);
        	 var txtVersionAdd = $(versionAdd);
	       	 
	       	 var x = document.forms["formThemCanBo"]["soCmndAdd"].value;
	         if (isNaN(x)) 
	         {
	           alert("Số chứng minh nhân dân chỉ được nhập số");
	           return false;
	         }
	       	 
	       	 var json = new Object();
	         json.pk = txtPkAdd.val();
	       	 json.soHieu = txtSoHieuAdd.val();
	       	 json.donViChucNang = new Object();
	       	 json.donViChucNang.pk = txtDonViChucNang_pkAdd.val();
	       	 json.boMon = new Object();
	       	 json.boMon.pk = txtBoMon_pkAdd.val();
	       	 json.imageUrl = txtImageUrlAdd.val();
	       	 json.ten = txtTenAdd.val();
	       	 json.tenGoiKhac = txtTenGoiKhacAdd.val();
	       	 json.ngaySinh = txtNgaySinhAdd.val();
	       	 json.gioiTinh = txtGioiTinhAdd.val();
	       	 json.noiSinh = txtNoiSinhAdd.val();
	       	 json.queQuan = new Object();
	       	 json.queQuan.pk = txtQueQuanAdd.val();
	       	 json.danToc = new Object();
	       	 json.danToc.pk = txtDanToc_pkAdd.val();
	       	 json.tonGiao = new Object();
	       	 json.tonGiao.pk = txtTonGiao_pkAdd.val();
	       	 json.soCmnd = txtSoCmndAdd.val();
	       	 json.ngayCapCmnd = txtNgayCapCmndAdd.val();
	       	 json.noiCapCmnd = txtNoiCapCmndAdd.val();
	       	 json.noiDKHoKhauThuongTru = txtNoiDKHoKhauThuongTruAdd.val();
	       	 json.noiOHienNay = txtNoiOHienNayAdd.val();
	       	 json.ngheNghiepKhiTuyenDung = txtNgheNghiepKhiTuyenDungAdd.val();
	       	 json.coQuanTuyenDung = txtCoQuanTuyenDungAdd.val();
	       	 json.ngayTuyenDung = txtNgayTuyenDungAdd.val();
	       	 json.chucVu = new Object();
	       	 json.chucVu.pk = txtChucVu_pkAdd.val();
	       	 json.congViecDuocGiao = txtCongViecDuocGiaoAdd.val();
	       	 json.chucDanh = txtChucDanhAdd.val();
	       	 json.ngachCongChuc = new Object();
	       	 json.ngachCongChuc.pk = txtNgachCongChuc_pkAdd.val();
	       	 json.bacLuong = new Object();
	       	 json.bacLuong.pk = txtBacLuong_pkAdd.val();
	       	 json.ngayHuong = txtNgayHuongAdd.val();
	       	 json.phuCapChucVu = txtPhuCapChucVuAdd.val();
	       	 json.phuCapChucVu = txtPhuCapKhacAdd.val();
	       	 json.trinhDoGiaoDucPt = txtTrinhDoGiaoDucPtAdd.val();
	       	 json.trinhDoChuyenMon = txtTrinhDoChuyenMonAdd.val();
	       	 json.hocVi = txtHocViAdd.val();
	       	 json.hocHam = txtHocHamAdd.val();
	       	 json.ngayNhanHocVi = txtNgayNhanHocViAdd.val();
	       	 json.ngayNhanHocHam = txtNgayNhanHocHamAdd.val();
	       	 json.lyLuanChinhTri = txtLyLuanChinhTriAdd.val();
	       	 json.quanLyNhaNuoc = txtQuanLyNhaNuocAdd.val();
	       	 json.ngoaiNgu = txtNgoaiNguAdd.val();
	       	 json.tinHoc = txtTinHocAdd.val();
	       	 json.ngayVaoDcsvnDuBi = txtNgayVaoDcsvnDuBiAdd.val();
	       	 json.ngayVaoDcsvnChinhThuc = txtNgayVaoDcsvnChinhThucAdd.val();
	       	 json.thamGiaToChucCtxh = txtThamGiaToChucCtxhAdd.val();
	       	 json.ngayNhapNgu = txtNgayNhapNguAdd.val();
	       	 json.ngayXuatNgu = txtNgayXuatNguAdd.val();
	       	 json.quanHamCaoNhat = txtQuanHamCaoNhatAdd.val();
	       	 json.danhHieuPhongTang = txtDanhHieuPhongTangAdd.val();
	       	 json.soTruongCongTac = txtSoTruongCongTacAdd.val();
	       	 json.khenThuong = txtKhenThuongAdd.val();
	       	 json.kyLuat = txtKyLuatAdd.val();
	       	 json.tinhTrangSucKhoe = txtTinhTrangSucKhoeAdd.val();
	       	 json.chieuCao = txtChieuCaoAdd.val();
	       	 json.canNang = txtCanNangAdd.val();
	       	 json.nhomMau = txtNhomMauAdd.val();
	       	 json.soBaoHiemXh = txtSoBaoHiemXhAdd.val();
	       	 json.laThuongBinh = txtLaThuongBinhAdd.val();
	       	 json.laConGiaDinhChinhSach = txtLaConGiaDinhChinhSachAdd.val();
	       	 json.nhanXet = txtNhanXetAdd.val();
	       	 json.ngayVeHuu = txtNgayVeHuuAdd.val();
	       	 json.ngayThoiViec = txtNgayThoiViecAdd.val();
	       	 json.version = txtVersionAdd.val();
	       	 
	       	 var invalidFields = $("#formThemCanBo").find(":invalid");
             if(invalidFields.length == 0){
      		 $.ajax({
               type : "POST",
               contentType: "application/json; charset=utf-8",
               data : JSON.stringify(json),
               url : endpointUrl,
               success : function(msg) {
               	// close modal dialog
               	alert("Thêm thành công");
               	$('#themCanBoForm').modal('toggle');
                table.ajax.reload();
               },
               error: function (data, textStatus, xhr) {
       			alert(data.responseText);
       		}
            });
           }else {
           	$("#formThemCanBo").submit();
           }
		});
		
		$("#themCanBoForm").on('hidden.bs.modal', function () {
            $("#formThemCanBo").find('.has-error').removeClass("has-error");
            $("#forformThemCanBomTest").find('.has-feedback').removeClass("has-feedback");
        });
		
		$("#ChiTietCanBoForm").on('hidden.bs.modal', function () {
            $("#formTest").find('.has-error').removeClass("has-error");
            $("#formTest").find('.has-feedback').removeClass("has-feedback");
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
		
		changeDonViChucNangAdd = function(){
			var donViChucNangPk = $(donViChucNang_pkAdd).val();
			 $.ajax({  
                 url: canBoService+"/getBoMonByDonViChucNang/"+donViChucNangPk,  
                 type: 'GET',  
                 success: function (res) {
                	 var toAppend = '';
                     $.each(res,function(i,o){
                    	 toAppend += '<option value='+o.pk+'>'+o.tenBoMon+'</option>';
                    });
                   $('#boMon_pkAdd').empty();
                   $('#boMon_pkAdd').append(toAppend);
                 }
			 });
		}
		
		changeDonViChucNangThongKe = function(){
			var donViChucNangPk = $(cbDonViChucNang).val();
			 $.ajax({  
                 url: canBoService+"/getBoMonByDonViChucNang/"+donViChucNangPk,  
                 type: 'GET',  
                 success: function (res) {
                	 var toAppend = '';
                     $.each(res,function(i,o){
                    	 toAppend += '<option value='+o.pk+'>'+o.tenBoMon+'</option>';
                    });
                   $('#cbBoMon').empty();
                   $('#cbBoMon').append(toAppend);
                 }
			 });
		}
		
		changeNgachCongChuc = function(){
			 var ngachCongChucPk = $(ngachCongChuc_pk).val();
			 
			 $.ajax({  
                url: canBoService+"/getNgachCongChucById/"+ngachCongChucPk,  
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
		
		changeNgachCongChucAdd = function(){
			 var ngachCongChucPk = $(ngachCongChuc_pkAdd).val();
			 $.ajax({  
               url: canBoService+"/getNgachCongChucById/"+ngachCongChucPk,  
               type: 'GET',  
               success: function (res) {
              	 var toAppend = '';
                   $.each(res,function(i,o){
                  	 toAppend += '<option value='+o.pk+'>'+o.maBacLuong+'</option>';
                  });
                 $('#bacLuong_pkAdd').empty();
                 $('#bacLuong_pkAdd').append(toAppend);
                 $('#tenNgachAdd').val(res.tenNgach);
               }
			 });
		}
		
});

/*  datepicker*/
$.fn.datepicker.defaults.format = "yyyy-mm-dd";
$('.datepicker').datepicker({
		 	startDate: '-3d'
});