import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UserService service = new UserService();
        ArrayList<User> users = service.getAllUser();

        service.login(users);
    }
}
