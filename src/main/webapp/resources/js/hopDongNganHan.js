$(document).ready(function() {
    var hopDongNganHanService = "/hopDongNganHanService";
    var hopDongNganHanController = "/hopDongNganHanController";
    var table = $('#HopDongNganHanTable').DataTable({
        "sAjaxSource": "/hopDongNganHanService" +
            "/getAll",
        "sAjaxDataProp": "",
        "order": [
            [0, "asc"]
        ],
        "aoColumnDefs": [{
                "aTargets": [0],
                "mData": "tenHopDong"
            },
            {
                "aTargets": [1],
                "mData": "tenNhanVien"
            },
            {
                "aTargets": [2],
                "mData": "ngayKy"
            },
            {
                "aTargets": [3],
                "mData": "tuNgay"
            },
            {
                "aTargets": [4],
                "mData": "denNgay"
            },
            {
                "targets": -1,
                "data": null,
                "defaultContent": "<button type='button' class='btn btn-info btn-lg' data-toggle='modal' id='btnDel'>Xóa</button>"
            },
            {
                "targets": -2,
                "data": null,
                "defaultContent": "<button type='button' class='btn btn-info btn-lg' data-toggle='modal' id='btnUpdate'>Sửa</button>"
            },
        ],
        scrollY: "600px",
        scrollCollapse: true,
        dom: 'Blfrtip',
        buttons: [
            'excel',
            'pdf',
            'print',
            {
                text: 'THÊM HỢP ĐỒNG NGẮN HẠN',
                action: function(e, dt, node, config) {
                    $('#formHDNganHan').modal('show');
                }
            }
        ],
        colReorder: true,
        select: true,
        "language": {
            "url": "//cdn.datatables.net/plug-ins/1.10.13/i18n/Vietnamese.json"
        }
    });

    $('#HopDongNganHanTable tbody').on('click', 'button', function() {
        var id = $(this)[0].id;
        if ("btnDel" == id) {
            var data = table.row($(this).parents('tr')).data();
            check = confirm("Bạn có chắc chắn muốn xóa đối tượng : " + data['tenNhanVien']);
            var maHDNganHan = data['maHDNganHan'];
            if (check == true) {
                $.ajax({
                    url: hopDongNganHanController + "/delete/" + maHDNganHan,
                    type: 'DELETE',
                    success: function(res) {
                        table.ajax.reload();
                    }
                });
            }
        }
    });

    $('#HopDongNganHanTable tbody').on('click', 'button', function() {
        var id = $(this)[0].id;
        if ("btnUpdate" == id) {
            var data = table.row($(this).parents('tr')).data();
            var maHDNganHan = data['maHDNganHan'];
            $.ajax({
                url: "/hopDongNganHanService" + "/getById/" + maHDNganHan,
                type: 'GET',
                success: function(res) {
                    txtTenHopDong.val(res.tenHopDong);
                    txtTenNhanVien.val(res.tenNhanVien);
                    txtNgayKy.val(res.ngayKy);
                    txtTuNgay.val(res.tuNgay);
                    txtDenNgay.val(res.denNgay);
                    $('#formHDNganHan').modal('show');
                }
            });
        }
    });

    $("button#btnCapNhap").click(function(e) {
    	
    	var endpointUrl = '/hopDongNganHanController/update';
    	
    	// TODO: need to implement code @here
    	// if(dang la Add new) {
    	// endpointUrl = '/hopDongNganHanController/add';
    	// }
    	
    	var txtTenHopDong = $(tenhopdong);
        var txtTenNhanVien = $(tennhanvien);
        var txtNgayKy = $(dpNgayKy);
        var txtTuNgay = $(dpTuNgay);
        var txtDenNgay = $(dpDenNgay);
        
        var json = new Object();
        // TODO: don't need the valud of [maHDNganHan] @here because user doesn't input this value
        json.maHDNganHan = -1;
        json.tenHopDong = txtTenHopDong.val();
        json.tenNhanVien = txtTenNhanVien.val();
        json.ngayKy = txtNgayKy.val();
        json.tuNgay = txtTuNgay.val();
        json.denNgay = txtDenNgay.val();
        
        $.ajax({
            type: "POST",
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(json),
            url: endpointUrl,
            success: function(msg) {
                table.ajax.reload();
            },
            error: function() {
                alert("Failed");
            }
        });
    });
});

/*  datepicker*/
$.fn.datepicker.defaults.format = "yyyy-mm-dd";
$('.datepicker').datepicker({
    startDate: '-3d'
});