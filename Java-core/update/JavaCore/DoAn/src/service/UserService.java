package service;

import model.Role;
import model.User;
import controller.Controller;
import util.*;
import exception.MyException;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    Scanner sc = new Scanner(System.in);
    StudentService studentService = new StudentService();
    ArrayList<User> listUser = getAllUser();

    /*Tạo danh sách người dùng*/
    public ArrayList<User> getAllUser() {

        ArrayList<User> list = new ArrayList<>();

        list.add(new User("admin@gmail.com", "admin", "12345678A", Role.Admin));
        list.add(new User("gv001@gmail.com", "GV001", "12345678A", Role.Teacher));
        list.add(new User("gv002@gmail.com", "GV002", "12345678A", Role.Teacher));
        list.add(new User("gv003@gmail.com", "GV003", "12345678A", Role.Teacher));
        list.add(new User("gv004@gmail.com", "GV004", "12345678A", Role.Teacher));
        list.add(new User("gv005@gmail.com", "GV005", "12345678A", Role.Teacher));
        list.add(new User("gv006@gmail.com", "GV006", "12345678A", Role.Teacher));
        list.add(new User("gv007@gmail.com", "GV007", "12345678A", Role.Teacher));
        list.add(new User("gv008@gmail.com", "GV008", "12345678A", Role.Teacher));
        list.add(new User("gv009@gmail.com", "GV009", "12345678A", Role.Teacher));
        list.add(new User("test_user@gmail.com", "user", "12345678A", Role.User));

        return list;
    }

    /*Đăng nhập*/
    public void Login() {
        System.out.println("Chào mừng bạn đến THPT Techmaster");
        System.out.println("Mời bạn đăng nhập!");
        System.out.println("Nhập tên tài khoản");
        String usernameInput = sc.nextLine();
        System.out.println("Nhập mật khẩu");
        String passwordInput = sc.nextLine();
        checkUser(usernameInput, passwordInput);
        while (!checkUsername(listUser, usernameInput)) {
            System.out.println("Kiểm tra lại username");
            System.out.println("Nhập username");
            usernameInput = sc.nextLine();
            System.out.println("Nhập password");
            passwordInput = sc.nextLine();

            checkUser(usernameInput, passwordInput);

        }

    }

    /*Kiểm tra tên đăng nhập*/
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

    /*Đưa ra tài khoản từ tên đăng nhập*/
    public User getAccountByUsername(String search) {

        for (User user : listUser
        ) {
            if (user.getUsername().equals(search)) {
                return user;
            }
        }
        return null;
    }

    /*Xoá người dùng*/
    public void delete(User user) {
        listUser.remove(user);
        System.out.println("Danh sách sau khi xoá: ");
        studentService.show(listUser);
    }

    /*Kiểm tra tài khoản, mật khẩu*/
    public void checkUser(String usernameInput, String passwordInput) {

        if (checkUsername(listUser, usernameInput)) {
            if (getAccountByUsername(usernameInput).getPassword().equals(passwordInput)) {
                System.out.println("Đăng nhập thành công");
                Controller.loginSucceed(usernameInput);
            } else {
                wrongPassword(usernameInput);
            }
        }
    }

    /*Kiểm tra email tồn tại chưa*/
    public boolean checkEmail(ArrayList<User> list, String email) {

        for (User user : list
        ) {
            if (user.getEmail().equals(email)) {

                return false;
            }
        }
        return true;
    }

    /*phương thức thay đổi password*/
    public void changePassword(String username) {

        boolean checkEmail = true;
        while (checkEmail) {
            System.out.println("Nhập email:");
            String emailInput = sc.nextLine();
            User user = getAccountByUsername(username);
            if (user.getEmail().equals(emailInput)) {

                System.out.println("Username của email là: " + user.getUsername());
                System.out.println("Nhập mật khẩu mới");
                user.setPassword(inputPassword());
                checkEmail = false;
                System.out.println("Password đã được thay đổi, mời bạn đăng nhập lại");
                Login();
            } else {
                System.out.println("Chưa tồn tại tài khoản");
            }
        }
    }

    /*Sai mật khẩu*/
    public void wrongPassword(String username) {
        System.out.println("Bạn đã nhập sai mật khẩu! Lựa chọn của bạn: ");
        System.out.println("1 - Đăng nhập lại");
        System.out.println("2 - Quên mật khẩu");
        int choice;
        choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> Login();
            case 2 -> changePassword(username);
        }

    }

    public String inputEmail() {
        boolean check = true;
        String email = "####";
        while (check) {

            email = sc.nextLine();
            try {
                Validate.validateEmail(email);
                if (checkEmail(listUser, email)) {
                    check = false;
                } else System.out.println("Email đã tồn tại");
            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng kiểm tra và nhập lại");
            }
        }
        return email;
    }

    public String inputPassword() {
        boolean check = true;
        String password = "####";
        while (check) {

            password = sc.nextLine();
            try {
                Validate.validatePassword(password);
                check = false;

            } catch (MyException e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng kiểm tra và nhập lại");
            }
        }
        return password;
    }

    /*phương thức admin đăng ký tài khoản mới cho quản trị viên hoặc giáo viên */
    public void createNewAccountByUser() {
        System.out.println("Nhập email: ");
        String email = inputEmail();
        System.out.println("Nhập username: ");
        String username = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = inputPassword();

        User user = new User(email, username, password, Role.User);

        listUser.add(user);
        System.out.println("Đăng ký tài khoản thành công, mời bạn đăng nhập lại");
        Controller.signInOrSignUp();
    }

    /*phương thức admin đăng ký tài khoản mới cho quản trị viên hoặc giáo viên */
    public void createNewAccountByAdmin() {
        System.out.println("Nhập email: ");
        String email = inputEmail();
        System.out.println("Nhập username: ");
        String username = sc.nextLine();
        System.out.println("Nhập mật khẩu: ");
        String password = inputPassword();
        System.out.println("Chọn vai trò của tài khoản: ");
        Role role = inputRole();
        User user = new User(email, username, password, role);

        listUser.add(user);
    }

    /*Nhập vai trò */
    public Role inputRole() {
        System.out.println("1 - Admin");
        System.out.println("2 - Giáo viên");
        Role role = Role.Teacher;
        int choice;
        choice = Integer.parseInt(sc.nextLine());
        if (choice == 1) {
            role = Role.Admin;
        }
        return role;
    }
}
