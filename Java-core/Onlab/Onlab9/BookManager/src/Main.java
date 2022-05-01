import controller.Controller;
import model.Book;
import service.BookService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        BookService service = new BookService();
//        ArrayList<Book> books = service.getALlBook();
//        service.show(books);
//        System.out.println("danh sach can tim");
//        service.searchByTitle(books, "de men");
//
//        Book updateBook = service.searchById(books,2);
//        service.updateBook(updateBook, "nha gia kim update");
//        System.out.println("sach sau khi sua");
//        System.out.println(updateBook);
//        System.out.println("dnah sach sau khi sua");
//
//        System.out.println("xoa sach");
//        service.deleteBook(books, updateBook);
//        System.out.println("danh sach sau xoa");
//        service.show(books);
//
//        System.out.println("them sach moi");
//        Book newBook = service.createNewBook();
//        service.addBook(newBook, books);
//        service.show(books);

        Controller.mainMenu();
    }
}
