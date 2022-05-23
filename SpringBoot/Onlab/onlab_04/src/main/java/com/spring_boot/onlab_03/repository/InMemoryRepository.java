package com.spring_boot.onlab_03.repository;

import java.util.ArrayList;
import java.util.List;

import com.spring_boot.onlab_03.model.Book;
import com.spring_boot.onlab_03.model.Job;
import com.spring_boot.onlab_03.model.Person;
import com.spring_boot.onlab_03.model.Product;
import com.spring_boot.onlab_03.model.Location;

import org.springframework.stereotype.Repository;

@Repository
public class InMemoryRepository {
    private ArrayList<Product> products;
    private ArrayList<Person> people;
    private ArrayList<Book> books;
    private ArrayList<Job> jobs;

    public InMemoryRepository() {
        products = new ArrayList<>(List.of(new Product("Sony WX-MH1004", "Sony", 55000000),
                new Product("Nike Air", "Nike", 25000000),
                new Product("Dell M6800", "Dell", 105000000),
                new Product("Aris Pro", "VinSmart", 65000000),
                new Product("Logitech MX Master 2X", "Logitech", 32000000)));

        people = new ArrayList<>(List.of(
                new Person("Cường", "Vietnam", "1975-11-27", "male"),
                new Person("John", "USA", "1979-10-27", "male"),
                new Person("Lara", "Italy", "1999-10-27", "female"),
                new Person("Anna", "Russia", "1998-02-01", "female"),
                new Person("Liên", "Vietnam", "1992-02-01", "female"),
                new Person("Ziang", "China", "2001-05-06", "female"),
                new Person("Persie", "Holland", "1978-11-20", "male")));

        books = new ArrayList<>(List.of(
                new Book("cuon theo chieu gio", "Margaret Mitchell"),
                new Book("Harry Potter", "J.k Rowlling"),
                new Book("De men phieu luu ky", "To hoai")
                )
                );

        jobs = new ArrayList<>(List.of(
                new Job("0X-11", "Java-backend", "thiet ke he thong", Location.HANOI, 5000000, 10000000,
                        "dangkhoa@gmail.com"),
                new Job("0X-12", "Frontend", "thiet ke he thong", Location.HAIPHONG, 6000000, 15000000,
                        "dangkhoa@gmail.com"),
                new Job("0X-13", "full-stack", "thiet ke he thong", Location.DANANG, 7000000, 20000000,
                        "dangkhoa@gmail.com")

        ));

    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }

    public void setPeople(ArrayList<Person> people) {
        this.people = people;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Job> getJobs() {
        return jobs;
    }

    public void setJobs(ArrayList<Job> jobs) {
        this.jobs = jobs;
    }

}
