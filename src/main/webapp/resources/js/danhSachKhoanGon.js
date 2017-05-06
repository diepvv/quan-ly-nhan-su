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
				       "mData": "hoTenCanBo"
			      },
			      {
				       "aTargets": [ 1 ],
				       "mData": "donViChucNangDskg_pk"
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
		                	 var txtPk = $(pk);
		                	 var txtDonViChucNangDskg_pk=$(donViChucNangDskg_pk);
		                	 var txtHoTenCanBo = $(hoTenCanBo);
		                	 var txtSoDienThoai = $(soDienThoai);
		                	 var txtSoCmnd = $(soCmnd);
		                	 var txtDiaChi = $(diaChi);
		                	 var txtNgayKyHopDong = $(ngayKyHopDong);


		                	 txtPk.val(-1);
		                	 txtDonViChucNangDskg_pk.val("");
		                	 txtHoTenCanBo.val("");
		                	 txtSoDienThoai.val("");
		                	 txtSoCmnd.val("");
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
	        check = confirm("Bạn có chắc chắn muốn xóa Cán Bộ Khoán Gọn : "
                    + data['hoTenCanBo'])
                    var pK = data['pk'];
	            if(check==true){
	            	$.ajax({  
	                    url: danhSachKhoanGonController+"/delete/"+pK,  
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
                    var pK = data['pk'];
                    var txtPk = $(pk);
                    var txtDonViChucNangDskg_pk=$(donViChucNangDskg_pk);
               	 	var txtHoTenCanBo = $(hoTenCanBo);
               	 	var txtSoDienThoai = $(soDienThoai);
               	 	var txtSoCmnd = $(soCmnd);
               	 	var txtDiaChi = $(diaChi);
               	 	var txtNgayKyHopDong = $(ngayKyHopDong);

	            	$.ajax({  
	                    url: danhSachKhoanGonService+"/getById/"+pK,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtPk.val(pK);
	                    	 txtDonViChucNangDskg_pk.val(res.donViChucNangDskg_pk);
	                    	 txtHoTenCanBo.val(res.hoTenCanBo);
	                    	 txtSoDienThoai.val(res.soDienThoai);
	                    	 txtSoCmnd.val(res.soCmnd);
	                    	 txtDiaChi.val(res.diaChi);
		                	 txtNgayKyHopDong.val(res.ngayKyHopDong)
		                     $('#formDanhSachKhoanGon').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("button#btnCapNhap").click(function(e) {

    		var endpointUrl = '/danhSachKhoanGonController/add';
    		var txtPk = $(pk);
    		var txtDonViChucNangDskg_pk=$(donViChucNangDskg_pk);
       	 	var txtHoTenCanBo = $(hoTenCanBo);
       	 	var txtSoDienThoai = $(soDienThoai);
       	 	var txtSoCmnd = $(soCmnd);
       	 	var txtDiaChi = $(diaChi);
       	 	var txtNgayKyHopDong = $(ngayKyHopDong);
       	 	
       	 var json = new Object();
         json.pk = txtPk.val();
         json.donViChucNangDskg_pk = txtDonViChucNangDskg_pk.val();
         json.hoTenCanBo = txtHoTenCanBo.val();
         json.soDienThoai = txtSoDienThoai.val();
         json.soCmnd = txtSoCmnd.val();
         json.diaChi = txtDiaChi.val();
         json.ngayKyHopDong = txtNgayKyHopDong.val();
        	if(txtPk.val()!= -1){
             	var endpointUrl = '/danhSachKhoanGonController/update';
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
    		 var txtDonViChucNangDskg_pk=$(donViChucNangDskg_pk);
        	 var txtHoTenCanBo = $(hoTenCanBo);
        	 var txtSoDienThoai = $(soDienThoai);
        	 var txtSoCmnd = $(soCmnd);
        	 var txtDiaChi = $(diaChi);
        	 var txtNgayKyHopDong = $(ngayKyHopDong);
        	 txtDonViChucNangDskg_pk.val("");
        	 txtHoTenCanBo.val("");
        	 txtSoDienThoai.val("");
        	 txtSoCmnd.val("");
        	 txtDiaChi.val("");
        	 txtNgayKyHopDong.val("");
        }); 
    	
	} );
	
	
		 
		
		 