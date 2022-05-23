package Homework.homework3;

public class Bai1221 {

    public static int balancedStringSplit(String s) {
        int result = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            if (chr == 'L') {
                count++;
            } else if (chr == 'R') {
                count--;
            }
            if (count == 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s1 = "RLRRLLRLRL";
        System.out.println(balancedStringSplit(s1));

        String s2 = "RLLLLRRRLR";
        System.out.println(balancedStringSplit(s2));

        String s3 = "LLLLRRRR";
        System.out.println(balancedStringSplit(s3));

    }
}
