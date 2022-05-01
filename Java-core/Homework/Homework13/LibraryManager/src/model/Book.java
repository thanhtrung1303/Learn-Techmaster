package model;

import java.util.Arrays;

public class Book {
    private int id;
    private String title;
    private String[] category;
    private String publishingCompany;

    public Book(int id, String title, String[] category, String publishingCompany) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.publishingCompany = publishingCompany;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getPublishingCompany() {
        return publishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    @Override
    public String toString() {
        return id + " - " + title + " - "
                + Arrays.toString(category) + " - " + publishingCompany;
    }
}
