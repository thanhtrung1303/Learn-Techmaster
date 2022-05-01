package com.company;

import java.util.Scanner;

public class ProductService {
    public Product createProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên: ");
        String ten = sc.nextLine();
        System.out.println("Nhập số lượng: ");
        int soluong = Integer.parseInt(sc.nextLine());
        System.out.println("Lựa chọn đơn vị: ");
        System.out.println("0 - gói");
        System.out.println("1 - thùng");
        System.out.println("2 - chiếc");
        int choice = Integer.parseInt(sc.nextLine());
        DVT donvitinh = DVT.DVT1;
        if(choice == 0) {
            donvitinh = DVT.DVT1;
        }
        else if(choice == 1) {
            donvitinh = DVT.DVT2;
        }
        else if(choice == 2) {
            donvitinh = DVT.DVT3;
        }
        else {
            System.out.println("Không có lựa chọn này");
        }
        System.out.println("Nhập giá nhập");
        double gianhap = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập giá bán");
        double giaban = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập số lượng bán");
        int soluongban = Integer.parseInt(sc.nextLine());

        Product newProduct = new Product(id, ten, soluong, donvitinh, gianhap, giaban, soluongban);
        return newProduct;
    }

    public double laiSP(double gianhap, double giaban, int soluongban) {
        return (giaban-gianhap)*soluongban;
    }

    public Product[] addProduct(int size) {
        Product[] products = new Product[size];
        for (int i = 0; i < size; i++) {
            products[i] = createProduct();
        }
        return products;
    }

    public void show(Product[] products) {
        for (Product p : products) {
            System.out.println(p + ", lãi được " + laiSP(p.gianhap, p.giaban, p.soluongban));
        }
    }
}
