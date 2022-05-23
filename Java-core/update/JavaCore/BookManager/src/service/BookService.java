package service;

import model.Book;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class BookService {
    public ArrayList<Book> getALlBooks(){
        ArrayList<Book> books=new ArrayList<>();
        books.add(new Book(1,"Conan", new String[]{"Yokohama", "Kaido"},2021));
        books.add(new Book(2,"Dế Mèn Phiêu Lưu Kí",new String[]{"Tô Hoài","Tô Ngọc Vân"},2002));
        books.add(new Book(3,"Tư Duy Phản Biện",new String[]{"Zoe Mckey"},2008));
        books.add(new Book(4,"Giết Chết Con Chim Nhại",new String[]{"Harper Lee"},2014));
        return books;
    }
    public void show(ArrayList<Book> books){
        for (Book b:books
             ) {
            System.out.println(b);
        }
    }

    public void searchByTitle(ArrayList<Book> books, String searchTitle){
        for (Book b:books
             ) {
            if(b.getTitle().toLowerCase(Locale.ROOT).contains(searchTitle.toLowerCase(Locale.ROOT))) {
                System.out.println(b);
            }
        }
    }
    public Book searchbyId(ArrayList<Book> books,int id){
        for (Book b:books
             ) {
            if ((b.getId()==id)){
                return b;
            }
        }
        return null;
    }
    public void updateBook(Book book, String newtitle){
        book.setTitle(newtitle);
        System.out.println(book);
    }
    public void deleteBook(ArrayList books,Book book){
        books.remove(book);

    }
//    public Book createaNewBook(){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Nhập id: ");
//        int id=Integer.parseInt(sc.nextLine());
//        System.out.println("Nhập tên: ");
//        String title=sc.nextLine();
//        System.out.println("Nhập tác giả: ");
//        String author=sc.nextLine();
//        System.out.println("Nhập năm xuất bản: ");
//        int year =Integer.parseInt(sc.nextLine());
//
//        Book b=new Book(id,title,author,year);
//        return b;
//    }
//    public void addBook(Book book, ArrayList<Book> books){
//        books.add(book);
//    }
}
