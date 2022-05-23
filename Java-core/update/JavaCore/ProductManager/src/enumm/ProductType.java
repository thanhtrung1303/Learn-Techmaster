package enumm;
public enum ProductType {
    HouseWare("HW","Đồ gia dụng"),
    Food("Food","Thực phẩm"),
    Fashion("Fashion","Thời trang");
    private String code;
    private String text;

     ProductType(String code, String text) {
        this.code = code;
        this.text = text;
    }

    public static ProductType getProductValueByCode(String typingCode){
        for (ProductType type:ProductType.values()
             ) {
            if((type.code.toLowerCase()).equals(typingCode.toLowerCase()))
            return type;
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
