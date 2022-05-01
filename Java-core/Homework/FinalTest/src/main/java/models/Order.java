package models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@NoArgsConstructor
@Getter
@Setter
public class Order extends UserDetail{
    private int id;
    private Date time;
    private ArrayList<CartItem> items;
    private long total;

    public Order(int userID, String phoneNum, String email, String address, String name, int id, Date time, ArrayList<CartItem> items, long total) {
        super(userID, phoneNum, email, address, name);
        this.id = id;
        this.time = time;
        this.items = items;
        this.total = total;
    }

    @Override
    public String toString() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return  "ID đơn hàng : "+id+", "+ super.toString() + ", Ngày mua : " +formatter.format(time)+ ", " +items+ ", tổng tiền: " +total;
    }
}