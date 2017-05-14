<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<div id="formHopDongCanBo" class="modal fade" role="dialog">
	<div class="modal-dialog ">

		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">ThÔNG TIN HỢP ĐỒNG CÁN BỘ</h4>
			</div>
			<div class="modal-body">
				<input class="form-control" id="pk" type="hidden">

				<label for="donViChucNangHdcb_pk">Đơn vị</label> 
				<c:if test="${not empty donViChucNangLists}">
					<select class="form-control my-select-control-style" id="donViChucNangHdcb_pk">
						<c:forEach var="dto" items="${donViChucNangLists}">
							<option value="${dto.pk}">${dto.tenDonVi}</option>
						</c:forEach>
					</select>
				</c:if>
				
				<label for="canBoQdkl_pk">Cán bộ</label> 
				<c:if test="${not empty canBoLists}">
					<select class="form-control my-select-control-style" id="canBoQdkl_pk">
						<c:forEach var="dto" items="${canBoLists}">
							<option value="${dto.pk}">${dto.ten}</option>
						</c:forEach>
					</select>
				</c:if>
				<label for="maHopDong">Mã hợp đồng</label> 
				<input class="form-control" id="maHopDong" type="text">
				 
				<label for="tenHopDong">Tên hợp đồng</label> 
				<input class="form-control" id="tenHopDong" type="text">
				 
				<label for="chucVu">Chức vụ</label>
				<input class="form-control" id="chucVu" type="text">
				
				<label for="loaiHopDongHdcb_pk">Loại hợp đồng</label> 
				<c:if test="${not empty loaiHopDongLists}">
					<select class="form-control my-select-control-style" id="loaiHopDongHdcb_pk">
						<c:forEach var="dto" items="${loaiHopDongLists}">
							<option value="${dto.pk}">${dto.tenLoaiHopDong}</option>
						</c:forEach>
					</select>
				</c:if>
				
				<label for="ngayKy">Ngày Ký</label>
				<div class="input-group date" data-provide="datepicker">
					<input type="text" class="form-control" id="ngayKy">
					<div class="input-group-addon">
						<span class="glyphicon glyphicon-th"></span>
					</div>
				</div>
				
				
				<label for="tuNgay">Hợp đồng từ ngày</label>
				<div class="input-group date" data-provide="datepicker">
					<input type="text" class="form-control" id="tuNgay">
					<div class="input-group-addon">
						<span class="glyphicon glyphicon-th"></span>
					</div>
				</div>
				<label for="denNgay">Hợp đồng đến ngày</label>
				<div class="input-group date" data-provide="datepicker">
					<input type="text" class="form-control" id="denNgay">
					<div class="input-group-addon">
						<span class="glyphicon glyphicon-th"></span>
					</div>
				</div>
				
				<label for="trichYeuNoiDung">Trích yếu nội dung</label>
				<textarea class="form-control" id="trichYeuNoiDung" type="text"></textarea>
				
				<label for="fileHD">Upload file scan hợp đồng</label> 
				<input class="form-control" id="fileHD" type="text">
				
			</div>
			
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal"
					id="btnCapNhap">Cập Nhập</button>
				<button type="button" class="btn btn-default" data-dismiss="modal"
					id="btnDong">Đóng</button>
			</div>
		</div>

	</div>
</div>