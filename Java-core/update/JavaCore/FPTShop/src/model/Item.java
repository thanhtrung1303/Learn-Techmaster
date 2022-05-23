package model;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Item {
    private String id;
    private String name;
    private String description;
    private int cost;
    private int amount;
    private int soldAmount;
    private String brand;
    private Category[] category;

    public Item(String id, String name, String description, int cost, int amount, int soldAmount, String brand, Category[] category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.cost = cost;
        this.amount = amount;
        this.soldAmount = soldAmount;
        this.brand = brand;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public int getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(int soldAmount) {
        this.soldAmount = soldAmount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Category[] getCategory() {
        return category;
    }

    public void setCategory(Category[] category) {
        this.category = category;
    }

    public String formatMoney(int money){
        String pattern="###,###,### VND";
        DecimalFormat myFormat=new DecimalFormat(pattern);
        return myFormat.format(money);
    }
    @Override
    public String toString() {
        return id + "  -  " + name + "  -  " + description + "  -  " + formatMoney(cost) + "  -  " + amount + "  -  " + soldAmount + "  -  " + brand + "  -  " + Arrays.toString(category) ;
    }
}
