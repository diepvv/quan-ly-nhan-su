$(document).ready(function() {
		var canBoController = "/canBoController";
		var table = $('#canBoTable').DataTable({
			"sAjaxSource" : "/canBoService/getAll",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"aoColumnDefs": [ 
			      {
			      "aTargets": [ 0 ],
			      "mData": "soHieuCB"
			      },
			      {
				  "aTargets": [ 1 ],
				  "mData": "tenCB"
				  },
				  {
				  "aTargets": [ 2 ],
				  "mData": "dvCongTac"
				  },
				  {
					"aTargets": [ 3 ],
					"mData": "chucVuHienTai"
				   },
				  {
			       "targets": -1,
			       "data": null,
			       "defaultContent": "<button type='button' class='btn btn-info btn-lg' data-toggle='modal' id='btnDel'>Xóa</button>"
			      },
			      {
				   "targets": -2,
				   "data": null,
				   "defaultContent": "<button type='button' class='btn btn-info btn-lg' data-toggle='modal'  id='btnChiTiet'>Chi Tiết</button>"
				  },
			],
			scrollY : "600px",
			scrollCollapse: true,
			dom: 'Blfrtip',
			buttons: ['copy',
			          'excel',
			          'pdf',
			          'print',
			          {
			             text: 'Đơn Vị',
			             action: function ( e, dt, node, config ) {
		                     $('#thongKeForm').modal('show');
			             },
			          },
			          {
				             text: 'Quản Lý Cán Bộ',
				             action: function ( e, dt, node, config ) {
			                     $('#thongKeForm').modal('show');
				             },
				      },
			          {
		                 text: 'Thêm Cán Bộ',
		                 action: function ( e, dt, node, config ) {
		                    // alert( 'Button activated' );
		                     $('#CAPNHAPCANBO').modal('show');
		                 },
		              },
		              {
			                 text: 'Thống Kê',
			                 action: function ( e, dt, node, config ) {
			                    // alert( 'Button activated' );
			                     $('#thongKeForm').modal('show');
			                 },
			          }
			          ],
		    colReorder: true,
		    select: true,
		    "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
            }
		});
	
		$('#canBoTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnChiTiet" == id){
		        var data = table.row($(this).parents('tr')).data();
		       // alert($(this)[0].id + ": " + data['soHieuCB']);
		        /*$.ajax({  
                    url: canBoController+"/ChiTietCanBo",  
                    type: 'GET',  
                    success: function (res) {
                    	alert('succcess');
                    }
                });*/
		        $('#ChiTietCanBoForm').modal('show');
			}
	    });
		
		$('#btnDel').on( 'click', function () {
		    alert('xoa');
		});
		
		$("button#btnXacNhan").click(function(e) {
			alert($(hidTieuChi).val());
		});
		
		$("button#btnXacNhanChiTietCanBo").click(function(e) {
			alert($(hidTieuChiChiTietCanBo).val());
		});
});

/*  datepicker*/
$.fn.datepicker.defaults.format = "yyyy-mm-dd";
$('.datepicker').datepicker({
		 	startDate: '-3d'
});