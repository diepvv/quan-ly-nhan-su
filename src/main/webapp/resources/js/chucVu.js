$(document).ready(function() {
		var chucVuService = "/chucVuService";
		var chucVuController = "/chucVuController";
		var table = $('#ChucVuTable').DataTable({
			"sAjaxSource" : chucVuService+"/getAll",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"aoColumnDefs": [ 
			      {
				       "aTargets": [ 0 ],
				       "mData": "tenChucVu"
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
		                 text: 'THÊM CHỨC VỤ',
		                 action: function ( e, dt, node, config ) {
		                	 var txtMaChucVu = $(maChucVu);
		                	 var txtTenChucVu=$(tenChucVu);
		                	 txtMaChucVu.val(-1);
		                	 txtTenChucVu.val("");
		                     
		                     $('#formChucVu').modal('show');
		                 },
		              }
			          ],
		    colReorder: true,
		    select: true,
		    "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
            }
		});
	
		$('#ChucVuTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnDel" == id){
	        var data = table.row($(this).parents('tr')).data();
	        check = confirm("Bạn có chắc chắn muốn xóa đối tượng : "
                    + data['tenChucVu'])
                    var maChucVu = data['maChucVu'];
	            if(check==true){
	            	$.ajax({  
	                    url: chucVuController+"/delete/"+maChucVu,  
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();	                    }  
	                });
	            }
                    
			}
	    });
		
		$('#ChucVuTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnUpdate" == id){
					var data = table.row($(this).parents('tr')).data();
                    var maCV = data['maChucVu'];
					var txtMaChucVu = $(maChucVu);
                	var txtTenChucVu=$(tenChucVu);
	            	$.ajax({  
	                    url: chucVuService+"/getById/"+maCV,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtMaChucVu.val(maCV);
		                	 txtTenChucVu.val(res.tenChucVu);
		                     $('#formChucVu').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("button#btnCapNhap").click(function(e) {

    		var endpointUrl = '/chucVuController/add';
    		 var txtMaChucVu = $(maChucVu);
        	 var txtTenChucVu=$(tenChucVu);
           
            
            var json = new Object();
            json.maChucVu = txtMaChucVu.val();
            json.tenChucVu = txtTenChucVu.val();
            if(txtMaChucVu.val() != -1){
            	var endpointUrl = '/chucVuController/update';
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
    		var txtTenChucVu=$(tenChucVu);
         	txtTenChucVu.val("");
        }); 
    	
	} );
	
	
		 
		
		 