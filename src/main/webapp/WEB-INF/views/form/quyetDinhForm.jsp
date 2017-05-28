<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div id="formQuyetDinh" class="modal fade" role="dialog">
	<div class="modal-dialog ">
		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">CHI TIẾT QUYẾT ĐỊNH</h4>
			</div>
			<div class="modal-body">
				<input class="form-control" id="pk" type="hidden">

				<label for="donViChucNangQd_pk">Đơn vị</label> 
				<c:if test="${not empty donViChucNanglists}">
					<select class="form-control my-select-control-style" id="donViChucNangQd_pk">
						<c:forEach var="dto" items="${donViChucNanglists}">
							<option value="${dto.pk}">${dto.tenDonVi}</option>
						</c:forEach>
					</select>
				</c:if>
				
				<label for="canBoQd_pk">Cán bộ</label> 
				<c:if test="${not empty canBolists}">
					<select class="form-control my-select-control-style" id="canBoQd_pk">
						<c:forEach var="dto" items="${canBolists}">
							<option value="${dto.pk}">${dto.ten}</option>
						</c:forEach>
					</select>
				</c:if>
				<label for="soQuyetDinh">Số quyết định</label> 
				<input class="form-control" id="soQuyetDinh" type="text">
				<label for="tenQuyetDinh">Tên quyết định</label> 
				<input class="form-control" id="tenQuyetDinh" type="text">
				<label for="loaiQuyetDinhQd_pk">Loại quyết định</label> 
				<c:if test="${not empty loaiQuyetDinhlists}">
					<select class="form-control my-select-control-style" id="loaiQuyetDinhQd_pk">
						<c:forEach var="dto" items="${loaiQuyetDinhlists}">
							<option value="${dto.pk}">${dto.tenLoaiQuyetDinh}</option>
						</c:forEach>
					</select>
				</c:if>
				<label for="noiDungQuyetDinh">Nội dung quyết định</label>
				<textarea class="form-control" id="noiDungQuyetDinh" type="text"></textarea>
				<label for="ngayKy">Ngày Ký</label>
				<div class="input-group date" data-provide="datepicker">
					<input type="text" class="form-control" id="ngayKy">
					<div class="input-group-addon">
						<span class="glyphicon glyphicon-th"></span>
					</div>
				</div>
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
				<label for="nguoiKy">Người ký</label> 
				<input class="form-control" id="nguoiKy" type="text">
				<label for="fileKy">Upload file scan</label> 
				<input class="form-control" id="fileKy" type="text">
				
			</div>
			
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal" id="btnCapNhap">Cập Nhập</button>
				<button type="button" class="btn btn-default" data-dismiss="modal" id="btnDong">Đóng</button>
			</div>
		</div>
	</div>
</div>