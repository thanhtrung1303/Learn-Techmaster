import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceLibrary {
    Scanner sc = new Scanner(System.in);
    public ArrayList<SchoolBook> getAllBook() {
        ArrayList<SchoolBook> schoolBooks = new ArrayList<>();
        schoolBooks.add(new SchoolBook(1, "hello", "nxb", 2000, 300, 500,
                "new", 200));
        schoolBooks.add(new SchoolBook(2, "hello1", "nxb", 2003, 300, 500,
                "old", 200));
        schoolBooks.add(new SchoolBook(3, "hello2", "nxb", 2000, 400, 500,
                "old", 200));
        return schoolBooks;
    }

    public void searchPosition(ArrayList<SchoolBook> schoolBooks) {
        System.out.println("Nhập vị trí muốn tìm sản phẩm");
        int key = sc.nextInt();
        System.out.println(schoolBooks.get(key - 1));
        for (SchoolBook schoolBook : schoolBooks) {
            System.out.println("Sản phẩm còn tồn trong kho");
            int tonkho = schoolBook.getAmount() - schoolBook.getAmountBorrow();
            System.out.println(tonkho);
        }
        }

    public void createSchoolBook(ArrayList<SchoolBook> schoolBooks){
        int id = Integer.parseInt(sc.nextLine());
        String title = sc.nextLine();
        String publishCompany = sc.nextLine();
        int year = sc.nextInt();
        int amount = sc.nextInt();
        int amountOfPage = sc.nextInt();
        String status = sc.nextLine();
        int amountBorrow = sc.nextInt();

        schoolBooks.add(new SchoolBook(id, title, publishCompany, year, amount, amountOfPage, status, amountBorrow));
    }

    public void show(ArrayList<SchoolBook> schoolBooks){
        for (SchoolBook schoolBook: schoolBooks) {
            System.out.println(schoolBook);
        }
    }
}