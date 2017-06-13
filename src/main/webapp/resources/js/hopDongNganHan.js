$(document).ready(function() {
		var hopDongNganHanService = "/hopDongNganHanService";
		var hopDongNganHanController = "/hopDongNganHanController";
		var table = $('#HopDongNganHanTable').DataTable({
			"sAjaxSource" : hopDongNganHanService+"/getAll",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"aoColumnDefs": [ 
			      {
				       "aTargets": [ 0 ],
				       "mData": "tenHopDong"
			      },
			      {
					   "aTargets": [ 1 ],
					   "mData": "tenNhanVien"
				  },
				  {
					   "aTargets": [ 2 ],
					   "mData": "ngayKy"
				  },
				  {
					   "aTargets": [ 3 ],
					   "mData": "tuNgay"
				  },
				  {
					   "aTargets": [ 4 ],
					   "mData": "denNgay"
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
			          'excel',
			          'pdf',
			          'print',
			          {
		                 text: 'THÊM HỢP ĐỒNG NGẮN HẠN',
		                 action: function ( e, dt, node, config ) {
		                	 var txtPk = $(pk);
		                	 var txtTenHopDong=$(tenhopdong);
		                     var txtTenNhanVien=$(tennhanvien);
		                     var txtNgayKy=$(dpNgayKy);
		                     var txtTuNgay=$(dpTuNgay);
		                     var txtDenNgay=$(dpDenNgay);
		                     var txtVerSion = $(version);
	                     	 txtPk.val(-1);
	                     	 txtTenHopDong.val("");
                         	 txtTenNhanVien.val("");
                         	 txtNgayKy.val("");
                         	 txtTuNgay.val("");
                         	 txtDenNgay.val("");
                         	 txtVerSion.val("");
		                     $('#formHopDongNganHan').modal('show');
		                 },
		              }
			          ],
		    colReorder: true,
		    select: true,
		    "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
            }
		});
	
		$('#HopDongNganHanTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnDel" == id){
		        var data = table.row($(this).parents('tr')).data();
		        check = confirm("Bạn có chắc chắn muốn xóa đối tượng : " + data['tenNhanVien'])
	            var pK = data['pk'];
		        var version = data['version'];    
	        	if(check==true){
	            	$.ajax({  
	                    url: hopDongNganHanController+"/delete/"+pK+"?version="+version,  
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();	                    }  
	                });
	            }
                    
			}
	    });
		
		$('#HopDongNganHanTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnUpdate" == id){
					var data = table.row($(this).parents('tr')).data();
                    var pK = data['pk'];
                    var txtPk = $(pk);
                    var txtTenHopDong=$(tenhopdong);
                    var txtTenNhanVien=$(tennhanvien);
                    var txtNgayKy=$(dpNgayKy);
                    var txtTuNgay=$(dpTuNgay);
                    var txtDenNgay=$(dpDenNgay);
                    var txtVersion = $(version);
	            	$.ajax({  
	                    url: hopDongNganHanService+"/getById/"+pK,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	txtPk.val(pK);
	                    	txtTenHopDong.val(res.tenHopDong);
	                    	txtTenNhanVien.val(res.tenNhanVien);
	                    	txtNgayKy.val(res.ngayKy);
	                    	txtTuNgay.val(res.tuNgay);
	                    	txtDenNgay.val(res.denNgay);
	                    	txtVersion.val(res.version);
		                    $('#formHopDongNganHan').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("#btnCapNhap").click(function(e) {

    		var endpointUrl = '/hopDongNganHanController/add';
    		var txtPk = $(pk);
    		var txtTenHopDong = $(tenhopdong);
            var txtTenNhanVien = $(tennhanvien);
            var txtNgayKy = $(dpNgayKy);
            var txtTuNgay = $(dpTuNgay);
            var txtDenNgay = $(dpDenNgay);
            var txtVersion = $(version);
            
            var json = new Object();
            json.pk = txtPk.val();
            json.tenHopDong = txtTenHopDong.val();
            json.tenNhanVien = txtTenNhanVien.val();
            json.ngayKy = txtNgayKy.val();
            json.tuNgay= txtTuNgay.val();
            json.denNgay = txtDenNgay.val();
            json.version = txtVersion.val();
            if(txtPk.val() != -1){
            	var endpointUrl = '/hopDongNganHanController/update';
            }
            var invalidFields = $("#formTest").find(":invalid");
            if(invalidFields.length == 0){
	            $.ajax({
	                type : "POST",
	                contentType: "application/json; charset=utf-8",
	                data : JSON.stringify(json),
	                url : endpointUrl,
	                success : function(msg) {
	                	alert("Thành Công");
	        			$('#formHopDongNganHan').modal('toggle');
	                    table.ajax.reload();
	                },
	                error: function (data, textStatus, xhr) {
	        			alert(data.responseText);
	        		}
	            });
            }else {
             	$("#formTest").submit();
            }       
        });
    	
    	$("button#btnDong").click(function(e) {
         	txtTenHopDong.val("");
         	txtTenNhanVien.val("");
         	txtNgayKy.val("");
         	txtTuNgay.val("");
         	txtDenNgay.val("");
        }); 
    	
    	$("#formHopDongNganHan").on('hidden.bs.modal', function () {
            $("#formTest").find('.has-error').removeClass("has-error");
            $("#formTest").find('.has-feedback').removeClass("has-feedback");
        });
    	
} );

/*  datepicker*/
$.fn.datepicker.defaults.format = "yyyy-mm-dd";
	$('.datepicker').datepicker({
		 	startDate: '-3d'
});	 