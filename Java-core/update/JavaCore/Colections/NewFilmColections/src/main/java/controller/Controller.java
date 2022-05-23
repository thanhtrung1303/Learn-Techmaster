package controller;

import model.Film;
import service.FilmService;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static FilmService service = new FilmService();
    static ArrayList<Film> listFilm=service.getAllFilm();


    public static void menu() {
        System.out.println("----------------------------------------");
        System.out.println("1 - Đưa ra danh sách phim");
        System.out.println("2 - Sắp xếp");
        System.out.println("3 - Tìm phim theo tên");
        System.out.println("4 - Tìm phim theo thể loại");
        System.out.println("5 - Lấy ra 3 phim có lượt xem cao nhất");
        System.out.println("0 - Thoát khỏi chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

    public static void submenu() {
        System.out.println("------------------------------------------");
        System.out.println("1 - Sắp xếp theo tên");
        System.out.println("2 - Sắp xếp theo năm xuất bản");
        System.out.println("3 - Sắp xếp theo độ dài phim");
        System.out.println("4 - Sắp xếp theo lượt xem");
        System.out.println("0 - Quay về menu chính");
        System.out.println("Lựa chọn của bạn : ");
    }

    public static void mainMenu() {
        boolean isContinue = true;
        while (isContinue) {
            menu();
            int choice=Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.println("Danh sách: ");
                    service.show(listFilm);
                }
                case 2 -> softBy();
                case 3 -> {
                    System.out.println("Nhập tên phim bạn muốn tìm");
                    String searchTitle = sc.nextLine();
                    service.searchFilmByTitle(listFilm, searchTitle);
                }
                case 4 -> {
                    System.out.println("Nhập thể loại phim bạn muốn tìm");
                    String searchCategory = sc.nextLine();
                    System.out.println("Danh sách tìm theo Category " + searchCategory + ":");
                    service.searchByCategory(listFilm, searchCategory);
                }
                case 5 -> {
                    System.out.println("Danh sách 3 phim có lượt xem cao nhất");
                    service.get3HighestViewFilms(listFilm);
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Không có lựa chọn này");
            }
        }
    }
    public static void softBy(){
        submenu();
        int choose=Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1 -> {
                System.out.println("Danh sách sau khi xếp theo tên phim: ");
                service.softByTitle(listFilm);
            }
            case 2 -> {
                System.out.println("Danh sách sau khi xếp theo năm xuất bản: ");
                service.softByYear(listFilm);
            }
            case 3 -> {
                System.out.println("Danh sách sau khi xếp theo độ dài phim: ");
                service.softByLength(listFilm);
            }
            case 4 -> {
                System.out.println("Danh sách sau khi xếp theo số lượt xem");
                service.softByView(listFilm);
            }
            case 0 -> menu();
        }
    }
}
