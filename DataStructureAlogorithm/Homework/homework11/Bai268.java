package Homework.homework11;

import java.util.HashSet;
import java.util.Set;

public class Bai268 {
    public static int missingNumber(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = { 3, 0, 1 };
        System.out.println(missingNumber(nums1));

        int[] nums2 = { 0, 1 };
        System.out.println(missingNumber(nums2));

        int[] nums3 = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(missingNumber(nums3));

    }
}
