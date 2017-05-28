<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div id="thongKeForm" class="modal fade" role="dialog">
	<div class="modal-dialog">
		<!-- Modal content-->
		<div class="modal-content ">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<center>
					<h4 class="modal-title">THỐNG KÊ</h4>
				</center>
			</div>
			<div class="modal-body">
				<div class="panel-group" id="accordion">
					<input id="hidTieuChi" type="hidden">

					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseCanBo" data-parent="#accordion" 
								   onclick="$(hidTieuChi).val('canBo')">Cán bộ</a>
							</h4>
						</div>
						<div id="collapseCanBo" class="panel-collapse collapse">
							<label for="cbPhanLoaiCanBo">Phân loại</label>
							<select class="form-control my-select-control-style" id="cbPhanLoaiCanBo" >
								<option value="0">Khối hành chính</option>
								<option value="1">Khối giảng viên</option>
							</select> 
						</div>
					</div>

					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseDoTuoi" data-parent="#accordion" 
								   onclick="$(hidTieuChi).val('doTuoi')">Theo độ tuổi</a>
							</h4>
						</div>
						<div id="collapseDoTuoi" class="panel-collapse collapse">
							<label for="txtDoTuoiTu">Độ tuổi từ</label> 
							<input class="form-control" id="txtDoTuoiTu" type="text"> 
							<label for="txtĐenDotuoi">Đến độ tuổi</label> 
							<input class="form-control" id="txtĐenDotuoi" type="text">
						</div>
					</div>

					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseGioiTinh" data-parent="#accordion"
								   onclick="$(hidTieuChi).val('gioiTinh')">Theo giới tính</a>
							</h4>
						</div>
						<div id="collapseGioiTinh" class="panel-collapse collapse">
							<label for="cbGioiTinh">Giới tính</label>
							<select class="form-control my-select-control-style" id="cbGioiTinh">
								<option value="0">Nam</option>
								<option value="1">Nữ</option>
							</select> 
						</div>
					</div>

					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseDanToc" data-parent="#accordion" 
								   onclick="$(hidTieuChi).val('danToc')">Theo dân tộc</a>
							</h4>
						</div>
						<div id="collapseDanToc" class="panel-collapse collapse">
							<label for="cbDanToc">Dân tộc</label>
							<c:if test="${not empty danTocLists}">
								<select class="form-control my-select-control-style" id="cbDanToc">
									<c:forEach var="dto" items="${danTocLists}">
										<option value="${dto.pk}">${dto.tenDanToc}</option>
									</c:forEach>
								</select>
							</c:if>
						</div>
					</div>

					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseTonGiao" data-parent="#accordion" 
								   onclick="$(hidTieuChi).val('tonGiao')">Theo tôn giáo</a>
							</h4>
						</div>
						<div id="collapseTonGiao" class="panel-collapse collapse">
							<label for="cbTonGiao">Tôn giáo</label>
							<c:if test="${not empty tonGiaoLists}">
								<select class="form-control my-select-control-style" id="cbTonGiao">
									<c:forEach var="dto" items="${tonGiaoLists}">
										<option value="${dto.pk}">${dto.tenTonGiao}</option>
									</c:forEach>
								</select>
							</c:if>
						</div>
					</div>

					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseChucVu" data-parent="#accordion" 
								   onclick="$(hidTieuChi).val('chucVu')">Theo chức vụ</a>
							</h4>
						</div>
						<div id="collapseChucVu" class="panel-collapse collapse">
							<label for="cbChucVu">Chức vụ</label>
							<c:if test="${not empty chucVuLists}">
								<select class="form-control my-select-control-style" id="cbChucVu">
									<c:forEach var="dto" items="${chucVuLists}">
										<option value="${dto.pk}">${dto.tenChucVu}</option>
									</c:forEach>
								</select>
							</c:if>
						</div>
					</div>

					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseChucDanh" data-parent="#accordion"
								   onclick="$(hidTieuChi).val('chucDanh')">Theo chức danh</a>
							</h4>
						</div>
						<div id="collapseChucDanh" class="panel-collapse collapse">
							<label for="txtChucDanh">Chức danh</label> 
							<input class="form-control" id="txtChucDanh" type="text">
						</div>
					</div>

					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseBoMonChuyenMon" data-parent="#accordion"
								   onclick="$(hidTieuChi).val('boMonChuyenMon')">Theo bộ môn chuyên môn</a>
							</h4>
						</div>
						<div id="collapseBoMonChuyenMon" class="panel-collapse collapse">
							<label for="cbDonViChucNang">Đơn vị công tác</label>
							<c:if test="${not empty donViChucNangLists}">
								<select class="form-control my-select-control-style" id="cbDonViChucNang" 
										onchange="changeDonViChucNangThongKe()">
									<c:forEach var="dto" items="${donViChucNangLists}">
										<option required="true" value="${dto.pk}">${dto.tenDonVi}</option>
									</c:forEach>
								</select>
							</c:if>

							<label for="cbBoMon">Bộ môn chuyên môn</label> 
							<select class="form-control my-select-control-style" id="cbBoMon"></select>

						</div>
					</div>

					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseQueQuan" data-parent="#accordion" 
								   onclick="$(hidTieuChi).val('queQuan')">Theo quê quán</a>
							</h4>
						</div>
						<div id="collapseQueQuan" class="panel-collapse collapse">
							<label for="cbQueQuan">Tỉnh hoặc thành phố</label>
							<c:if test="${not empty queQuanLists}">
								<select class="form-control my-select-control-style" id="cbQueQuan">
									<c:forEach var="dto" items="${queQuanLists}">
										<option value="${dto.pk}">${dto.tenQueQuan}</option>
									</c:forEach>
								</select>
							</c:if>
						</div>
					</div>

					<div class="panel panel-default">
						<div class="panel-heading">
							<h4 class="panel-title">
								<a data-toggle="collapse" href="#collapseNgachCongChuc" data-parent="#accordion"
								   onclick="$(hidTieuChi).val('ngachCongChuc')">Theo ngạch công chức</a>
							</h4>
						</div>
						<div id="collapseNgachCongChuc" class="panel-collapse collapse">
							<label for="cbNgachCongChuc">Mã ngạch</label>
							<c:if test="${not empty ngachCongChucLists}">
								<select class="form-control my-select-control-style" id="cbNgachCongChuc">
									<c:forEach var="dto" items="${ngachCongChucLists}">
										<option value="${dto.pk}">${dto.maNgach}</option>
									</c:forEach>
								</select>
							</c:if>
						</div>
					</div>

				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal" id="btnXacNhanThongKe">Xác nhận</button>
				<button type="button" class="btn btn-default" data-dismiss="modal" id="btnDong">Đóng</button>
			</div>
		</div>

	</div>
</div>