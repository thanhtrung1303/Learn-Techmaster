import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CustomService customService = new CustomService();
        ArrayList<Custom> customs = customService.getAllCustom();

        Custom newcu = customService.searchById(customs, "KH1234567");
        int choi = sc.nextInt();
        switch (choi){
            case 1:
                customService.deleteCustom(newcu,customs);
                break;
            case 2:
                customService.createNewCustom(customs);
                break;
        }

    }
}
