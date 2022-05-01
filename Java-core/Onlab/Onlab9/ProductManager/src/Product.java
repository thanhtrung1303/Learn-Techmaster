public class Product {
    private int id;
    private String name;
    private long sellprice;
    private int amount;
    private Type type;

    public Product(int id, String name, long sellprice, int amount, Type type) {
        this.id = id;
        this.name = name;
        this.sellprice = sellprice;
        this.amount = amount;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSellprice() {
        return sellprice;
    }

    public void setSellprice(long sellprice) {
        this.sellprice = sellprice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + sellprice + " - " + amount + " - " + type.getValue();
    }
}
