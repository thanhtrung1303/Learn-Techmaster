package model;

public enum Subject {
    Math("Toán"),Literature("Ngữ Văn"), English("Tiếng Anh");
    private String value;

    Subject(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
