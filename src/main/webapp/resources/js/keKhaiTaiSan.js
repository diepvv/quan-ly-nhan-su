$(document).ready(function() {
		var keKhaiTaiSanService = "/keKhaiTaiSanService";
		var keKhaiTaiSanController = "/keKhaiTaiSanController";
		var table = $('#KeKhaiTaiSanTable').DataTable({
			"sAjaxSource" : keKhaiTaiSanService+"/getAll",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"aoColumnDefs": [ 
			      {
				       "aTargets": [ 0 ],
				       "mData": "canBo.ten"
			      },
			      {
				       "aTargets": [ 1 ],
				       "mData": "ngayKeKhai"
			      },
			      {
				       "aTargets": [ 2 ],
				       "mData": "fileKeKhai"
			      },
				  {
				       "targets": -1,
				       "data": null,
				       "defaultContent": "<button type='button' class='btn btn-info btn-lg' data-toggle='modal' id='btnDel'>Xóa</button>"
			      },
			      {
					   "targets": -2,
					   "data": null,
					   "defaultContent": "<button type='button' class='btn btn-info btn-lg' data-toggle='modal' id='btnUpdate'>Sửa</button>"
				  },
			],
			scrollY : "600px",
			scrollCollapse: true,
			dom: 'Blfrtip',
			buttons: [
			          {
		                 text: 'THÊM BẢN KÊ KHAI MỚI',
		                 action: function ( e, dt, node, config ) {
		                	 var txtPk = $(pk);
		                	 var txtDonViChucNangKkts_pk=$(donViChucNangKkts_pk);
		                	 var txtCanBoKkts_pk=$(canBoKkts_pk);
		                	 var txtNgayKeKhai=$(ngayKeKhai);
		                	 var txtFileKeKhai=$(fileKeKhai);
		                	 txtPk.val(-1);
		                	 txtDonViChucNangKkts_pk.val("");
		                	 txtCanBoKkts_pk.val("");
		                	 txtNgayKeKhai.val("");
		                	 txtFileKeKhai.val("");
		                     $('#formKeKhaiTaiSan').modal('show');
		                 },
		              }
			          ],
		    colReorder: true,
		    select: true,
		    "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
            }
		});
	
		$('#KeKhaiTaiSanTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnDel" == id){
	        var data = table.row($(this).parents('tr')).data();
	        check = confirm("Bạn có chắc chắn muốn xóa bản kê khai đã chọn")
                    var pK = data['pk'];
	            if(check==true){
	            	$.ajax({  
	                    url: keKhaiTaiSanController+"/delete/"+pK,  
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();	                    }  
	                });
	            }
                    
			}
	    });
		
		$('#KeKhaiTaiSanTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnUpdate" == id){
					var data = table.row($(this).parents('tr')).data();
                    var pK = data['pk'];
                    var txtPk = $(pk);
               	 	var txtDonViChucNangKkts_pk=$(donViChucNangKkts_pk);
               	 	var txtCanBoKkts_pk=$(canBoKkts_pk);
               	 	var txtNgayKeKhai=$(ngayKeKhai);
               	 	var txtFileKeKhai=$(fileKeKhai);
	            	$.ajax({  
	                    url: keKhaiTaiSanService+"/getById/"+pK,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtPk.val(pK);
	                    	 txtDonViChucNangKkts_pk.val(res.donViChucNangKkts_pk);
	                    	 txtCanBoKkts_pk.val(res.canBoKkts_pk);
	                    	 txtNgayKeKhai.val(res.ngayKeKhai);
	                    	 txtFileKeKhai.val(res.fileKeKhai);
		                     $('#formKeKhaiTaiSan').modal('show');
	                    }
	                });
			}	
	    });
		
    	$("button#btnCapNhap").click(function(e) {
    		 var endpointUrl = '/keKhaiTaiSanController/add';
    		 var txtPk = $(pk);
        	 var txtDonViChucNangKkts_pk=$(donViChucNangKkts_pk);
        	 var txtCanBoKkts_pk=$(canBoKkts_pk);
        	 var txtNgayKeKhai=$(ngayKeKhai);
        	 var txtFileKeKhai=$(fileKeKhai);
            
             var json = new Object();
             json.pk = txtPk.val();
             json.donViChucNangKkts_pk = txtDonViChucNangKkts_pk.val();
             json.canBoKkts_pk = txtCanBoKkts_pk.val();
             json.ngayKeKhai = txtNgayKeKhai.val();
             json.fileKeKhai = txtFileKeKhai.val();

             if(txtPk.val() != -1){
            	var endpointUrl = '/keKhaiTaiSanController/update';
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
    		 var txtDonViChucNangKkts_pk=$(donViChucNangKkts_pk);
	       	 var txtCanBoKkts_pk=$(canBoKkts_pk);
	       	 var txtNgayKeKhai=$(ngayKeKhai);
	       	 var txtFileKeKhai=$(fileKeKhai);
	       	 txtDonViChucNangKkts_pk.val("");
	       	 txtCanBoKkts_pk.val("");
	       	 txtNgayKeKhai.val("");
	       	 txtFileKeKhai.val("");
        }); 
    	
	} );
/*  datepicker*/
$.fn.datepicker.defaults.format = "yyyy-mm-dd";
$('.datepicker').datepicker({
		 	startDate: '-3d'
});
	
		 
		
		 