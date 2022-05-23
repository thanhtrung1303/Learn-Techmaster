package Onlab.onlab5;

public class DeQuy {

    public static int giaithua(int n) {
        if (n == 0)
            return 1;
        return n * giaithua(n - 1);
    }
    
    public static int luythua(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * luythua(a, n - 1);
    }
    public static void main(String[] args) {
        System.out.println(giaithua(3)); 
        System.out.println(luythua(5, 3)); 
    }
}
