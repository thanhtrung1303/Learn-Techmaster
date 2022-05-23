package Onlab.onlab6;

import java.util.Arrays;

public class Bai2154 {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == original) {
                original *= 2;
            }
        }
        return original;
    }
}
