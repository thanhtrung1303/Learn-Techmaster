package com.spring_boot.onlab_03.controller;

import com.spring_boot.onlab_03.model.Book;
import com.spring_boot.onlab_03.model.City;
import com.spring_boot.onlab_03.repository.InMemoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HomeController {
    @Autowired
    private InMemoryRepository repo;

    @GetMapping
    public String homePage(Model model) {
        Book book = new Book("de men phieu luu ki", "to hoai");
        model.addAttribute("book", book);
        model.addAttribute("name", "khoa");
        model.addAttribute("message", "<h2>Display <span style='color:red'>HTML</span> inside</h2>");
        return "index";
    }

    @GetMapping(value = "/text")
    public String textPage(Model model) {

        return "text";
    }

    // @GetMapping(value = "/about")
    // public String displayAbout(Model model, @RequestParam("foo") String a,
    // @RequestParam("tom") String b) {
    // model.addAttribute("foo", a);
    // model.addAttribute("tom", b);
    // return "about";
    // }

    @GetMapping("/about")
    public String getAbout() {
        return "about";
    }

    @GetMapping(value = "/json", produces = "application/json")
    @ResponseBody
    public Book returnBook() {
        return new Book("de men phieu luu ki", "to hoai");
    }

    @GetMapping("/link")
    public String linkExpression(Model model) {
        model.addAttribute("dynamiclink", "products");
        return "link";
    }

    @GetMapping(value = "/products")
    public String getProduct(Model model) {
        model.addAttribute("products", repo.getProducts());
        return "products";
    }

    @GetMapping("/condition")
    public String demoCondition(Model model) {
        model.addAttribute("people", repo.getPeople());
        return "condition";
    }

    @GetMapping(value = "/books")
    public String getBook(Model model) {
        model.addAttribute("books", repo.getBooks());
        return "books";
    }

    @GetMapping(value = "/jobs")
    public String getJob(Model model) {
        model.addAttribute("jobs", repo.getJobs());
        return "jobs";
    }

    @GetMapping("/city")
    public String getCity(Model model) {
        return "city";
    }
}