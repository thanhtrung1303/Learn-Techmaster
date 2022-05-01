package homework5;

public class Bai001 {
    public static int search(int[] nums, int n, int x) {
        if (x >= nums.length) {
            return -1;
        }
        if (nums[x] == n) {
            return x;
        }
        return search(nums, n, x + 1);
    }

    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5, 6 };

        int result = search(nums, 2, 0);
        System.out.println(result);
    }

}
