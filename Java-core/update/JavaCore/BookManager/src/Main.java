import Controler.Controller;
import model.Book;
import service.BookService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BookService service = new BookService();
        ArrayList<Book> books = service.getALlBooks();
        service.show(books);
//        Book updateBook = service.searchbyId(books, 2);
//        service.updateBook(updateBook, "Nhà giả dối");
//        service.deleteBook(books,updateBook);
//
////        service.show(books);
//        Controller.mainMenu();
//        service.searchByTitle(books,"đai");
    }
}
