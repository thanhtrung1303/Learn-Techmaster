import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        Scanner sc = new Scanner(System.in);
        System.out.println("username : ");
        String username = sc.nextLine();
        System.out.println("password : ");
        String password = sc.nextLine();
        service.logIn(username,password);
    }
}