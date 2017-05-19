<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>login</title>
<%@include file="fragment/importResources.jsp"%>
</head>
<body>
	<!-- /pages_agile_info_w3l -->
	<div class="pages_agile_info_w3l">
		<!-- /login -->
		<div class="over_lay_agile_pages_w3ls">
			<div class="registration">
				<div class="signin-form profile">
					<h2>ĐĂNG NHẬP HỆ THỐNG</h2>
					<div class="login-form">
						<form action="#" method="post">
							<input type="text" name="user" placeholder="Tên đăng nhập" required="">
							<input type="password" name="password" placeholder="Mật khẩu"
								required="">
							<div class="tp">
								<input type="submit" value="Đăng Nhập">
							</div>
						</form>
					</div>

				</div>
			</div>
		</div>
	</div>

</body>
</html>