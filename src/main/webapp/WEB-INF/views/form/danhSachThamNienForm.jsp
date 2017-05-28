<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div id="formDanhSachThamNien" class="modal fade" role="dialog">
	<div class="modal-dialog">

		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">DANH SÁCH THÂM NIÊN</h4>
			</div>
			<div class="modal-body">
				<input class="form-control" id="pk" type="hidden">

				<div class="row">
					<div class="col-md-6">
						<label for="donViChucNangDstn_pk">Đơn vị</label>
						<c:if test="${not empty donViChucNangLists}">
							<select class="form-control my-select-control-style" id="donViChucNangDstn_pk">
								<c:forEach var="dto" items="${donViChucNangLists}">
									<option value="${dto.pk}">${dto.tenDonVi}</option>
								</c:forEach>
							</select>
						</c:if>
					</div>
					<div class="col-md-6">
						<label for="canBoDstn_pk">Cán bộ</label>
						<c:if test="${not empty canBoLists}">
							<select class="form-control my-select-control-style" id="canBoDstn_pk">
								<c:forEach var="dto" items="${canBoLists}">
									<option value="${dto.pk}">${dto.ten}</option>
								</c:forEach>
							</select>
						</c:if>
					</div>
				</div>

				<div class="row">
					<div class="col-md-6">
						<label for="mocTinhPhuCapTn" class="label-style">Mốc tính phụ cấp thâm niên</label>
						<div class="input-group date" data-provide="datepicker">
							<input type="text" class="form-control" id="mocTinhPhuCapTn">
							<div class="input-group-addon">
								<span class="glyphicon glyphicon-th"></span>
							</div>
						</div>

					</div>
				</div>

				<div class="row">
					<div class="col-md-6">
						<label for="bacLuongDstn_pk">Hệ số lương</label> 
						<input class="form-control" id="bacLuongDstn_pk" type="text">
					</div>
					<div class="col-md-6">
						<label for="phuCapChucVu">Phụ cấp chức vụ</label> 
						<input class="form-control" id="phuCapChucVu" type="text">
					</div>
				</div>

				<div class="row">
					<div class="col-md-6">
						<label for="vuotKhung" class="label-style">Vượt khung</label> 
						<input class="form-control" id="vuotKhung" type="text">
					</div>
					<div class="col-md-6">
						<label for="tongHeSoLuong" class="label-style">Tổng hệ số lương</label> 
						<input class="form-control" id="tongHeSoLuong" type="text">
					</div>
				</div>

				<div class="row">
					<div class="col-md-6">
						<label for="phuCapGiangVien" class="label-style">Phụ cấp GV</label> 
						<input class="form-control" id="phuCapGiangVien" type="text">
					</div>
					<div class="col-md-6">
						<label for="soThangBiGiamTru" class="label-style">Số tháng bị giảm trừ</label> 
						<input class="form-control" id="soThangBiGiamTru" type="text">
					</div>
				</div>
				<div class="row">
					<div class="col-md-6">
						<label for="thoiDiemTangPhuCapTn" class="label-style">Thời điểm tăng PCTN</label>
						<div class="input-group date" data-provide="datepicker">
							<input type="text" class="form-control" id="thoiDiemTangPhuCapTn">
							<div class="input-group-addon">
								<span class="glyphicon glyphicon-th"></span>
							</div>
						</div>
					</div>
				</div>

				<label for="ghiChuThoiDiemTang">Ghi chú</label>
				<textarea class="form-control" id="ghiChuThoiDiemTang"></textarea>

				<label class="label-style">THỜI GIAN KHÔNG TÍNH PHỤ CẤP THÂM NIÊN</label>
				<div class="row">
					<div class="col-md-6">
						<label for="tuNgay">Từ ngày</label>
						<div class="input-group date" data-provide="datepicker">
							<input type="text" class="form-control" id="tuNgay">
							<div class="input-group-addon">
								<span class="glyphicon glyphicon-th"></span>
							</div>
						</div>
					</div>
					<div class="col-md-6">
						<label for="denNgay">Đến ngày</label>
						<div class="input-group date" data-provide="datepicker">
							<input type="text" class="form-control" id="denNgay">
							<div class="input-group-addon">
								<span class="glyphicon glyphicon-th"></span>
							</div>
						</div>
					</div>
				</div>
				<label for="ghiChuKhongPhuCapTn">Ghi chú</label>
				<textarea class="form-control" id="ghiChuKhongPhuCapTn"></textarea>
			</div>

			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal" id="btnCapNhap">Cập Nhập</button>
				<button type="button" class="btn btn-default" data-dismiss="modal" id="btnDong">Đóng</button>
			</div>
		</div>

	</div>
</div>