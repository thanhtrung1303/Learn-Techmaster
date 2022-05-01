package com.company;

import java.util.Scanner;

public class Scannerlab {
    public static void usingscanner() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên của bạn:");

        String name = sc.nextLine();

        System.out.println("Tên của tôi là: ");

        System.out.println("Nhập tuổi của bạn: ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("Nhập địa chỉ");
        String add = sc.nextLine();
        System.out.printf("Tên của tôi là %s, năm nay tôi %d, địa chỉ %s: ", name, age, add);

        double a =Math.random();

        System.out.println(a);
    }
}
