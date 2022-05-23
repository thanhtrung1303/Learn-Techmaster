import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    static Team team = new Team();
    static ArrayList<Player> list = team.getAllPlayers();
    static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("------------------------------------------------");
        System.out.println("1 - Đội hình 4-3-3");
        System.out.println("2 - Đội hình 4-4-2");
        System.out.println("3 - Đội hình 4-5-1");
        System.out.println("4 - Đội hình 3-5-2");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void mainMenu() {
        while (true) {
            menu();
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    ArrayList<Player> choseTeam = team.buildTeam(4, 3, 3, list);
                    team.show(choseTeam);
                    break;
                case 2:
                    team.show(team.buildTeam(4, 4, 2, list));
                    break;
                case 3:
                    team.show(team.buildTeam(4, 5, 1, list));
                    break;
                case 4:
                    team.show(team.buildTeam(3, 5, 2, list));
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }
}
