package model;

public class TextBook extends Book{
    private int publishingYear;
    private int amount;
    private int numberOfPages;
    private String author;

    public TextBook(int id, String title, String[] category, String publishingCompany, int publishingYear, int amount, int numberOfPages, String author) {
        super(id, title, category, publishingCompany);
        this.publishingYear = publishingYear;
        this.amount = amount;
        this.numberOfPages = numberOfPages;
        this.author = author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + publishingYear + " - " + amount + " - "
                + numberOfPages + " - " + author;
    }
}
