package model;

import util.util;
import util.Gender;
import java.time.LocalDate;

public class User {
    private String id;
    private String Username;
    private String password;
    private String name;
    private Gender gender;
    private String phone;
    private LocalDate birthday;
    private String email;

    public User(String id, String username, String password, String name, Gender gender, String phone, LocalDate birthday, String email) {
        this.id = id;
        this.Username = username;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.birthday = birthday;
        this.email = email;
    }

    public String getUsername() {
        return Username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Mã người dùng: " + id +
                ", Tài khoản: " + Username  +
                ", Mật khẩu: " + password +
                ", Tên khách hàng: " + name +
                ", Giới tính: " + gender.getValue() +
                ", Số điện thoại: " + phone +
                ", Ngày sinh: " + birthday +
                ", email: " + email;
    }
}
