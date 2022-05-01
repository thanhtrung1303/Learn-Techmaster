import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    static Scanner sc = new Scanner(System.in);
    static ProductService service = new ProductService();
    static ArrayList<Product> products = service.getAllProduct();

    public void menu() {
        boolean isContinue = true;
        while (isContinue) {
            Menu.mainMenu();
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    itemMenu();
                    break;
                case 2:
                    System.out.println("Nhập hãng bạn muốn tìm kiếm: ");
                    sc.nextLine();
                    String brand = sc.nextLine();
                    service.printProductBybrand(products, brand);
                    break;
                case 3:
                    Menu.subMenuPrice();
                    service.printProductByPrice(products);
                    break;
                case 4:
                    System.out.println("Nhập tên sản phẩm: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    service.searchByName(products, name);
                    break;
                case 0:
                    System.exit(0);

            }
        }
    }

    public void itemMenu() {
            Menu.subMenuItem();
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    service.printProductByItem(products, Item.Điệnthoại);
                    break;
                case 2:
                    service.printProductByItem(products, Item.Laptop);
                    break;
                case 3:
                    service.printProductByItem(products, Item.Apple);
                    break;
                case 4:
                    service.printProductByItem(products, Item.PhụKiện);
                    break;
                case 0:
                    menu();
                    break;
            }
        }
    }