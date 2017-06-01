$(document).ready(function() {
		var danhSachKhoanGonService = "/danhSachKhoanGonService";
		var danhSachKhoanGonController = "/danhSachKhoanGonController";
		var table = $('#DanhSachKhoanGonTable').DataTable({
			"sAjaxSource" : danhSachKhoanGonService+"/getAll",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"aoColumnDefs": [ 
			      {
				       "aTargets": [ 0 ],
				       "mData": "hoTenCanBo"
			      },
			      {
				       "aTargets": [ 1 ],
				       "mData": "donViChucNang.tenDonVi"
			      },
			      {
				       "aTargets": [ 2 ],
				       "mData": "soDienThoai"
			      },
			      {
				       "aTargets": [ 3 ],
				       "mData": "ngayKyHopDong"
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
		                	 var txtDonViChucNangDskg_pk=$(donViChucNangDskg_pk);
		                	 var txtHoTenCanBo = $(hoTenCanBo);
		                	 var txtSoDienThoai = $(soDienThoai);
		                	 var txtSoCmnd = $(soCmnd);
		                	 var txtDiaChi = $(diaChi);
		                	 var txtNgayKyHopDong = $(ngayKyHopDong);
		                	 var txtVersion = $(version);
		                	 txtPk.val(-1);
		                	 txtDonViChucNangDskg_pk.val("");
		                	 txtHoTenCanBo.val("");
		                	 txtSoDienThoai.val("");
		                	 txtSoCmnd.val("");
		                	 txtDiaChi.val("");
		                	 txtNgayKyHopDong.val("");
		                	 txtVersion.val("");
		                     $('#formDanhSachKhoanGon').modal('show');
		                 },
		              }
			          ],
		    colReorder: true,
		    select: true,
		    "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
            }
		});
	
		$('#DanhSachKhoanGonTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnDel" == id){
	        var data = table.row($(this).parents('tr')).data();
	        check = confirm("Bạn có chắc chắn muốn xóa Cán Bộ Khoán Gọn : "
                    + data['hoTenCanBo'])
                    var pK = data['pk'];
	        var version = data['version'];
	            if(check==true){
	            	$.ajax({  
	                    url: danhSachKhoanGonController+"/delete/"+pK+"?version="+version,  
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
		
		$('#DanhSachKhoanGonTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnUpdate" == id){
					var data = table.row($(this).parents('tr')).data();
                    var pK = data['pk'];
                    var txtPk = $(pk);
                    var txtDonViChucNangDskg_pk=$(donViChucNangDskg_pk);
               	 	var txtHoTenCanBo = $(hoTenCanBo);
               	 	var txtSoDienThoai = $(soDienThoai);
               	 	var txtSoCmnd = $(soCmnd);
               	 	var txtDiaChi = $(diaChi);
               	 	var txtNgayKyHopDong = $(ngayKyHopDong);
               	 	var txtVersion = $(version);

	            	$.ajax({  
	                    url: danhSachKhoanGonService+"/getById/"+pK,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtPk.val(pK);
	                    	 txtDonViChucNangDskg_pk.val(res.donViChucNang.pk);
	                    	 txtHoTenCanBo.val(res.hoTenCanBo);
	                    	 txtSoDienThoai.val(res.soDienThoai);
	                    	 txtSoCmnd.val(res.soCmnd);
	                    	 txtDiaChi.val(res.diaChi);
		                	 txtNgayKyHopDong.val(res.ngayKyHopDong);
		                	 txtVersion.val(res.version);
		                     $('#formDanhSachKhoanGon').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("button#btnCapNhap").click(function(e) {
    		var endpointUrl = '/danhSachKhoanGonController/add';
    		var txtPk = $(pk);
    		var txtDonViChucNangDskg_pk=$(donViChucNangDskg_pk);
       	 	var txtHoTenCanBo = $(hoTenCanBo);
       	 	var txtSoDienThoai = $(soDienThoai);
       	 	var txtSoCmnd = $(soCmnd);
       	 	var txtDiaChi = $(diaChi);
       	 	var txtNgayKyHopDong = $(ngayKyHopDong);
       	 	var txtVersion = $(version);
       	 	
	       	var x = document.forms["formTest"]["soCmnd"].value;
	        if (isNaN(x)) {
	           alert("Số chứng minh nhân dân chỉ được nhập số");
	           return false;
	         }
	        var y = document.forms["formTest"]["soDienThoai"].value;
	        if (isNaN(y)) {
	           alert("Số điện thoại chỉ được nhập số");
	           return false;
	        }
	        
	       	var json = new Object();
	        json.pk = txtPk.val();
	        json.donViChucNang = new Object();
	       	json.donViChucNang.pk = txtDonViChucNangDskg_pk.val();
	        json.hoTenCanBo = txtHoTenCanBo.val();
	        json.soDienThoai = txtSoDienThoai.val();
	        json.soCmnd = txtSoCmnd.val();
	        json.diaChi = txtDiaChi.val();
	        json.ngayKyHopDong = txtNgayKyHopDong.val();
	        json.version = txtVersion.val();
        	if(txtPk.val()!= -1){
             	var endpointUrl = '/danhSachKhoanGonController/update';
            }
        	var invalidFields = $("#formTest").find(":invalid");
            if(invalidFields.length == 0){
	            $.ajax({
	                type : "POST",
	                contentType: "application/json; charset=utf-8",
	                data : JSON.stringify(json),
	                url : endpointUrl,
	                success : function(msg) {
	                	alert("Thành Công");
	                	$('#formDanhSachKhoanGon').modal('toggle');
	                    table.ajax.reload();
	                },
            		error: function (data, textStatus, xhr) {
            			alert(data.responseText);
            		}
	            });
            } else {
             	$("#formTest").submit();
            }   
        });
    	
    	$("button#btnDong").click(function(e) {
    		 var txtDonViChucNangDskg_pk=$(donViChucNangDskg_pk);
        	 var txtHoTenCanBo = $(hoTenCanBo);
        	 var txtSoDienThoai = $(soDienThoai);
        	 var txtSoCmnd = $(soCmnd);
        	 var txtDiaChi = $(diaChi);
        	 var txtNgayKyHopDong = $(ngayKyHopDong);
        	 txtDonViChucNangDskg_pk.val("");
        	 txtHoTenCanBo.val("");
        	 txtSoDienThoai.val("");
        	 txtSoCmnd.val("");
        	 txtDiaChi.val("");
        	 txtNgayKyHopDong.val("");
        });
    	
    	$("#formDanhSachKhoanGon").on('hidden.bs.modal', function () {
            $("#formTest").find('.has-error').removeClass("has-error");
            $("#formTest").find('.has-feedback').removeClass("has-feedback");
        });
    	
	} );
/*  datepicker*/
$.fn.datepicker.defaults.format = "yyyy-mm-dd";
$('.datepicker').datepicker({
		 	startDate: '-3d'
});	 