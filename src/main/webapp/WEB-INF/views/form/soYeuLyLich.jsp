<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<input class="form-control" id="txtCanBo" type="hidden">
<div class="row">
	<div class="col-md-3">
		<label for="txtDonViCongTac">Đơn vị công tác</label> <input
			class="form-control" id="txtDonViCongTac" type="text"
			list="listDonvicongTac"></br>
		<datalist id="listDonvicongTac">
			<option value="a"></option>
			<option value="b"></option>
			<option value="c"></option>
		</datalist>
	</div>
	<div class="col-md-3">
		<label for="txtBoMonChuyenMon">Bộ môn chuyên môn</label> <input
			class="form-control" id="txtBoMonChuyenMon" type="text"
			list="listBoMonChuyenMon"></br>
		<datalist id="listBoMonChuyenMon">
			<option value="a"></option>
			<option value="b"></option>
			<option value="c"></option>
		</datalist>
	</div>
	<div class="col-md-3">
		<button type="button" class="btn btn-default" data-dismiss="modal"
			id="btnCapNhapSoYeuLyLich">Lưu</button>
	</div>
	<div class="col-md-3">
		<button type="button" class="btn btn-default" data-dismiss="modal"
			id="btnXuatThongTin">Xuất thông tin cán bộ</button>
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="inputdefault">Số hiệu cán bộ</label> <input
			class="form-control" id="txtSoHieuCanBo" type="text"></br>
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Ảnh</label>
		<textarea class="form-control" id="textareaID"></textarea>
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="inputdefault">Tên Cán Bộ</label> <input
			class="form-control" id="txtTenCanBo" type="text"></br>
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Tên Gọi Khác</label> <input
			class="form-control" id="txtTenGoiKhac" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Ngày Sinh</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="dpNgaySinh">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Giới tính</label> <input
			class="form-control" id="txtGioiTinh" type="text">
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="inputdefault">Nơi sinh</label> <input class="form-control"
			id="txtNoisinh" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Quê quán</label> <input class="form-control"
			id="txtQueQuan" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Dân tộc</label> <input class="form-control"
			id="txtDanToc" type="text" list="listDanToc">
		<datalist id="listDanToc">
			<option value="a"></option>
			<option value="b"></option>
			<option value="c"></option>
		</datalist>
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Tôn giáo</label> <input class="form-control"
			id="txtTonGiao" type="text" list="listTonGiao">
		<datalist id="listTonGiao">
			<option value="a"></option>
			<option value="b"></option>
			<option value="c"></option>
		</datalist>
	</div>
</div>
</br>

<div class="row">
	<div class="col-md-3">
		<label for="inputdefault">Số CMND</label> <input class="form-control"
			id="txtSoCMND" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Ngày Cấp</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="dpNgayCap">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Nơi cấp CMND</label> <input
			class="form-control" id="txtNoiCapCMND" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Nơi đăng ký hộ khẩu thường trú</label> <input
			class="form-control" id="txtHoKhauTHuongTru" type="text">
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="inputdefault">Nơi ở hiện nay</label> <input
			class="form-control" id="txtNoiOHienNay" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Nghề Nghiệp khi tuyển dụng</label> <input
			class="form-control" id="txtNgheNghiep" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Cơ quan tuyển dụng</label> <input
			class="form-control" id="txtCoQuanTD"
			value="Trường đại học giao thông vận tải phân hiệu TP Hồ Chí Minh"
			type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Ngày tuyển dụng</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="dpNgayTuyenDung">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="inputdefault">Chức vụ hiện tại</label> <input
			class="form-control" id="txtChucVuHienTai" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Công việc chính được giao</label> <input
			class="form-control" id="txtCongViecDuocGiao" value="Giảng dạy"
			type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Chức Danh</label> <input
			class="form-control" id="txtChucDanh" value="Giảng Viên" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Mã ngạch công chức</label> <input
			class="form-control" id="txtMaNgachCongChuc" type="text"
			list="listMaNgach"></br>
		<datalist id="listMaNgach">
			<option value="a"></option>
			<option value="b"></option>
			<option value="c"></option>
		</datalist>
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="inputdefault">Tên ngạch công chức viên chức</label> <input
			class="form-control" id="txtTenNgach" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Bậc lương</label> <input
			class="form-control" id="txtMaBacLuong" type="text"
			list="listBacLuong">
		<datalist id="listBacLuong">
			<option value="a"></option>
			<option value="b"></option>
			<option value="c"></option>
		</datalist>
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Hệ Số Lương</label> <input
			class="form-control" id="txtHeSoLuong" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Ngày hưởng</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="dpNgayHuongLuong">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="inputdefault">Phụ cấp chức vụ</label> <input
			class="form-control" id="txtPhuCapChucVu" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Phụ cấp khác</label> <input
			class="form-control" id="txtPhuCapKhac" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Trình độ giáo dục phổ thông</label> <input
			class="form-control" id="txtTrinhDoGDPT" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Trình độ chuyên môn cao nhất</label> <input
			class="form-control" id="txtTrinhDoChuyenMon" type="text">
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="inputdefault">Học Vị</label> <input class="form-control"
			id="txtHocVi" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Ngày nhận học vị</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="dpNgayNhanHocVi">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Học Hàm</label> <input class="form-control"
			id="txtHocHam" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Ngày nhận học hàm</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="dpNgayNhanHocHam">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="inputdefault">Lý luận chính trị</label> <input
			class="form-control" id="txtLyLuanChinhTri" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Quản lý nhà nước</label> <input
			class="form-control" id="txtQuanLyNhaNuoc" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Anh Văn</label> <input class="form-control"
			id="txtAnhVan" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Tin học</label> <input class="form-control"
			id="txtTinHoc" type="text">
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="inputdefault">Ngày vào đảng cộng sản Việt Nam dự
			bị</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="dpNgayVaoDCSVNDuBi">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Ngày vào đảng cộng sản Việt Nam
			chính thức</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="dpNgayVaoDCSVNChinhThuc">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Tham gia tổ chức chính trị xã hội</label> <input
			class="form-control" id="txtToChucCTXH" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Ngày nhập ngũ</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="dpNgayNhapNgu">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="inputdefault">Ngày xuất ngũ</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="dpNgayXuatNgu">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Quân hàm cao nhất</label> <input
			class="form-control" id="txtQuanHamCaoNhat" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Danh hiệu được phong tặng cao nhất</label> <input
			class="form-control" id="txtDanhHieuPhongTang" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Số trường công tác giảng dạy</label> <input
			class="form-control" id="txtSoTruongCongTac" type="text">
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="inputdefault">Khen thưởng</label> <input
			class="form-control" id="txtKhenThuong" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Kỷ luật</label> <input class="form-control"
			id="txtKyLuat" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Tình trạng sức khỏe</label> <input
			class="form-control" id="txtTinhTrangSucKhoe" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Chiều cao</label> <input
			class="form-control" id="txtChieuCao" type="text">
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="inputdefault">Cân nặng</label> <input class="form-control"
			id="txtCanNang" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Nhóm máu</label> <input class="form-control"
			id="txtNhomMau" type="text" list="listNhomMau">
		<datalist id="listNhomMau">
			<option value="A"></option>
			<option value="B"></option>
			<option value="AB"></option>
			<option value="O"></option>
		</datalist>
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Số bảo hiểm xã hội</label> <input
			class="form-control" id="txtSoBHXH" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Là thương binh</label> <input
			class="form-control" id="txtLaThuongBinh" type="text">
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="inputdefault">Là con gia đình chính sách</label> <input
			class="form-control" id="txtConGiaDinhChinhSach" type="text">
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Nhận xét</label>
		<textarea class="form-control" id="txtNhanXet"></textarea>
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="inputdefault">Thôi việc</label> <input type="checkbox"
			value=""></label>
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Ngày thôi việc</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="dpNgayThoiViec">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Về Hưu</label> <input type="checkbox"
			value=""></label>
	</div>
	<div class="col-md-3">
		<label for="inputdefault">Ngày về hưu</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="dpNgayVeHuu">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
</div>