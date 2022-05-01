package model;

import util.util;

public class Order {
    private String idOrder;
    private String id;
    private String title;
    private int quantity;
    private long price;
    private String name;
    private String phone;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(String idOrder) {
        this.idOrder = idOrder;
    }

    @Override
    public String toString() {
        return
                "Người nhận hàng: " + name +
                ", Số điện thoại: " + phone +
                ", Mã sản phẩm: " + id +
                ", Tên sản phẩm: " + title +
                ", Số lượng: " + quantity +
                ", Giá bán: " + util.formatMoney(price) +
                ", Tổng đơn hàng: " + util.formatMoney(sumPrice());
    }

    public long sumPrice(){
        return getPrice()*getQuantity();
    }
}
