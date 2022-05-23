package Homework.homework1;

import java.util.Arrays;

public class Bai001 {
    public static void main(String[] args) {
        Bai001 test = new Bai001();
        int[] nums = {1, 2, 3, 4, 5};
        test.twoSum(nums, 5);
        System.out.println(Arrays.toString(test.twoSum(nums, 5)));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}


