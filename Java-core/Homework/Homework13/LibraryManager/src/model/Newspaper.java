package model;

import java.time.LocalDate;

public class Newspaper extends Book {
    private LocalDate date;
    private int amount;
    private int numberOfPages;

    public Newspaper(int id, String title, String[] category, String publishingCompany, LocalDate date, int amount, int numberOfPages) {
        super(id, title, category, publishingCompany);
        this.date = date;
        this.amount = amount;
        this.numberOfPages = numberOfPages;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String toString() {
        return super.toString() + " - " + date + " - "
                + amount + " - " + numberOfPages;
    }
}
