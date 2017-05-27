<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div id="formDanhSachKhoanGon" class="modal fade" role="dialog">
	<div class="modal-dialog ">
		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">DANH SÁCH KHOÁN GỌN</h4>
			</div>
			<div class="modal-body">
				<input class="form-control" id="pk" type="hidden">
				<label for="donViChucNangDskg_pk">Đơn vị công tác</label> 
				<c:if test="${not empty donViChucNangLists}">
					<select class="form-control my-select-control-style" id="donViChucNangDskg_pk">
						<c:forEach var="dto" items="${donViChucNangLists}">
							<option value="${dto.pk}">${dto.tenDonVi}</option>
						</c:forEach>
					</select>
				</c:if>
				<label for="hoTenCanBo">Họ tên cán bộ</label> 
				<input class="form-control" id="hoTenCanBo" type="text">
				<label for="soDienThoai">Số điện thoại</label> 
				<input class="form-control" id="soDienThoai" type="text">
				<label for="soCmnd">CMND</label>
				<input class="form-control" id="soCmnd" type="text">
				<label for="diaChi">Địa chỉ</label> 
				<input class="form-control" id="diaChi" type="text">
				<label for="ngayKyHopDong">Ngày Cấp</label>
				<div class="input-group date" data-provide="datepicker">
					<input type="text" class="form-control" id="ngayKyHopDong">
					<div class="input-group-addon">
						<span class="glyphicon glyphicon-th"></span>
					</div>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal" id="btnCapNhap">Cập Nhập</button>
				<button type="button" class="btn btn-default" data-dismiss="modal" id="btnDong">Đóng</button>
			</div>
		</div>
	</div>
</div>