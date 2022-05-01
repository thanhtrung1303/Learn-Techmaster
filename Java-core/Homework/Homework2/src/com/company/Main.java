package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Câu 1: Viết chương trình nhập vào hai chuỗi bất kỳ");
        StringScanner();

        System.out.println("Câu 2: Viết chương trình nhập điểm của học viên");
        AverageScore.Averages();
    }
    public static void StringScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi thứ nhất: ");
        String str1 = sc.next();
        System.out.println("Nhập vào chuỗi thứ hai: ");
        String str2 = sc.next();

        String result = str1.equals(str2)? "Hai chuỗi bằng nhau": "Hai chuỗi khác nhau";
        System.out.println(result);

        String result1 = str1.length() == str2.length()? "Hai chuỗi có kích thước bằng nhau": "Hai chuỗi có kích thước khác nhau";
        System.out.println(result1);
    }
}
