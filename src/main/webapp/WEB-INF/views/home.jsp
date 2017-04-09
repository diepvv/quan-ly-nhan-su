<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Home Pages</title>
<link rel="stylesheet" type="text/css" href="<c:url value="style.css"/>" />
<link rel="stylesheet" href="/webjars/bootstrap/3.3.7/css/bootstrap.min.css">

<script type="text/javascript" src="webjars/jquery/3.1.1/jquery.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
    					<li><a href="#">DANH SÁCH CÁN BỘ KHOÁN GỌN</a></li>
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
<!-- 	<div class="container"> -->
<!-- 		<div class="starter-template"> -->
<!-- 			<h1>BODY THYMELEAF</h1> -->
<!-- 			<h2> -->
<!-- 				TRUONG DAI HOC GIAO THONG VAN TAI-PHAN HIEU THANH PHO HO CHI MINH -->
<!-- 			</h2> -->
<!-- 		</div> -->
<!-- 	</div> -->
</body>
</html>