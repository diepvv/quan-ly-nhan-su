<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<!-- banner -->
	<div class="wthree_agile_admin_info">
		<!-- /w3_agileits_top_nav-->
		<%-- <%@include file="<c:url value='/WEB-INF/views/fragment/slideMenu.jsp'/>" %> --%>
		<%@include file="slideMenu.jsp" %>
		
				<li class="second logo"><h1>
						<a href="/"><i class="fa fa-graduation-cap"
							aria-hidden="true"></i>TRANG CHỦ </a>
					</h1></li>
				<li class="second admin-pic">
					<ul class="top_dp_agile">
						<li class="dropdown profile_details_drop"><a href="#"
							class="dropdown-toggle" data-toggle="dropdown"
							aria-expanded="false">
								<div class="profile_img">
									<span class="prfil-img"><img src="<c:url value='/resources/images/admin.jpg'/>"
										alt=""> </span>
								</div>
						</a>
							<ul class="dropdown-menu drp-mnu">
								<li><a href="#"><i class="fa fa-cog"></i> Xin chào AD</a></li>
								<li><a href="/addAdminController"><i class="fa fa-user"></i> Thêm admin</a></li>
								<li><a href="/loginController"><i class="fa fa-sign-out"></i> Đăng xuất</a></li>
							</ul></li>

					</ul>
				</li>

				<li class="second top_bell_nav">
					<h2>QUẢN LÝ NHÂN SỰ TRƯỜNG ĐẠI HỌC</h2>
				</li>
				<li class="second full-screen">
					<section class="full-top">
						<button id="toggle">
							<i class="fa fa-arrows-alt" aria-hidden="true"></i>
						</button>
					</section>
				</li>
				

			</ul>
			<!-- //nav -->

		</div>
		<div class="clearfix"></div>
		<!-- //w3_agileits_top_nav-->	