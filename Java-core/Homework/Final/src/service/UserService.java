package service;


import model.User;
import util.Gender;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class UserService {
    public ArrayList<User> getAllUser(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("USER001","nova", "Nova123","Nova"
                , Gender.MALE, "0963865543"
                , LocalDate.of(1994,3,13), "nova@gmail.com"));
        return users;
    }

    public User checkloginUser(String usename, String password, ArrayList<User> users){
        for (User user : users){
            if (user.getUsername().equals(usename)){
                if (user.getPassword().equals(password)){
                    return user;
                }
            }
        }
        return null;
    }

    public User checkEmailUser(String email, ArrayList<User> users){
        for (User user : users){
            if (user.getEmail().equals(email)){
                    return user;
                }
            }
        return null;
    }

    public User searchByUsername(ArrayList<User> users, String searchUsername) {
        for (User user : users) {
            if (user.getUsername().equals(searchUsername)) {
                return user;
            }
        }
        return null;
    }
}
