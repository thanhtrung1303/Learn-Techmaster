package controller;

import exception.MyException;
import models.Product;
import models.User;
import service.CartService;
import service.OrderService;
import service.ProductService;
import service.UserService;

import java.util.*;

import static java.lang.System.*;


public class Controller {
    static Scanner sc = new Scanner(System.in);
    static public UserService userService = new UserService();
    static public ProductService productService = new ProductService();
    static public CartService cartService = new CartService();
    static public OrderService orderService = new OrderService();
    static public ArrayList<User> allUsers = new ArrayList<>();
    static public User currentUser = new User();
    static public int cartItemID = 1;
    static public int orderID = 1;
    static boolean logSuccess = true;
    public static void menu(){
        System.out.println("--------------------------------");
        System.out.println("   1 - Đăng nhập ");
        System.out.println("   2 - Đăng ký");
        System.out.println("   3 - Quên mật khẩu");
        System.out.println("   0 - Thoát");
        System.out.print("Lựa chọn : ");
    }
    public static void purchaseSubMenu(){
        System.out.println("--------------------------------");
        System.out.println("   1 - Tìm theo thể loại");
        System.out.println("   2 - Tìm theo tên");
        System.out.println("   3 - Tìm theo giá tiền");
        System.out.println("   4 - Tìm theo hãng");
        System.out.println("   5 - Xem giỏ hàng");
        System.out.println("   6 - Xem lịch sử giao dịch");
        System.out.println("   0 - Đăng xuất");
        System.out.print("Lựa chọn : ");
    }
    public static void searchByCategoryMenu(){
        System.out.println("--------------------------------");
        System.out.println("Danh mục sản phẩm : ");
        System.out.println("   1 - CPU");
        System.out.println("   2 - GPU");
        System.out.println("   3 - MainBoard");
        System.out.println("   4 - PSU");
        System.out.println("   5 - Ram");
        System.out.println("   6 - SSD");
        System.out.println("   0 - Quay lại");
        System.out.print("Lựa chọn : ");
    }

    // menu chính
    public static void mainMenu() {
        AdminController.createAdmin();
        while (true) {
            menu();
            int choose = 0;
            boolean isContinue = true;
            while (isContinue) {
                try {
                    choose = Integer.parseInt(sc.nextLine());
                    if (choose < 0 || choose > 3) {
                        throw new MyException("Lựa chọn không hợp lệ");
                    }
                    isContinue = false;
                } catch (NumberFormatException e) {
                    System.out.println("Vui lòng nhập lại");
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Vui lòng nhập lại : ");
                }
            }
            switch (choose) {
                case 1 -> login();
                case 2 -> allUsers.add(userService.createUser());
                case 3 -> userService.forgetPassword(allUsers);
                case 0 -> {
                    return;
                }
            }
        }
    }

    //Đăng nhập
    public static void login() {
        boolean log = true;
        while (log) {
            System.out.print("Nhập số điện thoại : ");
            String phoneNum = sc.nextLine();
            System.out.print("Nhập mật khẩu : ");
            String pass = sc.nextLine();
            int count = 0;

            for (User u : allUsers) {
                if (u.getPhoneNum().equals(phoneNum) && u.getPassWord().equals(pass) && u.getRole().equals("Khách hàng")) {
                    currentUser = u;
                    count++;
                    System.out.println("Đăng nhập thành công");
                    logSuccess = true;
                    while (logSuccess) {
                        loginSuccess();
                    }
                    log = false;
                }
                if (u.getPhoneNum().equals(phoneNum) && u.getPassWord().equals(pass) && u.getRole().equals("Admin")) {
                    currentUser = u;
                    count++;
                    System.out.println("Đăng nhập thành công");
                    logSuccess = true;
                    while (logSuccess) {
                        AdminController.adminLoginSuccess();
                    }
                    log = false;
                }
            }
            if (count ==0){
                System.out.println("Tài khoản hoặc mật khẩu không đúng, vui lòng thử lại");
            }
        }
    }


    // menu mua hàng
    public static void loginSuccess(){
        purchaseSubMenu();
        int choose = 0;
        boolean isContinue = true;
        while (isContinue) {
            try {
                choose = Integer.parseInt(sc.nextLine());
                if (choose < 0 || choose > 6) {
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
            case 1 -> productService.searchByCategory();                    //Tìm theo thể loại
            case 2 -> productService.searchByProductname();                  // tìm theo tên
            case 3 -> productService.searchByPrice();                     //tìm theo khoảng giá
            case 4 -> productService.searchByManufacturer();                //Tìm theo hãng
            case 5 -> cartService.showCartItems();               //xem giỏ hàng
            case 6 -> orderService.showOrderList();                   //Xem lịch sử giao dịch
            case 0 -> {                 //Đăng xuất
                logSuccess=false;
//                    mainMenu();
            }
        }
//        }
    }
    public static Product findProductById(int id){
        for (Product p : ProductService.allProducts){
            if(p.getId() == id) return p;
        }
        return null;
    }
}