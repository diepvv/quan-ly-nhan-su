<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<style>
.modal-dialog1 {
  width: 100%;
  height: 100%;
  margin: 0;
  padding: 0;
}k

.modal-content {
  height: auto;
  min-height: 100%;
  border-radius: 0;
}
</style>	
<div id="ChiTietCanBoForm" class="modal fade" role="dialog">
	<div class="modal-dialog1 " >
		<!-- Modal content-->
		<div class="modal-content ">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">CHI TIẾT CÁN BỘ</h4>
			</div>
			<div class="modal-body">
				<div class="panel-group" id="accordion1">
					<input id="hidTieuChiChiTietCanBo" type="hidden">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseSoYeuLyLich" data-parent="#accordion1"
									onclick="$(hidTieuChiChiTietCanBo).val('soYeuLyLich')">Sơ Yếu Lý Lịch</a>
							</h4>
						</div>
						<div id="collapseSoYeuLyLich" class="panel-collapse collapse">
							 <div class ="row">
								 <div class="col-md-3">
								 	<label for="inputdefault">Đơn vị công tác</label>
							         <input class="form-control" id="txtDonViCongTac" type="text" list="listDonvicongTac"></br>
							         <datalist id="listDonvicongTac">
							         	<option value="a"></option>
							         	<option value="b"></option>
							         	<option value="c"></option>
							         </datalist>
								 </div>
								 
								 <div class="col-md-3">
								 	<label for="inputdefault">Số hiệu cán bộ</label>
		        					 <input class="form-control" id="txtSoHieuCanBo" type="text"></br>
								 </div>
								 
								 <div class="col-md-3">
								 	<label for="inputdefault">Tên Cán Bộ</label>
		         					<input class="form-control" id="txtTenCanBo" type="text"></br>
								 </div>
							 </div>
							 <div class="row">
								 <div class="col-md-3">
								 	<label for="inputdefault">Tên Gọi Khác</label>
	       						    <input class="form-control" id="txtTenGoiKhac" type="text">
								 </div>
							 
							 </div>
						</div>
					</div>

					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseQuanHeGiaDinh" data-parent="#accordion1"
									onclick="$(hidTieuChiChiTietCanBo).val('quanHeGiaDinh')">Quan hệ gia đình</a>
							</h4>
						</div>
						<div id="collapseQuanHeGiaDinh" class="panel-collapse collapse">
							<label for="inputdefault">Phân loại</label> 
							<input class="form-control" id="txtPhanLoai" type="text" list="phanloai">
							<datalist id="phanloai">
								<option value="Khối hành chính"></option>
								<option value="Khối giảng viên"></option>
							</datalist>
							
						</div>
					</div>
					
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseQuaTrinhCongTac" data-parent="#accordion1"
									onclick="$(hidTieuChiChiTietCanBo).val('quaTrinhCongTac')">Quá trình công tác</a>
							</h4>
						</div>
						<div id="collapseQuaTrinhCongTac" class="panel-collapse collapse">
							<label for="inputdefault">Phân loại</label> 
							<input class="form-control" id="txtPhanLoai" type="text" list="phanloai">
							<datalist id="phanloai">
								<option value="Khối hành chính"></option>
								<option value="Khối giảng viên"></option>
							</datalist>
							
						</div>
					</div>
					
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseQuaTrinhDaoTao" data-parent="#accordion1"
									onclick="$(hidTieuChiChiTietCanBo).val('quaTrinhDaoTao')">QUÁ TRÌNH ĐÀO TẠO</a>
							</h4>
						</div>
						<div id="collapseQuaTrinhDaoTao" class="panel-collapse collapse">
							<label for="inputdefault">Phân loại</label> 
							<input class="form-control" id="txtPhanLoai" type="text" list="phanloai">
							<datalist id="phanloai">
								<option value="Khối hành chính"></option>
								<option value="Khối giảng viên"></option>
							</datalist>
							
						</div>
					</div>
					
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseDanhSachHopDong" data-parent="#accordion1"
									onclick="$(hidTieuChiChiTietCanBo).val('danhSachHopDong')">DANH SÁCH HỢP ĐỒNG</a>
							</h4>
						</div>
						<div id="collapseDanhSachHopDong" class="panel-collapse collapse">
							<label for="inputdefault">Phân loại</label> 
							<input class="form-control" id="txtPhanLoai" type="text" list="phanloai">
							<datalist id="phanloai">
								<option value="Khối hành chính"></option>
								<option value="Khối giảng viên"></option>
							</datalist>
							
						</div>
					</div>
					
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseDanhSachQuyetDinh" data-parent="#accordion1"
									onclick="$(hidTieuChiChiTietCanBo).val('danhSachQuyetDinh')">DANH SÁCH QUYẾT ĐỊNH</a>
							</h4>
						</div>
						<div id="collapseDanhSachQuyetDinh" class="panel-collapse collapse">
							<label for="inputdefault">Phân loại</label> 
							<input class="form-control" id="txtPhanLoai" type="text" list="phanloai">
							<datalist id="phanloai">
								<option value="Khối hành chính"></option>
								<option value="Khối giảng viên"></option>
							</datalist>
							
						</div>
					</div>
					
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseQuaTrinhLuong" data-parent="#accordion1"
									onclick="$(hidTieuChiChiTietCanBo).val('quaTrinhLuong')">QUÁ TRÌNH LƯƠNG</a>
							</h4>
						</div>
						<div id="collapseQuaTrinhLuong" class="panel-collapse collapse">
							<label for="inputdefault">Phân loại</label> 
							<input class="form-control" id="txtPhanLoai" type="text" list="phanloai">
							<datalist id="phanloai">
								<option value="Khối hành chính"></option>
								<option value="Khối giảng viên"></option>
							</datalist>
							
						</div>
					</div>
					
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseChucVuKiemNhiem" data-parent="#accordion1"
									onclick="$(hidTieuChiChiTietCanBo).val('chucVuKiemNhiem')">CHỨC VỤ KIÊM NHIỆM</a>
							</h4>
						</div>
						<div id="collapseChucVuKiemNhiem" class="panel-collapse collapse">
							<label for="inputdefault">Phân loại</label> 
							<input class="form-control" id="txtPhanLoai" type="text" list="phanloai">
							<datalist id="phanloai">
								<option value="Khối hành chính"></option>
								<option value="Khối giảng viên"></option>
							</datalist>
							
						</div>
					</div>
					
					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseKeKhaiTaiSan" data-parent="#accordion1"
									onclick="$(hidTieuChiChiTietCanBo).val('keKhaiTaiSan')">KÊ KHAI TÀI SẢN</a>
							</h4>
						</div>
						<div id="collapseKeKhaiTaiSan" class="panel-collapse collapse">
							 <!-- datatable start  -->
							<h1>DANH SÁCH DÂN TỘC</h1>
							<!-- 	<button id="button">btn</button> -->
							<table id="DanTocTable" class="display">
					
								<!-- Header Table -->
								<thead>
									<tr>
										<th>Tên Dân Tộc</th>
										<th>Sửa Dân Tộc</th>
										<th>Xóa Dân Tộc</th>
									</tr>
								</thead>
								<!-- Footer Table -->
								<tfoot>
									<tr>
										<th>Tên Dân Tộc</th>
										<th>Sửa Dân Tộc</th>
										<th>Xóa Dân Tộc</th>
									</tr>
								</tfoot>
							</table>
							<!-- datatable end -->
						<%@include file="danTocForm.jsp"%>
						</div>
					</div>
					

				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal"
					id="btnXacNhanChiTietCanBo">Xác nhận</button>
				<button type="button" class="btn btn-default" data-dismiss="modal"
					id="btnDong">Đóng</button>
			</div>
		</div>

	</div>
</div>