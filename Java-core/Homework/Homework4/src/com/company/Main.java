package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("-Nhập thông tin cho các phần tử.");
	String [] arr = ArrayExercise.inputArray();
        System.out.println("\n-In thông tin ra màn hình.");
    ArrayExercise.printArray(arr);
        System.out.println("\n-Đếm số lần Java xuất hiện trong mảng.");
    ArrayExercise.javCount(arr);
        System.out.println("\n-Nhập vào từ bàn phím chuỗi bất kỳ, kiểm tra chuỗi đó ở vị trí nào của mảng.");
    ArrayExercise.locate(arr);
    }
}
