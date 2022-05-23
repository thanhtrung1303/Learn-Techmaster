package service;

import model.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

import model.*;
public class ItemService {

    /* Tạo mảng chứa toàn bộ sản phẩm*/
    public ArrayList<Item> getAllItems() {
        ArrayList<Item> list = new ArrayList<>();
        list.add(new Item("00773195", "iPhone 13 Pro Max 128GB ", "Đẳng cấp pro", 31990000, 25, 12, "Apple", new Category[]{Category.Apple, Category.Telephone}));
        list.add(new Item("00777919", "Tai nghe AirPods Pro 2021 ", "Tinh xảo, độ nhỏ gọn và tính đa dụng", 4999000, 120, 52, "Apple", new Category[]{Category.Apple, Category.Accessory}));
        list.add(new Item("00791366", "Samsung Galaxy S21 FE 5G 6GB-128GB", "Vẻ đẹp thời trang đến từ màu sắc", 15990000, 36, 18, "Samsung", new Category[]{Category.Telephone}));
        list.add(new Item("00762457", "Laptop Acer Nitro Gaming AN515 57 5831  ", "Bộ vi xử lý mới cho sức mạnh đột phá", 29699100, 45, 22, "Acer", new Category[]{Category.Laptop}));
        list.add(new Item("00785500", "Laptop MacBook Pro 16' 2021 M1 Pro Ram 32GB ", "Phong cáh thời thượng", 76990000, 20, 16, "Apple", new Category[]{Category.Apple, Category.Laptop}));
        list.add(new Item("00781350", "Apple Watch SE GPS 40mm viền nhôm dây cao su", "Thêm mục tiêu mới mỗi ngày", 6999000, 100, 62, "Apple", new Category[]{Category.Apple, Category.Accessory}));
        list.add(new Item("00760877", "Nokia 110 DS 4G", "Thiết kế làm nên thương hiệu", 850000, 524, 300, "Nokia", new Category[]{Category.Telephone}));
        list.add(new Item("00790410", "Masstel Hapi 30 4G", "Thiết kế trang nhã và độ hoàn thiện cao", 1990000, 125, 98, "Massel", new Category[]{Category.Telephone}));
        list.add(new Item("00772462", "Ốp lưng Magsafe iPhone 13 Pro Max Mipow", "Bảo vệ rất tốt, cực kỳ chắc chắn và ổn định", 432000, 1000, 512, "Mipow", new Category[]{Category.Accessory}));
        list.add(new Item("00772785", "Tai nghe chơi game không dây Corsair Virtuoso RGB SE", "Tính năng phù hợp khi chơi game", 5300000, 63, 42, "Corsair", new Category[]{Category.Accessory}));
        list.add(new Item("00720432", "Sạc nhanh 20W USB-C Power Adapter", "Thiết kế thanh lịch, tương thích mọi ổ cắm", 549000, 295, 132, "Apple", new Category[]{Category.Apple, Category.Accessory}));
        list.add(new Item("00790274", "Laptop HP 240 G8 Pentium N5030", "Giá rẻ chất lượng", 9891000, 55, 32, "HP", new Category[]{Category.Laptop}));
        list.add(new Item("00789800", "Laptop Dell Inspiron N3501", "Thiết kế thanh lịch", 12779100, 45, 26, "Dell", new Category[]{Category.Laptop}));
        list.add(new Item("00725257", "Samsung Galaxy A12 4GB-128GB", "Kiểu dáng hiện đại, màu sắc trẻ trung", 3990000, 295, 122, "Samsung", new Category[]{Category.Telephone}));
        list.add(new Item("00768217", "Xiaomi Redmi 9C 4GB-128GB", "Dung lượng pin lên tới 5000 mAh", 3490000, 215, 112, "Xiaomi", new Category[]{Category.Telephone}));

        return list;
    }

    /*Phương thức in ra màn hình theo danh mục sản phẩm*/
    public void showByCategory(ArrayList<Item> list, String category) {
        System.out.println("Sản phẩm thuộc danh mục "+category+" :");
        for (Item item : list
        ) {
            if (Arrays.toString(item.getCategory()).contains(category)) {
                System.out.println(item);
            }
        }
    }

/*Phương thức in ra màn hình theo mức giá*/
    public void showByCost(ArrayList<Item> list, int beginCost, int endCost) {
        for (Item item : list
        ) {
            if ((item.getCost() > beginCost) && (item.getCost() < endCost)) {
                System.out.println(item);
            }
        }

    }

    /*Tạo mảng gồm các nhãn hiệu và xử lý trùng lặp*/
    public ArrayList<String> getBrand() {
        ArrayList<Item> list = getAllItems();
        ArrayList<String> listBrand = new ArrayList<>();
        for (Item item : list
        ) {
            listBrand.add(item.getBrand());
        }
        for (int i = 0; i < listBrand.size(); i++) {
            for (int j = 1; j < listBrand.size(); j++) {
                if (listBrand.get(i).equals(listBrand.get(j))) {
                    listBrand.remove(j);
                }
            }
        }
        return listBrand;
    }

    /*Phương thức in ra màn hình theo nhãn hàng*/
    public void showByBrand(ArrayList<Item> list) {
        System.out.println("-------------------------------------------------");
        ArrayList<String> listBrand = getBrand();
        for (String brand : listBrand
        ) {
            System.out.println("Danh sách sản phẩm của hãng " + brand + " :");
            for (Item item : list
            ) {
                if (item.getBrand().equals(brand)) {
                    System.out.println(item);
                }
            }
            System.out.println("---------------------------------------------------");
        }

    }

    /*Phương thức tìm kiếm sản phảm theo từ khoá*/
    public void searchByName(ArrayList<Item> list, String searchName) {
        int count = 0;
        for (Item item : list
        ) {
            if (item.getName().toLowerCase(Locale.ROOT).contains(searchName.toLowerCase(Locale.ROOT))) {
                System.out.println(item);
                count++;
            }
        }
        System.out.println("Tìm thấy " + count + " kết quả với từ khoá \"" + searchName + "\"!!");
    }

    /*Phương thức tính và in ra màn hình số lượng sản phẩm mỗi danh mục*/
    public void countByCategory(ArrayList<Item> list) {
        int count = 0;
        for (Category category:Category.values()
             ) {
            for (Item item : list
            ) {
                if (Arrays.toString(item.getCategory()).contains(category.getValue())) {
                    count++;
                }
            }
            System.out.println("Danh mục: " + category + " có " + count + " sản phẩm");
            count=0;
        }

    }
    

}
