package com.company;

public class Main {

    public static void main(String[] args) {
        ProductService service = new ProductService();
        Product[] products = service.addProduct(1);
        service.show(products);
    }
}
