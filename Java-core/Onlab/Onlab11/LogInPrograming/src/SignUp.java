import java.util.ArrayList;
import java.util.Scanner;

public class SignUp {
    Scanner sc = new Scanner(System.in);
    Root root = new Root();
    ArrayList<Account> accounts = root.getAllAcount();

    static final String Email_PATTERN = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    static final String Password_PATTERN = "(?=.d)(?=.[A-Z])(?=.*[.,-_ ;]).{7,15}";

    public void createUsername(){
        boolean isCheckUsename = true;
        while (isCheckUsename){
            System.out.println("Nhập Username: ");
            String username = sc.nextLine();
            for(Account account: accounts){
                if(!account.getUsename().equals(username)){
                    isCheckUsename = false;
                }else{
                    System.out.println("Username đã tồn tại");
                }
            }
        }
    }
    public void createEmail() {
        boolean ischeck = true;
        while (ischeck) {
            System.out.println("Nhập email");
            String email = sc.nextLine();
                if (email.matches(Email_PATTERN)) {
                    System.out.println("Tạo email thành công");
                    ischeck = false;
            } else {
                System.out.println("Email không hợp lệ");
            }

        }
    }

    public void createPassword() {
        boolean ischeck = true;
        while (ischeck) {
            System.out.println("nhap pass");
            String pass = sc.nextLine();

            if (pass.matches(Password_PATTERN)) {
                System.out.println("tao thanh cong");
                ischeck = false;
            } else {
                System.out.println("Mật khẩu không hợp lệ");
            }
        }
    }

    public void createAcount(){
        createUsername();
        createEmail();
        createPassword();
        System.out.println("Đăng ký thành công");
    }

}
