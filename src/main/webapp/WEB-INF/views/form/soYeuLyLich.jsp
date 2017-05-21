<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<form id="formTest" method="post" action="#" class="valida"
	autocomplete="off" novalidate="novalidate">

	<input class="form-control" id="pk" type="hidden"> <input
		class="form-control" id="version" type="hidden">
	<div class="row">
		<div class="col-md-3">
			<div class="form-group">
				<label for="donViChucNang_pk">Đơn vị công tác</label></br>
				<c:if test="${not empty donViChucNangLists}">
					<select class="form-control my-select-control-style"
						id="donViChucNang_pk" onchange="changeDonViChucNang()"
						required="true">
						<c:forEach var="dto" items="${donViChucNangLists}">
							<option required="true" value="${dto.pk}">${dto.tenDonVi}</option>
						</c:forEach>
					</select>
				</c:if>
			</div>
		</div>
		<div class="col-md-3">
			<label for="boMon_pk">Bộ môn chuyên môn</label> <select
				class="form-control my-select-control-style" id="boMon_pk">
			</select>
		</div>
		<div class="col-md-3">
			<input type="submit" value="Lưu" class="btn btn-default" 
				id="btnCapNhapSoYeuLyLich" onclick="luuCanBo();"/>
		</div>
		<div class="col-md-3">
			<button type="button" class="btn btn-default" data-dismiss="modal"
				id="btnXuatThongTin">Xuất thông tin cán bộ</button>
		</div>
	</div>

	<div class="row">
		<div class="col-md-3">
			<div class="form-group">
				<label for="soHieu" class="label-style">Số hiệu cán bộ</label> <input
					class="form-control" id="soHieu" type="text" required="true"></br>
			</div>
		</div>
		<div class="col-md-3">
			<label for="imageUrl" class="label-style">Ảnh</label>
			<textarea class="form-control" id="imageUrl"></textarea>
		</div>
	</div>

	<div class="row">
		<div class="col-md-3">
			<div class="form-group">
				<label for="ten" class="label-style">Tên Cán Bộ</label> <input
					class="form-control" id="ten" type="text" required="true"></br>
			</div>
		</div>
		<div class="col-md-3">
			<label for="tenGoiKhac" class="label-style">Tên Gọi Khác</label> <input
				class="form-control" id="tenGoiKhac" type="text">
		</div>
		<div class="col-md-3">
			<label for="ngaySinh" class="label-style">Ngày Sinh</label>
			<div class="input-group date" data-provide="datepicker">
				<input type="text" class="form-control" id="ngaySinh">
				<div class="input-group-addon">
					<span class="glyphicon glyphicon-th"></span>
				</div>
			</div>
		</div>
		<div class="col-md-3">
			<div class="form-group">
				<label for="gioiTinh" class="label-style">Giới tính</label> <select
					class="form-control my-select-control-style" id="gioiTinh"
					required="true">
					<option value="0">Nam</option>
					<option value="1">Nữ</option>
				</select>
			</div>
		</div>
	</div>

	<div class="row">
		<div class="col-md-3">
			<label for="noiSinh">Nơi sinh</label> <input class="form-control"
				id="noiSinh" type="text">
		</div>
		<div class="col-md-3">
			<div class="form-group">
				<label for="queQuan_pk">Quê quán</label>
				<c:if test="${not empty queQuanLists}">
					<select class="form-control my-select-control-style"
						id="queQuan_pk" required="true">
						<c:forEach var="dto" items="${queQuanLists}">
							<option value="${dto.pk}">${dto.tenQueQuan}</option>
						</c:forEach>
					</select>
				</c:if>
			</div>
		</div>
		<div class="col-md-3">
			<div class="form-group">
				<label for="danToc_pk">Dân tộc</label></br>
				<c:if test="${not empty danTocLists}">
					<select class="form-control my-select-control-style" id="danToc_pk"
						required="true">
						<c:forEach var="dto" items="${danTocLists}">
							<option value="${dto.pk}">${dto.tenDanToc}</option>
						</c:forEach>
					</select>
				</c:if>
			</div>
		</div>
		<div class="col-md-3">
			<div class="form-group">
				<label for="tonGiao_pk">Tôn giáo</label></br>
				<c:if test="${not empty tonGiaoLists}">
					<select class="form-control my-select-control-style"
						id="tonGiao_pk" required="true">
						<c:forEach var="dto" items="${tonGiaoLists}">
							<option value="${dto.pk}">${dto.tenTonGiao}</option>
						</c:forEach>
					</select>
				</c:if>
			</div>
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
				trú</label> <input class="form-control" id="noiDKHoKhauThuongTru"
				type="text">
		</div>
	</div>

	<div class="row">
		<div class="col-md-3">
			<label for="noiOHienNay">Nơi ở hiện nay</label> <input
				class="form-control" id="noiOHienNay" type="text">
		</div>
		<div class="col-md-3">
			<label for="ngheNghiepKhiTuyenDung">Nghề Nghiệp khi tuyển
				dụng</label> <input class="form-control" id="ngheNghiepKhiTuyenDung"
				type="text">
		</div>
		<div class="col-md-3">
			<label for="coQuanTuyenDung">Cơ quan tuyển dụng</label> <input
				class="form-control" id="coQuanTuyenDung" type="text">
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
			<label for="chucVu_pk">Chức vụ hiện tại</label></br>
			<c:if test="${not empty chucVuLists}">
				<select class="form-control my-select-control-style" id="chucVu_pk">
					<c:forEach var="dto" items="${chucVuLists}">
						<option value="${dto.pk}">${dto.tenChucVu}</option>
					</c:forEach>
				</select>
			</c:if>
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
				<select class="form-control my-select-control-style"
					id="ngachCongChuc_pk" onchange="changeNgachCongChuc()">
					<c:forEach var="dto" items="${ngachCongChucLists}">
						<option value="${dto.pk}">${dto.maNgach}</option>
					</c:forEach>
				</select>
			</c:if>
		</div>
	</div>

	<div class="row">
		<div class="col-md-3">
			<label for="tenNgach" class="label-style">Tên ngạch công chức
				viên chức</label> <input class="form-control" id="tenNgach" type="text">
		</div>
		<div class="col-md-3">
			<label for="bacLuong_pk" class="label-style">Bậc lương</label> <select
				class="form-control my-select-control-style" id="bacLuong_pk">
			</select>
		</div>
		<div class="col-md-3">
			<label for="heSoLuong" class="label-style">Hệ Số Lương</label> <input
				class="form-control" id="heSoLuong" type="text">
		</div>
		<div class="col-md-3">
			<label for="ngayHuong" class="label-style">Ngày hưởng</label>
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
			<label for="hocVi" class="label-style">Học Vị</label> <input
				class="form-control" id="hocVi" type="text">
		</div>
		<div class="col-md-3">
			<label for="ngayNhanHocVi" class="label-style">Ngày nhận học
				vị</label>
			<div class="input-group date" data-provide="datepicker">
				<input type="text" class="form-control" id="ngayNhanHocVi">
				<div class="input-group-addon">
					<span class="glyphicon glyphicon-th"></span>
				</div>
			</div>
		</div>
		<div class="col-md-3">
			<label for="hocHam" class="label-style">Học Hàm</label> <input
				class="form-control" id="hocHam" type="text">
		</div>
		<div class="col-md-3">
			<label for="ngayNhanHocHam" class="label-style">Ngày nhận học
				hàm</label>
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
			<label for="ngayVaoDcsvnDuBi" class="label-style">Ngày vào
				đảng cộng sản Việt Nam dự bị</label>
			<div class="input-group date" data-provide="datepicker">
				<input type="text" class="form-control" id="ngayVaoDcsvnDuBi">
				<div class="input-group-addon">
					<span class="glyphicon glyphicon-th"></span>
				</div>
			</div>
		</div>
		<div class="col-md-3">
			<label for="ngayVaoDcsvnChinhThuc" class="label-style">Ngày
				vào đảng cộng sản Việt Nam chính thức</label>
			<div class="input-group date" data-provide="datepicker">
				<input type="text" class="form-control" id="ngayVaoDcsvnChinhThuc">
				<div class="input-group-addon">
					<span class="glyphicon glyphicon-th"></span>
				</div>
			</div>
		</div>
		<div class="col-md-3">
			<label for="thamGiaToChucCtxh" class="label-style">Tham gia
				tổ chức chính trị xã hội</label> <input class="form-control"
				id="thamGiaToChucCtxh" type="text">
		</div>
		<div class="col-md-3">
			<label for="ngayNhapNgu" class="label-style">Ngày nhập ngũ</label>
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
			<label for="canNang" class="label-style">Cân nặng</label> <input
				class="form-control" id="canNang" type="text">
		</div>
		<div class="col-md-3">
			<label for="nhomMau" class="label-style">Nhóm máu</label> <select
				class="form-control my-select-control-style" id="nhomMau">
				<option value="A">A</option>
				<option value="B">B</option>
				<option value="AB">AB</option>
				<option value="O">O</option>
			</select>
		</div>
		<div class="col-md-3">
			<label for="soBaoHiemXh" class="label-style">Số bảo hiểm xã
				hội</label> <input class="form-control" id="soBaoHiemXh" type="text">
		</div>
		<div class="col-md-3">
			<label for="laThuongBinh" class="label-style">Là thương binh</label>
			<input class="form-control" id="laThuongBinh" type="text">
		</div>
	</div>

	<div class="row">
		<div class="col-md-3">
			<label for="laConGiaDinhChinhSach" class="label-style">Là con
				gia đình chính sách</label> <input class="form-control"
				id="laConGiaDinhChinhSach" type="text">
		</div>
		<div class="col-md-3">
			<label for="nhanXet" class="label-style">Nhận xét</label>
			<textarea class="form-control" id="nhanXet"></textarea>
		</div>
	</div>

	<div class="row">
		<div class="col-md-3">
			<label for="inputdefault" class="label-style">Thôi việc</label> <input
				type="checkbox" value=""></label>
		</div>
		<div class="col-md-3">
			<label for="ngayThoiViec" class="label-style">Ngày thôi việc</label>
			<div class="input-group date" data-provide="datepicker">
				<input type="text" class="form-control" id="ngayThoiViec">
				<div class="input-group-addon">
					<span class="glyphicon glyphicon-th"></span>
				</div>
			</div>
		</div>
		<div class="col-md-3">
			<label for="inputdefault" class="label-style">Về Hưu</label> <input
				type="checkbox" value=""></label>
		</div>
		<div class="col-md-3">
			<label for="ngayVeHuu" class="label-style">Ngày về hưu</label>
			<div class="input-group date" data-provide="datepicker">
				<input type="text" class="form-control" id="ngayVeHuu">
				<div class="input-group-addon">
					<span class="glyphicon glyphicon-th"></span>
				</div>
			</div>
		</div>
	</div>

</form>