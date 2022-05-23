package util;

public class Menu {
    public static void menuUser(){
        System.out.println("---------------------------------------------------------");
        System.out.println("1 - Tìm kiếm Học sinh");
        System.out.println("2 - Tìm kiếm Giáo viên");
        System.out.println("3 - Báo cáo thống kê ");
        System.out.println("4 - Đăng xuất");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
    public static void subMenuUser(){
        System.out.println("---------------------------------------------------------");
        System.out.println("1 - Tìm kiếm theo tên");
        System.out.println("2 - Tìm kiếm theo mã");
        System.out.println("3 - Tìm kiếm theo lớp");
        System.out.println("0 - Về menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }
    public static void menuReport(){
        System.out.println("---------------------------------------------------------");
        System.out.println("1 - Xem kết quả học tập toàn trường");
        System.out.println("2 - Xem kết quả học tập toàn trường theo điểm tổng kết");
        System.out.println("3 - Tìm thủ khoa toàn trường và thủ khoa các khối");
        System.out.println("4 - Thống kê kết quả năm học");
        System.out.println("5 - Xem giáo viên có thâm niên cao nhất");
        System.out.println("0 - Về menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }
    public static void menuTeacher(){
        System.out.println("---------------------------------------------------------");
        System.out.println("1 - Xem thông tin bản thân");
        System.out.println("2 - Cập nhật điểm học sinh");
        System.out.println("3 - In kết quả học sinh lớp dạy");
        System.out.println("4 - In kết quả học tập lớp chủ nhiệm");
        System.out.println("5 - Xem thông tin học sinh toàn trường");
        System.out.println("6 - Tìm kiếm học sinh");
        System.out.println("7 - Tìm kiếm giáo viên");
        System.out.println("8 - Báo cáo thống kê ");
        System.out.println("9 - Đăng xuất");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
    public static void menuAdmin(){
        System.out.println("---------------------------------------------------------");
        System.out.println("1 - Thêm người mới");
        System.out.println("2 - Tạo tài khoản đăng nhập cho Giáo viên, Quản trị viên");
        System.out.println("3 - Xoá tài khoản đăng nhập của Giáo viên");
        System.out.println("4 - Cập nhật giáo viên");
        System.out.println("5 - Cập nhật học sinh");
        System.out.println("6 - Phân bổ nhân sự");
        System.out.println("7 - Báo cáo thông kê");
        System.out.println("8 - Đăng xuất");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");

    }
    public static void menuCreate(){
        System.out.println("---------------------------------------------------------");
        System.out.println("1 - Thêm học sinh mới");
        System.out.println("2 - Thêm giáo viên mới");
        System.out.println("0 - Vê menu chính");
    }
    public static void menuSearchTeacher(){
        System.out.println("---------------------------------------------------------");
        System.out.println("1 - Xoá giáo viên");
        System.out.println("2 - Cập nhật thông tin giáo viên");
        System.out.println("0 - Vê menu chính");
    }
    public static  void menuSearchStudent(){
        System.out.println("---------------------------------------------------------");
        System.out.println("1 - Xoá học sinh");
        System.out.println("2 - Cập nhật thông tin học sinh");
        System.out.println("0 - Vê menu chính");

    }
}
