package controller;

import java.util.ArrayList;
import java.util.Scanner;

import model.Book;
import model.Newspaper;
import model.EBook;
import service.BookService;
import service.EBookService;
import service.NewspaperService;
import util.Menu;

public class Controller {
    Scanner sc;
    ArrayList<Book> books;
    ArrayList<Newspaper> newspapers;
    ArrayList<EBook> ebooks;
    BookService bookService = new BookService();
    NewspaperService newspaperService = new NewspaperService();
    EBookService eBookService = new EBookService();

    public Controller(){
        sc = new Scanner(System.in);
        books = bookService.AllBook();
        ebooks = eBookService.getAllEBook();
        newspapers = newspaperService.getAllNewspaper();
    }

    public void controller() {
        boolean isContinue = true;
        while (isContinue) {
            Menu.menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    Menu.submenu();
                    bookService.showByItem();
                    break;
                case 2:
                    System.out.println("Nhập tên sách muốn tìm kiếm");
                    String searchTitle = sc.nextLine();
                    bookService.searchByTitle(books, searchTitle);
                    break;
                case 3:
                    System.out.println("Nhập thể loại sách muốn xem");
                    String searchCategory = sc.nextLine();
                    bookService.searchByCategory(books, searchCategory);
                    break;
                case 4:
                    EBookService.topDowload(ebooks);
                    break;
                case 5:
                    NewspaperService.currentYear(newspapers);
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


