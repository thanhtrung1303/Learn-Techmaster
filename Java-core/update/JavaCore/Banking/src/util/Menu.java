package util;

public class Menu {
    public static void mainMenu() {
        System.out.println("Bạn muốn làm gì?");
        System.out.println("1 - Truy vấn số dư tài khoản");
        System.out.println("2 - Chuyển tiền");
        System.out.println("3 - Xem lịch sử giao dịch");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void bankMenu() {
        System.out.println("Chọn ngân hàng bạn muốn chuyển!!! ");
        System.out.println("1 - Techcombank");
        System.out.println("2 - Vietcombank");
        System.out.println("3 - TPBank");
        System.out.println("4 - Agribank");
        System.out.println("5 - MBBank");
        System.out.println("6 - Sacombank");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }
    public static void checkMenu(){
        System.out.println("Vui lòng kiểm tra thông tin lần trước khi gửi!!");
        System.out.println("Bạn có muốn gửi không?");
        System.out.println("1 - Đồng ý");
        System.out.println("2 - Từ chối. Quay về menu chính!");
    }
}
