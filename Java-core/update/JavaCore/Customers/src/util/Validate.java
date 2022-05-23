package util;

import exception.MyExeption;

public class Validate {
    public static void ValidateID(String id) throws MyExeption {
        if (!id.startsWith("KH") || (!id.substring(2).matches("[0-9]{7}"))) {
            throw new MyExeption("ID gồm 9 kí tự, phải bắt đầu từ KH");
        }
    }

    public static void ValidatePhoneNumber(String phone) throws MyExeption {
        if (!phone.matches("[0-9]{10,11}")) {
            throw new MyExeption("Số điện thoại có 10 hoặc 11 số");
        }
    }

    public static void ValidateEmail(String email) throws MyExeption {
        if ((!email.matches("^[a-z][a-z0-9_.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$"))) {
            throw new MyExeption("Email phải chuẩn format email");
        }
    }

}
