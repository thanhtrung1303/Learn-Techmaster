package model;

public class EBook extends Book {
    private int publishingYear;
    private double Capacity;
    private String image;
    private int download;

    public EBook(int id, String title, String[] category, String publishingCompany, int publishingYear, double capacity, String image, int download) {
        super(id, title, category, publishingCompany);
        this.publishingYear = publishingYear;
        Capacity = capacity;
        this.image = image;
        this.download = download;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public double getCapacity() {
        return Capacity;
    }

    public void setCapacity(double capacity) {
        Capacity = capacity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getDownload() {
        return download;
    }

    public void setDownload(int download) {
        this.download = download;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + publishingYear + " - " + Capacity + " - " + image + " - " + download;
    }
}
