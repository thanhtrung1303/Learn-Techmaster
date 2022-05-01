package model;

public class Book {
    private int id;
    private String tittle;
    private String author;
    private String gender;

    public Book(int id, String tittle, String author, String gender) {
        this.id = id;
        this.tittle = tittle;
        this.author = author;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return id + " - " + tittle + " - " + author + " - " + gender;
    }
}
