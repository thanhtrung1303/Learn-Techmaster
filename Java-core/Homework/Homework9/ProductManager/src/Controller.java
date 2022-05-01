import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static ProductService service = new ProductService();
    static ArrayList<Product> products = service.getAllProduct();

    public static void menu(){
        System.out.println("1 - Xem danh sách toàn bộ sản phẩm");
        System.out.println("2 - Tìm sản phẩm theo tên");
        System.out.println("3 - Xem danh sách sản phẩm theo loại mặt hàng");
        System.out.println("4 - Cập nhật - xóa sản phẩm");
        System.out.println("5 - Thêm sản phẩm");
        System.out.println("6 - Sap xep theo gia");
        System.out.println("0 - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void subMenu() {
        System.out.println("-----------------------------------------");
        System.out.println("1 - Cập nhật tên sản phẩm");
        System.out.println("2 - Cập nhật giá sản phẩm");
        System.out.println("3 - Xóa sản phẩm");
        System.out.println("4 - Quay về màn hình chính");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void subMenuItem() {
        System.out.println("-----------------------------------------");
        System.out.println("1 - Đồ gia dụng");
        System.out.println("2 - Thực phẩm");
        System.out.println("3 - Thời trang");
        System.out.println("4 - Quay về màn hình chính");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void mainMenu() {
        boolean iscontinue = true;
        while (iscontinue){
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Danh sách sản phẩm: ");
                    service.show(products);
                    break;
                case 2:
                    System.out.println("Nhập sản phẩm muốn tìm: ");
                    String name = sc.nextLine();
                    service.searchByName(products, name);
                    break;
                case 3:
                    sortByItem();
                    break;
                case 4:
                    searchById();
                    break;
                case 5:
                    System.out.println("Nhập sản phẩm muốn thêm: ");
                    Product newProduct = service.createNewProdcut();
                    service.addNewProduct(newProduct, products);
                    System.out.println("Danh sách sản phẩm sau khi thêm: ");
                    service.show(products);
                    break;
                case 6:
                    Collections.sort(products);
                    System.out.println("Danh sach san pham sap xep theo gia");
                    service.show(products);
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("không có lựa chọn này");
            }
        }
    }

    public static void searchById() {
        System.out.println("Nhập mã sản phẩm muốn cập nhật: ");
        int id = Integer.parseInt(sc.nextLine());
        Product product = service.searchByID(products, id);
        System.out.println(product);
        subMenu();
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Cập nhật tên sản phẩm");
                String newName = sc.nextLine();
                service.updateNameProduct(product, newName);
                break;
            case 2:
                System.out.println("Cập nhật giá sản phẩm");
                long newPrice = Long.parseLong(sc.nextLine());
                service.updatePriceProduct(product, newPrice);
                break;
            case 3:
                System.out.println("Danh sách sản phẩm sau khi xóa: ");
                service.deleteProduct(products, product);
                service.show(products);
                break;
            case 4:
                menu();
                break;
        }
    }

    public static void sortByItem(){
        subMenuItem();
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                for (Product p : products){
                    if (p.getItem().getValue().contains(Item.ITEM1.getValue())){
                        System.out.println(p);
                    }
                }
                break;
            case 2:
                for (Product p : products){
                    if (p.getItem().getValue().contains(Item.ITEM2.getValue())){
                        System.out.println(p);
                    }
                }
                break;
            case 3:
                for (Product p : products){
                    if (p.getItem().getValue().contains(Item.ITEM3.getValue())){
                        System.out.println(p);
                    }
                }
                break;
            case 4:
                menu();
                break;
        }
    }
}
