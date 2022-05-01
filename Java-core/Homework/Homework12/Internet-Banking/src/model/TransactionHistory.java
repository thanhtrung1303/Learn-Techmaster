package model;

import util.Util;

import java.time.LocalDate;

public class TransactionHistory {
    private String id;
    private String idAccount;
    private LocalDate date;
    private String content;
    private String bankAccount;
    private long money;

    public TransactionHistory(LocalDate date, String idAccount, String content, String bankAccount, long money) {
        this.id = Util.randomId(5);
        this.date = date;
        this.content = content;
        this.bankAccount = bankAccount;
        this.money = money;
        this.idAccount = idAccount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(String idAccount) {
        this.idAccount = idAccount;
    }

    @Override
    public String toString() {
        return id + " - " + Util.formatDate(date) + " - " + content + " - " + bankAccount + " - " + Util.formatMoney(money) ;
    }
}