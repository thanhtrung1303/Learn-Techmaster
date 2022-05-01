import java.util.Scanner;

public class Kitchen extends Employee {
    private long  serviceCharge;

    public Kitchen() {
    }

    public Kitchen(int id, String name, int age, long basicSalary, long serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public long getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(long serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phí dịch vụ: ");
        serviceCharge = sc.nextLong();
    }

    @Override
    public String toString() {
        return super.toString() + "; " + "Phí dịch vụ: " + formatMoney(serviceCharge);
    }

    @Override
    public long calculatorSalary() {
        return getBasicSalary() + serviceCharge;
    }
}
