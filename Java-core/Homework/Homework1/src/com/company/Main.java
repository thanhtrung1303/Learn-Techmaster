package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("a + b = " + Calculator.sum(30, 10));
        System.out.println("a - b = " + Calculator.difference(30, 10));
        System.out.println("a * b = " + Calculator.product(30, 10));
        System.out.println("a / b = " + Calculator.quotient(30, 10));

        double weight = 60;
        double height = 1.65;
        double bmi = bmical(weight, height);
        System.out.println("Ket qua bmi cua ban la: " + weight / (height * height));
        System.out.println("Ket qua bmi cua ban la: " + bmical(60, 1.65));
        System.out.printf("Ket qua bmi cua ban la %.2f", bmi);

    }
    public static double bmical(double weight, double height) {
        return (weight / (height*height));
}
//     Sử dụng phương thức có kiểu trả về là double và có truyền tham số là tốt nhất
