<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
	
<!-- /nav-->
		<div class="w3_agileits_top_nav">
			<ul id="gn-menu" class="gn-menu-main">
				<!-- /nav_agile_w3l -->
				<li class="gn-trigger"><a class="gn-icon gn-icon-menu"><i
						class="fa fa-bars" aria-hidden="true"></i><span>Menu</span></a>
					<nav class="gn-menu-wrapper">
						<div class="gn-scroller scrollbar1">
							<ul class="gn-menu agile_menu_drop">
								<li><a href="/"> <i
										class="fa fa-tachometer"></i> Trang chủ
								</a></li>
								<li><a href="#"><i class="fa fa-cogs"
										aria-hidden="true"></i>Quản lý cán bộ<i
										class="fa fa-angle-down" aria-hidden="true"></i></a>
									<ul class="gn-submenu">
										<li class="mini_list_agile"><a href="/canBoController/show"><i
												class="fa fa-caret-right" aria-hidden="true"></i>  Danh sách cán bộ</a></li>
										<li class="mini_list_w3"><a href="/danhSachKhoanGonController/show"> <i
												class="fa fa-caret-right" aria-hidden="true"></i>  Danh sách khoán gọn
										</a></li>
										<li class="mini_list_w3"><a href="/danhSachKiemNhiemController/show"> <i
												class="fa fa-caret-right" aria-hidden="true"></i>  Danh sách kiêm nhiệm
										</a></li>
										<!-- <li class="mini_list_w3"><a href="/danhSachThamNienController/show"> <i
												class="fa fa-caret-right" aria-hidden="true"></i>  Danh sách thâm niên
										</a></li> -->
									</ul></li>
								<li><a href="#"> <i class="fa fa-file-text-o"
										aria-hidden="true"></i>Quản lý hợp đồng <i class="fa fa-angle-down"
										aria-hidden="true"></i></a>
									<ul class="gn-submenu">
										<li class="mini_list_agile"><a href="/hopDongCanBoController/show"><i
												class="fa fa-caret-right" aria-hidden="true"></i> Hợp đồng cán bộ</a></li>
										<li class="mini_list_w3"><a href="/hopDongNganHanController/show"><i
												class="fa fa-caret-right" aria-hidden="true"></i> Hợp đồng ngắn hạn</a></li>
									</ul></li>
								
								<!-- <li><a href="#"><i class="fa fa-list"
										aria-hidden="true"></i> Lương, Tài sản<i class="fa fa-angle-down"
										aria-hidden="true"> </i></a>
									<ul class="gn-submenu">
										<li class="mini_list_agile"><a href="/luongCanBoController/show"><i
												class="fa fa-caret-right" aria-hidden="true"></i> Quá trình lương</a></li>
										<li class="mini_list_w3"><a href="/keKhaiTaiSanController/show"> <i
												class="fa fa-caret-right" aria-hidden="true"></i> Kê khai tài sản
										</a></li>

									</ul></li> -->
								
								<li><a href="#"><i class="fa fa-list"
										aria-hidden="true"></i>Quản lý quyết định <i class="fa fa-angle-down"
										aria-hidden="true"> </i></a>
									<ul class="gn-submenu">
										<li class="mini_list_agile"><a href="/quyetDinhController/show"><i
												class="fa fa-caret-right" aria-hidden="true"></i> Danh sách quyết định</a></li>
										<li class="mini_list_w3"><a href="/quyetDinhKhenThuongController/show"> <i
												class="fa fa-caret-right" aria-hidden="true"></i> Quyết định khen thưởng
										</a></li>
										<li class="mini_list_w3"><a href="/quyetDinhKyLuatController/show"> <i
												class="fa fa-caret-right" aria-hidden="true"></i> Quyết định kỷ luật
										</a></li>

									</ul></li>

								<li class="page"><a href="#"><i class="fa fa-files-o"
										aria-hidden="true"></i> Danh mục <i class="fa fa-angle-down"
										aria-hidden="true"></i></a>
									<ul class="gn-submenu">

										<li class="mini_list_agile"><a href="/chucVuController/show"> <i
												class="fa fa-caret-right" aria-hidden="true"></i> Chức vụ
										</a></li>
										<li class="mini_list_w3"><a href="/ngachCongChucController/show"> <i
												class="fa fa-caret-right" aria-hidden="true"></i> Ngạch công chức
										</a></li>
										<li class="mini_list_agile error"><a href="/loaiHopDongController/show">
												<i class="fa fa-caret-right" aria-hidden="true"></i> Loại hợp đồng
										</a></li>
										<li class="mini_list_agile error"><a href="/loaiQuyetDinhController/show">
												<i class="fa fa-caret-right" aria-hidden="true"></i> Loại quyết định
										</a></li>
										<li class="mini_list_agile error"><a href="/danTocController/show">
												<i class="fa fa-caret-right" aria-hidden="true"></i> Dân tộc
										</a></li>
										<li class="mini_list_agile error"><a href="/tonGiaoController/show">
												<i class="fa fa-caret-right" aria-hidden="true"></i> Tôn giáo
										</a></li>
										<li class="mini_list_agile error"><a href="/donViChucNangController/show">
												<i class="fa fa-caret-right" aria-hidden="true"></i> Đơn vị chức năng
										</a></li>

									</ul></li>
								<li><a href="#"> <i class="fa fa-suitcase"
										aria-hidden="true"></i>Thoát <i class="fa fa-angle-down"
										aria-hidden="true"></i></a>
									<ul class="gn-submenu">
										<li class="mini_list_agile"><a href="/loginController"> <i
												class="fa fa-caret-right" aria-hidden="true"></i> Đăng xuất
										</a></li>
									</ul></li>
							</ul>
						</div>
						<!-- /gn-scroller -->
					</nav></li>
				<!-- //nav_agile_w3l -->