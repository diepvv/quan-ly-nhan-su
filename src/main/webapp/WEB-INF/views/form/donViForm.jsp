<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div id="DonViForm" class="modal fade" role="dialog">
	<div class="modal-dialog modal-sm">
		<!-- Modal content-->
		<div class="modal-content ">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">Chọn Đơn Vị</h4>
			</div>
			<div class="modal-body">
				<label for="txtThongKeDonViChucNang">Đơn vị công tác</label>
				<c:if test="${not empty donViChucNangLists}">
					<select class="form-control my-select-control-style" id="txtThongKeDonViChucNang">
						<c:forEach var="dto" items="${donViChucNangLists}">
							<option value="${dto.pk}">${dto.tenDonVi}</option>
						</c:forEach>
					</select>
				</c:if>	
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal" id="btnXacNhanDonViCongTac">Xác nhận</button>
				<button type="button" class="btn btn-default" data-dismiss="modal" id="btnDong">Đóng</button>
			</div>
		</div>
	</div>
</div>