
public class Validate {
    public static void validateEmail(String email) throws MyException {
        String EMAIL_REGEX="^[a-z][a-z0-9_.]{5,32}@[a-z0-9]{2,}(\\.[a-z0-9]{2,4}){1,2}$";
        if (!email.matches(EMAIL_REGEX)) {
            throw new MyException("Email phải chuẩn ");
        }
    }
    public static void validatePassword(String password) throws MyException {
        if (!password.matches("^(?=.*[A-Z])[A-Za-z0-9_;,.-]{7,15}$")) {
            throw new MyException("password dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa");
        }
    }


    }