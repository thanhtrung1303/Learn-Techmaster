import java.util.ArrayList;
import java.util.Scanner;

public class LogIn {
    Scanner sc = new Scanner(System.in);
    Root root = new Root();
    ArrayList<Account> accounts = root.getAllAcount();

    public void login(){
        System.out.println("Nhập username: ");
        String username = sc.nextLine();
        System.out.println("Nhập password: ");
        String password = sc.nextLine();

        boolean islogin = true;
        while (islogin){
            for(Account account: accounts){
                if (account.getUsename().equals(username) && (account.getPassword().equals(password))){
                        loginSuccess(account);
                        islogin = false;
                    }
                else if (account.getUsename().equals(username) && (!account.getPassword().equals(password))) {
                    System.out.println("Sai mật khẩu");
                    loginFail();
                }
                    else {
                    System.out.println("Kiểm tra lại username");
                    login();
                    }
                }
            }
        }

    public void loginSuccess(Account account){
        System.out.println("Chào mừng " + account.getUsename() + ", bạn có thể thực hiện các công việc sau: ");
        boolean isloginsucces =true;
        while (isloginsucces){
            Menu.logInSuccess();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    updateUserName(account);
                    break;
                case 2:
                    updateEmail(account);
                    break;
                case 3:
                    updatePassword(account);
                    break;
                case 4:
                    System.out.println("Đăng xuất");
                    isloginsucces =false;
                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
    }

    public void loginFail(){
        while (true){
            Menu.wrongPassWord();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    login();
                    break;
                case 2:
                    ForgotPassword();
                    break;
            }
        }
    }

    public void updateUserName(Account account){
        System.out.println("Nhập tên tài khoản: ");
        String useName = sc.nextLine();
        account.setUsename(useName);
    }

    public void updatePassword(Account account){
        System.out.println("Nhập mật khẩu: ");
        String password = sc.nextLine();
        account.setPassword(password);
    }

    public void updateEmail(Account account){
        System.out.println("Nhập email: ");
        String email = sc.nextLine();
        account.setUsename(email);
    }

    public void ForgotPassword(){
        boolean isCheckEmail = true;
        while (isCheckEmail){
            System.out.println("Nhập email của bạn: ");
            String email = sc.nextLine();
            for (Account account : accounts) {
                if (account.getEmail().equals(email)) {
                    isCheckEmail = false;
                    System.out.println("Đổi mật khẩu");
                    updatePassword(account);
                    System.out.println("Đổi mật khẩu thành công");
                    login();
                }
            }
        }
    }
}
