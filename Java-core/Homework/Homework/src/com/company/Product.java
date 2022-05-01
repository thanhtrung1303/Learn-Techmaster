package com.company;

public class Product {
    public int id;
    public String ten;
    public int soluong;
    public DVT donvitinh;
    public double gianhap;
    public double giaban;
    public int soluongban;

    public Product(int id, String ten, int soluong, DVT donvitinh, double gianhap, double giaban, int soluongban) {
        this.id = id;
        this.ten = ten;
        this.soluong = soluong;
        this.donvitinh = donvitinh;
        this.gianhap = gianhap;
        this.giaban = giaban;
        this.soluongban = soluongban;
    }

    @Override
    public String toString() {
        return "ID = " + id +
                ", Tên sản phẩm: " + ten  +
                ", Số lượng = " + soluong +
                ", Đơn vị tính = " + donvitinh.getValue() +
                ", Giá nhập = " + gianhap +
                ", Giá bán = " + giaban +
                ", Số lượng bán = " + soluongban
                ;
    }
}
