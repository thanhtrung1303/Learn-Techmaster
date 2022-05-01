package service;

import model.Book;
import model.TextBook;
import model.Newspaper;
import model.EBook;
import util.Menu;
import java.util.*;

public class BookService {
    Scanner sc;
    TextBookService textBookService;
    ArrayList<TextBook> textBooks;
    NewspaperService newspaperService;
    ArrayList<Newspaper> newspapers;
    EBookService eBookService;
    ArrayList<EBook> eBooks;

    public BookService(){
        sc = new Scanner(System.in);
        textBookService = new TextBookService();
        textBooks = textBookService.getAllTextBook();
        eBookService = new EBookService();
        eBooks = eBookService.getAllEBook();
        newspaperService = new NewspaperService();
        newspapers = newspaperService.getAllNewspaper();
    }

    public ArrayList<Book> AllBook(){
        ArrayList<Book> books = new ArrayList<>();
        books.addAll(eBooks);
        books.addAll(newspapers);
        books.addAll(textBooks);
        return books;
    }

    public void show(ArrayList<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public void showByItem(){
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose){
            case 1:
                show(textBooks);
                break;
            case 2:
                show(newspapers);
                break;
            case 3:
                show(eBooks);
                break;
            default:
                System.out.println("Lựa chọn không tồn tại");
                Menu.submenu();
                showByItem();
        }
    }

    public void searchByTitle(ArrayList<Book> books, String searchTitle) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(searchTitle.toLowerCase())) {
                System.out.println(book);
            }
        }
    }

    public void searchByCategory(ArrayList<Book> books, String searchCategory) {
        for (Book book : books) {
            for (String s : book.getCategory()){
                if(s.toLowerCase().contains(searchCategory.toLowerCase())){
                    System.out.println(book);
                }
            }
        }
    }
}
