import java.text.DecimalFormat;
import java.util.Scanner;

public abstract class Employee {
    private int id;
    private String name;
    private int age;
    private long basicSalary;

    public Employee(){
    }

    public Employee(int id, String name, int age, long basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(long basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên nhân viên: ");
        name = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        age = sc.nextInt();
        System.out.print("Nhập lương cơ bản: ");
        basicSalary = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Mã nhân viên: " + id + "; " + "Tên: " + name + "; " + "Tuổi: " + age + "; " +
                "Lương cơ bản: " + formatMoney(basicSalary) + "; " + "Lương thực lĩnh: "+ formatMoney(calculatorSalary());
    }

    public abstract long calculatorSalary();

    public String formatMoney(long salary) {
        String pattern = "###,###,000";
        DecimalFormat myFormat = new DecimalFormat(pattern);
        return myFormat.format(salary);
    }
}
