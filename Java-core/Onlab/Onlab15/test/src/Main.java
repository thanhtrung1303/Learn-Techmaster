import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceLibrary serviceLibrary = new ServiceLibrary();
        ArrayList<SchoolBook> schoolBooks = serviceLibrary.getAllBook();
        System.out.println("moi lua chon");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                serviceLibrary.searchPosition(schoolBooks);
            break;
            case 2:
                System.out.println("them sach");
                serviceLibrary.createSchoolBook(schoolBooks);
            break;
            case 3:
                serviceLibrary.show(schoolBooks);
                break;
        }
    }
}
