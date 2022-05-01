package com.company;

public class CountString {
    public static void countstr() {
        String s = "You only live once, but if you do it right, once is enough";
        String[] arr  = s.split("\s");
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
                count++;
            }
        System.out.println("Đếm số từ trong chuỗi: " + count);
        }

    public static void countCharO() {
        String s = "You only live once, but if you do it right, once is enough";
        char character = 'o';
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)== character) {
                System.out.println("in ra vị trí của o: " + i);
                count ++;
            }
        }
        System.out.println("Đếm ra các ký tự o xuất hiện: " + count);
    }
}
