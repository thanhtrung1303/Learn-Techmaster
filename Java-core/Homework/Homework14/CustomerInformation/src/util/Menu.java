package util;

public class Menu {
    public static void mainMenu(){
        System.out.println("1 - Xem thông tin toàn bộ khách hàng");
        System.out.println("2 - Xem thông tin khách hàng theo giới tính");
        System.out.println("3 - Thêm thông tin khách hàng");
        System.out.println("4 - Tìm khách hàng theo ID");
        System.out.println("0 - Thoát chương trình");
    }

    public static void subMenuGender(){
        System.out.println(" Mời lựa chọn");
        System.out.println("1 - Giới tính nữ");
        System.out.println("2 - Giới tính nam");
    }

    public static void subMenuUpdate(){
        System.out.println("1 - Sửa thông tin khách hàng");
        System.out.println("2 - Xóa thông tin khách hàng");
        System.out.println("3 - Ra màn hình chính");
    }

    public static void subSubMenuUpdate(){
        System.out.println("1 - Thay đổi id");
        System.out.println("2 - Thay đổi tên");
        System.out.println("3 - Thay đổi ngày sinh");
        System.out.println("4 - Thay đổi giới tính");
        System.out.println("5 - Thay đổi địa chỉ");
        System.out.println("6 - Thay đổi số điện thoại");
        System.out.println("7 - Thay đổi email");
        System.out.println("0 - Thoát chương trình");
        System.out.println(" Lựa chọn của bạn là");
    }
}
