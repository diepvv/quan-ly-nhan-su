$(document).ready(function() {
		var bacLuongService = "/bacLuongService";
		var bacLuongController = "/bacLuongController";
		var table = $('#BacLuongTable').DataTable({
			"sAjaxSource" : bacLuongService+"/getAll",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"aoColumnDefs": [ 
			      {
				       "aTargets": [ 0 ],
				       "mData": "maBacLuong"
			      },
			      {
				       "aTargets": [ 1 ],
				       "mData": "heSoLuong"
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
		                 text: 'THÊM BẬC LƯƠNG',
		                 action: function ( e, dt, node, config ) {
		                	 var txtPk = $(pk);
		                	 var txtMaBacLuong = $(maBacLuong);
		                	 var txtHeSoLuong=$(heSoLuong);
		                	 txtPk.val(-1);
		                	 txtMaBacLuong.val("");
		                	 txtHeSoLuong.val("");
		                     
		                     $('#formBacLuong').modal('show');
		                 },
		              }
			          ],
		    colReorder: true,
		    select: true,
		    "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
            }
		});
	
		$('#BacLuongTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnDel" == id){
	        var data = table.row($(this).parents('tr')).data();
	        check = confirm("Bạn có chắc chắn muốn xóa đối tượng Mã Bậc Lương: "
                    + data['maBacLuong'] + "Có hệ số lương" + data['heSoLuong'])
                    var pK = data['pk'];
	            if(check==true){
	            	$.ajax({  
	                    url: bacLuongController+"/delete/"+pK,  
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();	                    }  
	                });
	            }
                    
			}
	    });
		
		$('#BacLuongTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnUpdate" == id){
					var data = table.row($(this).parents('tr')).data();
                    var pK = data['pk'];
                    var txtPk = $(pk);
					var txtMaBacLuong = $(maBacLuong);
                	var txtHeSoLuong=$(heSoLuong);
	            	$.ajax({  
	                    url: bacLuongService+"/getById/"+pK,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtPk.val(pK);
	                    	 txtMaBacLuong.val(res.maBacLuong);
		                	 txtHeSoLuong.val(res.heSoLuong);
		                     $('#formBacLuong').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("button#btnCapNhap").click(function(e) {
    		var endpointUrl = '/bacLuongController/add';
    		var txtPk = $(pk);
    		var txtMaBacLuong = $(maBacLuong);
        	var txtHeSoLuong=$(heSoLuong);
            
            var json = new Object();
            json.pk = txtPk.val();
            json.maBacLuong = txtMaBacLuong.val();
            json.heSoLuong = txtHeSoLuong.val();
            if(txtPk.val() != -1){
            	var endpointUrl = '/bacLuongController/update';
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
       	    var txtMaBacLuong = $(maBacLuong);
    		var txtHeSoLuong=$(heSoLuong);
         	txtHeSoLuong.val("");
       	    txtMaBacLuong.val("");
        }); 
    	
	} );
	
	
		 
		
		 