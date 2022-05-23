package Onlab.onlab6;

import java.util.Arrays;

public class Bai2164 {
    public int[] sortEvenOdd(int[] nums) {
        int size = 0;
        if (nums.length % 2 == 0) {
            size = nums.length / 2;
        } else {
            size = (nums.length / 2) + 1;
        }
        int[] allodd = new int[nums.length / 2];
        int[] alleven = new int[size];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                alleven[even] = nums[i];
                even++;
            } else {
                allodd[odd] = nums[i];
                odd++;
            }
        }
        Arrays.sort(allodd);
        Arrays.sort(alleven);
        odd = allodd.length - 1;
        even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = alleven[even];
                even++;
            } else {
                nums[i] = allodd[odd];
                odd--;
            }
        }
        return nums;
    }
}
