$(document).ready(function() {
		var quyetDinhKhenThuongService = "/quyetDinhKhenThuongService";
		var quyetDinhKhenThuongController = "/quyetDinhKhenThuongController";
		var table = $('#QuyetDinhKhenThuongTable').DataTable({
			"sAjaxSource" : quyetDinhKhenThuongService+"/getAll",
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
		                	 var txtDonViChucNangQdkt_pk=$(donViChucNangQdkt_pk);
		                	 var txtCanBoQdkt_pk = $(canBoQdkt_pk);
		                	 var txtSoQuyetDinh = $(soQuyetDinh);
		                	 var txtTenQuyetDinh = $(tenQuyetDinh);
		                	 var txtNoiDungQuyetDinh = $(noiDungQuyetDinh);
		                	 var txtNgayKy = $(ngayKy);
		                	 var txtNguoiKy = $(nguoiKy);
		                	 var txtFileKy = $(fileKy);

		                	 txtPk.val(-1);
		                	 txtDonViChucNangQdkt_pk.val("");
		                	 txtCanBoQdkt_pk.val("");
		                	 txtSoQuyetDinh.val("");
		                	 txtTenQuyetDinh.val("");
		                	 txtNoiDungQuyetDinh.val("");
		                	 txtNgayKy.val("");
		                	 txtNguoiKy.val("");
		                	 txtFileKy.val("");
		                     $('#formQuyetDinhKhenThuong').modal('show');
		                 },
		              }
			          ],
		    colReorder: true,
		    select: true,
		    "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
            }
		});
	
		$('#QuyetDinhKhenThuongTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnDel" == id){
	        var data = table.row($(this).parents('tr')).data();
	        check = confirm("Bạn có chắc chắn muốn xóa quyết định khen thưởng : "
                    + data['soQuyetDinh'])
                    var pK = data['pk'];
	            if(check==true){
	            	$.ajax({  
	                    url: quyetDinhKhenThuongController+"/delete/"+pK,  
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();	                    }  
	                });
	            }
                    
			}
	    });
		
		$('#QuyetDinhKhenThuongTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnUpdate" == id){
					var data = table.row($(this).parents('tr')).data();
                    var pK = data['pk'];
                    var txtPk = $(pk);
                    var txtDonViChucNangQdkt_pk=$(donViChucNangQdkt_pk);
	               	var txtCanBoQdkt_pk = $(canBoQdkt_pk);
	               	var txtSoQuyetDinh = $(soQuyetDinh);
	               	var txtTenQuyetDinh = $(tenQuyetDinh);
	               	var txtNoiDungQuyetDinh = $(noiDungQuyetDinh);
	               	var txtNgayKy = $(ngayKy);
	               	var txtNguoiKy = $(nguoiKy);
	               	var txtFileKy = $(fileKy);

	            	$.ajax({  
	                    url: quyetDinhKhenThuongService+"/getById/"+pK,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtPk.val(pK);
	                    	 txtDonViChucNangQdkt_pk.val(res.donViChucNangQdkt_pk);
		                	 txtCanBoQdkt_pk.val(res.canBoQdkt_pk);
		                	 txtSoQuyetDinh.val(res.soQuyetDinh);
		                	 txtTenQuyetDinh.val(res.tenQuyetDinh);
		                	 txtNoiDungQuyetDinh.val(res.noiDungQuyetDinh);
		                	 txtNgayKy.val(res.ngayKy);
		                	 txtNguoiKy.val(res.nguoiKy);
		                	 txtFileKy.val(res.fileKy);
		                     $('#formQuyetDinhKhenThuong').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("button#btnCapNhap").click(function(e) {

    	 var endpointUrl = '/quyetDinhKhenThuongController/add';
    	 var txtPk = $(pk);
       	 var txtDonViChucNangQdkt_pk=$(donViChucNangQdkt_pk);
       	 var txtCanBoQdkt_pk = $(canBoQdkt_pk);
       	 var txtSoQuyetDinh = $(soQuyetDinh);
       	 var txtTenQuyetDinh = $(tenQuyetDinh);
       	 var txtNoiDungQuyetDinh = $(noiDungQuyetDinh);
       	 var txtNgayKy = $(ngayKy);
       	 var txtNguoiKy = $(nguoiKy);
       	 var txtFileKy = $(fileKy);
       	 	
       	 var json = new Object();
         json.pk = txtPk.val();
         json.donViChucNangQdkt_pk = txtDonViChucNangQdkt_pk.val();
         json.canBoQdkt_pk = txtCanBoQdkt_pk.val();
         json.soQuyetDinh = txtSoQuyetDinh.val();
         json.tenQuyetDinh = txtTenQuyetDinh.val();
         json.noiDungQuyetDinh = txtNoiDungQuyetDinh.val();
         json.ngayKy = txtNgayKy.val();
         json.nguoiKy = txtNguoiKy.val();
         json.fileKy = txtFileKy.val();

        	if(txtPk.val()!= -1){
             	var endpointUrl = '/quyetDinhKhenThuongController/update';
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
    		 var txtDonViChucNangQdkt_pk=$(donViChucNangQdkt_pk);
          	 var txtCanBoQdkt_pk = $(canBoQdkt_pk);
          	 var txtSoQuyetDinh = $(soQuyetDinh);
          	 var txtTenQuyetDinh = $(tenQuyetDinh);
          	 var txtNoiDungQuyetDinh = $(noiDungQuyetDinh);
          	 var txtNgayKy = $(ngayKy);
          	 var txtNguoiKy = $(nguoiKy);
          	 var txtFileKy = $(fileKy);
          	 txtDonViChucNangQdkt_pk.val("");
	       	 txtCanBoQdkt_pk.val("");
	       	 txtSoQuyetDinh.val("");
	       	 txtTenQuyetDinh.val("");
	       	 txtNoiDungQuyetDinh.val("");
	       	 txtNgayKy.val("");
	       	 txtNguoiKy.val("");
	       	 txtFileKy.val("");
        }); 
    	
	} );
/*  datepicker*/
$.fn.datepicker.defaults.format = "yyyy-mm-dd";
$('.datepicker').datepicker({
		 	startDate: '-3d'
});
	
		 
		
		 