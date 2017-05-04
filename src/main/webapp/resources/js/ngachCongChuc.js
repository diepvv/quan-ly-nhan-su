$(document).ready(function() {
		var ngachCongChucService = "/ngachCongChucService";
		var ngachCongChucController = "/ngachCongChucController";
		var table = $('#NgachCongChucTable').DataTable({
			"sAjaxSource" : ngachCongChucService+"/getAll",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"aoColumnDefs": [ 
			      {
				       "aTargets": [ 0 ],
				       "mData": "maNgach"
			      },
			      {
				       "aTargets": [ 1 ],
				       "mData": "tenNgach"
			      },
			      {
				       "aTargets": [ 2 ],
				       "mData": "soNamNangBacLuong"
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
		                 text: 'THÊM NGẠCH CÔNG CHỨC',
		                 action: function ( e, dt, node, config ) {
		                	 var txtPk = $(pk);
		                	 var txtMaNgach = $(maNgach);
		                	 var txtTenNgach=$(tenNgach);
		                	 var txtSoNamNangBacLuong = $(soNamNangBacLuong);
		                	 txtPk.val(-1);
		                	 txtMaNgach.val("");
		                	 txtTenNgach.val("");
		                	 txtSoNamNangBacLuong.val("");
		                     
		                     $('#formNgachCongChuc').modal('show');
		                 },
		              }
			          ],
		    colReorder: true,
		    select: true,
		    "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
            }
		});
	
		$('#NgachCongChucTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnDel" == id){
	        var data = table.row($(this).parents('tr')).data();
	        check = confirm("Bạn có chắc chắn muốn xóa mã ngạch : "
                    + data['maNgach'])
                     var pK = data['pk'];
	            if(check==true){
	            	$.ajax({  
	                    url: ngachCongChucController+"/delete/"+pK,  
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();	                    }  
	                });
	            }
                    
			}
	    });
		
		$('#NgachCongChucTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnUpdate" == id){
					var data = table.row($(this).parents('tr')).data();
					var pK = data['pk'];
					var txtPk = $(pk);
                    var txtMaNgach = $(maNgach);
               	 	var txtTenNgach=$(tenNgach);
               	 	var txtSoNamNangBacLuong = $(soNamNangBacLuong);
	            	$.ajax({  
	                    url: ngachCongChucService+"/getById/"+pK,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtPk.val(pK);
	                    	 txtMaNgach.val(res.maNgach);
		                	 txtTenNgach.val(res.tenNgach);
		                	 txtSoNamNangBacLuong.val(res.soNamNangBacLuong);
		                     $('#formNgachCongChuc').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("button#btnCapNhap").click(function(e) {

    		var endpointUrl = '/ngachCongChucController/add';
    		 var txtPk = $(pk);
    		 var txtMaNgach = $(maNgach);
        	 var txtTenNgach=$(tenNgach);
        	 var txtSoNamNangBacLuong = $(soNamNangBacLuong);
        	
            var json = new Object();
            json.pk = txtPk.val();
            json.maNgach = txtMaNgach.val();
            json.tenNgach = txtTenNgach.val();
            json.soNamNangBacLuong = txtSoNamNangBacLuong.val();
            if(txtPk.val() != -1){
            	var endpointUrl = '/ngachCongChucController/update';
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
         	 var txtMaNgach = $(maNgach);
	       	 var txtTenNgach=$(tenNgach);
	       	 var txtSoNamNangBacLuong = $(soNamNangBacLuong);
	       	 txtMaNgach.val("");
	       	 txtTenNgach.val("");
	       	 txtSoNamNangBacLuong.val("");
        }); 
    	
	} );
	
	
		 
		
		 