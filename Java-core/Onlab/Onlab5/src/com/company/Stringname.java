package com.company;

import java.util.Scanner;

public class Stringname {
    public static void namestr() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên của bạn");
        String name = sc.nextLine();
        name = name.trim();
        name = name.replaceAll("\\s+", " ");
        String[] temp = name.split(" ");
        name ="";
        for (int i = 0; i < temp.length; i++) {
            name += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length-1) {
                name += " ";
            }
        }
        System.out.println("Sau khi chuẩn hóa: ");
        System.out.println(name);
    }
    public static void check() {
        String reverseString="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bạn muốn kiểm tra: ");
        String inputString = scanner.nextLine();
        int length = inputString.length();
        for (int i = length - 1 ; i >= 0 ; i-- )
            reverseString = reverseString + inputString.charAt(i);
        if (inputString.equals(reverseString))
            System.out.println("Đây là chuỗi đối xứng!");
        else
            System.out.println("Đây không phải là chuỗi đối xứng!");
    }
}
