package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Câu 1: Viết chương trình vẽ hình tam giác và hình vuông ");
        System.out.println("Câu 2: Đếm và in ra vị trí của ký tự trong chuỗi");
        System.out.println("Câu 3: Viết chương trình sinh số ngẫu nhiên và kiểm tra có nguyên tố");
        System.out.println("Câu 4: Viết chương trình liệt kê 10 số nguyên tố đầu tiên");
        System.out.println("Câu 5: Chuẩn hóa chuỗi");
        System.out.println("Câu 6: Tạo mảng 2 chiều");
        System.out.println(" Nhập câu muốn xem: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Câu 1:Viết chương trình thực hiện ");
                System.out.println("In ra màn hình hình vuông");
                Draw.drawSquare();
                System.out.println("In ra màn hình hình tam giác");
                Draw.drawTriangle();
                break;
            case 2 :
                System.out.println("Câu 2: Cho chuỗi sau : You only live once, but if you do it right, once is enough");
                CountString.countstr();
                System.out.println("Đếm và in ra vị trí của ký tự o");
                CountString.countCharO();
                break;
            case 3 :
                System.out.println("Câu 3: Viết chương trình sinh ra số ngẫu nhiên, kiểm tra số đó có là số nguyên tố không.");
                RandomNumber.randomNum();
                break;
            case 4 :
                System.out.println("Câu 4: Viết phương trình thực hiện");
                System.out.println("Liệt kê 10 số nguyên tố đầu tiên");
                RandomNumber.printTenPrimeNumber();
                System.out.println("Liệt kê các số nguyên tố nhỏ hơn 10");
                RandomNumber.printTenMinPrimeNumber();
                break;
            case 5 :
                System.out.println("Câu 5:Viết chương trình thực hiện: ");
                Stringname.namestr();
                Stringname.check();
                break;
            case 6 :
                System.out.println("Câu 6: Tạo mảng 2 chiều với số dòng và cột nhập vào từ bàn phím");
                int[][] arr = TwoArray.inputArray();
                TwoArray.printArray(arr);
                TwoArray.findMainDiagonal(arr);
                break;
            default:
                System.out.println("Không tồn tại câu này");
                break;
        }
    }
}
