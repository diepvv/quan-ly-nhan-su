$(document).ready(function() {
		var loaiQuyetDinhService = "/loaiQuyetDinhService";
		var loaiQuyetDinhController = "/loaiQuyetDinhController";
		var table = $('#LoaiQuyetDinhTable').DataTable({
			"sAjaxSource" : loaiQuyetDinhService+"/getAll",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"aoColumnDefs": [ 
			      {
				       "aTargets": [ 0 ],
				       "mData": "tenLoaiQuyetDinh"
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
		                 text: 'THÊM LOẠI QUYẾT ĐỊNH',
		                 action: function ( e, dt, node, config ) {
		                	 var txtPk = $(pk);
		                	 var txtTenLoaiQuyetDinh=$(tenLoaiQuyetDinh);
		                	 var txtVersion = $(version);
		                	 txtPk.val(-1);
		                	 txtTenLoaiQuyetDinh.val("");
		                	 txtVersion.val("");
		                     $('#formLoaiQuyetDinh').modal('show');
		                 },
		              }
			          ],
		    colReorder: true,
		    select: true,
		    "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
            }
		});
	
		$('#LoaiQuyetDinhTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnDel" == id){
	        var data = table.row($(this).parents('tr')).data();
	        check = confirm("Bạn có chắc chắn muốn xóa đối tượng : "+ data['tenLoaiQuyetDinh'])
                var pK = data['pk'];
	        	var version = data['version'];
	            if(check==true){
	            	$.ajax({  
	                    url: loaiQuyetDinhController+"/delete/"+pK+"?version="+version,  
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();	                    }  
	                });
	            }
                    
			}
	    });
		
		$('#LoaiQuyetDinhTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnUpdate" == id){
					var data = table.row($(this).parents('tr')).data();
                    var pK = data['pk'];
					var txtPk = $(pk);
                	var txtTenLoaiQuyetDinh=$(tenLoaiQuyetDinh);
                	var txtVersion = $(version); 
                	$.ajax({  
	                    url: loaiQuyetDinhService+"/getById/"+pK,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtPk.val(pK);
		                	 txtTenLoaiQuyetDinh.val(res.tenLoaiQuyetDinh);
		                	 txtVersion.val(res.version);
		                	 $('#formLoaiQuyetDinh').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("button#btnCapNhap").click(function(e) {

    		 var endpointUrl = '/loaiQuyetDinhController/add';
    		 var txtPk = $(pk);
        	 var txtTenLoaiQuyetDinh=$(tenLoaiQuyetDinh);
        	 var txtVersion = $(version);
           
            
            var json = new Object();
            json.pk = txtPk.val();
            json.tenLoaiQuyetDinh = txtTenLoaiQuyetDinh.val();
            json.version = txtVersion.val();
            if(txtPk.val() != -1){
            	var endpointUrl = '/loaiQuyetDinhController/update';
            }
            var invalidFields = $("#formTest").find(":invalid");
            if(invalidFields.length == 0){
	            $.ajax({
	                type : "POST",
	                contentType: "application/json; charset=utf-8",
	                data : JSON.stringify(json),
	                url : endpointUrl,
	                success : function(msg) {
	                	 $('#formLoaiQuyetDinh').modal('toggle');
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
    		var txtTenLoaiQuyetDinh=$(tenLoaiQuyetDinh);
         	txtTenLoaiQuyetDinh.val("");
        }); 
    	$("#formLoaiQuyetDinh").on('hidden.bs.modal', function () {
            $("#formTest").find('.has-error').removeClass("has-error");
            $("#formTest").find('.has-feedback').removeClass("has-feedback");
        });
} );