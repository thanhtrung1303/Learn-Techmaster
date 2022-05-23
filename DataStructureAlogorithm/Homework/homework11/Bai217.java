package Homework.homework11;

import java.util.HashSet;
import java.util.Set;

public class Bai217 {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet();

        for (int i : nums) {
            if (!set.add(i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 2 };
        System.out.println(containsDuplicate(nums1));

        int[] nums2 = { 1, 2, 3, 4 };
        System.out.println(containsDuplicate(nums2));

        int[] nums3 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        System.out.println(containsDuplicate(nums3));
    }
}
