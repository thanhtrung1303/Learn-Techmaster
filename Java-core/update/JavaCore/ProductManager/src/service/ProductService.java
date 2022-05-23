package service;

import model.Product;
import enumm.ProductType;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class ProductService {
    //    tạo ArrayList sản phẩm
    public ArrayList<Product> getAllProducts() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "Mì tôm", 3000, 100, ProductType.Food, 50));
        products.add(new Product(2, "Áo phao", 150000, 5, ProductType.Fashion, 3));
        products.add(new Product(3, "Xúc xích", 5000, 150, ProductType.Food, 80));
        products.add(new Product(4, "Chổi", 80000, 20, ProductType.HouseWare, 8));
        products.add(new Product(1, "Nồi chiên không dầu 6.2 lít Philips HD9270/90", 3990000, 30, ProductType.HouseWare, 41));
        products.add(new Product(2, "Máy hút bụi Hitachi CV-SF20 Nâu", 2990000, 70, ProductType.HouseWare, 5));
        products.add(new Product(3, "Lò vi sóng Sharp 20 lít R-201VN-W", 1890000, 80, ProductType.HouseWare, 36));
        products.add(new Product(4, "Máy đánh trứng Electrolux EHM3407", 560000, 150, ProductType.HouseWare, 50));
        products.add(new Product(5, "Nồi chiên không dầu Elmich 3.2 lít AFE-3947", 990000, 75, ProductType.HouseWare, 47));
        products.add(new Product(6, "Nấm kim châm Hàn Quốc 150gr", 13000, 300,ProductType.Food, 148));
        products.add(new Product(7, "Thịt xương ống heo Meat deli(S) khay (450-495g)", 47000, 420, ProductType.Food, 320));
        products.add(new Product(8, "Thịt heo xay Meat deli đặc biệt(S) khay 3(50-385g)", 62000, 500, ProductType.Food, 148));
        products.add(new Product(9, "Rau dền gói 500g", 17300, 300, ProductType.Food, 54));
        products.add(new Product(10, "Bắp cải trắng gói 600g", 18540, 450, ProductType.Food, 200));
        products.add(new Product(11, "Áo thun nữ tay dài cổ vuông đuôi TÔM thời trang - Freesize", 53900, 300, ProductType.Fashion, 54));
        products.add(new Product(12, "Áo dài truyền thống cách tân màu hồng đỏ", 226300, 700,ProductType.Fashion, 38));
        products.add(new Product(13, "Áo phao nữ ultra soft YODY", 515600, 450, ProductType.Fashion, 240));
        products.add(new Product(14, "Chân váy xếp ly dáng ngắn", 63000, 1500, ProductType.Fashion, 547));
        products.add(new Product(15, "Chân váy kaki lưng cao MASARA", 590000, 850, ProductType.Fashion, 400));
        Collections.sort(products);
        return products;
    }

    //    định dạng tiền theo Format
    public String formatMoney(int money) {
        String pattern = "###,###,### VND";
        DecimalFormat myFormat = new DecimalFormat(pattern);
        return myFormat.format(money);
    }

    public void showTitle() {
        System.out.printf("%-5s %29s %40s %25s %21s %15s \n", "ID", "Tên sản phẩm", "Giá sản phẩm", "Số lượng sản phẩm", "Loại mặt hàng", "Số lượng bán");
    }

    public void showInfomation(Product product) {
        System.out.printf("%-5d %-60s %-20s %-20d %-20s %-20d \n", product.getId(), product.getName(), formatMoney(product.getCost()), product.getAmount(), product.getType().getText(), product.getSoldAmount());
    }

    //    Liệt kê danh sách sản phẩm
    public void show(ArrayList<Product> products) {
        showTitle();
        for (Product p : products
        ) {
            showInfomation(p);
        }
    }

    //    Tìm sản phẩm theo tên
    public void searchByName(ArrayList<Product> products, String name) {
        for (Product p : products
        ) {
            if (p.getName().toLowerCase(Locale.ROOT).contains(name.toLowerCase(Locale.ROOT))) {
                showInfomation(p);
            }
        }
    }

    //    Liệt kê sản phẩm theo loại mặt hàng
    public void showByType(ArrayList<Product> products, String searchType) {
        showTitle();
        for (Product p : products
        ) {
            if (p.getType().getText().toLowerCase(Locale.ROOT).contains(searchType.toLowerCase(Locale.ROOT))) {
                showInfomation(p);
            }
        }
    }

    //    Tìm sản phẩm theo ID
    public Product searchById(ArrayList<Product> products, int id) {
        for (Product p : products
        ) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    //    Cập nhật tên sản phẩm
    public void updateProductName(Product product, String newProductName) {
        product.setName(newProductName);
        showInfomation(product);
    }

    //    Cập nhật giá sản phẩm
    public void updateProductCost(Product product, int newProductCost) {
        product.setCost(newProductCost);
        showInfomation(product);
    }

    //    Xoá 1 sản phẩm
    public void deleteProduct(ArrayList<Product> products, Product product) {
        products.remove(product);
    }

    //    Tạo một sản phẩm mới
    public Product createaNewProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập id sản phẩm: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập tên sản phẩm: ");
        String name = sc.nextLine();
        System.out.println("Mời nhập giá bán sản phẩm: ");
        int cost = Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập số lượng sản phẩm: ");
        int amount = Integer.parseInt(sc.nextLine());
        ProductType newtype = productTypeInput();
        System.out.println("Mời nhập số lượng bán: ");
        int soldAmount = Integer.parseInt(sc.nextLine());

        return new Product(id, name, cost, amount, newtype, soldAmount);
    }

    public static ProductType productTypeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời chọn loại mặt hàng: ");
        System.out.println("-------------------------------------------");
        System.out.println("Nhập mã HW để nhập măt hàng Đồ Gia Dụng");
        System.out.println("Nhập mã Food để nhập mặt hàng Thực Phẩm");
        System.out.println("Nhập mã Fashion để nhập mặt hàng Thời Trang");
        System.out.println("--------------------------------------------");
        System.out.println("Mời nhập mã mặt hàng");
        String typingCode = sc.nextLine();
        return ProductType.getProductValueByCode(typingCode);
    }

    //    Thêm sản phẩm mớ vào danh sách
    public void addaNewProduct(Product newproduct, ArrayList<Product> products) {
        products.add(newproduct);
    }
}
