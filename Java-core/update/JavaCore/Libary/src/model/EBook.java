package model;


public class EBook extends Book {
    private int publishYear;
    private int data;
    private String image;
    private int numberDownload;

    public EBook(int id, String name, String[] type, String publishCompany, int publishYear, int data, String image, int numberDownload) {
        super(id, name, type, publishCompany);
        this.publishYear = publishYear;
        this.data = data;
        this.image = image;
        this.numberDownload = numberDownload;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getNumberDownload() {
        return numberDownload;
    }

    public void setNumberDownload(int numberDownload) {
        this.numberDownload = numberDownload;
    }

    @Override
    public String toString() {
        return super.toString() +
                " - " + publishYear +
                " - " + data +
                " - " + image +
                " - " + numberDownload;
    }
}
