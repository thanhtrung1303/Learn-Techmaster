package controller;

import model.*;
import service.ItemService;
import util.Menu;

import java.util.ArrayList;
import java.util.Scanner;


public class Controller {
    static Scanner sc = new Scanner(System.in);
    static ItemService service = new ItemService();
    static ArrayList<Item> list = service.getAllItems();

    public static void mainMenu() {
        boolean isContinue = true;
        while (isContinue) {
            Menu.menu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> showItemByCategory();
                case 2 -> service.showByBrand(list);
                case 3 -> showItemByCost();
                case 4 -> {
                    System.out.println("Mời bạn nhập từ khoá bạn muốn tìm kiếm!");
                    String searchText = sc.nextLine();
                    service.searchByName(list, searchText);
                }
                case 5 -> service.countByCategory(list);
                case 0 -> System.exit(0);
                default -> System.out.println("Không có lựa chọn này");
            }
        }
    }

    public static void showItemByCategory(){
        Menu.categoryMenu();
        int choose=Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1 -> service.showByCategory(list, "Điện thoại");
            case 2 -> service.showByCategory(list, "Laptop");
            case 3 -> service.showByCategory(list, "Apple");
            case 4 -> service.showByCategory(list, "Phụ kiện");
            case 0 -> mainMenu();
        }
    }
    public static void showItemByCost(){
        Menu.costMenu();
        int choice=Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> {
                System.out.println("Dưới 2 triệu: ");
                service.showByCost(list, 0, 2000000);
            }
            case 2 -> {
                System.out.println("Từ 2-4 triệu: ");
                service.showByCost(list, 2000000, 4000000);
            }
            case 3 -> {
                System.out.println("Từ 4-7 triệu: ");
                service.showByCost(list, 4000000, 7000000);
            }
            case 4 -> {
                System.out.println("Từ 7-13 triệu: ");
                service.showByCost(list, 7000000, 13000000);
            }
            case 5 -> {
                System.out.println("Trên 13 triệu:");
                service.showByCost(list, 13000000, 1000000000);
            }
            case 0 -> mainMenu();
        }
    }
}
