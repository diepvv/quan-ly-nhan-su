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
		                	 var txtVersion = $(version);

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
		                	 txtVersion.val("");
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
	
		$('#QuyetDinhKyLuatTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnDel" == id){
	        var data = table.row($(this).parents('tr')).data();
	        check = confirm("Bạn có chắc chắn muốn xóa quyết định kỷ luật : " + data['soQuyetDinh'])
                var pK = data['pk'];
	        	var version = data['version'];
	            if(check==true){
	            	$.ajax({  
	                    url: quyetDinhKyLuatController+"/delete/"+pK+"?version="+version,  
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();	              
	                    }  
	                });
	            }
                    
			}
	    });
		
		$('#QuyetDinhKyLuatTable tbody').on( 'click', 'button', function () {
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
	               	var txtVersion = $(version);

	            	$.ajax({  
	                    url: quyetDinhKyLuatService+"/getById/"+pK,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtPk.val(pK);
	                    	 txtDonViChucNangQdkl_pk.val(res.donViChucNang.pk);
	                    	 if(res.canBo!=null){
		                		 var toAppend = '';
		                         $.each(res.donViChucNang.canBo,function(i,o){
		                        	 if(o.pk==res.canBo.pk){
		                        		 toAppend += '<option value='+o.pk+' selected>'+o.ten+'</option>';
		                        	 } else {	                        		 
		                        		 toAppend += '<option value='+o.pk+'>'+o.ten+'</option>';
		                        	 }
		                        });
		                         txtCanBoQdkl_pk.empty();
		                         txtCanBoQdkl_pk.append(toAppend);
		                	 }
		                	 txtSoQuyetDinh.val(res.soQuyetDinh);
		                	 txtTenQuyetDinh.val(res.tenQuyetDinh);
		                	 txtNoiDungQuyetDinh.val(res.noiDungQuyetDinh);
		                	 txtNgayKy.val(res.ngayKy);
		                	 txtNguoiKy.val(res.nguoiKy);
		                	 txtTuNgay.val(res.tuNgay);
		                	 txtDenNgay.val(res.denNgay);
		                	 txtFileKy.val(res.fileKy);
		                	 txtVersion.val(res.version);
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
         var txtVersion = $(version);
       	 	
       	 var json = new Object();
         json.pk = txtPk.val();
         json.donViChucNang = new Object();
         json.donViChucNang.pk = txtDonViChucNangQdkl_pk.val();
         json.canBo = new Object();
         json.canBo.pk = txtCanBoQdkl_pk.val();
         json.soQuyetDinh = txtSoQuyetDinh.val();
         json.tenQuyetDinh = txtTenQuyetDinh.val();
         json.noiDungQuyetDinh = txtNoiDungQuyetDinh.val();
         json.ngayKy = txtNgayKy.val();
         json.nguoiKy = txtNguoiKy.val();
         json.tuNgay = txtTuNgay.val();
         json.denNgay = txtDenNgay.val();
         json.fileKy = txtFileKy.val();
         json.version = txtVersion.val();

        	if(txtPk.val()!= -1){
             	var endpointUrl = '/quyetDinhKyLuatController/update';
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
	        			$('#formQuyetDinhKyLuat').modal('toggle');
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
    	
    	$("#formQuyetDinhKyLuat").on('hidden.bs.modal', function () {
            $("#formTest").find('.has-error').removeClass("has-error");
            $("#formTest").find('.has-feedback').removeClass("has-feedback");
        });
    	
    	changeDonViChucNang = function(){
			var donViChucNangPk = $(donViChucNangQdkl_pk).val();
			 $.ajax({  
                 url: quyetDinhKyLuatService+"/getCanBoByDonViChucNang/"+donViChucNangPk,  
                 type: 'GET',  
                 success: function (res) {
                	 var toAppend = '';
                     $.each(res,function(i,o){
                    	 toAppend += '<option value='+o.pk+'>'+o.ten+'</option>';
                    });
                   $('#canBoQdkl_pk').empty();
                   $('#canBoQdkl_pk').append(toAppend);
                 }
			 });
    	}
    	
} );
/*  datepicker*/
$.fn.datepicker.defaults.format = "yyyy-mm-dd";
$('.datepicker').datepicker({
		 	startDate: '-3d'
});
	
		 
		
		 