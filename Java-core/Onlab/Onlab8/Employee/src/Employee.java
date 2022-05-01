import java.text.DecimalFormat;
import java.time.LocalDate;

public abstract class Employee {
    private int id;
    private String name;
    private LocalDate date;
    private long salary;

    public Employee(int id, String name, LocalDate date, long salary) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.salary = salary;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + date + " - " + formatMoney(salary) + " - " + formatMoney(salaryCalcu());
    }

    public abstract long salaryCalcu();

    public String formatMoney(long salary) {
        String pattern = "###,###,000";
        DecimalFormat myFormat = new DecimalFormat(pattern);
        return myFormat.format(salary);
    }
}
