package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItem {
    private int id;
    private int userId;
    private int productId;
    private String name;
    private long price;
    private int quantity;

    public CartItem(int id, int userId, int productId, String name, long price, int quantity) {
        this.id = id;
        this.userId = userId;
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return   "id : "+ id+
                " Tên sản phẩm : " + name +
                ", Giá : " + price +
                ", Số lượng : " + quantity;
    }
}