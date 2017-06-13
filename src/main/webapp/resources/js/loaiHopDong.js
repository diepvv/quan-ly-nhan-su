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
				       "mData": "tenLoaiHopDong"
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
		                	 var txtPk = $(pk);
		                	 var txtTenLoaiHopDong=$(tenLoaiHopDong);
		                	 var txtVersion = $(version);
		                	 txtPk.val(-1);
		                	 txtTenLoaiHopDong.val("");
		                	 txtVersion.val("");
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
		        check = confirm("Bạn có chắc chắn muốn xóa đối tượng : " + data['tenLoaiHopDong'])
	            var pK = data['pk'];
		        var version = data['version'];
	            if(check==true){
	            	$.ajax({  
	                    url: loaiHopDongController+"/delete/"+pK+"?version="+version,  
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	table.ajax.reload();	                    }  
	                });
	            }
			}
	    });
		
		$('#LoaiHopDongTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnUpdate" == id){
				var data = table.row($(this).parents('tr')).data();
                var pK = data['pk'];
				var txtPk = $(pk);
				var txtVersion = $(version);
            	var txtTenLoaiHopDong=$(tenLoaiHopDong);
            	$.ajax({  
                    url: loaiHopDongService+"/getById/"+pK,  
                    type: 'GET',  
                    success: function (res) {
                    	 txtPk.val(pK);
	                	 txtTenLoaiHopDong.val(res.tenLoaiHopDong);
	                	 txtVersion.val(res.version);
	                     $('#formLoaiHopDong').modal('show');
                    }
                });
			}	
	    });
		
		
		//twitter bootstrap btnCapNhap
    	$("button#btnCapNhap").click(function(e) {
    		var endpointUrl = '/loaiHopDongController/add';
    		var txtPk = $(pk);
        	var txtTenLoaiHopDong=$(tenLoaiHopDong);
			var txtVersion = $(version);
            
            var json = new Object();
            json.pk = txtPk.val();
            json.tenLoaiHopDong = txtTenLoaiHopDong.val();
            json.version = txtVersion.val();
            if(txtPk.val() != -1){
            	endpointUrl = '/loaiHopDongController/update';
            }
            var invalidFields = $("#formTest").find(":invalid");
            if(invalidFields.length == 0){
            	$.ajax({
            		type : "POST",
            		contentType: "application/json; charset=utf-8",
            		data : JSON.stringify(json),
            		url : endpointUrl,
            		success : function(msg) {
            			// close modal dialog
            			$('#formLoaiHopDong').modal('toggle');
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
    		var txtTenLoaiHopDong=$(tenLoaiHopDong);
         	txtTenLoaiHopDong.val("");
        });
    	
    	$("#formLoaiHopDong").on('hidden.bs.modal', function () {
            $("#formTest").find('.has-error').removeClass("has-error");
            $("#formTest").find('.has-feedback').removeClass("has-feedback");
        });
    	
	}); 