<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="/webjars/bootstrap/3.3.7/css/bootstrap.min.css">
<script type="text/javascript" src="webjars/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<link rel="stylesheet" href="https://cdn.datatables.net/1.10.12/css/jquery.dataTables.min.css">
<script src="https://cdn.datatables.net/1.10.13/js/jquery.dataTables.min.js"></script>



<link href="https://cdn.datatables.net/colreorder/1.2.0/css/colReorder.dataTables.css" rel="stylesheet" type="text/css" />
<script src="https://cdn.datatables.net/colreorder/1.2.0/js/dataTables.colReorder.js"></script>
<link href="https://cdn.datatables.net/select/1.0.0/css/select.dataTables.css" rel="stylesheet" type="text/css" />
<script src="https://cdn.datatables.net/select/1.0.0/js/dataTables.select.js"></script>
<link href="https://cdn.datatables.net/fixedheader/3.0.0/css/fixedHeader.dataTables.css" rel="stylesheet" type="text/css" />
<script src="https://cdn.datatables.net/fixedheader/3.0.0/js/dataTables.fixedHeader.js"></script>

<link href="https://cdn.datatables.net/buttons/1.0.1/css/buttons.dataTables.css" rel="stylesheet" type="text/css" />
<script src="https://cdn.datatables.net/buttons/1.0.1/js/dataTables.buttons.js"></script>
    
<link href="https://cdn.datatables.net/buttons/1.0.1/css/buttons.dataTables.css" rel="stylesheet" type="text/css" />
<script src="https://cdn.datatables.net/buttons/1.0.3/js/buttons.html5.min.js"></script>

<script src="https://cdn.datatables.net/buttons/1.2.4/js/buttons.flash.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jszip/2.5.0/jszip.min.js"></script>
<script src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.24/build/pdfmake.min.js"></script>
<script src="https://cdn.rawgit.com/bpampuch/pdfmake/0.1.24/build/vfs_fonts.js"></script>
<script src="https://cdn.datatables.net/buttons/1.2.4/js/buttons.print.min.js"></script>
<script src="//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"></script>

<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.6.4/js/bootstrap-datepicker.js"></script>

<title>HD Ngắn Hạn</title>

<script type="text/javascript">
	
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
                    var maHDNganHan = data['maHDNganHan'];
	            if(check==true){
	            	$.ajax({  
	                    url: hopDongNganHanController+"/delete/"+maHDNganHan,  
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
                    var maHDNganHan = data['maHDNganHan'];
                    var txtTenHopDong=$(tenhopdong);
                    var txtTenNhanVien=$(tennhanvien);
                    var txtNgayKy=$(dpNgayKy);
                    var txtTuNgay=$(dpTuNgay);
                    var txtDenNgay=$(dpDenNgay);
	            	$.ajax({  
	                    url: hopDongNganHanService+"/getById/"+maHDNganHan,  
	                    type: 'GET',  
	                    success: function (res) {
	                    	//alert(res.tenNhanVien);
	                    	//tenhopdong: id cua the input, res.tenHopDong : lay tu chuoi json dc get tu co do du lieu
	                    	//lay thong tin tu co so du lieu gan nen form
	                    	txtTenHopDong.val(res.tenHopDong);
	                    	txtTenNhanVien.val(res.tenNhanVien);
	                    	txtNgayKy.val(res.ngayKy);
	                    	txtTuNgay.val(res.tuNgay);
	                    	txtDenNgay.val(res.denNgay);
		                    $('#formHDNganHan').modal('show');
	                    }
	                });
	            	//twitter bootstrap script
	            	$("button#btnCapNhap").click(function(e) {
	                 	var json = new Object();
		                json.maHDNganHan = maHDNganHan;
		                json.tenHopDong = txtTenHopDong.val();
		                json.tenNhanVien = txtTenNhanVien.val();
		                json.ngayKy = txtNgayKy.val();
		                json.tuNgay= txtTuNgay.val();
		                json.denNgay = txtDenNgay.val();
	                 	$.ajax({
		                     type : "POST",
		                     contentType: "application/json; charset=utf-8",
		                     data : JSON.stringify(json),
		                     url : hopDongNganHanController+'/update',
		                     success : function(msg) {
		                         	alert("Sửa thành công");
		                         	table.ajax.reload();
		                         	txtTenHopDong.val("");
		                         	txtTenNhanVien.val("");
		                         	txtNgayKy.val("");
		                         	txtTuNgay.val("");
		                         	txtDenNgay.val("");
		                      },
		                      error : function() {
		                            alert("Sửa không thành công");
		                            txtTenHopDong.val("");
		                         	txtTenNhanVien.val("");
		                         	txtNgayKy.val("");
		                         	txtTuNgay.val("");
		                         	txtDenNgay.val("");
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
                    
			}	
	    });
		
		
		
		
		
	} );
	
	/*  datepicker*/
	$.fn.datepicker.defaults.format = "yyyy-mm-dd";
		$('.datepicker').datepicker({
			 	startDate: '-3d'
	});
</script>
</head>
<body>
<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">MENU</a>
			</div>
			
		<ul class="nav navbar-nav">
				<li>
				<div class="dropdown">
  				<button class="btn btn-primary navbar-btn dropdown-toggle" type="button" data-toggle="dropdown">QUẢN LÝ CÁN BỘ
  					<span class="caret"></span></button>
  					<ul class="dropdown-menu">
   						<li><a href="/canBoController/show">DANH SÁCH CÁN BỘ</a></li>
    					<li><a href="#">DANH SÁCH CÁN BỘ KHOÁN GỌN</a></li>
    					<li><a href="#">DANH SÁCH CÁN BỘ KIÊM NHIỆM</a></li>
   						<li><a href="#">DANH SÁCH CÁN BỘ THÂM NIÊN</a></li>
 					</ul>
				</div>
				</li>
				
				<li>
				<div class="dropdown">
  				<button class="btn btn-primary navbar-btn dropdown-toggle" type="button" data-toggle="dropdown">QUẢN LÝ QUYẾT ĐỊNH
  					<span class="caret"></span></button>
  					<ul class="dropdown-menu">
   						<li><a href="#">DANH SÁCH QUYẾT ĐỊNH</a></li>
    					<li><a href="#">DANH SÁCH QUYẾT ĐỊNH KHEN THƯỞNG</a></li>
   						<li><a href="#">DANH SÁCH QUYẾT ĐỊNH KỶ LUẬT</a></li>
 					</ul>
				</div>
				</li>
				
				<li>
				<div class="dropdown">
  				<button class="btn btn-primary navbar-btn dropdown-toggle" type="button" data-toggle="dropdown">QUẢN LÝ HỢP ĐỒNG
  					<span class="caret"></span></button>
  					<ul class="dropdown-menu">
   						<li><a href="#">HỢP ĐỒNG CÁN BỘ</a></li>
    					<li><a href="/hopDongNganHanController/show">HỢP ĐỒNG NGẮN HẠN</a></li>
 					</ul>
				</div>
				</li>
				
				<li>
				<div class="dropdown">
  				<button class="btn btn-primary navbar-btn dropdown-toggle" type="button" data-toggle="dropdown">QUẢN LÝ DANH MỤC
  					<span class="caret"></span></button>
  					<ul class="dropdown-menu">
   						<li><a href="#">CHỨC VỤ</a></li>
    					<li><a href="#">NGẠCH CÔNG CHỨC</a></li>
    					<li><a href="#">LOẠI HỢP ĐỒNG</a></li>
    					<li><a href="#">LOẠI QUYẾT ĐỊNH</a></li>
    					<li><a href="#">DÂN TỘC</a></li>
    					<li><a href="#">TÔN GIÁO</a></li>
    					<li><a href="#">ĐƠN VỊ CHỨC NĂNG</a></li>
 					</ul>
				</div>
				</li>
				 <li><a href="#">KÊ KHAI TÀI SẢN</a></li>
     			 <li><a href="#">QUÁ TRÌNH LƯƠNG</a></li>
     			 
				<form class="navbar-form navbar-left">
      				<div class="form-group">
        				<input type="text" class="form-control" placeholder="Search">
      				</div>
    			</form>
    			
			</ul>
		</div>
	</nav>
	<div class="container">
		<div class="starter-template">
			<!-- datatable start  -->
	<h1>DANH SÁCH HỢP ĐỒNG NGẮN HẠN</h1>
<!-- 	<button id="button">btn</button> -->
	<table id="HopDongNganHanTable" class="display">

		<!-- Header Table -->
		<thead>
			<tr>
				<th>Tên Hợp Đồng</th>
				<th>Tên Nhân Viên</th>
				<th>Ngày Ký</th>
				<th>Từ Ngày</th>
				<th>Đến Ngày</th>
				<th>Sửa HD</th>
				<th>Xóa HD</th>
			</tr>
		</thead>
		<!-- Footer Table -->
		<tfoot>
			<tr>
				<th>Tên Hợp Đồng</th>
				<th>Tên Nhân Viên</th>
				<th>Ngày Ký</th>
				<th>Từ Ngày</th>
				<th>Đến Ngày</th>
				<th>Sửa HD</th>
				<th>Xóa HD</th>
			</tr>
		</tfoot>
	</table>

	<!-- datatable end -->
		</div>
	</div>
	<!-- <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Open Modal</button> -->
	

<!-- form Thêm, Sửa Hợp đồng ngắn hạn -->
<div id="formHDNganHan" class="modal fade" role="dialog">
 <div class="modal-dialog modal-lg">
    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">HỢP ĐỒNG NGẮN HẠN</h4>
      </div>
      <div class="modal-body">
         <label for="inputdefault">Tên hợp đồng</label>
    	 <input class="form-control" id="tenhopdong" type="text">
    	
    	 <label for="inputdefault">Tên nhân viên</label>
    	 <input class="form-control" id="tennhanvien" type="text">
    	
    	 <label for="inputdefault">Ngày ký</label>
		 <div class="input-group date" data-provide="datepicker">
    		<input type="text" class="form-control" id = "dpNgayKy" >
    		<div class="input-group-addon">
      		  <span class="glyphicon glyphicon-th"></span>
    		</div>
	     </div>
    	
    	 <label for="inputdefault">Từ Ngày</label>
		 <div class="input-group date" data-provide="datepicker">
    		<input type="text" class="form-control" id = "dpTuNgay" >
    		<div class="input-group-addon">
      		  <span class="glyphicon glyphicon-th"></span>
    		</div>
	     </div>
    	
    	 <label for="inputdefault">Đến ngày</label>
		<div class="input-group date" data-provide="datepicker">
    		<input type="text" class="form-control" id = "dpDenNgay" >
    		<div class="input-group-addon">
      		  <span class="glyphicon glyphicon-th"></span>
    		</div>
	    </div>
	    
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal" id = "btnCapNhap">Cập Nhập</button>
        <button type="button" class="btn btn-default" data-dismiss="modal" id = "btnDong">Đóng</button>
      </div>
    </div>

  </div>
</div>

</body>
</html>