package service;

import model.Account;

import java.util.ArrayList;

public class AccountService {

    public ArrayList<Account> getAllAccount(){
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(new Account("0123456789", "0123456789", 5000000));

        return accounts;
    }

    public Account checkLogin(String mobile, String password, ArrayList<Account> accounts){
        for (Account account: accounts){
            if(account.getMobile().equals(mobile)){
                if(account.getPassword().equals(password)){
                    return account;
                }
            }
        }
        return null;
    }

    public long getBalance(Account account){
        return account.getBalance();
    }

}