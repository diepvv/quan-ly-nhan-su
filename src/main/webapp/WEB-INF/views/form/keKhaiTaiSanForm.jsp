<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div id="formKeKhaiTaiSan" class="modal fade" role="dialog">
	<div class="modal-dialog ">
		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">CHI TIẾT KÊ KHAI TÀI SẢN</h4>
			</div>
			<div class="modal-body">
				<input class="form-control" id="pk" type="hidden">

				<label for="donViChucNangKkts_pk">Đơn vị</label> 
				<c:if test="${not empty donViChucNangLists}">
					<select class="form-control my-select-control-style" id="donViChucNangKkts_pk">
						<c:forEach var="dto" items="${donViChucNangLists}">
							<option value="${dto.pk}">${dto.tenDonVi}</option>
						</c:forEach>
					</select>
				</c:if>
				
				<label for="canBoKkts_pk">Cán bộ</label> 
				<c:if test="${not empty canBoLists}">
					<select class="form-control my-select-control-style" id="canBoKkts_pk">
						<c:forEach var="dto" items="${canBoLists}">
							<option value="${dto.pk}">${dto.ten}</option>
						</c:forEach>
					</select>
				</c:if>
				<label for="ngayKeKhai">Ngày kê khai</label>
				<div class="input-group date" data-provide="datepicker">
					<input type="text" class="form-control" id="ngayKeKhai">
					<div class="input-group-addon">
						<span class="glyphicon glyphicon-th"></span>
					</div>
				</div>
				<label for="fileKeKhai">Upload file scan</label> 
				<input class="form-control" id="fileKeKhai" type="text">
			</div>
			
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal" id="btnCapNhap">Cập Nhập</button>
				<button type="button" class="btn btn-default" data-dismiss="modal" id="btnDong">Đóng</button>
			</div>
		</div>
	</div>
</div>