package service;

import controller.Controller;
import model.User;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {

    Scanner sc = new Scanner(System.in);
    ArrayList<User> list = getAllUser();

    public ArrayList<User> getAllUser() {

        ArrayList<User> list = new ArrayList<>();

        list.add(new User("truong@gmail.com", "truongdeptrai", "123456789_A"));
        list.add(new User("motconvit@yahoo.com", "motconvit", "MotConVit_123"));
        list.add(new User("lemontree0@disqus.com", "mhedgecock0", "YeO0Wh2;jvw"));
        list.add(new User("druggers1@yelp.com", "clias1", "2xlTs6W1_IkF"));
        list.add(new User("tsewart2@msn.com", "rhabbeshaw2", "ov5bYHZ6.r6"));
        list.add(new User("saldins9@china.com.cn", "cridges9", "S9Aios,k"));
        list.add(new User("bbonnier6@goo.ne.jp", "hkittless6", "d9qb2bDr_di"));
        list.add(new User("hpreddy8@mac.com", "amcdaid8", "xdak-8RTug"));

        return list;
    }

    /*    Kiểm tra xem username đã có trong List không*/
    public boolean checkUsername(ArrayList<User> list, String username) {

        boolean check = false;
        for (User user : list
        ) {
            if (user.getUsername().equals(username)) {
                check = true;
                break;
            }
        }
        return check;
    }

    /* Kiểm tra xem email có trong List không*/
    public boolean checkEmail(ArrayList<User> list, String email) {

        boolean check = false;
        for (User user : list
        ) {
            if (user.getEmail().equals(email)) {
                check = true;
                break;
            }
        }
        return check;
    }

    /*Lấy ra người dung user từ username*/
    public User getAccountByUsername(String search) {

        for (User user : list
        ) {
            if (user.getUsername().equals(search)) {
                return user;
            }
        }
        return null;
    }

    /* Kiểm tra username và password từ một người dúng user không*/
    public void checkUser(String usernameInput, String passwordInput) {

        if (checkUsername(list, usernameInput)) {
            if (getAccountByUsername(usernameInput).getPassword().equals(passwordInput)) {
                Controller.loginSucceed(usernameInput);
            } else Controller.wrongPassword(usernameInput);
        }
    }

    /* Đăng nhập và kiểm tra username và password*/
    public void Login() {

        System.out.println("Nhập username");
        String usernameInput = sc.nextLine();
        System.out.println("Nhập password");
        String passwordInput = sc.nextLine();
        checkUser(usernameInput, passwordInput);
        while (!checkUsername(list, usernameInput)) {

            System.out.println("Kiểm tra lại username");
            System.out.println("Nhập username");
            usernameInput = sc.nextLine();
            System.out.println("Nhập password");
            passwordInput = sc.nextLine();

            checkUser(usernameInput, passwordInput);

        }

    }

    /*phương thức thay đổi password*/
    public void changePassword(String username) {

        boolean checkEmail = true;
        while (checkEmail) {

            String emailInput = sc.nextLine();
            User user = getAccountByUsername(username);
            if (user.getEmail().equals(emailInput)) {

                System.out.println("Username của email là: " + user.getUsername());
                System.out.println("Nhập mật khẩu mới");
                checkEmail = false;
                Controller.signInOrSignUp();
            } else {
                System.out.println("Chưa tồn tại tài khoản");
            }
        }
    }

    /* phương thức nhập vào email*/
    public String inputEmail() {

        String email;
        do {
            /*email phải chuẩn format của email*/
            System.out.println("Nhập email: ");
            System.out.println("Email chuẩn theo format và không được trùng ");
            email = sc.nextLine();
        }
        while (!(email.matches("^[a-z][a-z0-9_.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$") && (!checkEmail(list, email))));
        return email;
    }

    /*phương thức nhập vào password*/
    public String inputPassword() {

        String password;
        do {
            /*password dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;)*/
            System.out.println("Nhập password: ");
            System.out.println("(password dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;)) ");
            password = sc.nextLine();
        }
        while (!password.matches("^(?=.*[A-Z])(?=.*[_;.,-])[A-Za-z0-9_;,.-]{7,15}$"));
        return password;
    }

    /*phương thức đăng ký tài khoản mới*/
    public void createNewAccount() {

        String email = inputEmail();
        System.out.println("Nhập username: ");
        String username = sc.nextLine();
        String password = inputPassword();
        User user = new User(email, username, password);

        list.add(user);
        Controller.signInOrSignUp();
    }
}
