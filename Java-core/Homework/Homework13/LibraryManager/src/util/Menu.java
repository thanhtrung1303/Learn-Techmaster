package util;

public class Menu {
    public static void menu() {
        System.out.println("\n1 - Danh sách theo từng loại");
        System.out.println("2 - Tìm sách theo tên");
        System.out.println("3 - Tìm sách theo thể loại");
        System.out.println("4 - Ebook có lượt tải cao nhất");
        System.out.println("5 - Các báo phát hành trong năm nay");
        System.out.println("0 - Thoát chương trình");
        System.out.println(" Lựa chọn của bạn là: ");
    }
    public static void submenu(){
        System.out.println("-----------------------");
        System.out.println("1 - Sách giáo khoa");
        System.out.println("2 - Báo");
        System.out.println("3 - Tài liệu điện tử");
        System.out.println(" Lựa chọn của bạn là: ");
    }
}