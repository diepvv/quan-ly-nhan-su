<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>

<input class="form-control" id="pk" type="hidden">
<div class="row">
	<div class="col-md-3">
		<label for="donViChucNang_pk">Đơn vị công tác</label></br>
		<c:if test="${not empty donViChucNangLists}">
			<select class="form-control" id="donViChucNang_pk">
				<c:forEach var="dto" items="${donViChucNangLists}">
					<option value="${dto.pk}">${dto.tenDonVi}</option>
				</c:forEach>
			</select>
		</c:if>
	</div>
	<div class="col-md-3">
		<label for="boMon_pk">Bộ môn chuyên môn</label> <input
			class="form-control" id="boMon_pk" type="text"
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
		<label for="soHieu">Số hiệu cán bộ</label> <input class="form-control"
			id="soHieu" type="text"></br>
	</div>
	<div class="col-md-3">
		<label for="imageUrl">Ảnh</label>
		<textarea class="form-control" id="imageUrl"></textarea>
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="ten">Tên Cán Bộ</label> <input class="form-control"
			id="ten" type="text"></br>
	</div>
	<div class="col-md-3">
		<label for="tenGoiKhac">Tên Gọi Khác</label> <input
			class="form-control" id="tenGoiKhac" type="text">
	</div>
	<div class="col-md-3">
		<label for="ngaySinh">Ngày Sinh</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="ngaySinh">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
	<div class="col-md-3">
		<label for="gioiTinh">Giới tính</label> <input class="form-control"
			id="gioiTinh" type="text">
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="noiSinh">Nơi sinh</label> <input class="form-control"
			id="noiSinh" type="text">
	</div>
	<div class="col-md-3">
		<label for="queQuan">Quê quán</label> <input class="form-control"
			id="queQuan" type="text">
	</div>
	<div class="col-md-3">
		<label for="danToc_pk">Dân tộc</label></br>
		<c:if test="${not empty danTocLists}">
			<select class="form-control" id="danToc_pk">
				<c:forEach var="dto" items="${danTocLists}">
					<option value="${dto.pk}">${dto.tenDanToc}</option>
				</c:forEach>
			</select>
		</c:if>
	</div>
	<div class="col-md-3">
		<label for="tonGiao_pk">Tôn giáo</label></br>
		<c:if test="${not empty tonGiaoLists}">
			<select class="form-control" id="tonGiao_pk">
				<c:forEach var="dto" items="${tonGiaoLists}">
					<option value="${dto.pk}">${dto.tenTonGiao}</option>
				</c:forEach>
			</select>
		</c:if>
	</div>
</div>
</br>

<div class="row">
	<div class="col-md-3">
		<label for="soCmnd">Số CMND</label> <input class="form-control"
			id="soCmnd" type="text">
	</div>
	<div class="col-md-3">
		<label for="ngayCapCmnd">Ngày Cấp</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="ngayCapCmnd">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
	<div class="col-md-3">
		<label for="noiCapCmnd">Nơi cấp CMND</label> <input
			class="form-control" id="noiCapCmnd" type="text">
	</div>
	<div class="col-md-3">
		<label for="noiDKHoKhauThuongTru">Nơi đăng ký hộ khẩu thường
			trú</label> <input class="form-control" id="noiDKHoKhauThuongTru" type="text">
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="noiOHienNay">Nơi ở hiện nay</label> <input
			class="form-control" id="noiOHienNay" type="text">
	</div>
	<div class="col-md-3">
		<label for="ngheNghiepKhiTuyenDung">Nghề Nghiệp khi tuyển dụng</label>
		<input class="form-control" id="ngheNghiepKhiTuyenDung" type="text">
	</div>
	<div class="col-md-3">
		<label for="coQuanTuyenDung">Cơ quan tuyển dụng</label> <input
			class="form-control" id="coQuanTuyenDung"
			value="Trường đại học giao thông vận tải phân hiệu TP Hồ Chí Minh"
			type="text">
	</div>
	<div class="col-md-3">
		<label for="ngayTuyenDung">Ngày tuyển dụng</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="ngayTuyenDung">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="chucVu_pk">Chức vụ hiện tại</label> <input
			class="form-control" id="chucVu_pk" type="text">
	</div>
	<div class="col-md-3">
		<label for="congViecDuocGiao">Công việc chính được giao</label> <input
			class="form-control" id="congViecDuocGiao" value="Giảng dạy"
			type="text">
	</div>
	<div class="col-md-3">
		<label for="chucDanh">Chức Danh</label> <input class="form-control"
			id="chucDanh" value="Giảng Viên" type="text">
	</div>
	<div class="col-md-3">
		<label for="ngachCongChuc_pk">Ngạch công chức</label></br>
		<c:if test="${not empty ngachCongChucLists}">
			<select class="form-control" id="ngachCongChuc_pk">
				<c:forEach var="dto" items="${ngachCongChucLists}">
					<option value="${dto.pk}">${dto.maNgach}</option>
				</c:forEach>
			</select>
		</c:if>
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="tenNgach">Tên ngạch công chức viên chức</label> <input
			class="form-control" id="tenNgach" type="text">
	</div>
	<div class="col-md-3">
		<label for="bacLuong_pk">Bậc lương</label> <input class="form-control"
			id="bacLuong_pk" type="text" list="listBacLuong">
		<datalist id="listBacLuong">
			<option value="a"></option>
			<option value="b"></option>
			<option value="c"></option>
		</datalist>
	</div>
	<div class="col-md-3">
		<label for="heSoLuong">Hệ Số Lương</label> <input class="form-control"
			id="heSoLuong" type="text">
	</div>
	<div class="col-md-3">
		<label for="ngayHuong">Ngày hưởng</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="ngayHuong">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="phuCapChucVu">Phụ cấp chức vụ</label> <input
			class="form-control" id="phuCapChucVu" type="text">
	</div>
	<div class="col-md-3">
		<label for="phuCapKhac">Phụ cấp khác</label> <input
			class="form-control" id="phuCapKhac" type="text">
	</div>
	<div class="col-md-3">
		<label for="trinhDoGiaoDucPt">Trình độ giáo dục phổ thông</label> <input
			class="form-control" id="trinhDoGiaoDucPt" type="text">
	</div>
	<div class="col-md-3">
		<label for="trinhDoChuyenMon">Trình độ chuyên môn cao nhất</label> <input
			class="form-control" id="trinhDoChuyenMon" type="text">
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="hocVi">Học Vị</label> <input class="form-control"
			id="hocVi" type="text">
	</div>
	<div class="col-md-3">
		<label for="ngayNhanHocVi">Ngày nhận học vị</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="ngayNhanHocVi">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
	<div class="col-md-3">
		<label for="hocHam">Học Hàm</label> <input class="form-control"
			id="hocHam" type="text">
	</div>
	<div class="col-md-3">
		<label for="ngayNhanHocHam">Ngày nhận học hàm</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="ngayNhanHocHam">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="lyLuanChinhTri">Lý luận chính trị</label> <input
			class="form-control" id="lyLuanChinhTri" type="text">
	</div>
	<div class="col-md-3">
		<label for="quanLyNhaNuoc">Quản lý nhà nước</label> <input
			class="form-control" id="quanLyNhaNuoc" type="text">
	</div>
	<div class="col-md-3">
		<label for="ngoaiNgu">Anh Văn</label> <input class="form-control"
			id="ngoaiNgu" type="text">
	</div>
	<div class="col-md-3">
		<label for="tinHoc">Tin học</label> <input class="form-control"
			id="tinHoc" type="text">
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="ngayVaoDcsvnDuBi">Ngày vào đảng cộng sản Việt Nam
			dự bị</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="ngayVaoDcsvnDuBi">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
	<div class="col-md-3">
		<label for="ngayVaoDcsvnChinhThuc">Ngày vào đảng cộng sản Việt
			Nam chính thức</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="ngayVaoDcsvnChinhThuc">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
	<div class="col-md-3">
		<label for="thamGiaToChucCtxh">Tham gia tổ chức chính trị xã
			hội</label> <input class="form-control" id="thamGiaToChucCtxh" type="text">
	</div>
	<div class="col-md-3">
		<label for="ngayNhapNgu">Ngày nhập ngũ</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="ngayNhapNgu">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="ngayXuatNgu">Ngày xuất ngũ</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="ngayXuatNgu">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
	<div class="col-md-3">
		<label for="quanHamCaoNhat">Quân hàm cao nhất</label> <input
			class="form-control" id="quanHamCaoNhat" type="text">
	</div>
	<div class="col-md-3">
		<label for="danhHieuPhongTang">Danh hiệu được phong tặng cao
			nhất</label> <input class="form-control" id="danhHieuPhongTang" type="text">
	</div>
	<div class="col-md-3">
		<label for="soTruongCongTac">Số trường công tác giảng dạy</label> <input
			class="form-control" id="soTruongCongTac" type="text">
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="khenThuong">Khen thưởng</label> <input
			class="form-control" id="khenThuong" type="text">
	</div>
	<div class="col-md-3">
		<label for="kyLuat">Kỷ luật</label> <input class="form-control"
			id="kyLuat" type="text">
	</div>
	<div class="col-md-3">
		<label for="tinhTrangSucKhoe">Tình trạng sức khỏe</label> <input
			class="form-control" id="tinhTrangSucKhoe" type="text">
	</div>
	<div class="col-md-3">
		<label for="chieuCao">Chiều cao</label> <input class="form-control"
			id="chieuCao" type="text">
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="canNang">Cân nặng</label> <input class="form-control"
			id="canNang" type="text">
	</div>
	<div class="col-md-3">
		<label for="nhomMau">Nhóm máu</label> <input class="form-control"
			id="nhomMau" type="text" list="listNhomMau">
		<datalist id="listNhomMau">
			<option value="A"></option>
			<option value="B"></option>
			<option value="AB"></option>
			<option value="O"></option>
		</datalist>
	</div>
	<div class="col-md-3">
		<label for="soBaoHiemXh">Số bảo hiểm xã hội</label> <input
			class="form-control" id="soBaoHiemXh" type="text">
	</div>
	<div class="col-md-3">
		<label for="laThuongBinh">Là thương binh</label> <input
			class="form-control" id="laThuongBinh" type="text">
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="laConGiaDinhChinhSach">Là con gia đình chính sách</label>
		<input class="form-control" id="laConGiaDinhChinhSach" type="text">
	</div>
	<div class="col-md-3">
		<label for="nhanXet">Nhận xét</label>
		<textarea class="form-control" id="nhanXet"></textarea>
	</div>
</div>

<div class="row">
	<div class="col-md-3">
		<label for="inputdefault">Thôi việc</label> <input type="checkbox"
			value=""></label>
	</div>
	<div class="col-md-3">
		<label for="ngayThoiViec">Ngày thôi việc</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="ngayThoiViec">
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
		<label for="ngayVeHuu">Ngày về hưu</label>
		<div class="input-group date" data-provide="datepicker">
			<input type="text" class="form-control" id="ngayVeHuu">
			<div class="input-group-addon">
				<span class="glyphicon glyphicon-th"></span>
			</div>
		</div>
	</div>
</div>