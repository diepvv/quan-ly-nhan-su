<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Quyết định kỷ luật</title>
<%@include file="fragment/importResources.jsp"%>
<%@include file="fragment/importDataTableResources.jsp"%>
<script src="<c:url value='/resources/js/quyetDinhKyLuat.js' />"></script>
<link href="<c:url value='/resources/css/myDataTable.css' />"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<!-- header -->
	<%@include file="fragment/header.jsp"%>
	<!-- /inner_content-->
	<div class="inner_content">

		<!-- datatable start  -->
		<h1>DANH SÁCH QUYẾT ĐỊNH KỶ LUẬT</h1>
		<!-- 	<button id="button">btn</button> -->
		<table id="QuyetDinhKyLuatTable" class="display">

			<!-- Header Table -->
			<thead>
				<tr>
					<th>Họ và tên</th>
					<th>Số quyết định</th>
					<th>Tên quyết định kỷ luật</th>
					<th>Nội dung kỷ luật</th>
					<th>Ngày ký</th>
					<th>Người ký</th>
					<th>Chi tiết</th>
					<th>Xóa</th>
				</tr>
			</thead>
			<!-- Footer Table -->
			<tfoot>
				<tr>
					<th>Họ và tên</th>
					<th>Số quyết định</th>
					<th>Tên quyết định kỷ luật</th>
					<th>Nội dung kỷ luật</th>
					<th>Ngày ký</th>
					<th>Người ký</th>
					<th>Chi tiết</th>
					<th>Xóa</th>
				</tr>
			</tfoot>
		</table>
		<!-- datatable end -->
	</div>
	<%@include file="form/quyetDinhKyLuatForm.jsp"%>
</body>
</html>