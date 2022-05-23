package onlab14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bai884 {
    public static String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Integer> map = new HashMap<>();
        String[] result1 = s1.split(" ");
        String[] result2 = s2.split(" ");

        for (String word : result1) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (String word : result2) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        List<String> result = new ArrayList<>();
        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                result.add(key);
            }
        }
        String[] strs = new String[result.size()];
        result.toArray(strs);
        return strs;
    }

    public static void main(String[] args) {
        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";
        System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));

        String s3 = "apple apple";
        String s4 = "banana";
        System.out.println(Arrays.toString(uncommonFromSentences(s3, s4)));
        

    }
}
