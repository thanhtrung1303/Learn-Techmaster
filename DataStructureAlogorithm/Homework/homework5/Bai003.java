package Homework.homework5;

public class Bai003 {
    public static int total(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return a + total(a - 1, b);
        }
        return b + total(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(total(1, 5));
    }
}
