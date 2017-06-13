$(document).ready(function() {
		var tonGiaoService = "/tonGiaoService";
		var tonGiaoController = "/tonGiaoController";
		var table = $('#TonGiaoTable').DataTable({
			"sAjaxSource" : tonGiaoService+"/getAll",
			"sAjaxDataProp" : "",
			"order" : [ [ 0, "asc" ] ],
			"aoColumnDefs": [ 
			      {
				       "aTargets": [ 0 ],
				       "mData": "tenTonGiao"
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
		                 text: 'THÊM TÔN GIÁO',
		                 action: function ( e, dt, node, config ) {
		                	 var txtPk = $(pk);
		                	 var txtTenTonGiao=$(tenTonGiao);
		                	 var txtVersion = $(version);
		                	 txtPk.val(-1);
		                	 txtTenTonGiao.val("");
		                	 txtVersion.val("");
		                     
		                     $('#formTonGiao').modal('show');
		                 },
		              }
			          ],
		    colReorder: true,
		    select: true,
		    "language": {
                "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
            }
		});
	
		$('#TonGiaoTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnDel" == id){
	        var data = table.row($(this).parents('tr')).data();
	        check = confirm("Bạn có chắc chắn muốn xóa đối tượng : "+ data['tenTonGiao'])
                var pK = data['pk'];
	        	var version = data['version'];
	            if(check==true){
	            	$.ajax({  
	                    url: tonGiaoController+"/delete/"+pK+"?version="+version,  
	                    type: 'DELETE',  
	                    success: function (res) {
	                    	alert("Xóa Thành Công");
	                    	table.ajax.reload();	                    }  
	                });
	            }
                    
			}
	    });
		
		$('#TonGiaoTable tbody').on( 'click', 'button', function () {
			var id = $(this)[0].id;
			if("btnUpdate" == id){
					var data = table.row($(this).parents('tr')).data();
                    var pK = data['pk'];
					var txtPk = $(pk);
                	var txtTenTonGiao=$(tenTonGiao);
                	var txtVersion = $(version);
	            	$.ajax({  
	                    url: tonGiaoService+"/getById/"+pK,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	 txtPk.val(pK);
		                	 txtTenTonGiao.val(res.tenTonGiao);
		                	 txtVersion.val(res.version);
		                     $('#formTonGiao').modal('show');
	                    }
	                });
			}	
	    });
		
		//twitter bootstrap btnCapNhap
    	$("button#btnCapNhap").click(function(e) {

    		 var endpointUrl = '/tonGiaoController/add';
    		 var txtPk = $(pk);
        	 var txtTenTonGiao=$(tenTonGiao);
        	 var txtVersion = $(version);
            
            var json = new Object();
            json.pk = txtPk.val();
            json.tenTonGiao = txtTenTonGiao.val();
            json.version = txtVersion.val();
            if(txtPk.val() != -1){
            	var endpointUrl = '/tonGiaoController/update';
            }
            var invalidFields = $("#formTest").find(":invalid");
            if(invalidFields.length == 0){
	            $.ajax({
	                type : "POST",
	                contentType: "application/json; charset=utf-8",
	                data : JSON.stringify(json),
	                url : endpointUrl,
	                success : function(msg) {
	                	$('#formTonGiao').modal('toggle');
	                    table.ajax.reload();
	                },
            		error: function (data, textStatus, xhr) {
            			alert(data.responseText);
            		}
	            });
            } else {
            	$("#formTest").submit();
            }    
        });
    	
    	$("button#btnDong").click(function(e) {
    		var txtTenTonGiao=$(tenTonGiao);
         	txtTenTonGiao.val("");
        }); 
    	$("#formTonGiao").on('hidden.bs.modal', function () {
            $("#formTest").find('.has-error').removeClass("has-error");
            $("#formTest").find('.has-feedback').removeClass("has-feedback");
        });
} );	 