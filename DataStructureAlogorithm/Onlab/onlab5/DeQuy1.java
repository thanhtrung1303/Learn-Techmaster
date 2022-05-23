package Onlab.onlab5;

public class DeQuy1 {
    public static void P(int[] a, int index) {
        if (index == 0) {
            System.out.println(a[0]);
            return;
        }
        System.out.println(a[index]);
        P(a, index - 1);
    }

    public static void Q(int[] a, int index) {
        if (index == a.length - 1) {
            System.out.println(a[index]);
            return;
        }
        System.out.println(a[index]);
        Q(a, index + 1);
    }
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
        P(a, 7);
        Q(a, 0);
    }
}
