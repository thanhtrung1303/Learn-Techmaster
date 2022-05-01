import java.util.Scanner;

public class ProductService {
    public void createProduct(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ten");
        String name = sc.nextLine();
        System.out.println("nhap gia ban");
        long sellPrince = Long.parseLong(sc.nextLine());
        System.out.println("nhap so luong");
        int amount = Integer.parseInt(sc.nextLine());
        System.out.println("chon loai mat hang");
        System.out.println("0 - Do gia dung");
        System.out.println("1 - Thuc pham");
        System.out.println("2 - Thoi trang");
        int choice = Integer.parseInt(sc.nextLine());
        Type type = Type.TYPE1;
        if (choice == 0) {
            type = Type.TYPE1;
        }
        else if (choice == 1) {
            type = Type.TYPE2;
        }
        else if (choice == 2) {
            type = Type.TYPE3;
        }

        Product newProduct = new Product(id, name, sellPrince, amount, type);

    }
}
