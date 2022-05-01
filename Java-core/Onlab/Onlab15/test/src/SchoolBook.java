public class SchoolBook extends Library{
    private int amountOfPage;
    private String status;
    private int amountBorrow;

    public SchoolBook(int id, String tittle, String publishCompany, int year, int amount, int amountOfPage, String status, int amountBorrow) {
        super(id, tittle, publishCompany, year, amount);
        this.amountOfPage = amountOfPage;
        this.status = status;
        this.amountBorrow = amountBorrow;
    }

    public int getAmountOfPage() {
        return amountOfPage;
    }

    public void setAmountOfPage(int amountOfPage) {
        this.amountOfPage = amountOfPage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAmountBorrow() {
        return amountBorrow;
    }

    public void setAmountBorrow(int amountBorrow) {
        this.amountBorrow = amountBorrow;
    }

    @Override
    public String toString() {
        return super.toString() +
                "amountOfPage=" + amountOfPage +
                ", status='" + status + '\'' +
                ", amountBorrow=" + amountBorrow;
    }

}
