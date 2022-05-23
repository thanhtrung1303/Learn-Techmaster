package controller;

import service.Service;
import model.*;
import util.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    Scanner sc = new Scanner(System.in);
    Service service = new Service();
    static Account user = new Account("012345678910", "motconvit123", 5000000);
    public ArrayList<Transaction> historyTrans = service.getHistoryTrans();

    public void VPBankService() {
        login();
        loginSuccess();
    }

    public void loginSuccess() {
        boolean isContinue = true;
        while (isContinue) {
            Menu.mainMenu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1 -> checkBalance();
                case 2 -> transferMoney();
                case 3 -> {
                    ArrayList<Transaction> history = historyTrans;
                    service.show(history);
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Không có lựa chọn này");
            }
        }
    }

    public void login() {
        boolean isContinue = true;
        while (isContinue) {
            System.out.println("Mời bạn đăng nhập vào tài khoản EBanking của TPBank!!");
            System.out.println("Mời nhập số điện thoại: ");
            String phoneNumberInput = sc.nextLine();
            System.out.println("Mời nhập mật khẩu: ");
            String passwordInput = sc.nextLine();
            if (phoneNumberInput.equals(user.getPhoneNumber())) {
                if (passwordInput.equals(user.getPassword())) {

                    isContinue = false;
                }
            }
        }
    }

    /* Phương thức xem số dư tài khoản*/
    public void checkBalance() {
        System.out.println("Số dư tài khoản là: " + service.formatMoney(user.getBalance()));
    }

    /* Phương thức gửi tiền*/
    public void transferMoney() {
        String bank = choseBank();
        String accountNumber = getAccountNumber();
        int moneyTranfer = inputMoneyTranfer();
        System.out.println("Mời nhập mô tả");
        String note = sc.nextLine();
        System.out.println("Bạn sẽ gửi số tiền " + service.formatMoney(moneyTranfer) + " vào tài khoản ngân hàng " + bank + " có số tài khoản: " + accountNumber + " với mô tả: " + note);
        Menu.checkMenu();
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> {
                user.setBalance(user.getBalance() - moneyTranfer);
                System.out.println("Chuyển tiền thành công! Số dư tài khoản của bạn còn: " + service.formatMoney(user.getBalance()));
                LocalDateTime dateTime = LocalDateTime.now();
                int i = historyTrans.size();
                historyTrans.add(new Transaction((i + 1), dateTime, note, accountNumber, moneyTranfer));
            }
            case 2 -> loginSuccess();
            default -> {
            }
        }

    }

    /* Phương thức chọn ngân hàng để gửi*/
    public String choseBank() {
        String bank = "#";
        Menu.bankMenu();
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1 -> bank = "Techcombank";
            case 2 -> bank = "Vietcombank";
            case 3 -> bank = "TPBank";
            case 4 -> bank = "Agribank";
            case 5 -> bank = "MBBank";
            case 6 -> bank = "Sacombank";
            case 0 -> System.exit(0);
        }

        return bank;
    }

    /* Phương thức nhập STK ngân hàng*/
    public String getAccountNumber() {
        boolean check = true;
        String accountNumber = "#########";
        while (check) {
            try {
                System.out.println("Mời bạn nhập số tài khoản: ");
                accountNumber = sc.nextLine();
                Validate.validateAccountNumber(accountNumber);
                check = false;
            } catch (MyExeption e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng kiểm tra lại!!");
            } catch (NumberFormatException e) {
                System.out.println("Số tài khoản bạn nhập không đúng.Vui lòng kiểm tra lại!!");
            }

        }
        return accountNumber;
    }

    /* Phương thức nhập số tiền gửi*/
    public int inputMoneyTranfer() {
        boolean check = true;
        int number = 0;
        while (check) {
            try {
                System.out.println("Mời nhập số tiền bạn muốn chuyển: ");
                number = Integer.parseInt(sc.nextLine());
                Validate.validateMoneyTranfer(number);
                check = false;

            } catch (MyExeption e) {
                System.out.println(e.getMessage());
                System.out.println("Vui lòng nhập lại!!");
            } catch (NumberFormatException e) {
                System.out.println("Số tiền bạn nhập không đúng. Vui lòng nhập lại!!");
            }
        }
        return number;
    }

    public static int getMoney() {
        return user.getBalance();
    }

}
