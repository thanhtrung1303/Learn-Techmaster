package Onlab.onlab7;

import java.util.ArrayList;
import java.util.List;

public class Bai1945 {
        public static int getLucky(String s, int k) {
            List<Integer> list = new ArrayList<>();
            for (char c : s.toCharArray()) {
                list.add(c - 'a' + 1);
            }
            int sum = 0;
            for (int i : list) {
                if (i >= 10) {
                    sum += i / 10;
                }
                sum += i % 10;
            }
            while (k-- > 1) {
                int newSum = 0;
                while (sum != 0) {
                    newSum += sum % 10;
                    sum /= 10;
                }
                sum = newSum;
            }
            return sum;
        }

    public static void main(String[] args) {
        String s = "iiii";
        int k = 1;
        System.out.println(getLucky(s, k));

        String s1 = "leetcode"; 
        int k1 = 2;
        System.out.println(getLucky(s1,k1));
    }
}
