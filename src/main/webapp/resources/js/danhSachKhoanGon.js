$(document).ready(function() {
		var danhSachKhoanGonService = "/danhSachKhoanGonService";
		var danhSachKhoanGonController = "/danhSachKhoanGonController";
		var table = $('#DanhSachKhoanGonTable').DataTable({
			"sAjaxSource" : danhSachKhoanGonService+"/getAll",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"aoColumnDefs": [ 
			      {
				       "aTargets": [ 0 ],
				       "mData": "hoTenCanbo"
			      },
			      {
				       "aTargets": [ 1 ],
				       "mData": "maDonVi"
			      },
			      {
				       "aTargets": [ 2 ],
				       "mData": "soDienThoai"
			      },
			      {
				       "aTargets": [ 3 ],
				       "mData": "ngayKyHopDong"
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
		                	 var txtMaCanBoKhoanGon = $(maCanBoKhoanGon);
		                	 var txtMaDonVi=$(maDonVi);
		                	 var txtHoTenCanBo = $(hoTenCanBo);
		                	 var txtSoCMND = $(soCMND);
		                	 var txtDiaChi = $(diaChi);
		                	 var txtNgayKyHopDong = $(ngayKyHopDong);


		                	 txtMaCanBoKhoanGon.val(-1);
		                	 txtMaDonVi.val("");
		                	 txtHoTenCanBo.val("");
		                	 txtSoCMND.val("");
		                	 txtDiaChi.val("");
		                	 txtNgayKyHopDong.val("");

		                     
		                     $('#formDanhSachKhoanGon').modal('show');
		                 },
		              }
			          ],
		    colReorder: true,
		    select: true,
		    "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
            }
		});
	
		$('#DanhSachKhoanGonTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnDel" == id){
	        var data = table.row($(this).parents('tr')).data();
	        check = confirm("Bạn có chắc chắn muốn xóa mã ngạch : "
                    + data['maCanBoKhoanGon'])
                    var maCanBoKhoanGon = data['maCanBoKhoanGon'];
	            if(check==true){
	            	$.ajax({  
	                    url: danhSachKhoanGonController+"/delete/"+maCanBoKhoanGon,  
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();	                    }  
	                });
	            }
                    
			}
	    });
		
		$('#DanhSachKhoanGonTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnUpdate" == id){
					var data = table.row($(this).parents('tr')).data();
                    var maCBKG = data['maCanBoKhoanGon'];
                    var txtMaCanBoKhoanGon = $(maCanBoKhoanGon);
               	 	var txtMaDonVi=$(maDonVi);
               	 	var txtHoTenCanBo = $(hoTenCanBo);
               	 	var txtSoCMND = $(soCMND);
               	 	var txtDiaChi = $(diaChi);
               	 	var txtNgayKyHopDong = $(ngayKyHopDong);

	            	$.ajax({  
	                    url: danhSachKhoanGonService+"/getById/"+maCBKG,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtMaCanBoKhoanGon.val(maCBKG);
		                	 txtTenNgach.val(res.maDonVi);
		                	 txtMaDonVi.val(res.hoTenCanBo);
		                	 txtHoTenCanBo.val(res.soCMND);
		                	 txtSoCMND.val(res.diaChi);
		                	 txtNgayKyHopDong.val(res.ngayKyHopDong)
		                     $('#formDanhSachKhoanGon').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("button#btnCapNhap").click(function(e) {

    		var endpointUrl = '/danhSachKhoanGonController/add';
    		var txtMaCanBoKhoanGon = $(maCanBoKhoanGon);
       	 	var txtMaDonVi=$(maDonVi);
       	 	var txtHoTenCanBo = $(hoTenCanBo);
       	 	var txtSoCMND = $(soCMND);
       	 	var txtDiaChi = $(diaChi);
       	 	var txtNgayKyHopDong = $(ngayKyHopDong);
        	 /*if(txtMaNgach.val()!= null){
             	var endpointUrl = '/danhSachKhoanGonController/update';
             }*/
            var json = new Object();
            json.maCanBoKhoanGon = txtMaCanBoKhoanGon.val();
            json.maDonVi = txtMaDonVi.val();
            json.hoTenCanBo = txtHoTenCanBo.val();
            json.soCMND = txtSoCMND.val();
            json.diaChi = txtDiaChi.val();
            json.ngayKyHopDong = txtNgayKyHopDong.val();
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
    		var txtMaCanBoKhoanGon = $(maCanBoKhoanGon);
       	 	var txtMaDonVi=$(maDonVi);
       	 	var txtHoTenCanBo = $(hoTenCanBo);
       	 	var txtSoCMND = $(soCMND);
       	 	var txtDiaChi = $(diaChi);
       	 	var txtNgayKyHopDong = $(ngayKyHopDong);
       	 txtMaCanBoKhoanGon.val("");
    	 txtMaDonVi.val("");
    	 txtHoTenCanBo.val("");
    	 txtSoCMND.val("");
    	 txtDiaChi.val("");
    	 txtNgayKyHopDong.val("");
        }); 
    	
	} );
	
	
		 
		
		 