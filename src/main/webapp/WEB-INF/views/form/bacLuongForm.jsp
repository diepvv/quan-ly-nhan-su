<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<div id="formBacLuong" class="modal fade" role="dialog">
	<form id="formTest" method="post" action="#" class="valida"
		autocomplete="off" novalidate="novalidate">
		<div class="modal-dialog">
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">BẬC LƯƠNG</h4>
				</div>
				<div class="modal-body">
					<input class="form-control" id="maBacLuong" type="hidden">
					<div class="form-group">
						<label for="heSoLuong">Hệ Số Lương</label> <input
							class="form-control" id="heSoLuong" name="heSoLuong"
							required="true" type="text"></br>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal"
						id="btnCapNhap">Cập Nhập</button>
					<button type="button" class="btn btn-default" data-dismiss="modal"
						id="btnDong">Đóng</button>
				</div>
			</div>
		</div>
	</form>
</div>

