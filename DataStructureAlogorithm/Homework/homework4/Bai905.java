package Homework.homework4;

import java.util.Arrays;
import java.util.Comparator;

public class Bai905 {
    public static int[] sortArrayByParity1(int[] nums) {
        Integer[] result = new Integer[nums.length];

        for (int i = 0; i < nums.length; i++)
            result[i] = nums[i];

        Arrays.sort(result, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1 % 2, o2 % 2);
            }
        });

        for (int i = 0; i < nums.length; i++)
            nums[i] = result[i];
        return nums;
    }

    public static int[] sortArrayByParity2(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] % 2 > nums[j] % 2) {
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
            } else if (nums[i] % 2 == 0) {
                i++;
            } else {
                j--;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 2, 4 };
        System.out.println(Arrays.toString(sortArrayByParity1(nums)));
        System.out.println(Arrays.toString(sortArrayByParity2(nums)));

    }
}
