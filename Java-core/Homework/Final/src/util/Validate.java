package util;

import exception.ValidateException;

public class Validate {
    static final String EMAIL_REGEX = "^(.+)@(\\S+)$";
    static final String PHONE_REGEX = "\\d{10,11}";
    static final String VALIDATE_ID = "(B)\\d{3}";
    static final String VALIDATE_IdUSER = "(USER)\\d{3}";

    static final String PASSWORD_REGEX = "(?=.*[a-z])(?=.*[A-Z])(?=.*[.,-_;]).{7,15}";

    public static boolean validateEmail(String email) throws ValidateException{
        if(!email.matches(EMAIL_REGEX)){
            throw new ValidateException("Email không hợp lệ");
        }else {
            return true;
        }
    }

    public static boolean validatePhone(String phone) throws ValidateException{
        if(!phone.matches(PHONE_REGEX)){
            throw new ValidateException("Số điện thoại không hợp lệ");
        }else {
            return true;
        }
    }

    public static boolean validateId(String id) throws ValidateException {
        if (!id.matches(VALIDATE_ID)){
            throw new ValidateException("Mã sách không hợp lệ");
        }else {
            return true;
        }
    }

    public static boolean validateIdUser(String idUser) throws ValidateException {
        if (!idUser.matches(VALIDATE_IdUSER)){
            throw new ValidateException("Mã khách hàng không hợp lệ");
        }else {
            return true;
        }
    }

    public static boolean validatePassword(String password) throws ValidateException {
        if (!password.matches(PASSWORD_REGEX)){
            throw new ValidateException("Mật khẩu không hợp lệ");
        }else {
            return true;
        }
    }
}