package com.company;

import java.util.Scanner;

public class AverageScore {
public static void Averages() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhập vào điểm thực hành của học viên: ");
    double a = sc.nextDouble();
    System.out.println("Nhập vào điểm lý thuyết của học viên: ");
    double b = sc.nextDouble();

    double average = (a + b)/2;
    String rs = average >= 6? "Đạt":"Trượt";
    System.out.printf("Điểm trung bình của học viên là %.1f, Kết quả %s", average, rs);
    }
}
