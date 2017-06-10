$(document).ready(function() {
		var hopDongCanBoService = "/hopDongCanBoService";
		var hopDongCanBoController = "/hopDongCanBoController";
		var table = $('#HopDongCanBoTable').DataTable({
			"sAjaxSource" : hopDongCanBoService+"/getAll",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"aoColumnDefs": [ 
			      {
				       "aTargets": [ 0 ],
				       "mData": "canBo.ten"
			      },
			      {
					   "aTargets": [ 1 ],
					   "mData": "maHopDong"
				  },
				  {
					   "aTargets": [ 2 ],
					   "mData": "tenHopDong"
				  },
				  {
					   "aTargets": [ 3 ],
					   "mData": "loaiHopDong.tenLoaiHopDong"
				  },
				  {
					   "aTargets": [ 4 ],
					   "mData": "ngayKy"
				  },
				  {
					   "aTargets": [ 5 ],
					   "mData": "denNgay"
				  },
				  {
					   "aTargets": [ 6 ],
					   "mData": "trichYeuNoiDung"
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
		                 text: 'THÊM MỚI',
		                 action: function ( e, dt, node, config ) {
			                	 var txtPk = $(pk);
			                	 var txtDonViChucNangHdcb_pk=$(donViChucNangHdcb_pk);
			                     var txtCanBoHdcb_pk=$(canBoHdcn_pk);
			                     var txtMaHopDong=$(maHopDong);
			                     var txtTenHopDong=$(tenHopDong);
			                     var txtChucVu=$(chucVu);
			                     var txtLoaiHopDongHdcb_pk=$(loaiHopDongHdcb_pk);
			                     var txtNgayKy=$(ngayKy);
			                     var txtTuNgay=$(tuNgay);
			                     var txtDenNgay=$(denNgay);
			                     var txtTrichYeuNoiDung=$(trichYeuNoiDung);
			                     var txtFileHD=$(fileHD);
			                     var txtVersion = $(version);

		                     	 txtPk.val(-1);
		                     	 txtDonViChucNangHdcb_pk.val("");
		                     	 txtCanBoHdcb_pk.val("");
		                     	 txtMaHopDong.val("");
		                     	 txtTenHopDong.val("");
		                     	 txtChucVu.val("");
		                     	 txtLoaiHopDongHdcb_pk.val("");
		                     	 txtNgayKy.val("");
		                     	 txtTuNgay.val("");
		                     	 txtDenNgay.val("");
		                     	 txtTrichYeuNoiDung.val("");
		                     	 txtFileHD.val("");
			                	 txtVersion.val("");
			                	 $('#formHopDongCanBo').modal('show');
		                 },
		              }
			          ],
		    colReorder: true,
		    select: true,
		    "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
            }
		});
	
		$('#HopDongCanBoTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnDel" == id){
	        var data = table.row($(this).parents('tr')).data();
	        check = confirm("Bạn có chắc chắn muốn xóa hợp đồng : "+ data['maHopDong'])
                var pK = data['pk'];
	        	var version = data['version'];
	            if(check==true){
	            	$.ajax({  
	                    url: hopDongCanBoController+"/delete/"+pK+"?version="+version,   
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();	                    }  
	                });
	            }
                    
			}
	    });
		
		$('#HopDongCanBoTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnUpdate" == id){
					var data = table.row($(this).parents('tr')).data();
                    var pK = data['pk'];
                    var txtPk = $(pk);
               	    var txtDonViChucNangHdcb_pk=$(donViChucNangHdcb_pk);
                    var txtCanBoHdcb_pk=$(canBoHdcn_pk);
                    var txtMaHopDong=$(maHopDong);
                    var txtTenHopDong=$(tenHopDong);
                    var txtChucVu=$(chucVu);
                    var txtLoaiHopDongHdcb_pk=$(loaiHopDongHdcb_pk);
                    var txtNgayKy=$(ngayKy);
                    var txtTuNgay=$(tuNgay);
                    var txtDenNgay=$(denNgay);
                    var txtTrichYeuNoiDung=$(trichYeuNoiDung);
                    var txtFileHD=$(fileHD);
	               	var txtVersion = $(version);

	            	$.ajax({  
	                    url: hopDongCanBoService+"/getById/"+pK,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtPk.val(pK);
	                    	 txtDonViChucNangHdcb_pk.val(res.donViChucNang.pk);
	                    	 if(res.canBo!=null){
		                		 var toAppend = '';
		                         $.each(res.donViChucNang.canBo,function(i,o){
		                        	 if(o.pk==res.canBo.pk){
		                        		 toAppend += '<option value='+o.pk+' selected>'+o.ten+'</option>';
		                        	 } else {	                        		 
		                        		 toAppend += '<option value='+o.pk+'>'+o.ten+'</option>';
		                        	 }
		                        });
		                         txtCanBoHdcb_pk.empty();
		                         txtCanBoHdcb_pk.append(toAppend);
		                	 }
	                     	 txtMaHopDong.val(res.maHopDong);
	                     	 txtTenHopDong.val(res.tenHopDong);
	                     	 txtChucVu.val(res.chucVu);
	                     	 txtLoaiHopDongHdcb_pk.val(res.loaiHopDong.pk);
	                     	 txtNgayKy.val(res.ngayKy);
	                     	 txtTuNgay.val(res.tuNgay);
	                     	 txtDenNgay.val(res.denNgay);
	                     	 txtTrichYeuNoiDung.val(res.trichYeuNoiDung);
	                     	 txtFileHD.val(res.fileHD);
		                	 txtVersion.val(res.version);
		                     $('#formHopDongCanBo').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("button#btnCapNhap").click(function(e) {

    		var endpointUrl = '/hopDongCanBoController/add';
    		var txtPk = $(pk);
       	    var txtDonViChucNangHdcb_pk=$(donViChucNangHdcb_pk);
            var txtCanBoHdcb_pk=$(canBoHdcn_pk);
            var txtMaHopDong=$(maHopDong);
            var txtTenHopDong=$(tenHopDong);
            var txtChucVu=$(chucVu);
            var txtLoaiHopDongHdcb_pk=$(loaiHopDongHdcb_pk);
            var txtNgayKy=$(ngayKy);
            var txtTuNgay=$(tuNgay);
            var txtDenNgay=$(denNgay);
            var txtTrichYeuNoiDung=$(trichYeuNoiDung);
            var txtFileHD=$(fileHD);
            var txtVersion = $(version);
            
            var json = new Object();
            json.pk = txtPk.val();
            json.donViChucNang = new Object();
	       	json.donViChucNang.pk = txtDonViChucNangHdcb_pk.val();
	       	json.canBo = new Object();
	       	json.canBo.pk = txtCanBoHdcb_pk.val();
            json.maHopDong = txtMaHopDong.val();
            json.tenHopDong= txtTenHopDong.val();
            json.chucVu = txtChucVu.val();
            json.loaiHopDong = new Object();
            json.loaiHopDong.pk = txtLoaiHopDongHdcb_pk.val();
            json.ngayKy = txtNgayKy.val();
            json.tuNgay = txtTuNgay.val();
            json.denNgay = txtDenNgay.val();
            json.trichYeuNoiDung = txtTrichYeuNoiDung.val();
            json.fileHD = txtFileHD.val();
	        json.version = txtVersion.val();

            if(txtPk.val() != -1){
            	var endpointUrl = '/hopDongCanBoController/update';
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
	        			$('#formHopDongCanBo').modal('toggle');
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
    		var txtDonViChucNangHdcb_pk=$(donViChucNangHdcb_pk);
            var txtCanBoHdcb_pk=$(canBoHdcn_pk);
            var txtMaHopDong=$(maHopDong);
            var txtTenHopDong=$(tenHopDong);
            var txtChucVu=$(chucVu);
            var txtLoaiHopDongHdcb_pk=$(loaiHopDongHdcb_pk);
            var txtNgayKy=$(ngayKy);
            var txtTuNgay=$(tuNgay);
            var txtDenNgay=$(denNgay);
            var txtTrichYeuNoiDung=$(trichYeuNoiDung);
            var txtFileHD=$(fileHD);
        	txtDonViChucNangHdcb_pk.val("");
        	txtCanBoHdcb_pk.val("");
        	txtMaHopDong.val("");
        	txtTenHopDong.val("");
        	txtChucVu.val("");
        	txtLoaiHopDongHdcb_pk.val("");
        	txtNgayKy.val("");
        	txtTuNgay.val("");
        	txtDenNgay.val("");
        	txtTrichYeuNoiDung.val("");
        	txtFileHD.val("");
        }); 
    	
    	$("#formHopDongCanBo").on('hidden.bs.modal', function () {
            $("#formTest").find('.has-error').removeClass("has-error");
            $("#formTest").find('.has-feedback').removeClass("has-feedback");
        });
    	
    	changeDonViChucNang = function(){
			var donViChucNangPk = $(donViChucNangHdcb_pk).val();
			 $.ajax({  
                 url: hopDongCanBoService+"/getCanBoByDonViChucNang/"+donViChucNangPk,  
                 type: 'GET',  
                 success: function (res) {
                	 var toAppend = '';
                     $.each(res,function(i,o){
                    	 toAppend += '<option value='+o.pk+'>'+o.ten+'</option>';
                    });
                   $('#canBoHdcn_pk').empty();
                   $('#canBoHdcn_pk').append(toAppend);
                 }
			 });
    	}
    	
} );
/*  datepicker*/
$.fn.datepicker.defaults.format = "yyyy-mm-dd";
	$('.datepicker').datepicker({
		 	startDate: '-3d'
});