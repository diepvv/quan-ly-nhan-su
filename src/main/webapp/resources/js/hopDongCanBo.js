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
			                     var txtCanBoQdkl_pk=$(canBoQdkl_pk);
			                     var txtMaHopDong=$(maHopDong);
			                     var txtTenHopDong=$(tenHopDong);
			                     var txtChucVu=$(chucVu);
			                     var txtLoaiHopDongHdcb_pk=$(loaiHopDongHdcb_pk);
			                     var txtNgayKy=$(ngayKy);
			                     var txtTuNgay=$(tuNgay);
			                     var txtDenNgay=$(denNgay);
			                     var txtTrichYeuNoiDung=$(trichYeuNoiDung);
			                     var txtFileHD=$(fileHD);

		                     	 txtPk.val(-1);
		                     	 txtDonViChucNangHdcb_pk.val("");
		                     	 txtCanBoQdkl_pk.val("");
		                     	 txtMaHopDong.val("");
		                     	 txtTenHopDong.val("");
		                     	 txtChucVu.val("");
		                     	 txtLoaiHopDongHdcb_pk.val("");
		                     	 txtNgayKy.val("");
		                     	 txtTuNgay.val("");
		                     	 txtDenNgay.val("");
		                     	 txtTrichYeuNoiDung.val("");
		                     	 txtFileHD.val("");
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
	        check = confirm("Bạn có chắc chắn muốn xóa hợp đồng : "
                    + data['maHopDong'])
                    var Pk = data['pk'];
	            if(check==true){
	            	$.ajax({  
	                    url: hopDongCanBoController+"/delete/"+Pk,  
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
                    var Pk = data['pk'];
                    var txtPk = $(pk);
               	    var txtDonViChucNangHdcb_pk=$(donViChucNangHdcb_pk);
                    var txtCanBoQdkl_pk=$(canBoQdkl_pk);
                    var txtMaHopDong=$(maHopDong);
                    var txtTenHopDong=$(tenHopDong);
                    var txtChucVu=$(chucVu);
                    var txtLoaiHopDongHdcb_pk=$(loaiHopDongHdcb_pk);
                    var txtNgayKy=$(ngayKy);
                    var txtTuNgay=$(tuNgay);
                    var txtDenNgay=$(denNgay);
                    var txtTrichYeuNoiDung=$(trichYeuNoiDung);
                    var txtFileHD=$(fileHD);
	            	$.ajax({  
	                    url: hopDongCanBoService+"/getById/"+Pk,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtPk.val(Pk);
	                    	 txtDonViChucNangHdcb_pk.val(res.donViChucNangHdcb_pk);
	                     	 txtCanBoQdkl_pk.val(res.canBoQdkl_pk);
	                     	 txtMaHopDong.val(res.maHopDong);
	                     	 txtTenHopDong.val(res.tenHopDong);
	                     	 txtChucVu.val(res.chucVu);
	                     	 txtLoaiHopDongHdcb_pk.val(res.loaiHopDongHdcb_pk);
	                     	 txtNgayKy.val(res.ngayKy);
	                     	 txtTuNgay.val(res.tuNgay);
	                     	 txtDenNgay.val(res.denNgay);
	                     	 txtTrichYeuNoiDung.val(res.trichYeuNoiDung);
	                     	 txtFileHD.val(res.fileHD);
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
            var txtCanBoQdkl_pk=$(canBoQdkl_pk);
            var txtMaHopDong=$(maHopDong);
            var txtTenHopDong=$(tenHopDong);
            var txtChucVu=$(chucVu);
            var txtLoaiHopDongHdcb_pk=$(loaiHopDongHdcb_pk);
            var txtNgayKy=$(ngayKy);
            var txtTuNgay=$(tuNgay);
            var txtDenNgay=$(denNgay);
            var txtTrichYeuNoiDung=$(trichYeuNoiDung);
            var txtFileHD=$(fileHD);
            
            var json = new Object();
            json.pk = txtPk.val();
            json.donViChucNangHdcb_pk = txtDonViChucNangHdcb_pk.val();
            json.canBoQdkl_pk = txtCanBoQdkl_pk.val();
            json.maHopDong = txtMaHopDong.val();
            json.tenHopDong= txtTenHopDong.val();
            json.chucVu = txtChucVu.val();
            json.loaiHopDongHdcb_pk = txtLoaiHopDongHdcb_pk.val();
            json.ngayKy = txtNgayKy.val();
            json.tuNgay = txtTuNgay.val();
            json.denNgay = txtDenNgay.val();
            json.trichYeuNoiDung = txtTrichYeuNoiDung.val();
            json.fileHD = txtFileHD.val();

            if(txtPk.val() != -1){
            	var endpointUrl = '/hopDongCanBoController/update';
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
    		var txtDonViChucNangHdcb_pk=$(donViChucNangHdcb_pk);
            var txtCanBoQdkl_pk=$(canBoQdkl_pk);
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
        	txtCanBoQdkl_pk.val("");
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
    	
	} );
	
	/*  datepicker*/
	$.fn.datepicker.defaults.format = "yyyy-mm-dd";
		$('.datepicker').datepicker({
			 	startDate: '-3d'
	});
		
		 
		
		 