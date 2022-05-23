package service;

import model.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class CustomerService {

    public ArrayList<Customer> getAllCustomers() {
        ArrayList<Customer> list = new ArrayList<>();

        list.add(new Customer("KH3574363", "Wash Amner", LocalDate.of(1998, 11, 6), Gender.MALE, "3725 Debs Center", "0773668335", "wamner0@umn.edu"));
        list.add(new Customer("KH7012913", "Nguyễn Văn Toàn", LocalDate.of(1995, 10, 6), Gender.MALE, "Hà Nội", "0316614985", "vantoan95@gmail.com"));
        list.add(new Customer("KH9416649", "Nguyễn Quốc Linh", LocalDate.of(1998, 1, 15), Gender.MALE, "Hà Giang", "0526666667", "quoclinh98@gmail.com"));
        list.add(new Customer("KH7096303", "Trần Thị Mỹ Linh", LocalDate.of(1995, 10, 6), Gender.FEMALE, "Hà Nội", "0316614985", "mylinh95@gmail.com"));
        list.add(new Customer("KH7012856", "Trần Thị Bích Thảo", LocalDate.of(2004, 3, 12), Gender.FEMALE, "Hà Tĩnh", "0356616986", "thaodepgai04@gmail.com"));
        list.add(new Customer("KH7057244", "Nguyễn Xuân Long", LocalDate.of(2000, 3, 10), Gender.MALE, "TP Hồ Chí Minh", "0896661419", "truongngu20@gmail.com"));
        list.add(new Customer("KH7969113", "Nguyễn Thị Hà Xuyên", LocalDate.of(2000, 10, 21), Gender.FEMALE, "Yên Bái", "0891144151", "xuyenchap20@gmail.com"));
        list.add(new Customer("KH7012545", "Trần Hoài Thơ", LocalDate.of(2002, 6, 19), Gender.FEMALE, "Hà Nội", "03199411615", "thocute202@gmail.com"));
        list.add(new Customer("KH7086840", "Văn Thị Thu Hằng", LocalDate.of(1990, 12, 3), Gender.FEMALE, "Vĩnh Phúc", "0325146215", "hangsociu9x@gmail.com"));
        list.add(new Customer("KH7001545", "Nguyễn Viết Bảo", LocalDate.of(1992, 11, 12), Gender.MALE, "Hải Dương", "0316614985", "nvbao@gmail.com"));
        list.add(new Customer("KH7001502", "Trần Khánh Chi", LocalDate.of(1997, 10, 10), Gender.FEMALE, "Lào Cai", "0316614985", "congchuabongbong@gmail.com"));
        list.add(new Customer("KH7986516", "Trịnh Cao Phương Diễm", LocalDate.of(2000, 3, 19), Gender.FEMALE, "TP Hồ Chí Minh", "0316618925", "mattihi@gmail.com"));
        list.add(new Customer("KH7896161", "Nguyễn Văn Chính", LocalDate.of(1998, 1, 2), Gender.MALE, "Hà Nội", "0366815469", "meo@gmail.com"));
        list.add(new Customer("KH9416615", "Lê Hồ Điệp", LocalDate.of(1980, 11, 9), Gender.FEMALE, "Hà Nội", "0891616136", "dark_knight@gmail.com"));
        list.add(new Customer("KH7098650", "Nguyễn Ngọc Ánh", LocalDate.of(1999, 9, 17), Gender.FEMALE, "Hà Nội", "0123456789", "ngocanh_ulis@.gmail.com"));

        return list;

    }

    public void show(ArrayList<Customer> list) {
        for (Customer c : list
        ) {
            System.out.println(c);
        }
    }

    public boolean checkID(ArrayList<Customer> list, String id) {
        for (Customer c : list
        ) {
            if (c.getId().equals(id)) {
                return false;
            }
        }
        return true;
    }


}
