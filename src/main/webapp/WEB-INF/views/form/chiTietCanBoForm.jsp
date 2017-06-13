<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<div id="ChiTietCanBoForm" class="modal fade background-white"
	role="dialog">
	<div class="full-screen-modal-dialog">
		<!-- Modal content-->
		<div class="full-screen-modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<center>
					<h4 class="modal-title">CHI TIẾT CÁN BỘ</h4>
				</center>
			</div>
			<div class="modal-body">
				<%@include file="soYeuLyLich.jsp"%>
			</div>
		</div>
		<div class="modal-footer">
			<button type=button class="btn btn-default"	id="btnCapNhapSoYeuLyLich">CẬP NHẬP</button>
			<button type="button" class="btn btn-default" data-dismiss="modal" id="btnDong">Đóng</button>
		</div>
	</div>

</div>
</div>