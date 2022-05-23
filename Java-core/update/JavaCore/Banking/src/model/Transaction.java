package model;

import service.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
    private int id;
    private LocalDateTime dateTime;
    private String tranferDescription;
    private String accountNumber;
    private int moneyTranfer;

    public Transaction(int id, LocalDateTime dateTime, String tranferDescription, String accountNumber, int moneyTranfer) {
        this.id = id;
        this.dateTime = dateTime;
        this.tranferDescription = tranferDescription;
        this.accountNumber = accountNumber;
        this.moneyTranfer = moneyTranfer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getTranferDescription() {
        return tranferDescription;
    }

    public void setTranferDescription(String tranferDescription) {
        this.tranferDescription = tranferDescription;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getMoneyTranfer() {
        return moneyTranfer;
    }

    public void setMoneyTranfer(int moneyTranfer) {
        this.moneyTranfer = moneyTranfer;
    }

    public String formatTime(LocalDateTime time){
        DateTimeFormatter myFormat=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return time.format(myFormat);
    }
    Service service=new Service();
    @Override
    public String toString() {
        return id +" - " + formatTime(dateTime) + " - "+ tranferDescription + " - " + accountNumber + " - " + service.formatMoney(moneyTranfer);
    }
}
