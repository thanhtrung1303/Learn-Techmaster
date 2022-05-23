package Homework.homework4;

public class Bai169 {
    public static int majorityElement(int[] nums) {
        int majority = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majority) {
                count++;
            } else {
                if (count == 0) {
                    majority = nums[i];
                    count = 1;
                }
                count--;
            }
        }
        return majority;
    }

    public static void main(String[] args) {
        int[] nums1 = { 3, 2, 3 };
        int[] nums2 = { 2, 2, 1, 1, 1, 2, 2 };
        System.out.println(majorityElement(nums1));
        System.out.println(majorityElement(nums2));
    }
}
