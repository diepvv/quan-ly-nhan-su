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


<title>DANH SACH CAN BO</title>
<script type="text/javascript">
	function xoa() {
		alert('xoa');
	}
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
			          'csv',
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
	<h1>DANH SÁCH CÁN BỘ</h1>
<!-- 	<button id="button">btn</button> -->
	<table id="canBoTable" class="display">

		<!-- Header Table -->
		<thead>
			<tr>
				<th>Số Hiệu Cán Bộ</th>
				<th>Tên Cán Bô</th>
				<th>Đơn Vị Công Tác</th>
				<th>Chức Vụ Hiện Tại</th>
				<th>Sửa CB</th>
				<th>Xóa CB</th>
			</tr>
		</thead>
		<!-- Footer Table -->
		<tfoot>
			<tr>
				<th>Số Hiệu Cán Bộ</th>
				<th>Tên Cán Bô</th>
				<th>Đơn Vị Công Tác</th>
				<th>Chức Vụ Hiện Tại</th>
				<th>Sửa CB</th>
				<th>Xóa CB</th>
			</tr>
		</tfoot>
	</table>

	<!-- datatable end -->
		</div>
	</div>
	<!-- Modal -->
<div id="CAPNHAPCANBO" class="modal fade" role="dialog">
  <div class="modal-dialog ">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">QUẢN LÝ CÁN BỘ</h4>
      </div>
      <div class="modal-body">
      
     	 <input class="form-control" id="txtCanBo" type="hidden">
      
         <label for="inputdefault">Đơn vị công tác</label>
         <input class="form-control" id="txtDonViCongTac" type="text" list="listDonvicongTac"></br>
         <datalist id="listDonvicongTac">
         	<option value="a"></option>
         	<option value="b"></option>
         	<option value="c"></option>
         </datalist>
         
         <label for="inputdefault">Số hiệu cán bộ</label>
         <input class="form-control" id="txtSoHieuCanBo" type="text"></br>
         
         <label for="inputdefault">Ảnh</label>
         <textarea class="form-control" id="textareaID"></textarea></br>
         
         <label for="inputdefault">Tên Cán Bộ</label>
         <input class="form-control" id="txtTenCanBo" type="text"></br>
         
         <label for="inputdefault">Tên Gọi Khác</label>
         <input class="form-control" id="txtTenGoiKhac" type="text"></br>
         
         <label for="inputdefault">Ngày Sinh</label>
		 <div class="input-group date" data-provide="datepicker">
    		<input type="text" class="form-control" id = "dpNgaySinh" >
    		<div class="input-group-addon">
      		  <span class="glyphicon glyphicon-th"></span>
    		</div>
	     </div></br>
	     
	     <label for="inputdefault">Giới tính</label>
         <input class="form-control" id="txtGioiTinh" type="text"></br>
         
         <label for="inputdefault">Nơi sinh</label>
         <input class="form-control" id="txtNoisinh" type="text"></br>
         <label for="inputdefault">Quê quán</label>
         <input class="form-control" id="txtQueQuan" type="text"></br>
         <label for="inputdefault">Dân tộc</label>
         <input class="form-control" id="txtDanToc" type="text" list="listDanToc"></br>
         <datalist id="listDanToc">
         	<option value="a"></option>
         	<option value="b"></option>
         	<option value="c"></option>
         </datalist>
         <label for="inputdefault">Tôn giáo</label>
         <input class="form-control" id="txtTonGiao" type="text" list="listTonGiao"></br>
         <datalist id="listTonGiao">
         	<option value="a"></option>
         	<option value="b"></option>
         	<option value="c"></option>
         </datalist>
         <label for="inputdefault">Số CMND</label>
         <input class="form-control" id="txtSoCMND" type="text"></br>
         
         <label for="inputdefault">Ngày Cấp</label>
		 <div class="input-group date" data-provide="datepicker">
    		<input type="text" class="form-control" id = "dpNgayCap" >
    		<div class="input-group-addon">
      		  <span class="glyphicon glyphicon-th"></span>
    		</div>
	     </div></br>
	     <label for="inputdefault">Nơi cấp CMND</label>
         <input class="form-control" id="txtNoiCapCMND" type="text"></br>
         <label for="inputdefault">Nơi đăng ký hộ khẩu thường trú</label>
         <input class="form-control" id="txtHoKhauTHuongTru" type="text"></br>
         <label for="inputdefault">Nơi ở hiện nay</label>
         <input class="form-control" id="txtNoiOHienNay" type="text"></br>
         <label for="inputdefault">Nghề Nghiệp khi tuyển dụng</label>
         <input class="form-control" id="txtNgheNghiep" type="text"></br>
         <label for="inputdefault">Cơ quan tuyển dụng</label>
         <input class="form-control" id="txtCoQuanTD" value="Trường đại học giao thông vận tải phân hiệu TP Hồ Chí Minh" type="text"></br>
         <label for="inputdefault">Số CMND</label>
         <input class="form-control" id="txtSoCMND" type="text"></br>
         
         <label for="inputdefault">Ngày tuyển dụng</label>
		 <div class="input-group date" data-provide="datepicker">
    		<input type="text" class="form-control" id = "dpNgayTuyenDung" >
    		<div class="input-group-addon">
      		  <span class="glyphicon glyphicon-th"></span>
    		</div>
	     </div></br>
	     
	     <label for="inputdefault">Chức vụ hiện tại</label>
         <input class="form-control" id="txtChucVuHienTai" type="text"></br>
         <label for="inputdefault">Công việc chính được giao</label>
         <input class="form-control" id="txtCongViecDuocGiao" value="Giảng dạy" type="text"></br>
         <label for="inputdefault">Chức Danh</label>
         <input class="form-control" id="txtChucDanh" value="Giảng Viên" type="text"></br>
         
         <label for="inputdefault">Mã ngạch công chức</label>
         <input class="form-control" id="txtMaNgachCongChuc" type="text" list="listMaNgach"></br>
         <datalist id="listMaNgach">
         	<option value="a"></option>
         	<option value="b"></option>
         	<option value="c"></option>
         </datalist>
         <label for="inputdefault">Tên ngạch công chức viên chức</label>
         <input class="form-control" id="txtTenNgach" type="text"></br>
         
         <label for="inputdefault">Bậc lương</label>
         <input class="form-control" id="txtMaBacLuong" type="text" list="listBacLuong"></br>
         <datalist id="listBacLuong">
         	<option value="a"></option>
         	<option value="b"></option>
         	<option value="c"></option>
         </datalist>
         <label for="inputdefault">Hệ Số Lương</label>
         <input class="form-control" id="txtHeSoLuong" type="text"></br>
         <label for="inputdefault">Ngày hưởng</label>
         <div class="input-group date" data-provide="datepicker">
    		<input type="text" class="form-control" id = "dpNgayHuongLuong" >
    		<div class="input-group-addon">
      		  <span class="glyphicon glyphicon-th"></span>
    		</div>
	     </div></br>
	     <label for="inputdefault">Phụ cấp chức vụ</label>
         <input class="form-control" id="txtPhuCapChucVu" type="text"></br>
         <label for="inputdefault">Phụ cấp khác</label>
         <input class="form-control" id="txtPhuCapKhac" type="text"></br>
         <label for="inputdefault">Trình độ giáo dục phổ thông</label>
         <input class="form-control" id="txtTrinhDoGDPT" type="text"></br>
         <label for="inputdefault">Trình độ chuyên môn cao nhất</label>
         <input class="form-control" id="txtTrinhDoChuyenMon" type="text"></br>
         
         <div class="panel-group">
    	 	<div class="panel panel-default">
      	 		<div class="panel-heading">
	        		 <h4 class="panel-title">
	           			<a data-toggle="collapse" href="#collapse">Học vị, học hàm</a>
	         		 </h4>
         		</div>
	         	<div id="collapse" class="panel-collapse collapse">
			         <label for="inputdefault">Học Vị</label>
			         <input class="form-control" id="txtHocVi" type="text"></br>
			         <label for="inputdefault">Ngày nhận học vị</label>
			         <div class="input-group date" data-provide="datepicker">
			    		<input type="text" class="form-control" id = "dpNgayNhanHocVi" >
			    		<div class="input-group-addon">
			      		  <span class="glyphicon glyphicon-th"></span>
			    		</div>
				     </div></br>
			         <label for="inputdefault">Học Hàm</label>
			         <input class="form-control" id="txtHocHam" type="text"></br>
			         <label for="inputdefault">Ngày nhận học hàm</label>
			         <div class="input-group date" data-provide="datepicker">
			    		<input type="text" class="form-control" id = "dpNgayNhanHocHam" >
			    		<div class="input-group-addon">
			      		  <span class="glyphicon glyphicon-th"></span>
			    		</div>
				     </div></br>
				     <label for="inputdefault">Lý luận chính trị</label>
			         <input class="form-control" id="txtLyLuanChinhTri" type="text"></br>
			         <label for="inputdefault">Quản lý nhà nước</label>
			         <input class="form-control" id="txtQuanLyNhaNuoc" type="text">
         		</div>
         	</div>
         </div>
         
         <div class="panel-group">
    	 	<div class="panel panel-default">
      	 		<div class="panel-heading">
	        		 <h4 class="panel-title">
	           			<a data-toggle="collapse" href="#collapse4">Bằng cấp</a>
	         		 </h4>
         		</div>
	         	<div id="collapse4" class="panel-collapse collapse">
				     <label for="inputdefault">Anh Văn</label>
			         <input class="form-control" id="txtAnhVan" type="text"></br>
			         <label for="inputdefault">Tin học</label>
			         <input class="form-control" id="txtTinHoc" type="text">
         		</div>
         	</div>
         </div>
         
         <div class="panel-group">
    	 	<div class="panel panel-default">
      	 		<div class="panel-heading">
	        		 <h4 class="panel-title">
	           			<a data-toggle="collapse" href="#collapse3">Danh hiệu, quân hàm</a>
	         		 </h4>
         		</div>
	         	<div id="collapse3" class="panel-collapse collapse">
			         <label for="inputdefault">Ngày vào đảng cộng sản Việt Nam dự bị</label>
			         <div class="input-group date" data-provide="datepicker">
			    		<input type="text" class="form-control" id = "dpNgayVaoDCSVNDuBi" >
			    		<div class="input-group-addon">
			      		  <span class="glyphicon glyphicon-th"></span>
			    		</div>
				     </div></br>
				     <label for="inputdefault">Ngày vào đảng cộng sản Việt Nam chính thức</label>
			         <div class="input-group date" data-provide="datepicker">
			    		<input type="text" class="form-control" id = "dpNgayVaoDCSVNChinhThuc" >
			    		<div class="input-group-addon">
			      		  <span class="glyphicon glyphicon-th"></span>
			    		</div>
				     </div></br>
				     <label for="inputdefault">Tham gia tổ chức chính trị xã hội</label>
			         <input class="form-control" id="txtToChucCTXH" type="text"></br>
			         
			         <label for="inputdefault">Ngày nhập ngũ</label>
			         <div class="input-group date" data-provide="datepicker">
			    		<input type="text" class="form-control" id = "dpNgayNhapNgu" >
			    		<div class="input-group-addon">
			      		  <span class="glyphicon glyphicon-th"></span>
			    		</div>
				     </div></br>
				     <label for="inputdefault">Ngày xuất ngũ</label>
			         <div class="input-group date" data-provide="datepicker">
			    		<input type="text" class="form-control" id = "dpNgayXuatNgu" >
			    		<div class="input-group-addon">
			      		  <span class="glyphicon glyphicon-th"></span>
			    		</div>
				     </div></br>
			         <label for="inputdefault">Quân hàm cao nhất</label>
			         <input class="form-control" id="txtQuanHamCaoNhat" type="text"></br>
			         <label for="inputdefault">Danh hiệu được phong tặng cao nhất</label>
			         <input class="form-control" id="txtDanhHieuPhongTang" type="text"></br>
			         <label for="inputdefault">Số trường công tác giảng dạy</label>
			         <input class="form-control" id="txtSoTruongCongTac" type="text"></br>
        		 </div>
         	</div>
         </div>
         
         <div class="panel-group">
    	 	<div class="panel panel-default">
      	 		<div class="panel-heading">
	        		 <h4 class="panel-title">
	           			<a data-toggle="collapse" href="#collapse1">Khen thưởng, kỷ luật</a>
	         		 </h4>
         		</div>
	         	<div id="collapse1" class="panel-collapse collapse">
			         <label for="inputdefault">Khen thưởng</label>
			         <input class="form-control" id="txtKhenThuong" type="text"></br>
			         <label for="inputdefault">Kỷ luật</label>
			         <input class="form-control" id="txtKyLuat" type="text"></br>
        		 </div>
  	 		</div>
		 </div>
		 
		 
          <div class="panel-group">
    	 	<div class="panel panel-default">
      	 		<div class="panel-heading">
	        		 <h4 class="panel-title">
	           			<a data-toggle="collapse" href="#collapse2">Sức Khỏe</a>
	         		 </h4>
         		</div>
	         	<div id="collapse2" class="panel-collapse collapse">
		         	 <label for="inputdefault">Tình trạng sức khỏe</label>
			         <input class="form-control" id="txtTinhTrangSucKhoe" type="text"></br>
			         <label for="inputdefault">Chiều cao</label>
			         <input class="form-control" id="txtChieuCao" type="text"></br>
			         <label for="inputdefault">Cân nặng</label>
			         <input class="form-control" id="txtCanNang" type="text"></br>
			          <label for="inputdefault">Nhóm máu</label>
			         <input class="form-control" id="txtNhomMau" type="text" list="listNhomMau"></br>
			         <datalist id="listNhomMau">
			         	<option value="A"></option>
			         	<option value="B"></option>
			         	<option value="AB"></option>
			         	<option value="O"></option>
			         </datalist>
			         <label for="inputdefault">Số bảo hiểm xã hội</label>
			         <input class="form-control" id="txtSoBHXH" type="text">
	      		 </div>
  	 		</div>
		 </div>
         
         <label for="inputdefault">Là thương binh</label>
         <input class="form-control" id="txtLaThuongBinh" type="text"></br>
         <label for="inputdefault">Là con gia đình chính sách</label>
         <input class="form-control" id="txtConGiaDinhChinhSach" type="text"></br>
         <label for="inputdefault">Nhận xét</label>
         <textarea class="form-control" id="txtNhanXet"></textarea></br>
         
         <label for="inputdefault">Về Hưu</label>
         <input type="checkbox" value=""></label></br>
         <label for="inputdefault">Ngày về hưu</label>
         <div class="input-group date" data-provide="datepicker">
    		<input type="text" class="form-control" id = "dpNgayVeHuu" >
    		<div class="input-group-addon">
      		  <span class="glyphicon glyphicon-th"></span>
    		</div>
	     </div></br>
         <label for="inputdefault">Thôi việc</label>
         <input type="checkbox" value=""></label></br>
         <label for="inputdefault">Ngày thôi việc</label>
         <div class="input-group date" data-provide="datepicker">
    		<input type="text" class="form-control" id = "dpNgayThoiViec" >
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