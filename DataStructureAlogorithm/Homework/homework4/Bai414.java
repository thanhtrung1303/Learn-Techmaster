package Homework.homework4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Bai414 {
    public static int thirdMax(int[] nums) {
        Set<Integer> maxElements = new HashSet<>();
        for (int element : nums) {
            maxElements.add(element);
            if (maxElements.size() > 3)
                maxElements.remove(Collections.min(maxElements));
        }
        if (maxElements.size() == 3)
            return Collections.min(maxElements);
        return Collections.max(maxElements);
    }

    public static void main(String[] args) {
        int[] nums1 = { 3, 2, 1 };
        System.out.println(thirdMax(nums1));

        int[] nums2 = { 1, 2 };
        System.out.println(thirdMax(nums2));

        int[] nums3 = { 2, 4, 2, 5, 3, 1 };
        System.out.println(thirdMax(nums3));
    }
}
