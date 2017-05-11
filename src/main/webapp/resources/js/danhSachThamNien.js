$(document).ready(function() {
		var danhSachThamNienService = "/danhSachThamNienService";
		var danhSachThamNienController = "/danhSachThamNienController";
		var table = $('#DanhSachThamNienTable').DataTable({
			"sAjaxSource" : danhSachThamNienService+"/getAll",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"aoColumnDefs": [ 
			      {
				       "aTargets": [ 0 ],
				       "mData": "canBo.ten"
			      },
			      {
				       "aTargets": [ 1 ],
				       "mData": "donViChucNang.tenDonVi"
			      },
			      {
				       "aTargets": [ 2 ],
				       "mData": "mocTinhPhuCapTn"
			      },
			      {
				       "aTargets": [ 3 ],
				       "mData": "tongHeSoLuong"
			      },
			      {
				       "aTargets": [ 4 ],
				       "mData": "soThangBiGiamTru"
			      },
			      {
				       "aTargets": [ 5 ],
				       "mData": "thoiDiemTangPhuCapTn"
			      },
			      {
				       "aTargets": [ 6 ],
				       "mData": "ghiChuThoiDiemTang"
			      },
				  {
				       "targets": -1,
				       "data": null,
				       "defaultContent": "<button type='button' class='btn btn-info btn-lg' data-toggle='modal' id='btnDel'>Xóa</button>"
			      },
			      {
					   "targets": -2,
					   "data": null,
					   "defaultContent": "<button type='button' class='btn btn-info btn-lg' data-toggle='modal' id='btnUpdate'>Chi Tiết</button>"
				  },
			],
			scrollY : "600px",
			scrollCollapse: true,
			dom: 'Blfrtip',
			buttons: [
			          {
		                 text: 'THÊM MỚI',
		                 action: function ( e, dt, node, config ) {
		                	 var txtPk = $(pk);
		                	 var txtDonViChucNangDstn_pk=$(donViChucNangDstn_pk);
		                	 var txtCanBoDstn_pk = $(canBoDstn_pk);
		                	 var txtMocTinhPhuCapTn = $(mocTinhPhuCapTn);
		                	 var txtBacLuongDstn_pk = $(bacLuongDstn_pk);
		                	 var txtPhuCapChucVu = $(phuCapChucVu);
		                	 var txtVuotKhung = $(vuotKhung);
		                	 var txtTongHeSoLuong = $(tongHeSoLuong);
		                	 var txtPhuCapGiangVien = $(phuCapGiangVien);
		                	 var txtSoThangBiGiamTru = $(soThangBiGiamTru);
		                	 var txtThoiDiemTangPhuCapTn = $(thoiDiemTangPhuCapTn);
		                	 var txtGhiChuThoiDiemTang = $(ghiChuThoiDiemTang);
		                	 var txtTuNgay = $(tuNgay);
		                	 var txtDenNgay = $(denNgay);
		                	 var txtGhiChuKhongPhuCapTn = $(ghiChuKhongPhuCapTn);
		                	 txtPk.val(-1);
		                	 txtDonViChucNangDstn_pk.val("");
		                	 txtCanBoDstn_pk.val("");
		                	 txtMocTinhPhuCapTn.val("");
		                	 txtBacLuongDstn_pk.val("");
		                	 txtPhuCapChucVu.val("");
		                	 txtVuotKhung.val("");
		                	 txtTongHeSoLuong.val("");
		                	 txtPhuCapGiangVien.val("");
		                	 txtSoThangBiGiamTru.val("");
		                	 txtThoiDiemTangPhuCapTn.val("");
		                	 txtGhiChuThoiDiemTang.val("");
		                	 txtTuNgay.val("");
		                	 txtDenNgay.val("");
		                	 txtGhiChuKhongPhuCapTn.val("");
		                     $('#formDanhSachThamNien').modal('show');
		                 },
		              }
			          ],
		    colReorder: true,
		    select: true,
		    "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
            }
		});
	
		$('#DanhSachThamNienTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnDel" == id){
	        var data = table.row($(this).parents('tr')).data();
	        check = confirm("Bạn có chắc chắn muốn xóa Cán Bộ Thâm Niên Đã Chọn : "
                    + data['tongHeSoLuong'])
                    var pK = data['pk'];
	            if(check==true){
	            	$.ajax({  
	                    url: danhSachThamNienController+"/delete/"+pK,  
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();	                    }  
	                });
	            }
                    
			}
	    });
		
		$('#DanhSachThamNienTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnUpdate" == id){
					var data = table.row($(this).parents('tr')).data();
                    var pK = data['pk'];
                    var txtPk = $(pk);
	               	var txtDonViChucNangDstn_pk=$(donViChucNangDstn_pk);
	               	var txtCanBoDstn_pk = $(canBoDstn_pk);
	               	var txtMocTinhPhuCapTn = $(mocTinhPhuCapTn);
	               	var txtBacLuongDstn_pk = $(bacLuongDstn_pk);
	               	var txtPhuCapChucVu = $(phuCapChucVu);
	               	var txtVuotKhung = $(vuotKhung);
	               	var txtTongHeSoLuong = $(tongHeSoLuong);
	               	var txtPhuCapGiangVien = $(phuCapGiangVien);
	               	var txtSoThangBiGiamTru = $(soThangBiGiamTru);
	               	var txtThoiDiemTangPhuCapTn = $(thoiDiemTangPhuCapTn);
	               	var txtGhiChuThoiDiemTang = $(ghiChuThoiDiemTang);
	               	var txtTuNgay = $(tuNgay);
	               	var txtDenNgay = $(denNgay);
	               	var txtGhiChuKhongPhuCapTn = $(ghiChuKhongPhuCapTn);

	            	$.ajax({  
	                    url: danhSachThamNienService+"/getById/"+pK,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtPk.val(pK);
	                    	 txtDonViChucNangDstn_pk.val(res.donViChucNangDstn_pk);
		                	 txtCanBoDstn_pk.val(res.canBoDstn_pk);
		                	 txtMocTinhPhuCapTn.val(res.mocTinhPhuCapTn);
		                	 txtBacLuongDstn_pk.val(res.bacLuongDstn_pk);
		                	 txtPhuCapChucVu.val(res.phuCapChucVu);
		                	 txtVuotKhung.val(res.vuotKhung);
		                	 txtTongHeSoLuong.val(res.tongHeSoLuong);
		                	 txtPhuCapGiangVien.val(res.phuCapGiangVien);
		                	 txtSoThangBiGiamTru.val(res.soThangBiGiamTru);
		                	 txtThoiDiemTangPhuCapTn.val(res.thoiDiemTangPhuCapTn);
		                	 txtGhiChuThoiDiemTang.val(res.ghiChuThoiDiemTang);
		                	 txtTuNgay.val(res.tuNgay);
		                	 txtDenNgay.val(res.denNgay);
		                	 txtGhiChuKhongPhuCapTn.val(res.ghiChuKhongPhuCapTn);
		                     $('#formDanhSachThamNien').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("button#btnCapNhap").click(function(e) {

    		var endpointUrl = '/danhSachThamNienController/add';
    		var txtPk = $(pk);
           	var txtDonViChucNangDstn_pk=$(donViChucNangDstn_pk);
           	var txtCanBoDstn_pk = $(canBoDstn_pk);
           	var txtMocTinhPhuCapTn = $(mocTinhPhuCapTn);
           	var txtBacLuongDstn_pk = $(bacLuongDstn_pk);
           	var txtPhuCapChucVu = $(phuCapChucVu);
           	var txtVuotKhung = $(vuotKhung);
           	var txtTongHeSoLuong = $(tongHeSoLuong);
           	var txtPhuCapGiangVien = $(phuCapGiangVien);
           	var txtSoThangBiGiamTru = $(soThangBiGiamTru);
           	var txtThoiDiemTangPhuCapTn = $(thoiDiemTangPhuCapTn);
           	var txtGhiChuThoiDiemTang = $(ghiChuThoiDiemTang);
           	var txtTuNgay = $(tuNgay);
           	var txtDenNgay = $(denNgay);
           	var txtGhiChuKhongPhuCapTn = $(ghiChuKhongPhuCapTn);
       	 	
       	 var json = new Object();
         json.pk = txtPk.val();
         json.donViChucNangDstn_pk = txtDonViChucNangDstn_pk.val();
         json.canBoDstn_pk = txtCanBoDstn_pk.val();
         json.mocTinhPhuCapTn = txtMocTinhPhuCapTn.val();
         json.bacLuongDstn_pk = txtBacLuongDstn_pk.val();
         json.phuCapChucVu = txtPhuCapChucVu.val();
         json.vuotKhung = txtVuotKhung.val();
         json.tongHeSoLuong = txtTongHeSoLuong.val();
         json.phuCapGiangVien = txtPhuCapGiangVien.val();
         json.soThangBiGiamTru = txtSoThangBiGiamTru.val();
         json.thoiDiemTangPhuCapTn = txtThoiDiemTangPhuCapTn.val();
         json.ghiChuThoiDiemTang = txtGhiChuThoiDiemTang.val();
         json.tuNgay = txtTuNgay.val();
         json.denNgay = txtDenNgay.val();
         json.ghiChuKhongPhuCapTn = txtGhiChuKhongPhuCapTn.val();

        	if(txtPk.val()!= -1){
             	var endpointUrl = '/danhSachThamNienController/update';
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
    	
    	$("button#btnDong").click(function(e) {
    		 var txtDonViChucNangDstn_pk=$(donViChucNangDstn_pk);
	       	 var txtCanBoDstn_pk = $(canBoDstn_pk);
	       	 var txtMocTinhPhuCapTn = $(mocTinhPhuCapTn);
	       	 var txtBacLuongDstn_pk = $(bacLuongDstn_pk);
	       	 var txtPhuCapChucVu = $(phuCapChucVu);
	       	 var txtVuotKhung = $(vuotKhung);
	       	 var txtTongHeSoLuong = $(tongHeSoLuong);
	       	 var txtPhuCapGiangVien = $(phuCapGiangVien);
	       	 var txtSoThangBiGiamTru = $(soThangBiGiamTru);
	       	 var txtThoiDiemTangPhuCapTn = $(thoiDiemTangPhuCapTn);
	       	 var txtGhiChuThoiDiemTang = $(ghiChuThoiDiemTang);
	       	 var txtTuNgay = $(tuNgay);
	       	 var txtDenNgay = $(denNgay);
	       	 var txtGhiChuKhongPhuCapTn = $(ghiChuKhongPhuCapTn);
	       	 txtDonViChucNangDstn_pk.val("");
	       	 txtCanBoDstn_pk.val("");
	       	 txtMocTinhPhuCapTn.val("");
	       	 txtBacLuongDstn_pk.val("");
	       	 txtPhuCapChucVu.val("");
	       	 txtVuotKhung.val("");
	       	 txtTongHeSoLuong.val("");
	       	 txtPhuCapGiangVien.val("");
	       	 txtSoThangBiGiamTru.val("");
	       	 txtThoiDiemTangPhuCapTn.val("");
	       	 txtGhiChuThoiDiemTang.val("");
	       	 txtTuNgay.val("");
	       	 txtDenNgay.val("");
	       	 txtGhiChuKhongPhuCapTn.val("");
        }); 
    	
	} );
/*  datepicker*/
$.fn.datepicker.defaults.format = "yyyy-mm-dd";
$('.datepicker').datepicker({
		 	startDate: '-3d'
});
	
		 
		
		 