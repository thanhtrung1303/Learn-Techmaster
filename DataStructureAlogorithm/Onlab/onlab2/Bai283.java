package Onlab.onlab2;

import java.util.Arrays;

public class Bai283 {
    public static void moveZeroes(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int t = nums[i];
                nums[i] = nums[k];
                nums[k] = t;
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 0, 0, 4, 5 };
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
