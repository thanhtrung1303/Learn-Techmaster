package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class Product {
    private int id;
    private String name;
    private Type type;
    private String manufacturer;
    private int warrantyPeriod;
    private long price;
    private int stock;
    private String detail;

    @Override
    public String toString() {
        return
                "id : " + id +
                        ", Tên sản phẩm : " + name +
                        ", Loại sản phẩm : " + type +
                        ", Hãng sản xuất : " + manufacturer +
                        ", Bảo hành : " + warrantyPeriod +
                        ", Giá : " + price +
                        ", Số lượng hiện có : " + stock +
                        ", Thông số chi tiết : " + detail;
    }
}