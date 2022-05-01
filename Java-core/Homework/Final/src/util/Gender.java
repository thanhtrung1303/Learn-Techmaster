package util;

public enum Gender {
    MALE("Nam"), FEMALE("Nữ");

    String value;

    Gender(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
