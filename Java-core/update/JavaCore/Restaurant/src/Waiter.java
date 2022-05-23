public class Waiter extends Employee {
    private int compensate;

    public Waiter(int id, String name, int age, int basicSalary, int compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public int getCompensate() {
        return compensate;
    }

    public void setCompensate(int compensate) {
        this.compensate = compensate;
    }

    @Override
    public String toString() {
        return "Chức vụ : BỒI BÀN |" + super.toString() +
                ", compensate= " + formatMoney(compensate) + ", lương nhận: " + formatMoney(calculatorSalary());
    }

    @Override
    public int calculatorSalary() {
        return getCompensate() + getBasicSalary();
    }

    @Override
    public void hienThiTT() {
        {
            System.out.printf("%-5d %-20s %-12d %-20s %-20s %-20s \n", getId(), getName(), getAge(), formatMoney(getBasicSalary()), formatMoney(compensate), formatMoney(calculatorSalary()));
        }
    }
}
