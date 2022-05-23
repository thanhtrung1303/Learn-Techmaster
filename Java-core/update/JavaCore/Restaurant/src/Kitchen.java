public class Kitchen extends Employee {
    private int serviceCharge;

    public Kitchen(int id, String name, int age, int basicSalary, int serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public int getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public int calculatorSalary() {
        return getServiceCharge() + getBasicSalary();
    }

    @Override
    public String toString() {
        return "Chức vụ : NHÂN VIÊN ĐỨNG BẾP \t|" + super.toString() +
                ", serviceCharge= " + formatMoney(serviceCharge) + ", lương nhận: " + formatMoney(calculatorSalary());
    }

    public void hienThiTT() {
        {
            System.out.printf("%-5d %-20s %-12d %-20s %-20s %-20s \n", getId(), getName(), getAge(), formatMoney(getBasicSalary()), formatMoney(serviceCharge), formatMoney(calculatorSalary()));
        }
    }
}
