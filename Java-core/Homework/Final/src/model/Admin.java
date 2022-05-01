package model;
import util.Gender;

import java.time.LocalDate;

public class Admin extends User {
    public Admin(String id, String username, String password, String name, Gender gender, String phone, LocalDate birthday, String email) {
        super(id, username, password, name, gender, phone, birthday, email);
    }
}
