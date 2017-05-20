<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<div id="formDanToc" class="modal fade" role="dialog">
	<form id="formTest" method="post" action="#" class="valida"
		autocomplete="off" novalidate="novalidate">
		<div class="modal-dialog">
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">DÂN TỘC</h4>
				</div>
				<div class="modal-body">
					<input class="form-control" id="pk" type="hidden">
					<div class="form-group">
						<label for="tenDanToc">Tên Dân Tộc</label> <input
							class="form-control" id="tenDanToc" name="tenDanToc"
							required="true" type="text"></br>
					</div>
				</div>
				<div class="modal-footer">
					<input type="submit" name="sub-1" value="Cập Nhập"
						class="btn btn-primary" id="btnCapNhap">
					<button type="button" class="btn btn-default" data-dismiss="modal"
						id="btnDong">Đóng</button>
				</div>
			</div>
		</div>
	</form>
</div>

