package com.company;

public class CountString {
    public static void countstr() {
        char character = 'o';
        int count = 0;
        String s = "You only live once, but if you do it right, once is enough";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == character) {
                System.out.println("Vị trị của ký tự " + character + " trong chuỗi: " + i);
                count++;
            }
        }
        System.out.println("Số ký tự " + character + " trong chuỗi " + s + " là: " + count);
    }
}
