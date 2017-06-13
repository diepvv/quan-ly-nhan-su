<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div id="formQuyetDinhKyLuat" class="modal fade" role="dialog">
	<form id="formTest" method="post" action="#" class="valida" autocomplete="off" novalidate="novalidate">
		<div class="modal-dialog ">
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
					<h4 class="modal-title">THÔNG TIN QUYẾT ĐỊNH KỶ LUẬT</h4>
				</div>
				<div class="modal-body">
					<input class="form-control" id="pk" type="hidden"> 
					<input class="form-control" id="version" type="hidden">
					<div class="form-group">
						<label for="donViChucNangQdkl_pk">Đơn vị</label>
						<c:if test="${not empty donViChucNanglists}">
							<select class="form-control my-select-control-style" id="donViChucNangQdkl_pk" 
									onchange="changeDonViChucNang()" required="true">
								<c:forEach var="dto" items="${donViChucNanglists}">
									<option value="${dto.pk}">${dto.tenDonVi}</option>
								</c:forEach>
							</select>
						</c:if>
					</div>
					<div class="form-group">
						<label for="canBoQdkl_pk">Cán bộ</label> 
						<select class="form-control my-select-control-style" id="canBoQdkl_pk" required="true"></select>
					</div>
					<div class="form-group">
						<label for="soQuyetDinh">Số quyết định</label> 
						<input class="form-control" id="soQuyetDinh" type="text" required="true">
					</div>
					<div class="form-group">
						<label for="tenQuyetDinh">Tên quyết định</label> 
						<input class="form-control" id="tenQuyetDinh" type="text" required="true">
					</div>
					<div class="form-group">
						<label for="noiDungQuyetDinh">Nội dung quyết định kỷ luật</label>
						<textarea class="form-control" id="noiDungQuyetDinh" type="text" required="true"></textarea>
					</div>
					<label for="ngayKy">Ngày Ký</label>
					<div class="input-group date" data-provide="datepicker">
						<input type="text" class="form-control" id="ngayKy">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-th"></span>
						</div>
					</div>
					<label for="nguoiKy">Người ký</label> 
					<input class="form-control" id="nguoiKy" type="text"> 
					<label for="tuNgay">Từ ngày</label>
					<div class="input-group date" data-provide="datepicker">
						<input type="text" class="form-control" id="tuNgay">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-th"></span>
						</div>
					</div>
					<label for="denNgay">Đến ngày</label>
					<div class="input-group date" data-provide="datepicker">
						<input type="text" class="form-control" id="denNgay">
						<div class="input-group-addon">
							<span class="glyphicon glyphicon-th"></span>
						</div>
					</div>
					<!--  <label for="fileKy">Upload file scan</label>--> 
					<input class="form-control" id="fileKy" type="hidden">

				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" id="btnCapNhap">Cập Nhập</button>
					<button type="button" class="btn btn-default" data-dismiss="modal" id="btnDong">Đóng</button>
				</div>
			</div>
		</div>
	</form>
</div>