<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Hợp đồng ngắn hạn</title>
<%@include file="fragment/importResources.jsp"%>
<%@include file="fragment/importDataTableResources.jsp"%>
<script src="<c:url value='/resources/js/hopDongNganHan.js' />"></script>
<link href="<c:url value='/resources/css/myDataTable.css' />"
	rel="stylesheet" type="text/css" />
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
	<%@include file="form/hopDongNganHanForm.jsp"%>
	<!-- //inner_content-->
	<!-- footer -->
	<%-- <%@include file="fragment/footer.jsp"%> --%>
</body>
</html>