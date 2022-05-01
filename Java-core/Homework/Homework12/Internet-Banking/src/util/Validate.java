package util;

import exception.ValidateException;

public class Validate {
    static String VALIDATEACCOUNT = "\\d{8,16}";
    public static boolean validateAccount(String account) throws ValidateException {
        if(!account.matches(VALIDATEACCOUNT)) throw new ValidateException("Định dạng không hợp lệ");
        else return true;
    }
}