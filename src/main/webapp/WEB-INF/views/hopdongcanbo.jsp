<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Hợp đồng cán bộ</title>
<%@include file="fragment/importResources.jsp"%>
<%@include file="fragment/importDataTableResources.jsp"%>
<script src="<c:url value='/resources/js/hopDongCanBo.js' />"></script>
<link href="<c:url value='/resources/css/myDataTable.css' />"
	rel="stylesheet" type="text/css" />
</head>
<body>
	<!-- header -->
	<%@include file="fragment/header.jsp"%>
	<!-- /inner_content-->
	<div class="inner_content">

		<!-- datatable start  -->
		<h1>DANH SÁCH HỢP ĐỒNG CÁN BỘ</h1>
		<!-- 	<button id="button">btn</button> -->
		<table id="HopDongCanBoTable" class="display">

			<!-- Header Table -->
			<thead>
				<tr>
					<th>Cán bộ</th>
					<th>Mã hợp đồng</th>
					<th>Tên hợp đồng</th>
					<th>Loại hợp đồng</th>
					<th>Ngày ký</th>
					<th>Ngày hết hạn hợp đồng</th>
					<th>Trích yếu nội dung</th>
					<th>Sửa HD</th>
					<th>Xóa HD</th>
				</tr>
			</thead>
			<!-- Footer Table -->
			<tfoot>
				<tr>
					<th>Cán bộ</th>
					<th>Mã hợp đồng</th>
					<th>Tên hợp đồng</th>
					<th>Loại hợp đồng</th>
					<th>Ngày ký</th>
					<th>Ngày hết hạn hợp đồng</th>
					<th>Trích yếu nội dung</th>
					<th>Sửa HD</th>
					<th>Xóa HD</th>
				</tr>
			</tfoot>
		</table>
		<!-- datatable end -->
	</div>
	<%@include file="form/hopDongCanBoForm.jsp"%>
	<!-- //inner_content-->
	<!-- footer -->
	<%-- <%@include file="fragment/footer.jsp"%> --%>
</body>
</html>