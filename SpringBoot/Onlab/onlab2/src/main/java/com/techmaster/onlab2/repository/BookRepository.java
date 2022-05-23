package com.techmaster.onlab2.repository;

import java.util.ArrayList;
import java.util.List;

import com.techmaster.onlab2.model.Book;
import com.techmaster.onlab2.model.Product;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    private ArrayList<Book> books;
    private ArrayList<Product> products;

  public BookRepository() {
    books = new ArrayList<>(List.of
    (new Book("0X-13", "Gone with the wind", "nova", 1998),
    new Book("0X-14", "Harry Potter", "J.K Rowlling", 1998),
    new Book("0X-15", "de men phieu luu ky", "To Hoai", 1998)
    ));

    products = new ArrayList<>(List.of(new Product("Sony WX-MH1004", "Sony", 55000000),
        new Product("Nike Air", "Nike", 25000000),
        new Product("Dell M6800", "Dell", 105000000),
        new Product("Aris Pro", "VinSmart", 65000000),
        new Product("Logitech MX Master 2X", "Logitech", 32000000)));
  }
    
  public List<Book> getBooks() {
    return books;
  }
    
  public void setBooks(ArrayList<Book> books) {
    this.books = books;
  }

  public ArrayList<Product> getProducts() {
    return products;
  }

  public void setProducts(ArrayList<Product> products) {
    this.products = products;
  }
}
