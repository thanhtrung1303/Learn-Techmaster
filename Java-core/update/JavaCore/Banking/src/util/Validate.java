package util;

import model.Account;
import service.Service;

public class Validate {

//    static Account user = new Account("01234567891", "motconvit123", 5000000);
    static  Service service=new Service();

    public static void validateMoneyTranfer(int money) throws MyExeption {

        if ((money < 50000) || (money > ( service.getMoney- 50000))) {
            throw new MyExeption("Nhập sai!! Giao dịch tối thiểu 50,000 VND ,tài khoản sau khi chuyển phải còn tối thiểu 50,000 VND");
        }
    }
    public static void validateAccountNumber(String accountNumber) throws MyExeption {
        if (!accountNumber.matches("[0-9]{8,16}")) {
            throw new MyExeption("Số tài khoản bạn nhập không đúng!! Số tài khoản là các số gồm từ 8-16 kí tự.");
        }
    }
}
