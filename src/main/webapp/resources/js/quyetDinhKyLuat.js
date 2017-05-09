$(document).ready(function() {
		var quyetDinhKyLuatService = "/quyetDinhKyLuatService";
		var quyetDinhKyLuatController = "/quyetDinhKyLuatController";
		var table = $('#QuyetDinhKyLuatTable').DataTable({
			"sAjaxSource" : quyetDinhKyLuatService+"/getAll",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"aoColumnDefs": [ 
			      {
				       "aTargets": [ 0 ],
				       "mData": "canBo.ten"
			      },
			      {
				       "aTargets": [ 1 ],
				       "mData": "soQuyetDinh"
			      },
			      {
				       "aTargets": [ 2 ],
				       "mData": "tenQuyetDinh"
			      },
			      {
				       "aTargets": [ 3 ],
				       "mData": "noiDungQuyetDinh"
			      },
			      {
				       "aTargets": [ 4 ],
				       "mData": "ngayKy"
			      },
			      {
				       "aTargets": [ 5 ],
				       "mData": "nguoiKy"
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
		                	 var txtDonViChucNangQdkl_pk=$(donViChucNangQdkl_pk);
		                	 var txtCanBoQdkl_pk = $(canBoQdkl_pk);
		                	 var txtSoQuyetDinh = $(soQuyetDinh);
		                	 var txtTenQuyetDinh = $(tenQuyetDinh);
		                	 var txtNoiDungQuyetDinh = $(noiDungQuyetDinh);
		                	 var txtNgayKy = $(ngayKy);
		                	 var txtNguoiKy = $(nguoiKy);
		                	 var txtTuNgay = $(tuNgay);
		                	 var txtDenNgay = $(denNgay);
		                	 var txtFileKy = $(fileKy);

		                	 txtPk.val(-1);
		                	 txtDonViChucNangQdkl_pk.val("");
		                	 txtCanBoQdkl_pk.val("");
		                	 txtSoQuyetDinh.val("");
		                	 txtTenQuyetDinh.val("");
		                	 txtNoiDungQuyetDinh.val("");
		                	 txtNgayKy.val("");
		                	 txtNguoiKy.val("");
		                	 txtTuNgay.val("");
		                	 txtDenNgay.val("");
		                	 txtFileKy.val("");
		                     $('#formQuyetDinhKyLuat').modal('show');
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
	        check = confirm("Bạn có chắc chắn muốn xóa quyết định kỷ luật : "
                    + data['soQuyetDinh'])
                    var pK = data['pk'];
	            if(check==true){
	            	$.ajax({  
	                    url: quyetDinhKyLuatController+"/delete/"+pK,  
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();	                    }  
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
                    var txtDonViChucNangQdkl_pk=$(donViChucNangQdkl_pk);
	               	var txtCanBoQdkl_pk = $(canBoQdkl_pk);
	               	var txtSoQuyetDinh = $(soQuyetDinh);
	               	var txtTenQuyetDinh = $(tenQuyetDinh);
	               	var txtNoiDungQuyetDinh = $(noiDungQuyetDinh);
	               	var txtNgayKy = $(ngayKy);
	               	var txtNguoiKy = $(nguoiKy);
	               	var txtTuNgay = $(tuNgay);
	               	var txtDenNgay = $(denNgay);
	               	var txtFileKy = $(fileKy);

	            	$.ajax({  
	                    url: quyetDinhKyLuatService+"/getById/"+pK,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtPk.val(pK);
	                    	 txtDonViChucNangQdkl_pk.val(res.donViChucNangQdkl_pk);
		                	 txtCanBoQdkl_pk.val(res.canBoQdkl_pk);
		                	 txtSoQuyetDinh.val(res.soQuyetDinh);
		                	 txtTenQuyetDinh.val(res.tenQuyetDinh);
		                	 txtNoiDungQuyetDinh.val(res.noiDungQuyetDinh);
		                	 txtNgayKy.val(res.ngayKy);
		                	 txtNguoiKy.val(res.nguoiKy);
		                	 txtTuNgay.val(res.tuNgay);
		                	 txtDenNgay.val(res.denNgay);
		                	 txtFileKy.val(res.fileKy);
		                     $('#formQuyetDinhKyLuat').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("button#btnCapNhap").click(function(e) {

    	 var endpointUrl = '/quyetDinhKyLuatController/add';
    	 var txtPk = $(pk);
       	 var txtDonViChucNangQdkl_pk=$(donViChucNangQdkl_pk);
       	 var txtCanBoQdkl_pk = $(canBoQdkl_pk);
       	 var txtSoQuyetDinh = $(soQuyetDinh);
       	 var txtTenQuyetDinh = $(tenQuyetDinh);
       	 var txtNoiDungQuyetDinh = $(noiDungQuyetDinh);
       	 var txtNgayKy = $(ngayKy);
       	 var txtNguoiKy = $(nguoiKy);
       	 var txtTuNgay = $(tuNgay);
       	 var txtDenNgay = $(denNgay);
       	 var txtFileKy = $(fileKy);
       	 	
       	 var json = new Object();
         json.pk = txtPk.val();
         json.donViChucNangQdkl_pk = txtDonViChucNangQdkl_pk.val();
         json.canBoQdkl_pk = txtCanBoQdkl_pk.val();
         json.soQuyetDinh = txtSoQuyetDinh.val();
         json.tenQuyetDinh = txtTenQuyetDinh.val();
         json.noiDungQuyetDinh = txtNoiDungQuyetDinh.val();
         json.ngayKy = txtNgayKy.val();
         json.nguoiKy = txtNguoiKy.val();
         json.tuNgay = txtTuNgay.val();
         json.denNgay = txtDenNgay.val();
         json.fileKy = txtFileKy.val();

        	if(txtPk.val()!= -1){
             	var endpointUrl = '/quyetDinhKyLuatController/update';
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
    		 var txtDonViChucNangQdkl_pk=$(donViChucNangQdkl_pk);
          	 var txtCanBoQdkl_pk = $(canBoQdkl_pk);
          	 var txtSoQuyetDinh = $(soQuyetDinh);
          	 var txtTenQuyetDinh = $(tenQuyetDinh);
          	 var txtNoiDungQuyetDinh = $(noiDungQuyetDinh);
          	 var txtNgayKy = $(ngayKy);
          	 var txtNguoiKy = $(nguoiKy);
          	 var txtTuNgay = $(tuNgay);
          	 var txtDenNgay = $(denNgay);
          	 var txtFileKy = $(fileKy);
          	 txtDonViChucNangQdkl_pk.val("");
	       	 txtCanBoQdkl_pk.val("");
	       	 txtSoQuyetDinh.val("");
	       	 txtTenQuyetDinh.val("");
	       	 txtNoiDungQuyetDinh.val("");
	       	 txtNgayKy.val("");
	       	 txtNguoiKy.val("");
	       	 txtTuNgay.val("");
	       	 txtDenNgay.val("");
	       	 txtFileKy.val("");
        }); 
    	
	} );
/*  datepicker*/
$.fn.datepicker.defaults.format = "yyyy-mm-dd";
$('.datepicker').datepicker({
		 	startDate: '-3d'
});
	
		 
		
		 