import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    ArrayList<Player> allPlayer;
    Team team;
    Scanner sc;
    public Controller() {
        team = new Team();
        allPlayer = team.getAllTeam();
        sc = new Scanner(System.in);
    }
    public void menu(){
        boolean isContinue = true;
        while (isContinue) {
            Menu.menu();
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.println(" Danh sách cầu thủ sau khi chọn đội hình");
                    ArrayList<Player> choiceTeam = team.buildTeam(4, 4, 2, allPlayer);
                    team.show(choiceTeam);
                    break;
                case 2:
                    System.out.println(" Danh sách cầu thủ sau khi chọn đội hình");
                    ArrayList<Player> choiceTeam2 = team.buildTeam(4, 3, 3, allPlayer);
                    team.show(choiceTeam2);
                    break;
                case 3:
                    System.out.println(" Danh sách cầu thủ sau khi chọn đội hình");
                    ArrayList<Player> choiceTeam3 = team.buildTeam(3, 5, 2, allPlayer);
                    team.show(choiceTeam3);
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
