package util;

public class Menu {
    public static void mainmenu(){
        System.out.println("---------Danh sách------------");
        System.out.println("1 - Xem toàn bộ sách");
        System.out.println("2 - Tìm sách theo tên");
        System.out.println("3 - Tìm sách theo thể loại");
        System.out.println("4 - Tìm sách theo giá");
        System.out.println("5 - Sách bán chạy");
        System.out.println("6 - Sách mới phát hành");
        System.out.println("7 - Mua sách");
        System.out.println("8 - Quản lý bán hàng");
        System.out.println("0 - Thoát chương trình");
        System.out.println(" Mời chọn mục lục");
    }

    public static void subMenuPrice(){
        System.out.println("---------Mức giá----------");
        System.out.println("1 - Dưới 50,000đ");
        System.out.println("2 - Từ 50,000 đến 100,000đ");
        System.out.println("3 - Trên 100,000");
        System.out.println(" Mời chọn giá");
    }

    public static void subMenuUpdate(){
        System.out.println("1 - Thêm sách");
        System.out.println("2 - cập nhật lại sách");
        System.out.println("3 - Xóa sách");
        System.out.println("4 - Xem thông tin khách hàng");
        System.out.println("5 - Thêm khách hàng");
        System.out.println("6 - Xóa khách hàng");
        System.out.println("7 - Xem các đơn đặt hàng");
        System.out.println("8 - Đăng xuất");
        System.out.println(" Mời bạn lựa chọn: ");
    }

    public static void subSubMenuUpdate(){
        System.out.println("1 - Cập nhật tên sách");
        System.out.println("2 - Cập nhật thể loại");
        System.out.println("3 - Cập nhật tác giả");
        System.out.println("4 - Cập nhật nhà xuất bản");
        System.out.println("5 - Cập nhật năm xuất bản");
        System.out.println("6 - Cập nhật số lượng đã bán");
        System.out.println("7 - Cập nhật số trang");
        System.out.println("8 - Cập nhật giá bán");
        System.out.println("9 - Quay lại");
        System.out.println(" Mời bạn lựa chọn: ");
    }

    public static void subMenuBuyBook(){
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
        System.out.println("3 - Quay lại");
        System.out.println(" Lựa chọn của bạn: ");
    }

    public static void loginfail(){
        System.out.println("1 - Đăng nhập lại");
        System.out.println("2 - Quên mật khẩu");
        System.out.println(" lựa chọn của bạn");
    }

    public static void subMenuGender(){
        System.out.println("1 - Giới tính nam");
        System.out.println("2 - Giới tính nữ");
        System.out.println(" lựa chọn của bạn:");
    }

    public static void subMenuOrder(){
        System.out.println("1 - Thêm sách vào giỏ hàng");
        System.out.println("2 - Giỏ hàng");
        System.out.println("3 - Thay đổi thông tin");
        System.out.println("4 - Lịch sử mua hàng");
        System.out.println("5 - Đăng xuất");
        System.out.println(" lựa chọn của bạn:");
    }

    public static void subMenuUpdateUser(){
        System.out.println("1 - Thay đổi tên người dùng");
        System.out.println("2 - Thay đổi mật khẩu người dùng");
        System.out.println("3 - Thay đổi giới tính người dùng");
        System.out.println("4 - Thay đổi số điện thoại người dùng");
        System.out.println("5 - Thay đổi ngày sinh người dùng");
        System.out.println("6 - Thay đổi email người dùng");
        System.out.println("7 - Quay lại");
        System.out.println(" Mời bạn lựa chọn: ");
    }

    public static void submenubill(){
        System.out.println("1 - Mua hàng");
        System.out.println("2 - Xóa sách khỏi giỏ hàng");
        System.out.println("3 - Cập nhật lại đơn hàng");
        System.out.println("4 - Quay lại");
        System.out.println(" Mời bạn lựa chọn");
    }
}
