package com.company;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Fizzbuzz.fizzbuss();
        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap vao can nang cua ban");
//        double weight = sc.nextDouble();
//        System.out.println("nhap vao chieu cao cua ban");
//        double height = sc.nextDouble();
//        double bmi =  bmical(weight,height);
//        if (bmi < 18.5) {
//            System.out.println("thieu can");
//        } else if (bmi >= 18.5 && bmi <= 24.9) {
//            System.out.println("can doi");
//        } else {
//            System.out.println("thua can");
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("nhap vao canh a");
//        int a = sc.nextInt();
//        System.out.println("nhap vao canh b");
//
//        int b = sc.nextInt();
//        System.out.println("nhap vao canh c");
//
//        int c = sc.nextInt();
//        if ((a+b) > c && (a+c) > b && (c+b) >a) {
//            System.out.println("hinh tam giac");
//        }

//        Scanner sc =new Scanner(System.in);
//        System.out.println("nhap so bat ky");
//        int num = sc.nextInt();
//        switch (num) {
//            case 2:
//                System.out.println("thu hai");
//                break;
//            case 3:
//                System.out.println("thu ba");
//                break;
//            case 4:
//                System.out.println("thu tu");
//                break;
//            case 5:
//                System.out.println("thu nam");
//                break;
//            case 6:
//                System.out.println("thu sau");
//                break;
//            default:
//                System.out.println("ko co");
//                break;
//        }
//        Scanner sc =new Scanner(System.in);
//        System.out.println("nhap so bat ky");
//        int month = sc.nextInt();

//        switch (month) {
//            case 1, 3, 5, 7, 8, 10, 12:
//                System.out.println("thang co 31 ngay");
//                break;
//            case 2:
//                System.out.println("thang co 28 ngay hoac 29 ngay");
//                break;
//            case 4, 6, 9, 11:
//                System.out.println("thang co 30 ngay");
//                break;
//            default:
//                System.out.println("ko co thang nao");
//                break;
////        }
//        for(int i =1; i<=10; i+=2) {
//            System.out.println("hello");
//        }
//    Random rd = new Random();
//    int rdNumber = 0;
//    int count =0;
//    while (rdNumber <=0) {
//        rdNumber = rd.nextInt();
//        System.out.println(rdNumber);
//        count ++;
//    }
//        System.out.println("so vong lap: " + count);
//        double height = 0;
//        double weight = 0;
//        do {
//            System.out.println("nhap chieu cao");
//            height = sc.nextDouble();
//        }
//        while (height < 0.1 || height > 2.5);
//        System.out.println(height);
//        do {
//            System.out.println("nhap can nang");
//            weight = sc.nextDouble();
//        }
//        while (weight < 0 || weight > 100);
//        System.out.println(weight);

//    public static double bmical(double weight, double height) {
//        return (weight / (height * height));
//
    boolean iscntinue =true;
    Random rd = new Random();
    int rdNumber = rd.nextInt(100);

    while (iscntinue) {
        System.out.println("doan so: ");
        int number = sc.nextInt();
        if (number == rdNumber) {
            System.out.println("bann doan dung roi");
            iscntinue =false;
        }
        else {
            if (number > rdNumber) {
                System.out.println("doan lon hon mat roi");
                System.out.println(" so dung la: " + rdNumber);
            }
            else {
                System.out.println("doan nho hon mat roi");
                System.out.println(" so dung la: " + rdNumber);
            }
        }
    }
    }
}

