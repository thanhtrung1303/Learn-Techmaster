package model;

import enumm.ProductType;

public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private int cost;
    private int amount;
    private ProductType type;
    private int soldAmount;

    //    tạo constructor
    public Product(int id, String name, int cost, int amount, ProductType type, int soldAmount) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.amount = amount;
        this.type = type;
        this.soldAmount = soldAmount;
    }

    //    getter and setter begin
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public int getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(int soldAmount) {
        this.soldAmount = soldAmount;
    }

    // end setter and getter
    @Override
    public String toString() {
        return "model.Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", amount=" + amount +
                ", type=" + type.getText() +
                ", soldAmount=" + soldAmount +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return this.cost-o.getCost();
    }
}
