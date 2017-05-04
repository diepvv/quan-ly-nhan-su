<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<div id="QuanLyCanBoForm" class="modal fade" role="dialog">
	<div class="modal-dialog modal-sm">
		<!-- Modal content-->
		<div class="modal-content ">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">Danh Sách Cán Bộ</h4>
			</div>
			<div class="modal-body">
				<div class="panel-group" id="accordion2">
					<input id="hidTieuChiQLCB" type="hidden">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseCanBoSapVeHuu"
									data-parent="#accordion2"
									onclick="$(hidTieuChiQLCB).val('canBoSapVeHuu')">Sắp về hưu</a>
							</h4>
						</div>
						<div id="collapseCanBoSapVeHuu" class="panel-collapse collapse">
							<label for="inputdefault">Số ngày cần kiểm tra(Ngày):</label> <input
								class="form-control" id="txtSoNgay" type="text">
						</div>
					</div>

					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseCanBoVeHuu"
									data-parent="#accordion2"
									onclick="$(hidTieuChiQLCB).val('canBoVeHuuThoiViec')">Đã về hưu hoặc thôi việc</a>
							</h4>
						</div>
						<div id="collapseCanBoVeHuu" class="panel-collapse collapse">
							<label for="dpTuNgay">Từ Ngày</label>
							<div class="input-group date" data-provide="datepicker">
								<input type="text" class="form-control" id="dpTuNgay">
								<div class="input-group-addon">
									<span class="glyphicon glyphicon-th"></span>
								</div>
							</div>
							<label for="dpDenNgay">Đến Ngày</label>
							<div class="input-group date" data-provide="datepicker">
								<input type="text" class="form-control" id="dpDenNgay">
								<div class="input-group-addon">
									<span class="glyphicon glyphicon-th"></span>
								</div>
							</div>
							<label for=""txtDieuKienTim"">Điều kiện tìm</label> <input
								class="form-control" id="txtDieuKienTim" type="text"
								list="listDieuKientim"></br>
							<datalist id="listDieuKientim">
								<option value="Về Hưu"></option>
								<option value="Thôi việc"></option>
							</datalist>
						</div>
					</div>

				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal"
					id="btnXacNhanQuanLyCanBo">Xác nhận</button>
				<button type="button" class="btn btn-default" data-dismiss="modal"
					id="btnDong">Đóng</button>
			</div>
		</div>

	</div>
</div>