package model;

public enum Role {
    User("Người dùng "), Admin("Quản trị viên "),Teacher("Giáo viên ");
    private  String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
