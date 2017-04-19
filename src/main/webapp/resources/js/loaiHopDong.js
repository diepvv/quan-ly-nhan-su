$(document).ready(function() {
		var loaiHopDongService = "/loaiHopDongService";
		var loaiHopDongController = "/loaiHopDongController";
		var table = $('#LoaiHopDongTable').DataTable({
			"sAjaxSource" : loaiHopDongService+"/getAll",
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
		                 text: 'THÊM LOẠI HỢP ĐỒNG',
		                 action: function ( e, dt, node, config ) {
		                	 var txtMaLoaiHopDong = $(maLoaiHopDong);
		                	 var txtTenLoaiHopDong=$(tenLoaiHopDong);
		                	 txtMaLoaiHopDong.val(-1);
		                	 txtTenLoaiHopDong.val("");
		                     
		                     $('#formLoaiHopDong').modal('show');
		                 },
		              }
			          ],
		    colReorder: true,
		    select: true,
		    "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
            }
		});
	
		$('#LoaiHopDongTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnDel" == id){
	        var data = table.row($(this).parents('tr')).data();
	        check = confirm("Bạn có chắc chắn muốn xóa đối tượng : "
                    + data['tenLoaiHopDong'])
                    var maLoaiHopDong = data['maLoaiHopDong'];
	            if(check==true){
	            	$.ajax({  
	                    url: loaiHopDongController+"/delete/"+maLoaiHopDong,  
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();	                    }  
	                });
	            }
                    
			}
	    });
		
		$('#LoaiHopDongTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnUpdate" == id){
					var data = table.row($(this).parents('tr')).data();
                    var maLoaiHD = data['maLoaiHopDong'];
					var txtMaLoaiHopDong = $(maLoaiHopDong);
                	var txtTenLoaiHopDong=$(tenLoaiHopDong);
	            	$.ajax({  
	                    url: loaiHopDongService+"/getById/"+maLoaiHD,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtMaLoaiHopDong.val(maLoaiHD);
		                	 txtTenLoaiHopDong.val(res.tenLoaiHopDong);
		                     $('#formLoaiHopDong').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("button#btnCapNhap").click(function(e) {

    		var endpointUrl = '/loaiHopDongController/add';
    		 var txtMaLoaiHopDong = $(maLoaiHopDong);
        	 var txtTenLoaiHopDong=$(tenLoaiHopDong);
           
            
            var json = new Object();
            json.maLoaiHopDong = txtMaLoaiHopDong.val();
            json.tenLoaiHopDong = txtTenLoaiHopDong.val();
            if(txtMaLoaiHopDong.val() != -1){
            	var endpointUrl = '/loaiHopDongController/update';
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
    		var txtTenLoaiHopDong=$(tenLoaiHopDong);
         	txtTenLoaiHopDong.val("");
        }); 
    	
	} );
	
	
		 
		
		 