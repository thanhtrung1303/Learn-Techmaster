import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    ArrayList<Film> films;
    FilmService service;
    Scanner sc;

    public Controller(){
        service = new FilmService();
        films = service.getAllFilm();
        sc = new Scanner(System.in);
    }

    public void mainmenu(){
        boolean isContinue = true;
        while (isContinue){
            Menu.menu();
            int choose = Integer.parseInt(sc.nextLine());
            switch (choose){
                case 1:
                    service.sortByYear(films);
                    break;
                case 2:
                    service.sortByTitle(films);
                    break;
                case 3:
                    System.out.println("Nhập tên phim muốn tìm: ");
                    String title = sc.nextLine();
                    service.searchByTitle(films, title);
                    break;
                case 4:
                    System.out.println("Danh sách 3 phim có lượt xem nhiều nhất: ");
                    service.printTopView(films);
                    break;
                case 5:
                    System.out.println("Nhập thể loại phim muốn tìm: ");
                    String category = sc.nextLine();
                    System.out.println("Danh sách phim tìm được: ");
                    service.searchByCategory(films, category);
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
