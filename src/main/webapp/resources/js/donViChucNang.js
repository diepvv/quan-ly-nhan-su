$(document).ready(function() {
		var donViChucNangService = "/donViChucNangService";
		var donViChucNangController = "/donViChucNangController";
		var table = $('#DonViChucNangTable').DataTable({
			"sAjaxSource" : donViChucNangService+"/getAll",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"aoColumnDefs": [ 
			      {
				       "aTargets": [ 0 ],
				       "mData": "tenDonVi"
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
		                 text: 'THÊM ĐƠN VỊ',
		                 action: function ( e, dt, node, config ) {
		                	 var txtMaDonVi = $(maDonVi);
		                	 var txtTenDonVi=$(tenDonVi);
		                	 txtMaDonVi.val(-1);
		                	 txtTenDonVi.val("");
		                     
		                     $('#formDonViChucNang').modal('show');
		                 },
		              }
			          ],
		    colReorder: true,
		    select: true,
		    "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
            }
		});
	
		$('#DonViChucNangTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnDel" == id){
	        var data = table.row($(this).parents('tr')).data();
	        check = confirm("Bạn có chắc chắn muốn xóa đối tượng : "
                    + data['tenDonVi'])
                    var maDonVi = data['maDonVi'];
	            if(check==true){
	            	$.ajax({  
	                    url: donViChucNangController+"/delete/"+maDonVi,  
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();	                    }  
	                });
	            }
                    
			}
	    });
		
		$('#DonViChucNangTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnUpdate" == id){
					var data = table.row($(this).parents('tr')).data();
                    var maDonViChucNang = data['maDonVi'];
					var txtMaDonVi = $(maDonVi);
                	var txtTenDonVi=$(tenDonVi);
	            	$.ajax({  
	                    url: donViChucNangService+"/getById/"+maDonViChucNang,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtMaDonVi.val(maDonViChucNang);
		                	 txtTenDonVi.val(res.tenDonVi);
		                     $('#formDonViChucNang').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("button#btnCapNhap").click(function(e) {

    		var endpointUrl = '/donViChucNangController/add';
    		 var txtMaDonVi = $(maDonVi);
        	 var txtTenDonVi=$(tenDonVi);
           
            
            var json = new Object();
            json.maDonVi = txtMaDonVi.val();
            json.tenDonVi = txtTenDonVi.val();
            if(txtMaDonVi.val() != -1){
            	var endpointUrl = '/donViChucNangController/update';
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
    		var txtTenDonVi=$(tenDonVi);
         	txtTenDonVi.val("");
        }); 
    	
	} );
	
	
		 
		
		 