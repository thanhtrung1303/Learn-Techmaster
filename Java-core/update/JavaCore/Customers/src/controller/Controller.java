package controller;

import exception.MyExeption;
import util.*;
import service.CustomerService;
import model.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Controller {
    static CustomerService service = new CustomerService();
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Customer> list = service.getAllCustomers();

    public void menu() {
        boolean isContinue = true;
        while (isContinue) {
            Menu.mainMenu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> {
                    System.out.println("Danh sách: ");
                    service.show(list);
                }
                case 2 -> chooseGender();
                case 3 -> {
                    Customer c = createNewCustomer();
                    addNewCustomer(c, list);
                }
                case 4 -> serviceId();
                case 0 -> System.exit(0);
                default -> System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void serviceId() {
        System.out.println("Nhập ID sản phẩm bạn muốn tìm: ");
        String id = sc.nextLine();
        Customer customer = searchByID(list, id);
        Menu.subMenu();
        int choose = Integer.parseInt(sc.nextLine());
        switch (choose) {
            case 1 -> {
                System.out.println("Thay đổi thông tin khách hàng: ");
                updateCustomer(customer);
            }
            case 2 -> deleteCustomer(list, customer);
            case 0 -> menu();
        }
    }

    public void chooseGender() {
        Menu.genderMenu();
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> {
                countByGender(list);
                showByGender(list, Gender.MALE);

            }
            case 2 -> {
                countByGender(list);
                showByGender(list, Gender.FEMALE);

            }
        }
    }

    /*Tạo một khách hàng mới*/
    public Customer createNewCustomer() {
        System.out.print("Nhập id khách hàng: ");
        String id = inputID();
        System.out.print("Nhập tên khách hàng: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh(yyyy mm dd) ");
        LocalDate date = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Nhập giới tính: ");
        Gender gender = inputGender();
        sc.nextLine();
        System.out.print("Nhập quê quán: ");
        String address = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phone = inputPhone();
        System.out.print("Nhập email: ");
        String email = inputEmail();

        return new Customer(id, name, date, gender, address, phone, email);
    }

    /*Thêm vào danh sách khách hàng*/
    public void addNewCustomer(Customer customer, ArrayList<Customer> list) {
        list.add(customer);

    }

    /*Cài phương thức thêm ID*/
    public String inputID() {
        boolean check = true;
        String id = "KH#######";
        while (check) {
            id = sc.nextLine();

            try {
                Validate.ValidateID(id);
                if (!service.checkID(list, id)) {
                    System.out.println("ID đã tồn tại, về menu chính");
                    menu();
                }
                check = false;
            } catch (MyExeption e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng kiểm tra lại!!");
            }


        }
        return id;
    }

    /*Nhập giới tính*/
    public Gender inputGender() {
        boolean check = true;
        Gender gender = Gender.MALE;
        while (check) {
            System.out.println("1 - Nam");
            System.out.println("2 - Nữ");
            System.out.println("Lựa chọn của bạn là: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> check = false;
                case 2 -> {
                    gender = Gender.FEMALE;
                    check = false;
                }
            }
        }
        return gender;
    }

    /*Nhập số điện thoại*/
    public String inputPhone() {
        boolean check = true;
        String phone = "##########";
        while (check) {
            try {
                phone = sc.nextLine();
                Validate.ValidatePhoneNumber(phone);
                check = false;
            } catch (MyExeption e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng kiểm tra lại!!");
            }

        }
        return phone;
    }

    /*Nhập email*/
    public String inputEmail() {
        boolean check = true;
        String email = null;
        while (check) {
            try {
                email = sc.nextLine();
                Validate.ValidateEmail(email);
                check = false;
            } catch (MyExeption e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng kiểm tra lại!!");
            }

        }
        return email;
    }

    /*Đưa ra danh sách theo giới tính*/
    public void showByGender(ArrayList<Customer> list, Gender gender) {
        for (Customer c : list
        ) {
            if (c.getGender() == gender) {
                System.out.println(c);
            }
        }
    }

    /*Chỉnh sửa thông tin khách hàng (trừ ID)*/
    public void updateCustomer(Customer customer) {

        System.out.print("Nhập tên khách hàng: ");
        String name = sc.nextLine();
        System.out.print("Nhập ngày sinh(yyyy mm dd) ");
        LocalDate date = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Nhập giới tính: ");
        Gender gender = inputGender();
        sc.nextLine();
        System.out.print("Nhập quê quán: ");
        String address = sc.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phone = inputPhone();
        System.out.print("Nhập email: ");
        String email = inputEmail();

        customer = new Customer(customer.getId(), name, date, gender, address, phone, email);
        System.out.println("Thông tin sau khi cập nhật: ");
        System.out.println(customer);

    }

    /*Đếm số lượng khách hàng mỗi giới tính*/
    public void countByGender(ArrayList<Customer> customers) {
        Map<Gender, Integer> list = new HashMap<>();
        for (Customer c : customers
        ) {
            if (list.get(c.getGender()) == null) {
                list.put(c.getGender(), 1);
            } else {
                list.put(c.getGender(), list.get(c.getGender()) + 1);
            }
        }
        System.out.println(list);
    }

    /*Tìm theo ID*/
    public Customer searchByID(ArrayList<Customer> list, String searchID) {
        int count = 0;
        for (Customer c : list
        ) {
            if (c.getId().equals(searchID)) {
                System.out.println(c);
                count++;
                return c;
            }
        }
        if (count == 0) {
            System.out.println("Không có khách hàng này!!");
            menu();
        }
        return null;
    }

    /*Xoá khách hàng*/
    public void deleteCustomer(ArrayList<Customer> list, Customer customer) {
        list.remove(customer);
        System.out.println("Danh sach sau khi xoá: ");
        service.show(list);
    }
}
