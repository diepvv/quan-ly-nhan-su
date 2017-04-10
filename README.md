# quan-ly-nhan-su
quan-ly-nhan-su
**TÀI LIỆU ĐẶC TẢ YÊU CẦU**

**ĐỒ ÁN TỐT NGHIỆP &quot; XÂY DỰNG ỨNG DỤNG WEB QUẢN LÝ NHÂN SỰ TRƯỜNG ĐẠI HỌC&quot;**

1. 1.Giới thiệu về đồ án tốt nghiệp &quot; XÂY DỰNG ỨNG DỤNG WEB QUẢN LÝ NHÂN SỰ TRƯỜNG ĐẠI HỌC&quot;

Đồ án Xây dựng ứng dụng web quản lý nhân sự trường đại học là một ứng dụng dùng trong trường đại học với mục đích quản lý thông tin nhân sự trong trường đại học như quản lý:

- **** Danh sách cán bộ giảng viên.
- **** Danh sách hợp đồng.
- **** Danh sách cán bộ khoán gọn.
- **** Danh sách cán bộ giảng viên kiêm nhiệm.
- **** Danh sách cán bộ giảng viên thâm niên.
- **** Danh sách các quyết định trong trường đại học.
- **** Quản lý kê khai tài sản của cán bộ giảng viên trong trường.
- **** Ngoài ra còn quản lý quá trình lương và tính lương của giảng viên trong trường đại học.

1. 2.Kiến trúc hệ thống

**Các thành phần của kiến trúc hệ thống gồm có:**

- **--**** Các đối tượng sử dụng:**

**○** Quản lý/ quản trị

○ Nhân viên phòng quản lý hành chính và nhân sự

- **--**** Thiết bị truy cập vào trang web(yêu cầu có trình duyệt web):**

**○** Máy tính để bàn, laptop

○ Máy tính bảng

○ Điện thoại thông minh

1. 3.Kiến trúc phần mềm

**Trong đó:**

- **--** Người dùng **trình duyệt web** để truy cập đến website quản lý nhân sự trường đại học.
- **--** Website được thiết kế theo mô hình web động, Trên nền tảng **ngôn ngữ lập trình Java** (Nền tản có tính bảo mật cao, có hiệu năng tốt) áp dụng **Spring MVC Framework**. Toàn bộ trang web khi hoàn thành sẽ được triển khai trên **Apache Tomcat**.
- **--** Cơ sở dữ liệu để quản lý thông tin được sử dụng là **MySQL**.
- **--** Ngoài ra còn có kết hợp một số công nghệ trong quá trình hoàn thiện như: Spring Boot, Maven, DataTables Jquery, Spring RESTful, BootStrap.

1. 4.Về giao diện và ngôn ngữ
  1. 4.1Về giao diện

- **--** Giao diện trang web xây dựng phải đạt được các tiêu chí sau:

○ Giao diện dễ nhìn, bố cục gọn gàng, dễ sử dụng các chức năng.

○ Có khả năng hiện thị trên máy tính bàn, laptop, điện thoại thông minh

1.
  1. 4.2Về ngôn ngữ

- **--** Các Mô-đun của website được thiết kế bằng tiếng việt, hiện thị trên Datatable có một số tiêu đề nhỏ bằng tiếng anh.

1. 5.Các đối tượng và thông tin có trong hệ thống
  1. 5.1Người sử dụng

Admin/quản trị viên là người sử dụng ứng dụng web là các **nhân viên trong phòng quản lý hành chính và nhân sự** trường đại học.

- **--** Admin có quyền thêm các admin khác.

1.
  1. 5.2Cán bộ giảng viên trong trường đại học

 Cán bộ giảng viên trong trường đại học được hiểu là toàn bộ các giảng viên, nhân viên, cán bộ quản lý đã được tuyển dụng trong trường đại học bao gồm rất nhiều thông tin như:

**Về phần Sơ Yếu lí lịch bao gồm các thuộc tính:**

- **--** Đơn vị công tác
- **--**** Số hiệu cán bộ (khóa chính)**
- **--** Ảnh 3x4
- **--** Tên cán bộ
- **--** Giới tính
- **--** Ngày sinh
- **--** Quê quán
- **--** Dân tộc
- **--** Tôn giáo
- **--** Số CMND
- **--** Nơi ở hiện nay
- **--** Nghề nghiệp khi được tuyển dụng
- **--** Cơ quan tuyển dụng
- **--** Chức vụ hiện tại
- **--** Mã ngạch
- **--** Bậc lương
- **--** Hệ số lương
- **--** Phụ cấp chức vụ
- **--** Học vị
- **--** Trình độ ngoại ngữ
- **--** Ngày vào Đảng Cộng Sản Việt Nam
- **--** Tình trạng sức khỏe
- **--** Danh hiệu được khen tặng
- **--** ………………..

**Quan hệ gia đình bản thân bao gồm:**

- **--** Mối quan hệ
- **--** Họ tên
- **--** Năm sinh
- **--** Quê quán nghề nghiệp

**Quá trình công tác bao gồm:**

- **--** Đơn vị
- **--** Họ tên cán bộ
- **--** Nội dung công tác
- **--** Công tác từ ngày
- **--** Công tác đến ngày
- **--** Ghi chú
- **--** Người ký

**Quá trình đào tạo bao gồm:**

- **--** Đơn vị
- **--** Họ tên cán bộ
- **--** Đơn vị đào tạo
- **--** Hình thức đào tạo
- **--** Chuyên ngành đào tạo
- **--** Tên bằng cấp
- **--** Hình thức đi học: **trong nước** hoặc **nước ngoài**
- **--** Từ ngày
- **--** Đến ngày
- **--** Ghi chú

**Danh sách hợp đồng** (ứng với cán bộ được chọn)

**Danh sách quyết định** (ứng với cán bộ được chọn)

**Quá trình lương** (ứng với cán bộ được chọn)

**Chức vụ kiêm nhiệm** ( ứng với cán bộ được chọn)

**Kê khai tài sản** (ứng với cán bộ được chọn)

1.
  1. 5.3Cán bộ khoán gọn

 Cán bộ khoán gọn được hiểu là các giảng viên, cán bộ công nhân viên được ký hợp đồng trong một thời gian tại trường đại học, cán bộ khoán gọn bao gồm các thông tin:

-   Đơn vị công tác

-   Họ tên cán bộ

-   **Số CMND ( khóa chính )**

-   Địa chỉ

-   Ngày ký hợp đồng

## 5.5  Cán bộ kiêm nhiệm

Cán bộ kiêm nhiệm được hiểu là các giảng viên, cán bộ quản lý trong trường đại học được kiêm thêm một chức vụ nào đó, cán bộ kiêm nhiệm bao gồm thông tin như sau:

-   Đơn vị công tác

-   Họ tên cán bộ (khóa chính)

-   Chức vụ kiêm nhiệm

-   Kiêm nhiệm từ ngày

-   Kiêm nhiệm đến ngày

## 5.6  Cán bộ thâm niên

Cán bộ thâm niên được hiểu là cán bộ công tác lâu năm, bao gồm các thông tin như sau:

-   Đơn vị công tác

-   Mốc tính phụ cấp thâm niên

-   Hệ số lương

-   Thời điểm tăng phụ cấp thâm niên

-   Họ tên cán bộ thâm niên

-   Phụ cấp chức vụ

-   Tổng hệ số lương

-   Số tháng bị giảm trừ

-   Ghi chú

-   Thời gian không tính phụ cấp thâm niên: từ ngày…đến ngày….

## 5.7 Hợp đồng

Được hiểu là các hợp đồng lao động, hợp đồng thử việc, hợp đồng làm việc được ký trong trường đại học: Có 2 loại hợp đồng là hợp đồng cán bộ, và hợp đồng ngắn hạn. Trong đó **Hợp đồng cán bộ** bao gồm thông tin như sau:

- **--** Đơn vị công tác
- **--** Họ tên cán bộ giảng viên
- **--** Mã hợp đồng
- **--** Tên hợp đồng
- **--** Chức vụ
- **--** Loại hợp đồng
- **--** Ngày ký
- **--** Hợp đồng từ ngày
- **--** Hợp đồng đến ngày
- **--** Trích yếu nội dung
- **--** File scan hợp đồng

**Hợp đồng ngắn hạn** bao gồm các thông tin như sau:

- **--** Tên hợp đồng
- **--** Tên nhân viên
- **--** Nội dung hợp đồng
- **--** Ngày ký: Từ ngày…đến ngày….

## 5.8 Lương cán bộ

Lương cán bộ được hiểu là quản lý quá trình lương của các cán bộ giảng viên trong trường đại học bao gồm các thông tin như sau:

-   Đơn vị công tác

-   **Họ tên cán bộ**

-   Đang giữ chức danh/mã ngạch

-   Đang giữ bậc có hệ số lương

-   Đang giữ thời gian tính thưởng

-   Đang giữ % phụ cấp thâm niên vượt khung

-   Thời gian tăng lương: … năm

-   Thời gian chậm lên lương: … tháng

-   Lý do chậm nên lương

-   Thời gian lên lương sớm: … tháng

-   Lý do lên lương sớm

-   Chức danh/mã ngạch mới

-   Bậc có hệ số lương mới

-   Phần trăm phụ cấp thâm niên vượt khung mới

-   Thời gian tính hưởng mới

-   Ghi chú

## 5.9 Kê khai tài sản

Kê khai tài sản cán bộ bao gồm các thông tin như sau:

-   **Họ tên cán bộ**

-   Ngày kê khai

-   File kê khai tài sản

## 5.10 Các quyết định

   Các quyết định được hiểu là quyết định được ký thông qua người đứng đầu trường đại học, Ngoài ra có thêm quyết định khen thưởng, kỷ luật cán bộ giảng viên trong trường đại học

Thông tin **danh sách quyết định** bao gồm:

-   Đơn vị công tác

-   Họ tên cán bộ

-   **Số quyết định**

-   Tên quyết định

-   Loại quyết định

-   Nội dung quyết định

-   Ngày ký: …

-   Ký từ ngày: …

-   Ký đến ngày: …

-   Người ký

-   File Ký

Thông tin **quyết định khen thưởng/kỷ luật** bao gồm:

- **--** Đơn vị công tác
- **--** Họ tên cán bộ
- **--**** Số quyết định**
- **--** Tên quyết định: **khen thưởng/kỷ luật**
- **--** Nội dung quyết định **khen thưởng/kỷ luật**
- **--** Ngày ký
- **--** Người ký

**5.11 Các Danh mục quản lý**

**- CHỨC VỤ (**  **Tên chức vụ**** )**

**- NGẠCH CÔNG CHỨC (**  **Mã ngạch**** , **tên ngạch công chức, số năm nâng bậc lương thường xuyên** )**

**- LOẠI HỢP ĐỒNG (**  **Tên loại hợp đồng**** )**

**- LOẠI QUYẾT ĐỊNH (**  **Tên loại quyết định**** )**

**- DÂN TỘC (**  **Tên dân tộc**** )**

**- TÔN GIÁO (****Tên tôn giáo****)**

**- ĐƠN VỊ CHỨC NĂNG (**  **Mã đơn vị**** , **tên đơn vị** )**

**- BỘ MÔN CHUYÊN MÔN (**  **ID**** , **Tên bộ môn chuyên môn** )**

1. 6.Các chức năng cụ thể

Chức năng của admin, các nhân viên trong phòng quản lý hành chính và nhân sự bao gồm:

- **--**** Thêm admin** : Là các nhân viên trong phòng quản lý hành chính và nhân sự.
- **--**** XEM, THÊM, SỬA, XÓA** các thông tin của Cán bộ, lương cán bộ, tài sản cán bộ, các quyết định được ký, các hợp đồng đã được ký.
- **--**** Thống kê, Tìm kiếm **và** Xuất các file Exel, file Doc** của: thông tin danh sách cán bộ, thông tin cán bộ, danh sách lương cán bộ, thông tin lương cán bộ.
- **--**** Tính lương** của cán bộ giảng viên.
