import java.text.DecimalFormat;
public class Product implements Comparable<Product> {
    private int id;
    private String name;
    private long sellPrice;
    private int amount;
    private Item item;
    private long sellAmount;

    public Product(int id, String name, long sellPrice, int amount, Item item, long sellAmount) {
        this.id = id;
        this.name = name;
        this.sellPrice = sellPrice;
        this.amount = amount;
        this.item = item;
        this.sellAmount = sellAmount;
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

    public long getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(long sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public long getSellAmount() {
        return sellAmount;
    }

    public void setSellAmount(long sellAmount) {
        this.sellAmount = sellAmount;
    }

    @Override
    public String toString() {
        return "Mã sản phẩm: " + id +
                ", Tên sản phẩm: " + name  +
                ", Giá bán = " + formatMoney(sellPrice) +
                ", Số lượng = " + amount +
                ", Loại mặt hàng: " + item.getValue() +
                ", Số lượng bán = " + sellAmount;
    }

    public String formatMoney(long salary) {
        String pattern = "###,###,000";
        DecimalFormat myFormat = new DecimalFormat(pattern);
        return myFormat.format(salary);
    }

    @Override
    public int compareTo(Product o) {
        return (int) (this.sellPrice - o.sellPrice);
    }
}
