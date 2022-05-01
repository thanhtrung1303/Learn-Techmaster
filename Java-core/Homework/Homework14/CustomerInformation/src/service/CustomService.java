package service;

import model.Custom;
import util.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomService {
    Scanner sc = new Scanner(System.in);

    public ArrayList<Custom> getAllCustom(){
        ArrayList<Custom> customs = new ArrayList<>();
        customs.add(new Custom("KH1234567", "Nguyễn văn A", LocalDate.of(1990,8,8),
                Gender.Male, "HN", "0963014454", "abc@gmail.com"));
        customs.add(new Custom("KH1234568", "Nguyễn Thị B", LocalDate.of(1991,4,8),
                Gender.Female, "HP", "0962014454", "abcd@gmail.com"));
        customs.add(new Custom("KH1234562", "Nguyễn văn C", LocalDate.of(1993,7,3),
                Gender.Male, "BN", "0963064454", "asc@gmail.com"));
        customs.add(new Custom("KH1254567", "Nguyễn văn D", LocalDate.of(1995,9,2),
                Gender.Male, "HN", "0963614454", "abnb@gmail.com"));
        customs.add(new Custom("KH1332537", "Nguyễn Thị X", LocalDate.of(1999,9,8),
                Gender.Female, "HN", "0963054454", "abv@gmail.com"));
        return customs;
    }

    public void show(ArrayList<Custom> customs){
        for(Custom custom : customs){
            System.out.println(custom);
        }
    }

    public void showByGender(ArrayList<Custom> customs){
        Scanner sc = new Scanner(System.in);
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                for (Custom custom : customs)
                    if(custom.getGender().equals(Gender.Female))
                        System.out.println(custom);
                break;
            case 2:
                for (Custom custom : customs)
                    if(custom.getGender().equals(Gender.Male))
                        System.out.println(custom);
                break;
        }
    }

}