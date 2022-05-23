package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Product;
import service.ProductService;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static ProductService service = new ProductService();
    static ArrayList<Product> products = service.getAllProducts();

    public static void menu() {
        System.out.println("-------------------------------------------");
        System.out.println("1 - Xem toàn bộ sản phẩm ");
        System.out.println("2 - Thêm 1 sản phẩm vào danh sách ");
        System.out.println("3 - Tìm sản phẩm theo tên ");
        System.out.println("4 - Tìm sản phẩm theo ID");
        System.out.println("5 - Liệt kê sản phẩm theo loại mặt hàng ");
        System.out.println("6 - Sắp xếp");
        System.out.println("0 - Thoát khỏi chương trình ");
        System.out.println("Lựa  chọn của bạn là: ");

    }

    public static void submenu() {
        System.out.println("-----------------------------------------------------");
        System.out.println("1 - Cập nhật tên sản phẩm ");
        System.out.println("2 - Cập nhật giá sản phẩm ");
        System.out.println("3 - Xoá sản phẩm ");
        System.out.println("4 - Quay về màn hình chính ");
    }

    public static void mainMenu() {
        boolean isContinue = true;
        while (isContinue) {
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Danh sách: ");
                    service.show(products);
                    break;
                case 2:
                    System.out.println("Thêm sản phẩm: ");
                    Product newproduct = service.createaNewProduct();
                    service.addaNewProduct(newproduct, products);
                    break;
                case 3:
                    System.out.println("Nhập tên sản phẩm bạn muốn tìm: ");
                    String searchProductName = sc.nextLine();
                    service.searchByName(products, searchProductName);
                    break;
                case 4:
                    searchByID();
                    break;
                case 5:
                    System.out.println("Nhập tên loại mặt hàng bạn muốn liệt kê: ");
                    String type = sc.nextLine();
                    service.showByType(products, type);
                    break;
                case 6:
                    sortList();
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void searchByID() {
        System.out.println("Nhập ID sản phẩm bạn muốn tìm: ");
        int id = Integer.parseInt(sc.nextLine());
        Product product = service.searchById(products, id);
        System.out.println(product);
        submenu();
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Nhập tên mới cho sản phẩm: ");
                String newProductName = sc.nextLine();
                service.updateProductName(product, newProductName);
                break;
            case 2:
                System.out.println("Nhập giá mới cho sản phẩm: ");
                int newProductCost = Integer.parseInt(sc.nextLine());
                service.updateProductCost(product, newProductCost);
                break;
            case 3:
                System.out.println("Danh sách sau khi xoá: ");
                service.deleteProduct(products, product);
                service.show(products);
            case 4:
                menu();
                break;
        }
    }
    public static void sortList(){
        System.out.println("1 - Sắp xếp theo tên");
        System.out.println("2 - Sắp xếp theo giá tiền");
    }
}
