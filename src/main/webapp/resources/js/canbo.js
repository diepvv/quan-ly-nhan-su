$(document).ready(function() {
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
				   "defaultContent": "<button type='button' class='btn btn-info btn-lg' data-toggle='modal' data-target='#CAPNHAPCANBO'>Sửa</button>"
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
		                 text: 'Thêm Cán Bộ',
		                 action: function ( e, dt, node, config ) {
		                    // alert( 'Button activated' );
		                     $('#CAPNHAPCANBO').modal('show');
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
		if("btnDel" == id){
        var data = table.row($(this).parents('tr')).data();
        alert($(this)[0].id + ": " + data['soHieuCB']);
		}
    });
	
	$('#btnDel').on( 'click', function () {
	        alert('xoa');
	    } );
	} );
	
	
	/*  datepicker*/
	$.fn.datepicker.defaults.format = "yyyy-mm-dd";
	$('.datepicker').datepicker({
			 	startDate: '-3d'
	});