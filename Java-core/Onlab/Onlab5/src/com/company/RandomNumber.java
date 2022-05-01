package com.company;

import java.util.Random;

public class RandomNumber {
    static void randomNum(){
        Random rd = new Random();
        int num = rd.nextInt(1000);

        if(isPrimeNumber(num)){
            System.out.println(num + " là số nguyên tố") ;
        }else{
            System.out.println(num + " không là số nguyên tố");
        }
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    static void printTenPrimeNumber(){
        int tenNumber =10;
        int count = 0;
        for(int i = 0; count < tenNumber; i++){
            if (isPrimeNumber(i)){
                System.out.println(i);
                count++;
            }
        }
    }

    static void printTenMinPrimeNumber() {
        int tenNumber = 10;
        for (int i = 0; i < tenNumber; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }
}
