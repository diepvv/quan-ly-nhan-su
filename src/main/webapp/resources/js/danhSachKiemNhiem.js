$(document).ready(function() {
		var danhSachKiemNhiemService = "/danhSachKiemNhiemService";
		var danhSachKiemNhiemController = "/danhSachKiemNhiemController";
		var table = $('#DanhSachKiemNhiemTable').DataTable({
			"sAjaxSource" : danhSachKiemNhiemService+"/getAll",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"aoColumnDefs": [ 
			      {
				       "aTargets": [ 0 ],
				       "mData": "canBo.ten"
			      },
			      {
				       "aTargets": [ 1 ],
				       "mData": "chucVuKiemNhiem"
			      },
			      {
				       "aTargets": [ 2 ],
				       "mData": "tuNgay"
			      },
			      {
				       "aTargets": [ 3 ],
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
					   "defaultContent": "<button type='button' class='btn btn-info btn-lg' data-toggle='modal' id='btnUpdate'>Chi Tiết</button>"
				  },
			],
			scrollY : "600px",
			scrollCollapse: true,
			dom: 'Blfrtip',
			buttons: [
			          {
		                 text: 'THÊM MỚI',
		                 action: function ( e, dt, node, config ) {
		                	 var txtPk = $(pk);
		                	 var txtDonViChucNangDskn_pk=$(donViChucNangDskn_pk);
		                	 var txtCanBoDskn_pk = $(canBoDskn_pk);
		                	 var txtChucVuKiemNhiem = $(chucVuKiemNhiem);
		                	 var txtTuNgay = $(tuNgay);
		                	 var txtDenNgay = $(denNgay);
		                	 var txtVersion = $(version);
		                	 txtPk.val(-1);
		                	 txtDonViChucNangDskn_pk.val("");
		                	 txtCanBoDskn_pk.val("");
		                	 txtChucVuKiemNhiem.val("");
		                	 txtTuNgay.val("");
		                	 txtDenNgay.val("");
		                	 txtVersion.val("");
		                     $('#formDanhSachKiemNhiem').modal('show');
		                 },
		              }
			          ],
		    colReorder: true,
		    select: true,
		    "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
            }
		});
	
		$('#DanhSachKiemNhiemTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnDel" == id){
	        var data = table.row($(this).parents('tr')).data();
	        check = confirm("Bạn có chắc chắn muốn xóa Cán Bộ Kiêm Nhiệm : "+ data['pk'])
                var pK = data['pk'];
	        	var version = data['version'];
	            if(check==true){
	            	$.ajax({  
	                    url: danhSachKiemNhiemController+"/delete/"+pK+"?version="+version, 
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();	                    
	                    }  
	                });
	            }
			}
	    });
		
		$('#DanhSachKiemNhiemTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnUpdate" == id){
					 var data = table.row($(this).parents('tr')).data();
                     var pK = data['pk'];
                     var txtPk = $(pk);
	               	 var txtDonViChucNangDskn_pk=$(donViChucNangDskn_pk);
	               	 var txtCanBoDskn_pk = $(canBoDskn_pk);
	               	 var txtChucVuKiemNhiem = $(chucVuKiemNhiem);
	               	 var txtTuNgay = $(tuNgay);
	               	 var txtDenNgay = $(denNgay);
	               	 var txtVersion = $(version);

	            	$.ajax({  
	                    url: danhSachKiemNhiemService+"/getById/"+pK,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtPk.val(pK);
	                    	 txtDonViChucNangDskn_pk.val(res.donViChucNang.pk);
	                    	 if(res.canBo!=null){
		                		 var toAppend = '';
		                         $.each(res.donViChucNang.canBo,function(i,o){
		                        	 if(o.pk==res.canBo.pk){
		                        		 toAppend += '<option value='+o.pk+' selected>'+o.ten+'</option>';
		                        	 } else {	                        		 
		                        		 toAppend += '<option value='+o.pk+'>'+o.ten+'</option>';
		                        	 }
		                        });
		                         txtCanBoDskn_pk.empty();
		                         txtCanBoDskn_pk.append(toAppend);
		                	 }
		                	 txtChucVuKiemNhiem.val(res.chucVuKiemNhiem);
		                	 txtTuNgay.val(res.tuNgay);
		                	 txtDenNgay.val(res.denNgay);
		                	 txtVersion.val(res.version);
		                     $('#formDanhSachKiemNhiem').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("button#btnCapNhap").click(function(e) {
    		var endpointUrl = '/danhSachKiemNhiemController/add';
    		var txtPk = $(pk);
    		var txtDonViChucNangDskn_pk=$(donViChucNangDskn_pk);
          	var txtCanBoDskn_pk = $(canBoDskn_pk);
          	var txtChucVuKiemNhiem = $(chucVuKiemNhiem);
          	var txtTuNgay = $(tuNgay);
          	var txtDenNgay = $(denNgay);
          	var txtVersion = $(version);
          	
	       	var json = new Object();
	        json.pk = txtPk.val();
	        json.donViChucNang = new Object();
	       	json.donViChucNang.pk = txtDonViChucNangDskn_pk.val();
	       	json.canBo = new Object();
	       	json.canBo.pk = txtCanBoDskn_pk.val();
	        json.chucVuKiemNhiem = txtChucVuKiemNhiem.val();
	        json.tuNgay = txtTuNgay.val();
	        json.denNgay = txtDenNgay.val();
	        json.version = txtVersion.val();
        	if(txtPk.val()!= -1){
        		var endpointUrl = '/danhSachKiemNhiemController/update';
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
	        			$('#formDanhSachKiemNhiem').modal('toggle');
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
    		 var txtDonViChucNangDskn_pk=$(donViChucNangDskn_pk);
	       	 var txtCanBoDskn_pk = $(canBoDskn_pk);
	       	 var txtChucVuKiemNhiem = $(chucVuKiemNhiem);
	       	 var txtTuNgay = $(tuNgay);
	       	 var txtDenNgay = $(denNgay);
	       	 txtDonViChucNangDskn_pk.val("");
	       	 txtCanBoDskn_pk.val("");
	       	 txtChucVuKiemNhiem.val("");
	       	 txtTuNgay.val("");
	       	 txtDenNgay.val("");
        }); 
    	
    	$("#formDanhSachKiemNhiem").on('hidden.bs.modal', function () {
            $("#formTest").find('.has-error').removeClass("has-error");
            $("#formTest").find('.has-feedback').removeClass("has-feedback");
        });
    	
    	changeDonViChucNang = function(){
			var donViChucNangPk = $(donViChucNangDskn_pk).val();
			 $.ajax({  
                 url: danhSachKiemNhiemService+"/getCanBoByDonViChucNang/"+donViChucNangPk,  
                 type: 'GET',  
                 success: function (res) {
                	 var toAppend = '';
                     $.each(res,function(i,o){
                    	 toAppend += '<option value='+o.pk+'>'+o.ten+'</option>';
                    });
                   $('#canBoDskn_pk').empty();
                   $('#canBoDskn_pk').append(toAppend);
                 }
			 });
    	}
    	
});
/*  datepicker*/
$.fn.datepicker.defaults.format = "yyyy-mm-dd";
$('.datepicker').datepicker({
		 startDate: '-3d'
}); 