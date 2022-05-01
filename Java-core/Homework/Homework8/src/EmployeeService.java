import java.util.Scanner;

public class EmployeeService {
    public static Employee[] createEmployee(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nhân viên: ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i+1));
            System.out.println(" Chọn công việc của nhân viên");
            System.out.println("0 - Waiter");
            System.out.println("1 - Kitchen");
            int choice = sc.nextInt();

            if (choice == 0) {
                employees[i] = new Waiter();
            }
            else if (choice == 1) {
                employees[i] = new Kitchen();
            }

            employees[i].input();
        }
        return employees;
    }
    public static void show(Employee[] employees) {
        for (Employee e: employees) {
            System.out.println(e);
        }
    }
}
