package model;

public enum Gender {
    MALE("Nam"), FEMALE("Nữ");

    private String value;

    Gender(String value) {
        this.value = value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
