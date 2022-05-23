package util;

import exception.MyException;

public class Validate {

    public static void validateID(String id, String keyWord) throws MyException {
        if ((!id.startsWith(keyWord) || (!id.substring(2).matches("[0-9]{3}")))) {
            throw new MyException("ID bắt đầu từ " + keyWord + ", tiếp theo là các số");
        }
    }

    public static void validateEmail(String email) throws MyException {
        if (!email.matches("^[a-z][a-z0-9_.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$")) {
            throw new MyException("Email phải chuẩn ");
        }
    }

    public static void validateClass(String Schoolclass, int keyWord) throws MyException {
        if ((!Schoolclass.startsWith(String.valueOf(keyWord)) || (!Schoolclass.substring(2).matches("[A-Z][0-9]{1,2}$")))) {
            throw new MyException("Tên lớp bắt đầu từ tên khối + khối thi + số thứ tự lớp");
        }
    }

    public static void validatePassword(String password) throws MyException {
        if (!password.matches("^(?=.*[A-Z])[A-Za-z0-9_;,.-]{7,15}$")) {
            throw new MyException("password dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa");
        }
    }
}
