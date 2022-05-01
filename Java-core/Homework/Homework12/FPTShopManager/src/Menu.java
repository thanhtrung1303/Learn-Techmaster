public class Menu {
    public static void mainMenu(){
        System.out.println("1 - Xem thông tin sản phẩm theo danh mục");
        System.out.println("2 - Xem thông tin sản phẩm theo hãng");
        System.out.println("3 - Xem sản phẩm theo mức giá");
        System.out.println("4 - Tìm kiếm sản phẩm");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn của bạn: ");
    }
    public static void subMenuItem(){
        System.out.println("Danh mục sản phẩm: ");
        System.out.println("1 - Điện thoại");
        System.out.println("2 - Laptop");
        System.out.println("3 - Apple");
        System.out.println("4 - Phụ kiện");
        System.out.println("0 - Quay lại");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void subMenuPrice(){
        System.out.println("Chọn mức giá");
        System.out.println("1 - Dưới 2 triệu");
        System.out.println("2 - Từ 2 - 4 triệu");
        System.out.println("3 - Từ 4 - 7 triệu");
        System.out.println("4 - Từ 7 -13 triệu");
        System.out.println("5 - Từ 13 triệu trở lên");
        System.out.println("0 - Quay lại");
        System.out.println("Lựa chọn của bạn: ");
    }
}
