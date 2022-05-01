package service;

import model.Admin;
import model.User;
import util.Gender;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class AdminService {
    Scanner sc = new Scanner(System.in);

    public ArrayList<Admin> getAllAdmin(){
        ArrayList<Admin> admins = new ArrayList<>();
        admins.add(new Admin("ADMIN","admin", "123","Nguyễn Thành Trung",
                Gender.MALE,"0999999999",
                LocalDate.of(1994,3,13),"admin@gmail.com"));
        return admins;
    }

    public Admin checklogin(String usename, String password, ArrayList<Admin> admins){
        for (Admin admin : admins){
            if (admin.getUsername().equals(usename)){
                if (admin.getPassword().equals(password)){
                    return admin;
                }
            }
        }
        return null;
    }

    public Admin checkEmailAdmin(String email, ArrayList<Admin> admins){
        for (Admin admin : admins){
            if (admin.getEmail().equals(email)){
                return admin;
            }
        }
        return null;
    }

}
