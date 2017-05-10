$(document).ready(function() {
		var quyetDinhService = "/quyetDinhService";
		var quyetDinhController = "/quyetDinhController";
		var table = $('#QuyetDinhTable').DataTable({
			"sAjaxSource" : quyetDinhService+"/getAll",
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
				       "mData": "loaiQuyetDinh.tenLoaiQuyetDinh"
			      },
			      {
				       "aTargets": [ 4 ],
				       "mData": "ngayKy"
			      },
			      {
				       "aTargets": [ 5 ],
				       "mData": "denNgay"
			      },
			      {
				       "aTargets": [ 6 ],
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
		                	 var txtDonViChucNangQd_pk=$(donViChucNangQd_pk);
		                	 var txtCanBoQd_pk = $(canBoQd_pk);
		                	 var txtSoQuyetDinh = $(soQuyetDinh);
		                	 var txtTenQuyetDinh = $(tenQuyetDinh);
		                	 var txtLoaiQuyetDinhQd_pk = $(loaiQuyetDinhQd_pk);
		                	 var txtNoiDungQuyetDinh = $(noiDungQuyetDinh);
		                	 var txtNgayKy = $(ngayKy);
		                	 var txtTuNgay = $(tuNgay);
		                	 var txtDenNgay = $(denNgay);
		                	 var txtNguoiKy = $(nguoiKy);
		                	 var txtFileKy = $(fileKy);

		                	 txtPk.val(-1);
		                	 txtDonViChucNangQd_pk.val("");
		                	 txtCanBoQd_pk.val("");
		                	 txtSoQuyetDinh.val("");
		                	 txtTenQuyetDinh.val("");
		                	 txtLoaiQuyetDinhQd_pk.val("");
		                	 txtNoiDungQuyetDinh.val("");
		                	 txtNgayKy.val("");
		                	 txtTuNgay.val("");
		                	 txtDenNgay.val("");
		                	 txtNguoiKy.val("");
		                	 txtFileKy.val("");
		                     $('#formQuyetDinh').modal('show');
		                 },
		              }
			          ],
		    colReorder: true,
		    select: true,
		    "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
            }
		});
	
		$('#QuyetDinhTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnDel" == id){
	        var data = table.row($(this).parents('tr')).data();
	        check = confirm("Bạn có chắc chắn muốn xóa quyết định : "
                    + data['soQuyetDinh'])
                    var pK = data['pk'];
	            if(check==true){
	            	$.ajax({  
	                    url: quyetDinhController+"/delete/"+pK,  
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();	                    }  
	                });
	            }
                    
			}
	    });
		
		$('#QuyetDinhTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnUpdate" == id){
					 var data = table.row($(this).parents('tr')).data();
                     var pK = data['pk'];
                     var txtPk = $(pk);
	               	 var txtDonViChucNangQd_pk=$(donViChucNangQd_pk);
	               	 var txtCanBoQd_pk = $(canBoQd_pk);
	               	 var txtSoQuyetDinh = $(soQuyetDinh);
	               	 var txtTenQuyetDinh = $(tenQuyetDinh);
	               	 var txtLoaiQuyetDinhQd_pk = $(loaiQuyetDinhQd_pk);
	               	 var txtNoiDungQuyetDinh = $(noiDungQuyetDinh);
	               	 var txtNgayKy = $(ngayKy);
	               	 var txtTuNgay = $(tuNgay);
	               	 var txtDenNgay = $(denNgay);
	               	 var txtNguoiKy = $(nguoiKy);
	               	 var txtFileKy = $(fileKy);

	            	$.ajax({  
	                    url: quyetDinhService+"/getById/"+pK,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtPk.val(pK);
	                    	 txtDonViChucNangQd_pk.val(res.donViChucNangQd_pk);
		                	 txtCanBoQd_pk.val(res.canBoQd_pk);
		                	 txtSoQuyetDinh.val(res.soQuyetDinh);
		                	 txtTenQuyetDinh.val(res.tenQuyetDinh);
		                	 txtLoaiQuyetDinhQd_pk.val(res.loaiQuyetDinhQd_pk);
		                	 txtNoiDungQuyetDinh.val(res.noiDungQuyetDinh);
		                	 txtNgayKy.val(res.ngayKy);
		                	 txtTuNgay.val(res.tuNgay);
		                	 txtDenNgay.val(res.denNgay);
		                	 txtNguoiKy.val(res.nguoiKy);
		                	 txtFileKy.val(res.fileKy);
		                     $('#formQuyetDinh').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("button#btnCapNhap").click(function(e) {

    	 var endpointUrl = '/quyetDinhController/add';
    	 var txtPk = $(pk);
    	 var txtDonViChucNangQd_pk=$(donViChucNangQd_pk);
    	 var txtCanBoQd_pk = $(canBoQd_pk);
    	 var txtSoQuyetDinh = $(soQuyetDinh);
    	 var txtTenQuyetDinh = $(tenQuyetDinh);
    	 var txtLoaiQuyetDinhQd_pk = $(loaiQuyetDinhQd_pk);
    	 var txtNoiDungQuyetDinh = $(noiDungQuyetDinh);
    	 var txtNgayKy = $(ngayKy);
    	 var txtTuNgay = $(tuNgay);
    	 var txtDenNgay = $(denNgay);
    	 var txtNguoiKy = $(nguoiKy);
    	 var txtFileKy = $(fileKy);
       	 	
       	 var json = new Object();
         json.pk = txtPk.val();
         json.donViChucNangQd_pk = txtDonViChucNangQd_pk.val();
         json.canBoQd_pk = txtCanBoQd_pk.val();
         json.soQuyetDinh = txtSoQuyetDinh.val();
         json.tenQuyetDinh = txtTenQuyetDinh.val();
         json.loaiQuyetDinhQd_pk = txtLoaiQuyetDinhQd_pk.val();
         json.noiDungQuyetDinh = txtNoiDungQuyetDinh.val();
         json.ngayKy = txtNgayKy.val();
         json.tuNgay = txtTuNgay.val();
         json.denNgay = txtDenNgay.val();
         json.nguoiKy = txtNguoiKy.val();
         json.fileKy = txtFileKy.val();

        	if(txtPk.val()!= -1){
             	var endpointUrl = '/quyetDinhController/update';
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
    		 var txtDonViChucNangQd_pk=$(donViChucNangQd_pk);
        	 var txtCanBoQd_pk = $(canBoQd_pk);
        	 var txtSoQuyetDinh = $(soQuyetDinh);
        	 var txtTenQuyetDinh = $(tenQuyetDinh);
        	 var txtLoaiQuyetDinhQd_pk = $(loaiQuyetDinhQd_pk);
        	 var txtNoiDungQuyetDinh = $(noiDungQuyetDinh);
        	 var txtNgayKy = $(ngayKy);
        	 var txtTuNgay = $(tuNgay);
        	 var txtDenNgay = $(denNgay);
        	 var txtNguoiKy = $(nguoiKy);
        	 var txtFileKy = $(fileKy);
        	 txtDonViChucNangQd_pk.val("");
        	 txtCanBoQd_pk.val("");
        	 txtSoQuyetDinh.val("");
        	 txtTenQuyetDinh.val("");
        	 txtLoaiQuyetDinhQd_pk.val("");
        	 txtNoiDungQuyetDinh.val("");
        	 txtNgayKy.val("");
        	 txtTuNgay.val("");
        	 txtDenNgay.val("");
        	 txtNguoiKy.val("");
        	 txtFileKy.val("");
        }); 
    	
	} );
/*  datepicker*/
$.fn.datepicker.defaults.format = "yyyy-mm-dd";
$('.datepicker').datepicker({
		 	startDate: '-3d'
});
	
		 
		
		 