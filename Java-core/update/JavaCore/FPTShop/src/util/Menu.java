package util;

public class Menu {

    public static void menu(){
        System.out.println("---------------------------------------");
        System.out.println("1 - In thông tin dựa trên danh mục");
        System.out.println("2 - In thông tin sản phẩm dựa theo hãng");
        System.out.println("3 - In thông tin sản phẩm dựa trên mức giá");
        System.out.println("4 - Tìm kiếm sản phẩm ");
        System.out.println("5 - Liệt kê số lượng sản phẩm của từng danh mục");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
    public static void categoryMenu(){
        System.out.println("---------------------------------------");
        System.out.println("Danh mục:");
        System.out.println("1 - Điện thoại");
        System.out.println("2 - Laptop");
        System.out.println("3 - Apple");
        System.out.println("4 - Phụ kiện");
        System.out.println("0 - Về menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void costMenu(){
        System.out.println("----------------------------------------------");
        System.out.println("Mức giá:");
        System.out.println("1 - Dưới 2 triệu");
        System.out.println("2 - Từ 2-4 triệu");
        System.out.println("3 - Từ 4-7 triệu");
        System.out.println("4 - Từ 7-13 triệu");
        System.out.println("5 - Trên 13 triệu");
        System.out.println("0 - Về menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }
}
