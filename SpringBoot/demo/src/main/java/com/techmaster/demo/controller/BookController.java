package com.techmaster.demo.controller;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import com.techmaster.model.Book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    private ConcurrentHashMap<String, Book> books;

    public BookController() {
        books = new ConcurrentHashMap<>();
        books.put("OX-13", new Book("0X-13", "Gone with the wind", "cuong", 1945));
    }

    @GetMapping
    public List<Book> getBooks() {
        return books.values().stream().toList();
    }
}
