package com.company;

public enum DVT {
    DVT1("gói"), DVT2 ("thùng"), DVT3 ("chiếc");

    String value;

    DVT(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
