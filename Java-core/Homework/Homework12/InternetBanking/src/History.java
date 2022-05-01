import java.time.LocalDate;

public class History {
    private int id;
    private LocalDate date;
    private String memo;
    private String stk;

    public History(int id, LocalDate date, String memo, String stk) {
        this.id = id;
        this.date = date;
        this.memo = memo;
        this.stk = stk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getStk() {
        return stk;
    }

    public void setStk(String stk) {
        this.stk = stk;
    }

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", date=" + date +
                ", memo='" + memo + '\'' +
                ", stk='" + stk + '\'' +
                '}';
    }
}