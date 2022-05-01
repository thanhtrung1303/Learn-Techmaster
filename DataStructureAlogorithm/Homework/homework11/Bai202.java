package homework11;

import java.util.HashSet;
import java.util.Set;

public class Bai202 {
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet();
        set.add(n);
        int result = 0;
        while (n != 1) {
            result = getResult(n);
            if (set.contains(result)) {
                return false;
            }
            set.add(result);
            n = result;
        }
        return true;
    }

    private static Integer getResult(int num) {
        int result = 0;
        while (num != 0) {
            result += (num % 10) * (num % 10);
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));

        System.out.println(isHappy(2));
        
        System.out.println(isHappy(1));
    }
}
