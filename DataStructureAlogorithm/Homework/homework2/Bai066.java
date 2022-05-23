package Homework.homework2;

import java.util.Arrays;

public class Bai066 {
    public static int[] plusOne(int[] digits) {

        int index = digits.length - 1;
        for (int i = index; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }
        int[] newArray = new int[index + 2];
        newArray[0] = 1;
        return newArray;
    }

    public static void main(String[] args) {
        int[] digits = { 9, 9, 9 };
        int[] result = plusOne(digits);
        System.out.println(Arrays.toString(result));
    }
}
