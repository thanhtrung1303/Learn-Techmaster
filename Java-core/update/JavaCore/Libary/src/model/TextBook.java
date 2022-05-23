package model;

public class TextBook extends Book {
    private int publishYear;
    private int amount;
    private int pageNumber;
    private String author;

    public TextBook(int id, String name, String[] type, String publishCompany, int publishYear, int amount, int pageNumber, String author) {
        super(id, name, type, publishCompany);
        this.publishYear = publishYear;
        this.amount = amount;
        this.pageNumber = pageNumber;
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() +
                " - " + publishYear +
                " - " + amount +
                " - " + pageNumber +
                " - " + author;
    }
}
