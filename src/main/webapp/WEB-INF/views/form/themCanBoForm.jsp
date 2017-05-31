<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<div id="themCanBoForm" class="modal fade background-white" role="dialog">
	<div class="full-screen-modal-dialog">
		<!-- Modal content-->
		<div class="full-screen-modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<center>
					<h4 class="modal-title">THÊM CÁN BỘ</h4>
				</center>
			</div>
			<div class="modal-body">
				<div class="panel-group">
					<form id="formThemCanBo" method="post" action="#" class="valida" autocomplete="off" novalidate="novalidate">
						<input class="form-control" id="pkAdd" type="hidden"> 
						<input class="form-control" id="versionAdd" type="hidden">

						<div class="row">
							<div class="col-md-3">
								<div class="form-group">
									<label for="donViChucNang_pkAdd">Đơn vị công tác</label>
									<c:if test="${not empty donViChucNangLists}">
										<select class="form-control my-select-control-style"
											id="donViChucNang_pkAdd" onchange="changeDonViChucNangAdd()" required="true">
											<c:forEach var="dto" items="${donViChucNangLists}">
												<option required="true" value="${dto.pk}">${dto.tenDonVi}</option>
											</c:forEach>
										</select>
									</c:if>
								</div>
							</div>
							<div class="col-md-3">
								<label for="boMon_pkAdd">Bộ môn chuyên môn</label> 
								<select class="form-control my-select-control-style" id="boMon_pkAdd"></select>
							</div>
							<div class="col-md-3">
								<button type=button class="btn btn-default" id="btnThemCanBo">Lưu</button>
							</div>
							<div class="col-md-3">
								<button type="button" class="btn btn-default"
									data-dismiss="modal" id="btnXuatThongTinCanBoAdd">Xuất
									thông tin cán bộ</button>
							</div>
						</div>

						<div class="row">
							<div class="col-md-3">
								<div class="form-group">
									<label for="soHieuAdd" class="label-style">Số hiệu cán bộ</label>
									<input class="form-control" id="soHieuAdd" type="text" required="true">
								</div>
							</div>
							<div class="col-md-3">
								<label for="imageUrlAdd" class="label-style">Ảnh</label>
								<textarea class="form-control" id="imageUrlAdd"></textarea>
							</div>
						</div>

						<div class="row">
							<div class="col-md-3">
								<div class="form-group">
									<label for="tenAdd" class="label-style">Tên Cán Bộ</label> 
									<input class="form-control" id="tenAdd" type="text" required="true">
								</div>
							</div>
							<div class="col-md-3">
								<label for="tenGoiKhacAdd" class="label-style">Tên Gọi Khác</label>
								<input class="form-control" id="tenGoiKhacAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="ngaySinhAdd" class="label-style">Ngày Sinh</label>
								<div class="input-group date" data-provide="datepicker">
									<input type="text" class="form-control" id="ngaySinhAdd">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-th"></span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<div class="form-group">
									<label for="gioiTinhAdd" class="label-style">Giới tính</label> 
									<select class="form-control my-select-control-style" id="gioiTinhAdd" required="true">
										<option value="0">Nam</option>
										<option value="1">Nữ</option>
									</select>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-md-3">
								<label for="noiSinhAdd">Nơi sinh</label> 
								<input class="form-control" id="noiSinhAdd" type="text">
							</div>
							<div class="col-md-3">
								<div class="form-group">
									<label for="queQuan_pkAdd">Quê quán</label>
									<c:if test="${not empty queQuanLists}">
										<select class="form-control my-select-control-style"
											id="queQuan_pkAdd" required="true">
											<c:forEach var="dto" items="${queQuanLists}">
												<option value="${dto.pk}">${dto.tenQueQuan}</option>
											</c:forEach>
										</select>
									</c:if>
								</div>
							</div>
							<div class="col-md-3">
								<div class="form-group">
									<label for="danToc_pkAdd">Dân tộc</label>
									<c:if test="${not empty danTocLists}">
										<select class="form-control my-select-control-style" id="danToc_pkAdd" required="true">
											<c:forEach var="dto" items="${danTocLists}">
												<option value="${dto.pk}">${dto.tenDanToc}</option>
											</c:forEach>
										</select>
									</c:if>
								</div>
							</div>
							<div class="col-md-3">
								<div class="form-group">
									<label for="tonGiao_pkAdd">Tôn giáo</label></br>
									<c:if test="${not empty tonGiaoLists}">
										<select class="form-control my-select-control-style" id="tonGiao_pkAdd" required="true">
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
								<label for="soCmndAdd">Số CMND</label> 
								<input class="form-control" id="soCmndAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="ngayCapCmndAdd">Ngày Cấp</label>
								<div class="input-group date" data-provide="datepicker">
									<input type="text" class="form-control" id="ngayCapCmndAdd">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-th"></span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<label for="noiCapCmndAdd">Nơi cấp CMND</label> 
								<input class="form-control" id="noiCapCmndAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="noiDKHoKhauThuongTruAdd">Nơi đăng ký hộ khẩu thường trú</label> 
								<input class="form-control" id="noiDKHoKhauThuongTruAdd" type="text">
							</div>
						</div>

						<div class="row">
							<div class="col-md-3">
								<label for="noiOHienNayAdd">Nơi ở hiện nay</label> 
								<input class="form-control" id="noiOHienNayAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="ngheNghiepKhiTuyenDungAdd">Nghề Nghiệp khi tuyển dụng</label> 
								<input class="form-control" id="ngheNghiepKhiTuyenDungAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="coQuanTuyenDungAdd">Cơ quan tuyển dụng</label> 
								<input class="form-control" id="coQuanTuyenDungAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="ngayTuyenDungAdd">Ngày tuyển dụng</label>
								<div class="input-group date" data-provide="datepicker">
									<input type="text" class="form-control" id="ngayTuyenDungAdd">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-th"></span>
									</div>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-md-3">
								<div class="form-group">
									<label for="chucVu_pkAdd">Chức vụ hiện tại</label>
									<c:if test="${not empty chucVuLists}">
										<select class="form-control my-select-control-style" id="chucVu_pkAdd" required="true">
											<c:forEach var="dto" items="${chucVuLists}">
												<option value="${dto.pk}">${dto.tenChucVu}</option>
											</c:forEach>
										</select>
									</c:if>
								</div>
							</div>
							<div class="col-md-3">
								<label for="congViecDuocGiaoAdd">Công việc chính được giao</label>
								<input class="form-control" id="congViecDuocGiaoAdd" value="Giảng dạy" type="text">
							</div>
							<div class="col-md-3">
								<label for="chucDanhAdd">Chức Danh</label> 
								<input class="form-control" id="chucDanhAdd" value="Giảng Viên" type="text">
							</div>
							<div class="col-md-3">
								<div class="form-group">
									<label for="ngachCongChuc_pkAdd">Ngạch công chức</label>
									<c:if test="${not empty ngachCongChucLists}">
										<select class="form-control my-select-control-style"
											id="ngachCongChuc_pkAdd" onchange="changeNgachCongChucAdd()"
											required="true">
											<c:forEach var="dto" items="${ngachCongChucLists}">
												<option value="${dto.pk}">${dto.maNgach}</option>
											</c:forEach>
										</select>
									</c:if>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-md-3">
								<label for="tenNgachAdd" class="label-style">Tên ngạch công chức viên chức</label> 
								<input class="form-control" id="tenNgachAdd" type="text">
							</div>
							<div class="col-md-3">
								<div class="form-group">
									<label for="bacLuong_pkAdd" class="label-style">Bậc lương</label>
									<select class="form-control my-select-control-style"
										id="bacLuong_pkAdd" required="true"></select>
								</div>
							</div>
							<div class="col-md-3">
								<label for="heSoLuongAdd" class="label-style">Hệ Số Lương</label> 
								<input class="form-control" id="heSoLuongAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="ngayHuongAdd" class="label-style">Ngày hưởng</label>
								<div class="input-group date" data-provide="datepicker">
									<input type="text" class="form-control" id="ngayHuongAdd">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-th"></span>
									</div>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-md-3">
								<label for="phuCapChucVuAdd">Phụ cấp chức vụ</label> 
								<input class="form-control" id="phuCapChucVuAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="phuCapKhacAdd">Phụ cấp khác</label> 
								<input class="form-control" id="phuCapKhacAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="trinhDoGiaoDucPtAdd">Trình độ giáo dục phổ thông</label> 
								<input class="form-control" id="trinhDoGiaoDucPtAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="trinhDoChuyenMonAdd">Trình độ chuyên môn cao nhất</label> 
								<input class="form-control" id="trinhDoChuyenMonAdd" type="text">
							</div>
						</div>

						<div class="row">
							<div class="col-md-3">
								<label for="hocViAdd" class="label-style">Học Vị</label> 
								<input class="form-control" id="hocViAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="ngayNhanHocViAdd" class="label-style">Ngày nhận học vị</label>
								<div class="input-group date" data-provide="datepicker">
									<input type="text" class="form-control" id="ngayNhanHocViAdd">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-th"></span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<label for="hocHamAdd" class="label-style">Học Hàm</label> 
								<input class="form-control" id="hocHamAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="ngayNhanHocHamAdd" class="label-style">Ngày nhận học hàm</label>
								<div class="input-group date" data-provide="datepicker">
									<input type="text" class="form-control" id="ngayNhanHocHamAdd">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-th"></span>
									</div>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-md-3">
								<label for="lyLuanChinhTriAdd">Lý luận chính trị</label> 
								<input class="form-control" id="lyLuanChinhTriAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="quanLyNhaNuocAdd">Quản lý nhà nước</label> 
								<input class="form-control" id="quanLyNhaNuocAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="ngoaiNguAdd">Anh Văn</label> 
								<input class="form-control" id="ngoaiNguAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="tinHocAdd">Tin học</label> 
								<input class="form-control" id="tinHocAdd" type="text">
							</div>
						</div>

						<div class="row">
							<div class="col-md-3">
								<label for="ngayVaoDcsvnDuBiAdd" class="label-style">Ngày vào đảng cộng sản Việt Nam dự bị</label>
								<div class="input-group date" data-provide="datepicker">
									<input type="text" class="form-control" id="ngayVaoDcsvnDuBiAdd">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-th"></span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<label for="ngayVaoDcsvnChinhThucAdd" class="label-style">Ngày vào đảng cộng sản Việt Nam chính thức</label>
								<div class="input-group date" data-provide="datepicker">
									<input type="text" class="form-control" id="ngayVaoDcsvnChinhThucAdd">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-th"></span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<label for="thamGiaToChucCtxhAdd" class="label-style">Tham gia tổ chức chính trị xã hội</label> 
								<input class="form-control" id="thamGiaToChucCtxhAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="ngayNhapNguAdd" class="label-style">Ngày nhập ngũ</label>
								<div class="input-group date" data-provide="datepicker">
									<input type="text" class="form-control" id="ngayNhapNguAdd">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-th"></span>
									</div>
								</div>
							</div>
						</div>

						<div class="row">
							<div class="col-md-3">
								<label for="ngayXuatNguAdd">Ngày xuất ngũ</label>
								<div class="input-group date" data-provide="datepicker">
									<input type="text" class="form-control" id="ngayXuatNguAdd">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-th"></span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<label for="quanHamCaoNhatAdd">Quân hàm cao nhất</label> 
								<input class="form-control" id="quanHamCaoNhatAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="danhHieuPhongTangAdd">Danh hiệu được phong tặng cao nhất</label> 
								<input class="form-control" id="danhHieuPhongTangAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="soTruongCongTacAdd">Số trường công tác giảng dạy</label> 
								<input class="form-control" id="soTruongCongTacAdd" type="text">
							</div>
						</div>

						<div class="row">
							<div class="col-md-3">
								<label for="khenThuongAdd">Khen thưởng</label> 
								<input class="form-control" id="khenThuongAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="kyLuatAdd">Kỷ luật</label> 
								<input class="form-control" id="kyLuatAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="tinhTrangSucKhoeAdd">Tình trạng sức khỏe</label> 
								<input class="form-control" id="tinhTrangSucKhoeAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="chieuCaoAdd">Chiều cao</label> 
								<input class="form-control" id="chieuCaoAdd" type="text">
							</div>
						</div>

						<div class="row">
							<div class="col-md-3">
								<label for="canNangAdd" class="label-style">Cân nặng</label> 
								<input class="form-control" id="canNangAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="nhomMauAdd" class="label-style">Nhóm máu</label> 
								<select class="form-control my-select-control-style" id="nhomMauAdd">
									<option value="A">A</option>
									<option value="B">B</option>
									<option value="AB">AB</option>
									<option value="O">O</option>
								</select>
							</div>
							<div class="col-md-3">
								<label for="soBaoHiemXhAdd" class="label-style">Số bảo hiểm xã hội</label> 
								<input class="form-control" id="soBaoHiemXhAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="laThuongBinhAdd" class="label-style">Là thương binh</label> 
								<input class="form-control" id="laThuongBinhAdd" type="text">
							</div>
						</div>

						<div class="row">
							<div class="col-md-3">
								<label for="laConGiaDinhChinhSachAdd" class="label-style">Là con gia đình chính sách</label> 
								<input class="form-control" id="laConGiaDinhChinhSachAdd" type="text">
							</div>
							<div class="col-md-3">
								<label for="nhanXetAdd" class="label-style">Nhận xét</label>
								<textarea class="form-control" id="nhanXetAdd"></textarea>
							</div>
						</div>

						<div class="row">
							<div class="col-md-3">
								<label for="inputdefault" class="label-style">Thôi việc</label>
								<input type="checkbox" value=""></label>
							</div>
							<div class="col-md-3">
								<label for="ngayThoiViecAdd" class="label-style">Ngày thôi việc</label>
								<div class="input-group date" data-provide="datepicker">
									<input type="text" class="form-control" id="ngayThoiViecAdd">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-th"></span>
									</div>
								</div>
							</div>
							<div class="col-md-3">
								<label for="inputdefault" class="label-style">Về Hưu</label> 
								<input type="checkbox" value=""></label>
							</div>
							<div class="col-md-3">
								<label for="ngayVeHuuAdd" class="label-style">Ngày về hưu</label>
								<div class="input-group date" data-provide="datepicker">
									<input type="text" class="form-control" id="ngayVeHuuAdd">
									<div class="input-group-addon">
										<span class="glyphicon glyphicon-th"></span>
									</div>
								</div>
							</div>
						</div>

					</form>
				</div>
			</div>
		</div>
	</div>
</div>
