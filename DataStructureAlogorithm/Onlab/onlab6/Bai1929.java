package Onlab.onlab6;

public class Bai1929 {
     public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] answers = new int[len*2];
        for(int i = 0; i < len; i++){
            answers[i] = nums[i];
            answers[i + len] = nums[i];
        }
        return answers;
    }
}
