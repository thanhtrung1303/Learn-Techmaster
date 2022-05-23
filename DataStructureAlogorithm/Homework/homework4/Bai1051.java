package Homework.homework4;

import java.util.Arrays;

public class Bai1051 {
    public static int heightChecker(int[] heights) {
        int[] copy = heights.clone();
        Arrays.sort(copy);
        int count = 0;

        for (int i = 0; i < heights.length; i++) {
            if (copy[i] != heights[i]) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] heights = new int[] { 1, 1, 4, 2, 1, 3 };
        System.out.println(heightChecker(heights));
    }
}
