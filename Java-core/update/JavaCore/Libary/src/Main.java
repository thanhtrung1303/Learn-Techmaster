import controller.Controller;
import model.Book;
import service.BookService;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Controller.mainMenu();
        BookService service=new BookService();
        ArrayList<Book>list= service.getAllBook();
        service.countCate(list);
    }
}
