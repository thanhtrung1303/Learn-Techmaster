import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ProductService {
    public ArrayList<Product> getAllProduct() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Samsung Galaxy S21 FE 5G", "Samsung Galaxy S21 FE 5G 6GB - 128GB", 15990000, 20, 5, "Samsung", new Item[]{Item.Điệnthoại}));
        products.add(new Product(2, "OPPO Reno6 Z 5G", "OPPO Reno6 Z 5G", 9490000, 30, 9, "OPPO",new Item[]{Item.Điệnthoại}));
        products.add(new Product(3, "Xiaomi 11 Lite 5G NE", "Xiaomi 11 Lite 5G NE 8GB - 256BG", 8990000, 25, 8, "Xiaomi",new Item[]{Item.Điệnthoại}));
        products.add(new Product(4, "Acer Nitro Gaming AN515-45-R6EV/R5-5600H", "Acer Nitro Gaming AN515-45-R6EV/R5-5600H", 219999000, 15, 5, "Acer", new Item[]{Item.Laptop}));
        products.add(new Product(5, "Dell Gaming G15 5511 i5 11400H/70266676", "Dell Gaming G15 5511 i5 11400H/70266676", 269999000, 19, 6, "Dell", new Item[]{Item.Laptop}));
        products.add(new Product(6, "MSI Gaming GF63 10SC 804VN i5 10500H", "MSI Gaming GF63 10SC 804VN i5 10500H", 189999000, 18, 6, "Apple", new Item[]{Item.Laptop}));
        products.add(new Product(7, "iPhone 13 Pro Max", "iPhone 13 Pro Max", 31990000, 15, 7, "Apple", new Item[]{Item.Apple,Item.Điệnthoại}));
        products.add(new Product(8, "iPad 10.2 2021 Wi-Fi", "iPad 10.2 2021 Wi-Fi", 9999000, 14, 7, "Apple", new Item[]{Item.Apple}));
        products.add(new Product(9, "MacBook Air 13\" 2020 M1 256GB", "MacBook Air 13\" 2020 M1 256GB", 269999000, 16, 8, "Apple", new Item[]{Item.Apple, Item.Laptop}));
        products.add(new Product(10, "Tai nghe không dây Mi TWS Earphones 2 Basic", "Tai nghe không dây Mi TWS Earphones 2 Basic", 799000, 12, 8, "Xiaomi", new Item[]{Item.PhụKiện}));
        products.add(new Product(11, "Ốp lưng Magsafe iPhone 13 Pro Max Mipow", "Ốp lưng Magsafe iPhone 13 Pro Max Mipow", 432000, 42, 15, "Magsafe", new Item[]{Item.PhụKiện}));
        products.add(new Product(12, "Tai nghe AirPods Pro 2021", "Tai nghe AirPods Pro 2021", 4999000, 18, 3, "Apple", new Item[]{Item.PhụKiện}));
        products.add(new Product(13, "Samsung Galaxy A12 4GB-128GB", "Samsung Galaxy A12 4GB-128GB", 3690000, 18, 3, "Samsung", new Item[]{Item.Điệnthoại}));


        return products;
    }

    public void printProductByItem(ArrayList<Product> products, Item item) {
        int count = 0;
        for (Product product : products) {
            if (Arrays.toString(product.getItem()).contains(item.toString())) {
                System.out.println(product);
                count++;
            }
        }
        System.out.println("Số lượng sản phẩm: " + count);
    }

    public void printProductBybrand(ArrayList<Product> products, String brand) {
        for (Product product : products) {
            if (product.getBrand().toLowerCase().contains(brand.toLowerCase())) {
                System.out.println(product);
            }
        }
    }

    public void printProductByPrice(ArrayList<Product> products) {
        Scanner sc = new Scanner(System.in);
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1:
                for (Product product : products) {
                    if (product.getPrice() < 2000000) {
                        System.out.println(product);
                    }
                }
                break;
            case 2:
                for (Product product : products) {
                    if (product.getPrice() >= 2000000 && product.getPrice() < 4000000) {
                        System.out.println(product);
                    }
                }
                break;
            case 3:
                for (Product product : products) {
                    if (product.getPrice() >= 4000000 && product.getPrice() < 7000000) {
                        System.out.println(product);
                    }
                }
                break;
            case 4:
                for (Product product : products) {
                    if (product.getPrice() >= 7000000 && product.getPrice() < 13000000) {
                        System.out.println(product);
                    }
                }
                break;
            case 5:
                for (Product product : products) {
                    if (product.getPrice() >= 13000000) {
                        System.out.println(product);
                    }
                }
                break;
        }
    }

    public void searchByName(ArrayList<Product> products, String name) {
        for (Product product : products) {
            if (product.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(product);
            }
        }
    }
}
