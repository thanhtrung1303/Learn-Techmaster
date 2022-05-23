package service;

import model.Transaction;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Service {

    public ArrayList<Transaction> getHistoryTrans() {

        return new ArrayList<>();
    }

    public String formatMoney(int money) {
        String pattern = "###,###,### VND";
        DecimalFormat myFormat = new DecimalFormat(pattern);
        return myFormat.format(money);
    }

    public void show(ArrayList<Transaction> list) {
        System.out.println("-----------------------------------------------------------------------------------------------");
        for (Transaction tran : list
        ) {
            System.out.println(tran);
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
    }
}
