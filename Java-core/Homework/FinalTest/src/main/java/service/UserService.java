package service;

import controller.Controller;
import models.User;
import validate.Validate;

import java.util.ArrayList;
import java.util.Scanner;

public class UserService {
    static Scanner sc = new Scanner(System.in);
    static int userID = 1;

    //Tạo tài khoản
    public User createUser(){
        Validate validate = new Validate();
        System.out.print("Nhập số điện thoại : ");
        String phoneNum = sc.nextLine();
        while (!validate.validatePhone(phoneNum)){
            System.out.println("Số điện thoại phải có 10-11 chữ số, vui lòng thử lại : ");
            phoneNum = sc.nextLine();
        }
        for (User u : Controller.allUsers){
            while(true){
                int count = 0;
                if(u.getPhoneNum().equals(phoneNum)){
                    System.out.println("Số điện thoại đã được sử dụng");
                    System.out.print("Nhập lại số điện thoại : ");
                    phoneNum = sc.nextLine();
                }
                else count++;
                if(count>0) break;
            }
        }
        System.out.print("Nhập mật khẩu : ");
        String passWord = sc.nextLine();
        while (!validate.validatePassWord(passWord)){
            System.out.println("Mật khẩu phải có 7 đến 15 ký tự, trong đó có ít nhất 01 ký tự đặc biệt và 01 chữ in hoa");
            System.out.println("Nhập mật khẩu : ");
            passWord = sc.nextLine();
        }
        System.out.print("Nhập email : ");
        String email = sc.nextLine();
        while (!validate.validateEmail(email)){
            System.out.println("Email không đúng định dạng, mời nhập lại : ");
            email = sc.nextLine();
        }
        for (User u : Controller.allUsers){
            while(true){
                int count = 0;
                if(u.getEmail().equals(email)){
                    System.out.println("Số điện thoại đã được sử dụng");
                    System.out.print("Nhập lại số điện thoại : ");
                    email = sc.nextLine();
                }
                else count++;
                if(count>0) break;
            }
        }
        System.out.print("Nhập địa chỉ : ");
        String address = sc.nextLine();
        System.out.print("Nhập họ tên : ");
        String name = sc.nextLine();
        User newUser = new User(userID,phoneNum,email,address,name,passWord,"Khách hàng");
        userID++;
        return newUser;
    }


    public void forgetPassword(ArrayList<User> users){
        System.out.print("Nhập số điện thoại : ");
        String phoneNum = sc.nextLine();
        System.out.print("Nhập email đăng ký : ");
        String email = sc.nextLine();
        for (User u : users){
            if (u.getPhoneNum().equals(phoneNum)&&u.getEmail().contains(email)){
                System.out.println("Nhập mật khẩu mới : ");
                String newPassword = sc.nextLine();
                u.setPassWord(newPassword);
                System.out.println("Đổi mật khẩu thành công");
            }
            if (!u.getPhoneNum().equals(phoneNum)){
                System.out.println("Số điện thoại chưa được đăng ký, vui lòng thử lại : ");
            }
            if (u.getPhoneNum().equals(phoneNum)&&!u.getEmail().equals(email)){
                System.out.println("Email không chính xác, vui lòng thử lại : ");
            }
        }
        if (users.isEmpty()){
            System.out.println("Tài khoản không tồn tại");
        }
    }
}