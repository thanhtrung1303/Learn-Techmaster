package onlab14;

import java.util.HashMap;
import java.util.Map;

public class Bai2206 {
    public static boolean divideArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) % 2 != 0) {
                return false;
            }
        }
        return true;
    }

        public static void main(String[] args) {
            int[] nums1 = { 3, 2, 3, 2, 2, 2 };
            System.out.println(divideArray(nums1));

            int[] nums2 = { 1, 2, 3, 4 };
            System.out.println(divideArray(nums2));

        }
    }
