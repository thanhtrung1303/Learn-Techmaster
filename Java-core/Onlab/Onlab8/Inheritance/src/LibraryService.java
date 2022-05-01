import java.awt.print.Book;
import java.util.Scanner;

public class LibraryService {
    public static void createLibrary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma sach");
        int masach = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ten sach");
        String tensach = sc.nextLine();
        System.out.println("nhap nha xuat ban");
        String nhaxuatban = sc.nextLine();
        System.out.println("nhap nam xuat ban");
        int namxuatban = Integer.parseInt(sc.nextLine());
        System.out.println("nhap so luong");
        int soluong = sc.nextInt();
    }
}
