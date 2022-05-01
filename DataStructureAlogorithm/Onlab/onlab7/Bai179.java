import java.util.Arrays;
import java.util.Comparator;

public class Bai179 {
    public String largestNumber(int[] nums) {
        String[] s = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            s[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(s, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder sb = new StringBuilder();
        for (String str : s) {
            sb.append(str);
        }
        String result = sb.toString();
        return result.startsWith("0") ? "0" : result;
    }

    // public String largestNumber1(int[] nums) {
    //     String[] s_num = new String[nums.length];

    //     for (int i = 0; i < nums.length; i++) {
    //         s_num[i] = String.valueOf(nums[i]);
    //     }

    //     Arrays.sort(s_num, new Comparator<String>() {

    //         @Override
    //         public int compare(String o1, String o2) {
    //             return (o1 + o2).compareTo(o2 + o1);
    //         }
    //     });

    //     StringBuilder sb = new StringBuilder();
    //     if (s_num[0].equals("0")) {
    //         return "0";
    //     }

    //     for (String s : s_num) {
    //         sb.append(s);
    //     }

    //     return sb.toString();
    // }
}
