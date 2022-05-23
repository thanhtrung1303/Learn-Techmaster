package Homework.homework2;

import java.util.Arrays;

class Bai027 {
    public static void main(String[] args) {
        int[] nums = { 0, 1, 2, 2, 3, 0, 4 };
        int val = 2;

        System.out.println(Arrays.toString(nums));
        int result = removeElement(nums, val);
        System.out.println(result);
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}