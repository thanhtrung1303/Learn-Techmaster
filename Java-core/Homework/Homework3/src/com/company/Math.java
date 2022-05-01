package com.company;

import java.util.Scanner;

public class Math {
    public static void equation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào giá trị của a: ");
        int a = sc.nextInt();
        System.out.println("Nhập vào giá trị của b: ");
        int b = sc.nextInt();
        double root;
        System.out.println("Giải phương trình sau: " + a + "x " + "+ " + b + " = " + 0);

        if (a == 0) {
            if (b == 0) {
                System.out.println("=> Phương trình có vô số nghiệm");
            }
            else {
                System.out.println("=> Phương trình vô nghiệm");
            }
        }
        else {
            root = (double) -b/a;
            System.out.println(" => Phương trình có nghiệm là: x = " + root );
        }
    }
}
