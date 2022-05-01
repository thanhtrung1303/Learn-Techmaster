package com.company;

import java.util.Scanner;

public class TwoArray {
    public static int[][] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số dòng:");
        int row = sc.nextInt();
        System.out.println("Nhập số cột: ");
        int column = sc.nextInt();
        int[][] arr = new int[row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Nhập phần tử arr[%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void findMainDiagonal(int arr[][]){
            System.out.println("Đường chéo chính là: ");
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    if(i == j){
                        System.out.print(arr[i][j] + "\t");
                    }
                }
            }
        }
}
