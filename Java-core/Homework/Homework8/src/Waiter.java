import java.util.Scanner;

public class Waiter extends Employee {
    private long compensate;

    public Waiter() {
    }

    public Waiter(int id, String name, int age, long basicSalary, long compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public long getCompensate() {
        return compensate;
    }

    public void setCompensate(long compensate) {
        this.compensate = compensate;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhập thưởng: ");
        compensate = sc.nextLong();
    }

    @Override
    public String toString() {
        return super.toString() + "; " + "Thưởng: " + formatMoney(compensate);
    }

    @Override
    public long calculatorSalary() {
        return getBasicSalary() + compensate;
    }
}
