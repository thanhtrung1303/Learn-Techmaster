package service;

import model.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookService {
    public ArrayList<Book> getALlBook() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "de men", "to hoai", "phieu luu"));
        books.add(new Book(2, "men", "hoai", "phieu luu"));

        return books;
    }

    public void show(ArrayList<Book> books) {
        for (Book b : books
             ) {
            System.out.println(b);
        }
    }

    public void searchByTitle(ArrayList<Book> books, String searchTitle) {
        for (Book b : books) {
            if (b.getTittle().toLowerCase().contains(searchTitle.toLowerCase())){
                System.out.println(b);
            }
        }
    }

    public Book searchById(ArrayList<Book> books, int id){
        for (Book b:books) {
            if(b.getId()==id) {
                return b;
            }
        }
        return null;
    }

    public void updateBook(Book book, String newTitle) {
        book.setTittle(newTitle);
    }

    public void deleteBook(ArrayList<Book> books, Book book) {
        books.remove(book);
    }

    public Book createNewBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ten");
        String title = sc.nextLine();
        System.out.println("tac gia");
        String author = sc.nextLine();;
        String gender = sc.nextLine();
        Book newBook = new Book(id, title, author, gender);

        return newBook;
    }
    public void addBook(Book book, ArrayList<Book> books) {
        books.add(book);
    }
}
