package model;

import util.util;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.Arrays;

public class Book {
    private String id;
    private String title;
    private String[] category;
    private String author;
    private String publishingCompany;
    private YearMonth publishingYear;
    private int sold;
    private int numberOfPage;
    private long sellPrice;

    public Book(String id, String title, String[] category, String author, String publishingCompany, YearMonth publishingYear, int sold, int numberOfPage, long sellPrice) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.author = author;
        this.publishingCompany = publishingCompany;
        this.publishingYear = publishingYear;
        this.sold = sold;
        this.numberOfPage = numberOfPage;
        this.sellPrice = sellPrice;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    public YearMonth getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(YearMonth publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public long getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(long sellPrice) {
        this.sellPrice = sellPrice;
    }

    @Override
    public String toString() {
        return "ID=" + id +
                ", Tên sách: " + title  +
                ", Thể loại: " + Arrays.toString(category) +
                ", Tác giả: " + author  +
                ", Nhà xuất bản: " + publishingCompany +
                ", Năm xuất bản: " + publishingYear +
                ", Đã bán: " + sold +
                ", Số trang: " + numberOfPage +
                ", Giá bán: " + util.formatMoney(sellPrice);
    }
}
