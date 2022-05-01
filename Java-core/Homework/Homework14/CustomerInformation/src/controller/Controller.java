package controller;

import model.Custom;
import service.CustomService;
import util.Menu;
import util.Gender;
import util.Validate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner sc;
    CustomService customService;
    ArrayList<Custom> customs;

    public Controller() {
        sc = new Scanner(System.in);
        customService = new CustomService();
        customs = customService.getAllCustom();
    }

    public void controller() {
        boolean iscontinue = true;
        while (iscontinue) {
            Menu.mainMenu();
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    customService.show(customs);
                    break;
                case 2:
                    Menu.subMenuGender();
                    customService.showByGender(customs);
                    break;
                case 3:
                    createNewCustom(customs);
                    break;
                case 4:
                    System.out.println("Nhập ID");
                    String id = sc.nextLine();
                    searchByid(customs, id);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }
        }
    }

    public void createNewCustom(ArrayList<Custom> customs) {
        String id = inputID();
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        LocalDate date = inputDate();
        Gender gender = inputGender();
        System.out.println("Nhập địa chỉ");
        String address = sc.nextLine();
        String phone = inputPhone();
        String email = inputEmail();

        customs.add(new Custom(id, name, date, gender, address, phone, email));
        System.out.println("Đăng ký thành công");
    }

    public String inputID() {
        boolean isvalidId = false;
        String id = null;
        while (!isvalidId) {
            System.out.println("Nhập ID");
            id = sc.nextLine();
            if (!Validate.validateId(id)) {
                System.out.println("ID không hợp lệ");
            } else {
                for (Custom custom : customs) {
                    if (custom.getId().equals(id)) {
                        System.out.println("ID đã tồn tại");
                    } else {
                        isvalidId = true;
                    }
                }
            }
        }
        return id;
    }

    public Gender inputGender() {
        Menu.subMenuGender();
        Gender gender = null;
        int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    gender = Gender.Female;
                    break;
                case 2:
                    gender = Gender.Male;
            }
        return gender;
    }

    public LocalDate inputDate() {
        System.out.println("Nhập ngày sinh: ");
        LocalDate date = LocalDate.parse(sc.nextLine());

        return date;
    }

    public String inputPhone() {
        boolean isvalidatePhone = false;
        String phone = null;
        while (!isvalidatePhone) {
            System.out.println("Nhập số điện thoại");
            phone = sc.nextLine();

            if (!Validate.validatePhone(phone)) {
                System.out.println("Số điện thoại không hợp lệ");
            } else {
                isvalidatePhone = true;
            }
        }
        return phone;
    }

    public String inputEmail() {
        boolean isValidEmail = false;
        String email = null;
        while (!isValidEmail) {
            System.out.println("Nhập email: ");
            email = sc.nextLine();
            if (!Validate.validateEmail(email)) {
                System.out.println("Email không hợp lệ");
            } else {
                for (Custom custom : customs) {
                    if (custom.getEmail().equals(email)) {
                        System.out.println("Email đã tồn tại");
                    } else {
                        isValidEmail = true;
                    }
                }
            }
        }
        return email;
    }

    public void searchByid(ArrayList<Custom> customs, String id) {
        boolean isContinue = true;
        while (isContinue) {
            for (Custom custom : customs) {
                if (custom.getId().equals(id)) {
                    System.out.println(custom);
                    Menu.subMenuUpdate();
                    int choice = Integer.parseInt(sc.nextLine());
                    switch (choice) {
                        case 1:
                            updateCustom(custom);
                            break;
                        case 2:
                            removeCustom(customs, custom);
                            break;
                    }
                }
            }
            System.out.println("Không tồn tại ID");
            isContinue = false;
        }
    }

    public void updateCustom(Custom custom) {
        boolean isCheck = true;
        while (isCheck) {
            Menu.subSubMenuUpdate();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    changeId(custom);
                    break;
                case 2:
                    changeName(custom);
                    break;
                case 3:
                    changeDate(custom);
                    break;
                case 4:
                    changeGender(custom);
                    break;
                case 5:
                    changeAddress(custom);
                    break;
                case 6:
                    changePhone(custom);
                    break;
                case 7:
                    changeEmail(custom);
                    break;
                case 0:
//                    System.exit(0);
                    isCheck = false;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void changeId(Custom custom) {
        custom.setId(inputID());
        System.out.println("Thông tin sau khi cập nhật");
        System.out.println(custom);
    }

    public void changeName(Custom custom) {
        custom.setName(sc.nextLine());
        System.out.println("Thông tin sau khi cập nhật");
        System.out.println(custom);
    }

    public void changeDate(Custom custom) {
        custom.setDate(inputDate());
        System.out.println("Thông tin sau khi cập nhật");
        System.out.println(custom);
    }

    public void changeGender(Custom custom) {
        custom.setGender(inputGender());
        System.out.println("Thông tin sau khi cập nhật");
        System.out.println(custom);
    }

    public void changeAddress(Custom custom) {
        custom.setAddress(sc.nextLine());
        System.out.println("Thông tin sau khi cập nhật");
        System.out.println(custom);
    }

    public void changePhone(Custom custom) {
        custom.setPhone(inputPhone());
        System.out.println("Thông tin sau khi cập nhật");
        System.out.println(custom);
    }

    public void changeEmail(Custom custom) {
        custom.setEmail(inputEmail());
        System.out.println("Thông tin sau khi cập nhật");
        System.out.println(custom);
    }

    public void removeCustom(ArrayList<Custom> customs, Custom custom){
        customs.remove(custom);
        System.out.println("Xóa thông tin khách hàng thành công");
    }

}
