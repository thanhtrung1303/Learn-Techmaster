package controller;

import service.Service;
import model.User;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static Service service = new Service();

    public static void signInOrSignUp() {
        System.out.println("1 - Đăng nhập");
        System.out.println("2 - Đăng ký");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> service.Login();
            case 2 -> service.createNewAccount();
            default -> {
            }
        }
    }

    public static void loginSucceed(String username) {
        System.out.println("Chào mừng " + username + ", bạn có thể thực hiện các công việc sau:");
        System.out.println("1 - Thay đổi username");
        System.out.println("2 - Thay đổi email");
        System.out.println("3 - Thay đổi mật khẩu");
        System.out.println("4 - Đăng xuất");
        System.out.println("0 - Thoát chương trình");
        int choice = Integer.parseInt(sc.nextLine());
        User choseUser = service.getAccountByUsername(username);

        switch (choice) {
            case 1 -> {
                System.out.println("Nhập username mới: ");
                choseUser.setUsername(sc.nextLine());
                System.out.println("Username đã được thay đổi! Mời bạn đăng nhập lại: ");
                service.Login();
            }
            case 2 -> {
                System.out.println("Thay đổi email! ");
                choseUser.setEmail(service.inputEmail());
                System.out.println("Email đã được thay đổi! Mời bạn đăng nhập lại: ");
                service.Login();
            }
            case 3 -> {
                System.out.println("Thay đổi password!! ");
                choseUser.setPassword(service.inputPassword());
                System.out.println("Password đã được thay dổi! Mời bạn đăng nhập lại");
                service.Login();
            }
            case 4 -> signInOrSignUp();
            case 0 -> System.exit(0);
        }
    }

    public static void wrongPassword(String username) {
        System.out.println("Bạn đã nhập sai mật khẩu! Lựa chọn của bạn: ");
        System.out.println("1 - Đăng nhập lại");
        System.out.println("2 - Quên mật khẩu");
        int choice;
        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> service.Login();
            case 2 -> service.changePassword(username);
        }

    }


}
