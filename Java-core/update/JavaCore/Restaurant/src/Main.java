import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static void nhapNhanVien(Employee nv) {
        System.out.println("NHap id ");
        nv.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap ten");
        nv.setName(sc.nextLine());
        System.out.println("Nhap tuoi");
        nv.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap luong co ban ");
        nv.setBasicSalary(sc.nextInt());
        System.out.println("bạn muốn nhập chức vụ nào");
        System.out.println("Nhập 0 để nhập  bồi bàn, nhập 1 để nhập đầu bếp");
    }

    public static void main(String[] args) {
        Employee[] std = new Employee[5];
//        std[0] = new Waiter(1, "Nam", 21, 3500000, 6000000);
//        std[1] = new Waiter(2, "Lan", 18, 6000000, 5000000);
//        std[2] = new Kitchen(3, "Thơ", 22, 5000000, 6000000);
//        std[3] = new Waiter(4, "Long", 25, 1000000, 5000000);
//        std[4] = new Kitchen(5, "Hùng", 22, 6000000, 3000000);

        System.out.printf("%-5s %9s %15s %20s %21s %17s \n", "ID", "Họ và tên", "Tuổi", "Lương cơ bản", "Lương dịch vụ", "Tổng lương");
        for (int i = 0; i < std.length; i++) {
            std[i].hienThiTT();
        }
    }

}
