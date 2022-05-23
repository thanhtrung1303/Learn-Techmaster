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
            case 2 -> {
                System.out.println("Đăng ký tài khoản mới");
                User newUser=service.createNewAccount();
                service.addNewUser(newUser);
            }
            default -> {
            }
        }
    }

    public static void loginSucceed(String username) {
        System.out.println("Chào mừng " + username + ", bạn có thể thực hiện các công việc sau:");
        System.out.println("1 - Thay đổi mật khẩu");
        System.out.println("2 - Đăng xuất");
        System.out.println("0 - Thoát chương trình");
        int choice = Integer.parseInt(sc.nextLine());
        User choseUser = service.getAccountByUsername(username);

        switch (choice) {
            case 1 -> {
                System.out.println("Thay đổi password!! Mời nhập mật khẩu mới!!");
                service.changePassword(choseUser);
                System.out.println("Password đã được thay đổi! Mời bạn đăng nhập lại");
                service.Login();
            }
            case 2 -> signInOrSignUp();
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
            case 2 -> service.findPassword(username);
        }

    }
}
