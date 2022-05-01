package controller;

import exception.MyException;
import models.User;
import service.OrderService;
import service.ProductService;
public class AdminController extends Controller {
    //    static models.User currentAdmin = new models.User();
    public static ProductService productService = new ProductService();
    public static OrderService orderService = new OrderService();

    public static void createAdmin(){
        User admin = new User(99999,"admin1","emailAdmin","HN","Vuong","admin1","Admin");
        allUsers.add(admin);
    }

    public static void adminLoginSuccess(){
//        boolean isContinue = true;
        while (true){
            System.out.println("--------------------------------");
            System.out.println("   1 - Thêm sản phẩm");
            System.out.println("   2 - Xem danh sách sản phẩm");
            System.out.println("   3 - Xem danh sách khách hàng");
            System.out.println("   4 - Xem đơn hàng");
            System.out.println("   0 - Đăng xuất");
            System.out.print("Lựa chọn : ");
            int choose = 0;
            boolean isContinue = true;
            while (isContinue) {
                try {
                    choose = Integer.parseInt(sc.nextLine());
                    if (choose < 0 || choose > 4) {
                        throw new MyException("Lựa chọn không hợp lệ");
                    }
                    isContinue=false;
                } catch (NumberFormatException e) {
                    System.out.println("Vui lòng nhập lại");
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Vui lòng nhập lại : ");
                }
            }
            switch (choose){
                case 1 -> ProductService.allProducts.add(productService.addProduct());
                case 2 -> {
                    ProductService.allProducts.forEach(System.out::println);
                    System.out.println("   1 - Thêm sản phẩm");
                    System.out.println("   2 - Xóa sản phẩm");
                    System.out.println("   0 - Quay lại");
                    System.out.print("Lựa chọn : ");
                    int choose2 = 0;
                    boolean isContinue2 = true;
                    while (isContinue2) {
                        try {
                            choose2 = Integer.parseInt(sc.nextLine());
                            if (choose2 < 0 || choose2 > 2) {
                                throw new MyException("Lựa chọn không hợp lệ");
                            }
                            isContinue2=false;
                        } catch (NumberFormatException e) {
                            System.out.println("Vui lòng nhập lại");
                        } catch (MyException e) {
                            System.out.println(e.getMessage());
                            System.out.println("Vui lòng nhập lại : ");
                        }
                    }
                    switch (choose2){
                        case 1 -> productService.updateProduct();
                        case 2 -> productService.deleteProduct();
                        case 0 -> {
                            return;
                        }
                    }
                }
                case 3 -> allUsers.stream().filter(i -> i.getRole().equals("Khách hàng")).forEach(System.out::println);
                case 4 -> orderService.orderList.forEach(System.out::println);
                case 0 -> {
                    logSuccess=false;
                    currentUser = null;
                    mainMenu();
                }
            }
        }
    }
}