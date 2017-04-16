<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>home</title>
<%@include file="fragment/importResources.jsp"%>

</head>
<body>
	<!-- banner -->
	<%@include file="fragment/header.jsp"%>
	<!-- /inner_content-->
	<div class="inner_content">
		<!-- /inner_content_w3_agile_info-->
		<div class="inner_content_w3_agile_info">
			<!-- /agile_top_w3_grids-->

			<!-- //agile_top_w3_grids-->
			<!-- /agile_top_w3_post_sections-->
			<div class="agile_top_w3_post_sections">
				<div class="col-md-6 agile_top_w3_post agile_info_shadow">
					<div class="img_wthee_post">
						<h3 class="w3_inner_tittle">LƯỢT TRUY CẬP</h3>
						<div class="stats-wrap">
							<div class="count_info">
								<h4 class="count">1000</h4>
								<span class="year">QUẢN LÝ CÁN BỘ</span>
							</div>
							<div class="year-info">
								<p class="text-no">20</p>
								<span class="year">Năm</span>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="stats-wrap">
							<div class="count_info">
								<h4 class="count">800</h4>
								<span class="year">QUẢN LÝ QUYẾT ĐỊNH</span>
							</div>
							<div class="year-info">
								<p class="text-no">40</p>
								<span class="year">Tháng</span>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="stats-wrap">
							<div class="count_info">
								<h4 class="count">1200</h4>
								<span class="year">QUẢN LÝ HỢP ĐỒNG</span>
							</div>
							<div class="year-info">
								<p class="text-no">30</p>
								<span class="year">Tuần</span>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="stats-wrap">
							<div class="count_info">
								<h4 class="count">1204</h4>
								<span class="year">QUẢN LÝ TẢI SẢN</span>
							</div>
							<div class="year-info">
								<p class="text-no">10</p>
								<span class="year">Ngày</span>
							</div>
							<div class="clearfix"></div>
						</div>

					</div>
				</div>
				<div class="col-md-6 agile_top_w3_post_info agile_info_shadow">
					<div class="img_wthee_post1">
						<h3 class="w3_inner_tittle">THỜI GIAN TRUY CẬP</h3>
						<div class="main-example">
							<div class="clock"></div>
							<div class="message"></div>

						</div>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>

			<!-- /w3ls_agile_circle_progress-->
			<div class="w3ls_agile_circle_progress agile_info_shadow">
				<div class="cir_agile_info "></div>
			</div>
			<!-- /w3ls_agile_circle_progress-->

			<!-- /weather_w3_agile_info-->
			<div class="weather_w3_agile_info agile_info_shadow">
				<div class="weather_w3_inner_info">
					<div class="over_lay_agile">
						<h3 class="w3_inner_tittle">Dự Báo Thời Tiết</h3>
						<ul>
							<li>
								<figure class="icons">
									<canvas id="partly-cloudy-day" width="60" height="60"></canvas>
								</figure>
								<h3>25 °C</h3>
								<div class="clearfix"></div>
							</li>
							<li>
								<figure class="icons">
									<canvas id="clear-day" width="60" height="60"></canvas>
								</figure>
								<div class="weather-text">
									<h4>THỨ 2</h4>
									<h5>27 °C</h5>
								</div>
								<div class="clearfix"></div>
							</li>
							<li>
								<figure class="icons">
									<canvas id="snow" width="60" height="60"></canvas>
								</figure>
								<div class="weather-text">
									<h4>THỨ 3</h4>
									<h5>13 °C</h5>
								</div>
								<div class="clearfix"></div>
							</li>
							<li>
								<figure class="icons">
									<canvas id="partly-cloudy-night" width="60" height="60"></canvas>
								</figure>
								<div class="weather-text">
									<h4>THỨ 4</h4>
									<h5>18 °C</h5>
								</div>
								<div class="clearfix"></div>
							</li>
							<li>
								<figure class="icons">
									<canvas id="cloudy" width="60" height="60"></canvas>
								</figure>
								<div class="weather-text">
									<h4>THỨ 5</h4>
									<h5>15 °C</h5>
								</div>
								<div class="clearfix"></div>
							</li>
							<li>
								<figure class="icons">
									<canvas id="fog" width="60" height="60"></canvas>
								</figure>
								<div class="weather-text">
									<h4>THỨ 6</h4>
									<h5>11 °C</h5>
								</div>
								<div class="clearfix"></div>
							</li>
						</ul>
					</div>
				</div>
			</div>
			<!-- //weather_w3_agile_info-->
		</div>
		<!-- //inner_content_w3_agile_info-->
	</div>
	<!-- //inner_content-->
	</div>
	<!--copy rights start here-->
	<%@include file="fragment/footer.jsp"%>
	<!--copy rights end here-->

	<!--skycons-icons-->
	<script src="<c:url value='/resources/js/vendor/skycons.js'/>"></script>
	<script>
		var icons = new Skycons({
			"color" : "#fcb216"
		}), list = [ "partly-cloudy-day" ], i;

		for (i = list.length; i--;)
			icons.set(list[i], list[i]);
		icons.play();
	</script>
	<script>
		var icons = new Skycons({
			"color" : "#fff"
		}), list = [ "clear-night", "partly-cloudy-night", "cloudy",
				"clear-day", "sleet", "snow", "wind", "fog" ], i;

		for (i = list.length; i--;)
			icons.set(list[i], list[i]);
		icons.play();
	</script>
	<!--//skycons-icons-->

	<script src="<c:url value='/resources/js/vendor/flipclock.js'/>"></script>
	<script type="text/javascript">
		var clock;

		$(document).ready(function() {

			clock = $('.clock').FlipClock({
				clockFace : 'HourlyCounter'
			});
		});
	</script>

</body>
</html>