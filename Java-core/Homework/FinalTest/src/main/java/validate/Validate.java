package validate;

import java.util.regex.Pattern;

public class Validate {
    public boolean validatePhone(String phoneNum) {
        String accountNumberPattern = "^[0-9]{10,11}$";
        if (Pattern.matches(accountNumberPattern, phoneNum)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validateEmail(String email) {
        String emailPattern = "^[\\w]+@([a-z]+\\.[a-z]{3})$";
        if (Pattern.matches(emailPattern, email)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validatePassWord(String passWord){
        String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[.,_;-@])(?=\\S+$).{7,15}$";
        if (Pattern.matches(PASSWORD_PATTERN,passWord)){
            return true;
        }
        else {
            return false;
        }
    }
}