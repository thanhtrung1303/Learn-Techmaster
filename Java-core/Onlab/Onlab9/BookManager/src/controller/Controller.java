package controller;

import service.BookService;
import model.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static BookService service = new BookService();
    static ArrayList<Book> books = service.getALlBook();
    public static void menu(){
        System.out.println("1 - Xem danh sach toan bo sach");
        System.out.println("2 - them 1 quyen sach vao danh sach");
        System.out.println("3 - tim sach theo ten");
        System.out.println("4 - tim sach theo id");
        System.out.println("0 - thoat chuong trinh");
        System.out.println("lua chon cua ban la: ");
    }

    public static void submenu(){
        System.out.println("-----------------------------------------");
        System.out.println("1 - Sửa tên sách");
        System.out.println("2 - Xóa sách");
        System.out.println("3 - Quay về màn hình chính");
        System.out.println("Lựa chọn của bạn là");
    }

    public static void mainMenu(){
        boolean iscontinue = true;
        while (iscontinue) {
            menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("danh sach");
                    service.show(books);
                    break;
                case 2:
                    System.out.println("them quyen sach: ");
                    Book newBook = service.createNewBook();
                    service.addBook(newBook, books);
                    break;
                case 3:
                    System.out.println("Nhập tên quyển sách bạn muốn tìm:");
                    String title = sc.nextLine();
                    service.searchByTitle(books, title);
                    break;
                case 4:
                    searchById();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("khong co lua chon nay");
            }
        }
    }

    public static void searchById(){
        System.out.println("Nhập id quyển sách bạn muốn tìm: ");
        int id = Integer.parseInt(sc.nextLine());
        Book book = service.searchById(books, id);
        System.out.println(book);
        submenu();
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose){
            case 1:
                System.out.println("Nhập tên mới:");
                String newTitle = sc.nextLine();
                service.updateBook(book, newTitle);
                break;
            case 2:
                System.out.println("Danh sách sau khi xóa: ");
                service.deleteBook(books, book);
                service.show(books);
                break;
            case 3:
                menu();
                break;
        }
    }
}
