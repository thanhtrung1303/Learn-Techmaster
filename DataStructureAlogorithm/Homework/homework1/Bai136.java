package homework1;

public class Bai136 {
    public static void main(String[] args) {
        Bai136 test = new Bai136();
        int[] num = {1, 2, 4, 4, 3, 2, 1};
        int[] num1 = {1, 2, 3, 3, 6, 2, 1};
        System.out.println(test.singleNumber(num));
        System.out.println(test.singleNumber(num1));
    }

    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++){
                if(i != j && nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 0) {
                return nums[i];
            }
        }
        return 0;
    }
}
