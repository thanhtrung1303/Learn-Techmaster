import java.text.DecimalFormat;

public abstract class Employee {
    private int id;
    private String name;
    private int age;
    private int basicSalary;

    //    khởi tạo contructor có tham số
    public Employee(int id, String name, int age, int basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }
//    begin setter and getter

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }

    // end getter and setter
//    khởi tạo phương thức toString
    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", basicSalary=" + formatMoney(getBasicSalary());
    }
//khởi tạo phương thức trừu tượng tính lương
    public abstract int calculatorSalary();

    // format lại định dạng tiền
    public String formatMoney(int money) {
        String pattern = "###,###,### VND";
        DecimalFormat myFormat = new DecimalFormat(pattern);
        return myFormat.format(money);
    }
//khởi tạo phương thức trừu tượng hiển thị thông tin nhân viên theo format
    public abstract void hienThiTT();

}
