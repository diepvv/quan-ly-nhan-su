<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<div id="DonViForm" class="modal fade" role="dialog">
	<div class="modal-dialog modal-sm">
		<!-- Modal content-->
		<div class="modal-content ">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">Chọn Đơn Vị</h4>
			</div>
			<div class="modal-body">
				<label for="txtDonViCT">Đơn vị công tác</label> <input
					class="form-control" id="txtDonViCT" type="text"
					list="listDonViCT"></br>
				<datalist id="listDonViCT">
					<option value="a"></option>
					<option value="b"></option>
					<option value="c"></option>
				</datalist>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal"
					id="btnXacNhanDonVi">Xác nhận</button>
				<button type="button" class="btn btn-default" data-dismiss="modal"
					id="btnDong">Đóng</button>
			</div>
		</div>

	</div>
</div>