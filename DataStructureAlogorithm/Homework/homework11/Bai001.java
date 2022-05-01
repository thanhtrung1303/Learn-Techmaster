package homework11;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Bai001 {

    public static int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        int temp1 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (set.contains(target - nums[i])) {
                temp1 = nums[i];
                break;
            } else {
                set.add(nums[i]);
            }
        }

        int temp2 = target - temp1;
        int result[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == temp2) {
                result[0] = i;
                break;
            }
        }

        for (int i = result[0] + 1; i < nums.length; i++) {
            if (nums[i] == temp1) {
                result[1] = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 0, 4, 0, 7, 6, 3 };
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
}
