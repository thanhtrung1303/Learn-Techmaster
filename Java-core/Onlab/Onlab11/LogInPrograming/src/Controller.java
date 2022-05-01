import java.util.Scanner;

public class Controller {
    LogIn logIn = new LogIn();
    SignUp signUp = new SignUp();
    Scanner sc = new Scanner(System.in);
    public void menu(){
        sc = new Scanner(System.in);
        boolean isContinue = true;
        while (isContinue){
            Menu.mainMenu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    logIn.login();
                    break;
                case 2:
                    signUp.createAcount();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }
}
