$(document).ready(function() {
		var danTocService = "/danTocService";
		var danTocController = "/danTocController";
		var table = $('#DanTocTable').DataTable({
			"sAjaxSource" : danTocService+"/getAll",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"aoColumnDefs": [ 
			      {
				       "aTargets": [ 0 ],
				       "mData": "tenDanToc"
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
		                 text: 'THÊM DÂN TỘC',
		                 action: function ( e, dt, node, config ) {
		                	 var txtPk = $(pk);
		                	 var txtTenDanToc=$(tenDanToc);
		                	 txtPk.val(-1);
		                	 txtTenDanToc.val("");
		                     
		                     $('#formDanToc').modal('show');
		                 },
		              }
			          ],
		    colReorder: true,
		    select: true,
		    "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
            }
		});
	
		$('#DanTocTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnDel" == id){
	        var data = table.row($(this).parents('tr')).data();
	        check = confirm("Bạn có chắc chắn muốn xóa đối tượng : "
                    + data['tenDanToc'])
                    var pK = data['pk'];
	            if(check==true){
	            	$.ajax({  
	                    url: danTocController+"/delete/"+pK,  
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();	                    }  
	                });
	            }
                    
			}
	    });
		
		$('#DanTocTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnUpdate" == id){
					var data = table.row($(this).parents('tr')).data();
                    var pK = data['pk'];
					var txtPk = $(pk);
                	var txtTenDanToc=$(tenDanToc);
	            	$.ajax({  
	                    url: danTocService+"/getById/"+pK,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtPk.val(pK);
		                	 txtTenDanToc.val(res.tenDanToc);
		                     $('#formDanToc').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("#btnCapNhap").click(function(e) {
    		var endpointUrl = '/danTocController/add';
    		var txtPk = $(pk);
        	var txtTenDanToc=$(tenDanToc);
        	var txtTenDanToc = $.trim($('#tenDanToc').val());
            if(txtTenDanToc == ''){
            	alert('Tên dân tộc không được để trống!');
                return false;
            }
            var json = new Object();
            json.pk = txtPk.val();
            json.tenDanToc = txtTenDanToc.val();
            if(txtPk.val() != -1){
            	var endpointUrl = '/danTocController/update';
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
    		var txtTenDanToc=$(tenDanToc);
         	txtTenDanToc.val("");
        }); 
    	
	} );
	
	
		 
		
		 