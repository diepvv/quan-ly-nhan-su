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
<script src="<c:url value='/resources/js/keKhaiTaiSan.js' />"></script>
<link href="<c:url value='/resources/css/myDataTable.css' />" rel="stylesheet" type="text/css"/>
<link href="<c:url value='/resources/css/quanlynhansu.css' />" rel="stylesheet" type="text/css"/>
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
				<th>Chi Tiết CB</th>
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
				<th>Chi Tiết</th>
				<th>Xóa CB</th>
			</tr>
		</tfoot>
	</table>

	<!-- datatable end -->
		</div>
		<%@include file="form/canBoForm.jsp"%>
		<%@include file="form/chiTietCanBoForm.jsp"%>
		<%@include file="form/thongKeForm.jsp"%>
		<%@include file="form/donViForm.jsp"%>
		<%@include file="form/quanLyCanBoForm.jsp"%>
		<!-- footer -->
	<%@include file="fragment/footer.jsp"%>
</body>
</html>