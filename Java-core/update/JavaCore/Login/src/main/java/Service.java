import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service {
    ConnectDatabase connectDatabase = new ConnectDatabase();
    Connection conn = connectDatabase.connect();
    Scanner sc = new Scanner(System.in);
    List<User> list = getAllUsers();

    public List<User> getAllUsers() {
        String query = "SELECT * FROM users";
        List<User> list = new ArrayList<>();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String email = rs.getString("email");

                list.add(new User(id, username, password, email));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }


    /*    Kiểm tra xem username đã có trong List không*/
    public boolean checkUsername(List<User> list, String username) {

        return list.stream().anyMatch(user -> user.getUsername().equals(username));
    }

    /* Kiểm tra xem email có trong List không*/
    public boolean checkEmail(List<User> list, String email) {

        return list.stream().anyMatch(user -> user.getEmail().equals(email));
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

    public void checkUser(String usernameInput, String passwordInput) {
        if (checkUsername(list, usernameInput)) {
            if (getAccountByUsername(usernameInput).getPassword().equals(passwordInput)) {
                Controller.loginSucceed(usernameInput);
            } else Controller.wrongPassword(usernameInput);
        }
    }

    public void changePassword(User user) {
        String password = inputPassword();
        String query = "UPDATE `users` SET `password`='" + password + "' WHERE id=" + user.getId();
        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            System.out.println("Password đã được thay đổi!");
            Controller.loginSucceed(user.getUsername());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void findPassword(String username) {
        boolean checkEmail = true;
        while (checkEmail) {
            System.out.println("Mời nhập email: ");
            String emailInput = sc.nextLine();
            User user = getAccountByUsername(username);
            if (user.getEmail().equals(emailInput)) {
                System.out.println("Username của email là: " + user.getUsername());
                System.out.println("Nhập mật khẩu mới");

                String password = inputPassword();
                String query = "UPDATE `users` SET `password`='" + password + "' WHERE id=" + user.getId();
                try {
                    Statement stm = conn.createStatement();
                    stm.executeUpdate(query);
                    System.out.println("Password đã được thay đổi, mời bạn đăng nhập lại");
                    Login();
                    checkEmail = false;
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            } else {
                System.out.println("Chưa tồn tại tài khoản!!");
            }

        }
    }

    public String inputEmail() {
        System.out.println("Mời nhập email: ");
        boolean check = true;
        String email = "####";
        while (check) {

            email = sc.nextLine();
            try {
                Validate.validateEmail(email);
                if (!checkEmail(list, email)) {
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
        System.out.println("Nhập mật khẩu: ");
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


    public User createNewAccount() {

        String email = inputEmail();
        System.out.println("Nhập username: ");
        String username = sc.nextLine();

        String password = inputPassword();

        return new User(username, password, email);
    }

    public void addNewUser(User user) {
        String query = "INSERT INTO `users`(`id`, `username`, `password`, `email`) VALUES ('" + user.getId() + "','" + user.getUsername() + "','" + user.getPassword() + "','" + user.getEmail() + "')";

        try {
            Statement stm = conn.createStatement();
            stm.executeUpdate(query);
            System.out.println("Đăng ký tài khoản thành công, mời bạn đăng nhập lại");
            Controller.signInOrSignUp();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
