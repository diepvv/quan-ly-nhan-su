<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>DANH SACH CAN BO</title>
<%@include file="fragment/importResources.jsp"%>
<%@include file="fragment/importDataTableResources.jsp"%>
<script src="<c:url value='/resources/js/canbo.js' />"></script>
<link href="<c:url value='/resources/css/myDataTable.css' />" rel="stylesheet" type="text/css"/>
</head>
<body>
<!-- header -->
	<%@include file="fragment/header.jsp"%>
	<!-- /inner_content-->
	<div class="inner_content">
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