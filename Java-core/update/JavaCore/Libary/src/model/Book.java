package model;

import java.util.Arrays;

public class Book {
    private int id;
    private String name;
    private String[] category;
    private String publishCompany;

    public Book(int id, String name, String[] category, String publishCompany) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.publishCompany = publishCompany;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCategory() {
        return category;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    public String getPublishCompany() {
        return publishCompany;
    }

    public void setPublishCompany(String publishCompany) {
        this.publishCompany = publishCompany;
    }

    @Override
    public String toString() {
        return id +
                " - " + name +
                " - " + Arrays.toString(category) +
                " - " + publishCompany;
    }
}
