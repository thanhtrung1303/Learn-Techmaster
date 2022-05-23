package controller;

import model.*;
import model.TextBook;
import service.BookService;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static BookService service = new BookService();
    static ArrayList<Book> listBook = service.getAllBook();
    static ArrayList<TextBook> listTextbook = service.getAllTextBook();
    static ArrayList<Magazine> listMagazine = service.getAllMagazine();
    static ArrayList<EBook> listEbook = service.getAllEbook();

    public static void menu() {
        System.out.println("------------------------------------------");
        System.out.println("1 - In danh sách theo từng loại");
        System.out.println("2 - Tìm theo tên");
        System.out.println("3 - Tìm theo thể loại");
        System.out.println("4 - Lấy ra Ebook có lượt tải nhiểu nhất");
        System.out.println("5 - Tìm các báo phát hành trong năm");
        System.out.println("0 - Thoát chương trình");
    }

    public static void subMenu() {
        System.out.println("-----------------------------------------");
        System.out.println("1 - Sách giáo khoa");
        System.out.println("2 - Báo");
        System.out.println("3 - Ebook");
        System.out.println("0 - Về menu chính");
    }

    public static void mainMenu() {
        boolean isContinue = true;
        while (isContinue) {
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> showByType();
                case 2 -> {
                    System.out.println("Nhập từ khoá tên sách: ");
                    String searchName = sc.nextLine();
                    service.searchByName(listBook, searchName);
                }
                case 3 -> {
                    System.out.println("Nhập thể loại: ");
                    String searchCategory = sc.nextLine();
                    service.searchByCategory(listBook, searchCategory);
                }
                case 4 -> {
                    System.out.println("Ebook có lượt tải nhiều nhất: ");
                    service.getHighestEbook(listEbook);
                }
                case 5 -> service.searchByPubishYear(listMagazine);
                case 0 -> System.exit(0);
                default -> System.out.println("Không có lựa chọn này ");
            }
        }
    }

    public static void showByType() {
        subMenu();
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> {
                System.out.println("Danh sách Sách Giáo Khoa:");
                service.show(listTextbook);
            }
            case 2 -> {
                System.out.println("Danh sách Báo:");
                service.show(listMagazine);
            }
            case 3 -> {
                System.out.println("Danh sách Ebook:");
                service.show(listEbook);
            }
            case 0 -> mainMenu();
        }
    }
}

