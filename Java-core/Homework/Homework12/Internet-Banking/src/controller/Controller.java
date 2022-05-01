package controller;

import exception.ValidateException;
import model.Account;
import model.TransactionHistory;
import service.AccountService;
import service.TransactionHistoryService;
import util.Menu;
import util.Util;
import util.Validate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Scanner sc;
    AccountService accountService;
    TransactionHistoryService transactionService;
    ArrayList<Account> accounts;
    ArrayList<TransactionHistory> transactionHistories;

    public Controller() {
        sc = new Scanner(System.in);
        accountService = new AccountService();
        transactionService = new TransactionHistoryService();
        accounts = accountService.getAllAccount();
        transactionHistories = transactionService.getAllTransactionHistory();
    }

    public void home(){
        Account account = login();

        boolean isContinue = true;
        while (isContinue){
            Menu.menu();
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    getBalance(account);
                    break;
                case 2:
                    transferHandling(account);
                    break;
                case 3:
                    getAllTransactionHistory(account);
                    break;
                case 0:
                    isContinue = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }

    }

    public Account login(){
        Account account = null;
        while (account == null){
            System.out.print("Nhập số điện thoại: ");
            String mobile = sc.nextLine();
            System.out.print("Nhập mật khẩu: ");
            String password = sc.nextLine();
            account = accountService.checkLogin(mobile, password, accounts);

            if(account == null){
                System.out.println("Sai số điện thoại hoặc password");
                System.out.println("Vui lòng đăng nhập lại");
            }
        }
        return account;
    }

    public void getBalance(Account account){
        String balance = Util.formatMoney(account.getBalance());
        System.out.println("Số dư: " + balance);
    }

    public void transferHandling(Account account){
        TransactionHistory newTransaction = createNewTransaction(account);
        transactionHistories.add(newTransaction);
        System.out.println("Thành công");
        System.out.println(newTransaction);
    }

    public TransactionHistory createNewTransaction(Account account){
        System.out.println("Lựa chọn ngân hàng muốn gửi tiền: ");
        String bank = sc.nextLine();

        System.out.println("Nhập số tài khoản: ");
        String bankAccount = inputBankAccount();

        System.out.println("Nhập số tiền cần chuyển: ");
        long money = inputMoney(account);
        sc.nextLine();

        System.out.println("Nhập nội dung: ");
        String content = sc.nextLine();

        account.setBalance(account.getBalance() - money);

        return new TransactionHistory(LocalDate.now(), account.getId(), content, bankAccount, money);
    }

    public void getAllTransactionHistory(Account account){
        for(TransactionHistory history: transactionHistories){
            if(history.getIdAccount().equals(account.getId())){
                System.out.println(history);
            }
        }
    }

    public String inputBankAccount(){
        String bankAccount = null;
        while (bankAccount == null){
            bankAccount = sc.nextLine();
            try {
                Validate.validateAccount(bankAccount);
            } catch (ValidateException e) {
                bankAccount = null;
                System.out.println("Số tài khoản không đúng, vui lòng nhập lại");
            }
        }
        return bankAccount;
    }

    public long inputMoney(Account account){
        long money = 0;
        while (money == 0){
            money = sc.nextLong();
            if(money < 50000){
                System.out.println("Số tiền cần chuyển phải từ 50.000 trở lên");
                money = 0;
            }else{
                if(account.getBalance()-50000 < money){
                    System.out.println("Số dư của bạn không đủ");
                    money = 0;
                }
            }
            if(money == 0){
                System.out.println("Vui lòng nhập lại");
            }
        }
        return money;
    }

}