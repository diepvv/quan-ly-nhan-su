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
		                	 var txtMaLoaiQuyetDinh = $(maLoaiQuyetDinh);
		                	 var txtTenLoaiQuyetDinh=$(tenLoaiQuyetDinh);
		                	 txtMaLoaiQuyetDinh.val(-1);
		                	 txtTenLoaiQuyetDinh.val("");
		                     
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
	        check = confirm("Bạn có chắc chắn muốn xóa đối tượng : "
                    + data['tenLoaiQuyetDinh'])
                    var maLoaiQuyetDinh = data['maLoaiQuyetDinh'];
	            if(check==true){
	            	$.ajax({  
	                    url: loaiQuyetDinhController+"/delete/"+maLoaiQuyetDinh,  
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
                    var maLoaiQD = data['maLoaiQuyetDinh'];
					var txtMaLoaiQuyetDinh = $(maLoaiQuyetDinh);
                	var txtTenLoaiQuyetDinh=$(tenLoaiQuyetDinh);
	            	$.ajax({  
	                    url: loaiQuyetDinhService+"/getById/"+maLoaiQD,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtMaLoaiQuyetDinh.val(maLoaiQD);
		                	 txtTenLoaiQuyetDinh.val(res.tenLoaiQuyetDinh);
		                     $('#formLoaiQuyetDinh').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("button#btnCapNhap").click(function(e) {

    		var endpointUrl = '/loaiQuyetDinhController/add';
    		 var txtMaLoaiQuyetDinh = $(maLoaiQuyetDinh);
        	 var txtTenLoaiQuyetDinh=$(tenLoaiQuyetDinh);
           
            
            var json = new Object();
            json.maLoaiQuyetDinh = txtMaLoaiQuyetDinh.val();
            json.tenLoaiQuyetDinh = txtTenLoaiQuyetDinh.val();
            if(txtMaLoaiQuyetDinh.val() != -1){
            	var endpointUrl = '/loaiQuyetDinhController/update';
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
    		var txtTenLoaiQuyetDinh=$(tenLoaiQuyetDinh);
         	txtTenLoaiQuyetDinh.val("");
        }); 
    	
	} );
	
	
		 
		
		 