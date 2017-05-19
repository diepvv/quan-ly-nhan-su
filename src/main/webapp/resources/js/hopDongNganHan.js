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
		                     	 txtPk.val(-1);
		                     	 txtTenHopDong.val("");
	                         	 txtTenNhanVien.val("");
	                         	 txtNgayKy.val("");
	                         	 txtTuNgay.val("");
	                         	 txtDenNgay.val("");
		                     
		                     $('#formHDNganHan').modal('show');
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
	        check = confirm("Bạn có chắc chắn muốn xóa đối tượng : "
                    + data['tenNhanVien'])
                    var Pk = data['pk'];
	            if(check==true){
	            	$.ajax({  
	                    url: hopDongNganHanController+"/delete/"+Pk,  
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
                    var Pk = data['pk'];
                    //$(tenhopdong) giá trị ban đầu : Rỗng
                    var txtPk = $(pk);
                    var txtTenHopDong=$(tenhopdong);
                    var txtTenNhanVien=$(tennhanvien);
                    var txtNgayKy=$(dpNgayKy);
                    var txtTuNgay=$(dpTuNgay);
                    var txtDenNgay=$(dpDenNgay);
	            	$.ajax({  
	                    url: hopDongNganHanService+"/getById/"+Pk,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	//alert(res.tenNhanVien);
	                    	//tenhopdong: id cua the input, res.tenHopDong : lay tu chuoi json dc get tu co do du lieu
	                    	//lay thong tin tu co so du lieu gan nen form
	                    	txtPk.val(Pk);
	                    	txtTenHopDong.val(res.tenHopDong);
	                    	txtTenNhanVien.val(res.tenNhanVien);
	                    	txtNgayKy.val(res.ngayKy);
	                    	txtTuNgay.val(res.tuNgay);
	                    	txtDenNgay.val(res.denNgay);
		                    $('#formHDNganHan').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("#btnCapNhap").click(function(e) {

    		var endpointUrl = '/hopDongNganHanController/add';
    		//$(tenhopdong) là giá trị sau khi lấy ở database nên gắn vào form khi click nút Sửa
    		var txtPk = $(pk);
    		var txtTenHopDong = $(tenhopdong);
            var txtTenNhanVien = $(tennhanvien);
            var txtNgayKy = $(dpNgayKy);
            var txtTuNgay = $(dpTuNgay);
            var txtDenNgay = $(dpDenNgay);
            
            var txtTenHopDong = $.trim($('#tenhopdong').val());
            if(txtTenHopDong == ''){
            	alert('Tên hợp đồng không được để Trống! ok Men');
                return false;
            }
            
            var json = new Object();
         	//truyen du lieu thanh chuoi Json gui xuong database
            json.pk = txtPk.val();
            json.tenHopDong = txtTenHopDong.val();
            json.tenNhanVien = txtTenNhanVien.val();
            json.ngayKy = txtNgayKy.val();
            json.tuNgay= txtTuNgay.val();
            json.denNgay = txtDenNgay.val();
            if(txtPk.val() != -1){
            	var endpointUrl = '/hopDongNganHanController/update';
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
         	txtTenHopDong.val("");
         	txtTenNhanVien.val("");
         	txtNgayKy.val("");
         	txtTuNgay.val("");
         	txtDenNgay.val("");
        }); 
    	
	} );
	
	/*  datepicker*/
	$.fn.datepicker.defaults.format = "yyyy-mm-dd";
		$('.datepicker').datepicker({
			 	startDate: '-3d'
	});
		
		 
		
		 