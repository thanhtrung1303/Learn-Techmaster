package com.company;

import java.util.Random;
import java.util.Scanner;

public class Fizzbuzz {
    public static void fizzbuss() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.println("fizzbuzz");
                } else {
                    System.out.println("fizz");
                }
            } else {
                if (i % 5 == 0) {
                    System.out.println("buzz");
                }
                else {
                    System.out.println(i);
                }
            }
        }
    }
}
