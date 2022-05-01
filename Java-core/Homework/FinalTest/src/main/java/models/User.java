package models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@Setter

public class User extends UserDetail {
    private String passWord;
    private String role;

    public User(int userID, String phoneNum, String email, String address, String name, String passWord, String role) {
        super(userID, phoneNum, email, address, name);
        this.passWord = passWord;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Khách hàng ID = " + super.getUserID() + ": " + super.toString();
    }
}