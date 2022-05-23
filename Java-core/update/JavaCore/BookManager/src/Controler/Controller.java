package Controler;

import model.Book;
import service.BookService;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc=new Scanner(System.in);
    static BookService service =new BookService();
    static ArrayList<Book> books=service.getALlBooks();
    public static void Menu(){
        System.out.println("--------------------------------------------------------");
        System.out.println("1 - Xem danh sách");
        System.out.println("2 - Thêm 1 quyển sách");
        System.out.println("3 - Tìm sách theo tên");
        System.out.println("4 - Tìm sách theo id");
        System.out.println("0 -Thoát");
        System.out.println("Lựa chọn của bạn là: ");

    }
    public static void subMenu(){
        System.out.println("-------------------------------------------------------------");
        System.out.println("1 - Sửa tên sách");
        System.out.println("2 - Xoá sách");
        System.out.println("3 - Quay về màn hình chính");
    }
    public static void mainMenu(){
        boolean isContinue=true;
        while (isContinue){
            Menu();
            int choice=Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Danh sách: ");
                    service.show(books);
                    break;
                case 2:
//                    System.out.println("Thêm quyển sách");
//                    Book newBook=service.createaNewBook();
//                    service.addBook(newBook,books);
//                    break;
                case 3:
                    System.out.println("Tìm sách theo tên! ");
                    System.out.println("Nhập tên quyển sách bạn muốn tìm:");
                    String searchTitle=sc.nextLine();
                    service.searchByTitle(books,searchTitle);
                    break;
                case 4:
                    searchById();
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
    public static void searchById(){
        System.out.println("Tìm sách theo id! ");
        System.out.println("Nhập id quyển sách bạn muốn tìm: ");
        int id =Integer.parseInt(sc.nextLine());
        Book book =service.searchbyId(books,id);
        System.out.println(book);
        subMenu();
        int choose=Integer.parseInt(sc.nextLine());
        switch (choose){
            case 1:{
                System.out.println("Nhập tên mới: ");
                String newTitle=sc.nextLine();
                service.updateBook(book,newTitle);
                break;
            }
            case 2:{
                System.out.println("Dánh sách sau khi xoá");
                service.deleteBook(books,book);
                service.show(books);
                break;
            }
            case 3:{
               mainMenu();
                break;
            }
        }
    }
}
