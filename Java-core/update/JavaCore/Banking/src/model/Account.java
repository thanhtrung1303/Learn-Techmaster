package model;

public class Account {
    private String phoneNumber;
    private String password;
    private int balance;

    public Account(String phoneNumber, String password, int balance) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.balance = balance;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "model.Account{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
