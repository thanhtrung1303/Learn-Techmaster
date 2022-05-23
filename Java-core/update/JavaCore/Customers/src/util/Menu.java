package util;

public class Menu {
    public static void mainMenu() {
        System.out.println("--------------------------------------------------------------");
        System.out.println("1 - Xem toàn bộ thông tin khách hàng");
        System.out.println("2 - Xem thông tin theo giới tính");
        System.out.println("3 - Thêm một khách hàng");
        System.out.println("4 - Tìm theo ID");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void genderMenu() {
        System.out.println("-------------------------------------------------------------------");
        System.out.println("1 - Nam");
        System.out.println("2 - Nữ");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void subMenu() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("1 - Sửa thông tin khách hàng ");
        System.out.println("2 - Xoá thông tin khách hàng ");
        System.out.println("0 - Trở về menu chính");
    }
}
