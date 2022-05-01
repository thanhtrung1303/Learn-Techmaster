package com.company;

import java.util.Scanner;

public class ArrayExercise {
    public static String[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử mảng: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập phần tử arr[%d]: ", i);
            arr[i] = sc.next();
        }
        return arr;
    }

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void javCount(String[] arr) {
        String s = "Java";
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(s)) {
                count++;
            }
        }
        System.out.println("Số lần " + s + " xuất hiện trong mảng = " + count);
    }

    public static void locate(String[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi bất kỳ: ");
        String rs = sc.nextLine();

        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals(rs)) {
                System.out.println("Vị trí của " + rs + " trong mảng là: " + i);
            }
        }
    }
}
