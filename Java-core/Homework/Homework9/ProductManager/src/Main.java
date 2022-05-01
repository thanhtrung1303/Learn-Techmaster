import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        ArrayList<Product> products = service.getAllProduct();
        Controller.mainMenu();
    }
}
