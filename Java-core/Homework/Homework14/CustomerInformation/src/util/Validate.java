package util;

public class Validate {
    static final String EMAIL_REGEX = "^(.+)@(\\S+)$";
    static final String PHONE_REGEX = "\\d{10,11}";
    static final String VALIDATE_ID = "(KH)\\d{7}";

    public static boolean validateEmail(String email){
        if(email.matches(EMAIL_REGEX)){
            return true;
        }else {
            return false;
        }
    }

    public static boolean validatePhone(String password){
        if(password.matches(PHONE_REGEX)){
            return true;
        }else {
            return false;
        }
    }

    public static boolean validateId(String id){
        if (id.matches(VALIDATE_ID)){
            return true;
        }else {
            return false;
        }
    }
}
