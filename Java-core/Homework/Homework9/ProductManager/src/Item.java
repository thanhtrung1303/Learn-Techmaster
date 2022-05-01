public enum Item {
    ITEM1("Đồ gia dụng"),
    ITEM2("Thực phẩm"),
    ITEM3("Thời trang");

    String value;

    Item(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
