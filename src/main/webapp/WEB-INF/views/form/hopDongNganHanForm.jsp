<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div id="formHopDongNganHan" class="modal fade" role="dialog">
	<form id="formTest" method="post" action="#" class="valida" autocomplete="off" novalidate="novalidate">
		<div class="modal-dialog">
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">HỢP ĐỒNG NGẮN HẠN</h4>
				</div>
				<div class="modal-body">
					<input class="form-control" id="pk" type="hidden">
					<input class="form-control" id="version" type="hidden">
					<div class="form-group">
						<label for="tenhopdong">Tên hợp đồng</label> 
						<input class="form-control" id="tenhopdong" name="tenhopdong" required="true" type="text"></br>
					</div>
					<div class="form-group">
						<label for="tennhanvien">Tên nhân viên</label> 
						<input class="form-control" id="tennhanvien" required="true" type="text">
					</div>
					<label for="dpNgayKy">Ngày ký</label>
					<div class="input-group date" data-provide="datepicker">
						<input type="text" class="form-control" id="dpNgayKy">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-th"></span>
						</div>
					</div>
					<label for="dpTuNgay">Từ Ngày</label>
					<div class="input-group date" data-provide="datepicker">
						<input type="text" class="form-control" id="dpTuNgay">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-th"></span>
						</div>
					</div>
					<label for="dpDenNgay">Đến ngày</label>
					<div class="input-group date" data-provide="datepicker">
						<input type="text" class="form-control" id="dpDenNgay">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-th"></span>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" id="btnCapNhap">Cập Nhập</button> 
					<input type="reset" name="res-1" id="res-1" value="Làm mới" class="btn btn-danger">
					<button type="button" class="btn btn-default" data-dismiss="modal" id="btnDong">Đóng</button>
				</div>
			</div>
		</div>
	</form>
</div>
