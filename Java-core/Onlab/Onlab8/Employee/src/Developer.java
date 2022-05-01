import java.time.LocalDate;

public class Developer extends Employee {
    private int api;

    public Developer(int id, String name, LocalDate date, long salary, int api) {
        super(id, name, date, salary);
        this.api = api;
    }

    public int getApi() {
        return api;
    }

    public void setApi(int api) {
        this.api = api;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + api;
    }

    @Override
    public long salaryCalcu() {
        return getSalary() + (api*100000);
    }
}
