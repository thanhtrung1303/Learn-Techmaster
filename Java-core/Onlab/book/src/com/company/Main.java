package com.company;

public class Main {

    public static void main(String[] args) {
        Book[] books = BookService.getAllBook();
        System.out.println("Danh sách:");
        BookService.printBook(books);

        System.out.println("Sách có thể loại phiêu lưu: ");
        BookService.getBookByCategory(books, "Phiêu lưu");
    }
}
