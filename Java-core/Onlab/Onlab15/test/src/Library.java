public class Library {
    private int id;
    private String tittle;
    private String publishCompany;
    private int year;
    private int amount;

    public Library(int id, String tittle, String publishCompany, int year, int amount) {
        this.id = id;
        this.tittle = tittle;
        this.publishCompany = publishCompany;
        this.year = year;
        this.amount = amount;
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

    public String getPublishCompany() {
        return publishCompany;
    }

    public void setPublishCompany(String publishCompany) {
        this.publishCompany = publishCompany;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", tittle='" + tittle + '\'' +
                ", publishCompany='" + publishCompany + '\'' +
                ", year=" + year +
                ", amount=" + amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
