package com.company;

public enum Gender {
    MALE("nam"), FEMALE("nu");
    String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
