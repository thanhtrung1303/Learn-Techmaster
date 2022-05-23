package model;


import java.time.LocalDate;

public class Magazine extends Book {
    private LocalDate publishDay;
    private int amount;
    private int pageNumber;

    public Magazine(int id, String name, String[] type, String publishCompany, LocalDate publishDay, int amount, int pageNumber) {
        super(id, name, type, publishCompany);
        this.publishDay = publishDay;
        this.amount = amount;
        this.pageNumber = pageNumber;
    }

    public LocalDate getPublishDay() {
        return publishDay;
    }

    public void setPublishDay(LocalDate publishDay) {
        this.publishDay = publishDay;
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

    @Override
    public String toString() {
        return super.toString() +
                " - " + publishDay +
                " - " + amount +
                " - " + pageNumber;
    }
}
