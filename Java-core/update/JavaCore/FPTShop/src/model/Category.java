package model;

public enum Category {

       Telephone("Điện thoại"),Laptop("Laptop"), Apple("Apple"),Accessory("Phụ kiện");
        private final String value;

        Category(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value ;
        }

}
