import java.util.ArrayList;
import java.util.Scanner;

public class ProductService {
    public ArrayList<Product> getAllProduct(){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Đèn led", 100000, 5, Item.ITEM1, 2));
        products.add(new Product(2, "Khoai tây chiên", 50000, 6, Item.ITEM2, 3));
        products.add(new Product(3, "Áo thun", 200000, 10, Item.ITEM3, 6));
        products.add(new Product(4, "Áo sơ mi", 230000, 12, Item.ITEM3, 3));
        products.add(new Product(5, "Đồng hồ", 550000, 10, Item.ITEM1, 5));
        products.add(new Product(6, "Nước giải khát", 10000, 50, Item.ITEM2, 30));

        return products;
    }

    public void show(ArrayList<Product> products) {
        for (Product p : products){
            System.out.println(p);
        }
    }

    public void searchByName(ArrayList<Product> products, String searchName){
        for (Product p : products){
            if(p.getName().toLowerCase().contains(searchName.toLowerCase())){
                System.out.println(p);
            }
        }
    }

    public Product searchByID(ArrayList<Product> products, int id){
        for (Product p : products){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public void updateNameProduct(Product product, String newProduct){
        product.setName(newProduct);
        System.out.println(product);
    }
    public void updatePriceProduct(Product product, long newSellPrice){
        product.setSellPrice(newSellPrice);
        System.out.println(product);
    }


    public void deleteProduct(ArrayList<Product> products, Product product){
        products.remove(product);
    }

    public Product createNewProdcut(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sản phẩm: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.println("Nhập giá bán: ");
        long sellPrice = Long.parseLong(sc.nextLine());
        System.out.println("Nhập số lượng");
        int amount = sc.nextInt();
        System.out.println("Chọn loại mặt hàng: ");
        System.out.println("1 - Đồ gia dụng");
        System.out.println("2 - Thực phẩm");
        System.out.println("3 - Thời trang");
        int choice = sc.nextInt();
        Item item = Item.ITEM1;
        if (choice == 1){
            item = Item.ITEM1;
        }
        else if (choice == 2){
            item = Item.ITEM2;
        }
        else if (choice == 3){
            item = Item.ITEM3;
        }
        else {
            System.out.println("Mặc định lựa chọn 1");
        }

        System.out.println("Nhập số lượng bán: ");
        int sellAmount = sc.nextInt();

        Product newProduct = new Product(id, name, sellPrice, amount, item, sellAmount);

        return newProduct;
    }

    public void addNewProduct(Product product, ArrayList<Product> products){
        products.add(product);
    }
}
