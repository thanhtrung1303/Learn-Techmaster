public enum Type {
    TYPE1("Do gia dung"),TYPE2( "Thuc pham"),TYPE3("Thoi trang");

    String value;
    Type(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
