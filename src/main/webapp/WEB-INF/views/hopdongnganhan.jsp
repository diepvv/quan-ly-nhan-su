<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Hop Dong Ngan Han</title>
<%@include file="fragment/importResources.jsp"%>
<%@include file="fragment/importDataTableResources.jsp"%>
<script src="<c:url value='/resources/js/hopDongNganHan.js' />"></script>
<link href="<c:url value='/resources/css/myDataTable.css' />" rel="stylesheet" type="text/css"/>
</head>
<body>
	<!-- header -->
	<%@include file="fragment/header.jsp"%>
	<!-- /inner_content-->
	<div class="inner_content">
	

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
		<div class="modal-dialog ">
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">HỢP ĐỒNG NGẮN HẠN</h4>
				</div>
				<div class="modal-body">

					<input class="form-control" id="maHopDongNganHan" type="hidden">

					<label for="inputdefault">Tên hợp đồng</label> <input
						class="form-control" id="tenhopdong" type="text"></br> <label
						for="inputdefault">Tên nhân viên</label> <input
						class="form-control" id="tennhanvien" type="text"></br> <label
						for="inputdefault">Ngày ký</label>
					<div class="input-group date" data-provide="datepicker">
						<input type="text" class="form-control" id="dpNgayKy">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-th"></span>
						</div>
					</div>
					</br> <label for="inputdefault">Từ Ngày</label>
					<div class="input-group date" data-provide="datepicker">
						<input type="text" class="form-control" id="dpTuNgay">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-th"></span>
						</div>
					</div>
					</br> <label for="inputdefault">Đến ngày</label>
					<div class="input-group date" data-provide="datepicker">
						<input type="text" class="form-control" id="dpDenNgay">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-th"></span>
						</div>
					</div>
					</br>

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal"
						id="btnCapNhap">Cập Nhập</button>
					<button type="button" class="btn btn-default" data-dismiss="modal"
						id="btnDong">Đóng</button>
				</div>
			</div>



		</div>
		<!-- //inner_content-->
		<!-- footer -->
		<%@include file="fragment/footer.jsp"%>
</body>
</html>