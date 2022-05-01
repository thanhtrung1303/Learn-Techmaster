import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    Scanner scanner = new Scanner(System.in);

    public ArrayList<User> getAllUser(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("124", "123",5000000));

        return users;
    }

    public void login(ArrayList<User> users) {
        System.out.println("Nhập số điện thoại");
        String phone = scanner.nextLine();
        System.out.println("Nhập password");
        String password = scanner.nextLine();

        boolean isValidUsername = false;
        while (!isValidUsername) {
            for (User user : users) {
                if (user.getPhone().equals(phone)) {
                    isValidUsername = true;
                    if (user.getPassword().equals(password)) {
                        loginSuccess(user);
                    } else {
                        System.out.println("Mật khẩu không chính xác");
                        login(users);
                    }
                }
            }
            if (!isValidUsername) {
                System.out.println("Kiểm tra lại số điện thoại");
                login(users);


            }
        }
    }

    public void loginSuccess(User user){
        System.out.println("Chào mừng " + user.getPhone() + ", bạn có thể thực hiện các việc sau");
        boolean isContinue = true;
        while (isContinue) {
            Menu.loginSuccessMenu();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    showBalance(user);
                    break;
                case 2:
                    sendMoney(user);
                    break;
                case 3:
                    showHistory(user);
                    break;
                case 4:
                    isContinue = false;
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }


    }
    public void showBalance(User user){
        System.out.println("Số dư tài khoản của bạn là: " + user.getBalance()+" vnđ");
    }
    public void sendMoney(User user){}
    public void showHistory(User user){}
    public void addHistory(){}

}