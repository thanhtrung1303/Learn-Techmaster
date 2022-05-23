package Homework.homework5;

public class Bai002 {
    public static int total(int n) {
        if (n == 0)
            return 0;
        return n + total(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(total(5));
    }
}
