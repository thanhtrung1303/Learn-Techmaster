package onlab14;

import java.util.List;

public class Bai1773 {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int match = 0;
        for (List<String> item : items) {
            if (ruleKey.equals("type") && item.get(0).equals(ruleValue)) {
                match++;
            } else if (ruleKey.equals("color") && item.get(1).equals(ruleValue)) {
                match++;
            } else if (ruleKey.equals("name") && item.get(2).equals(ruleValue)) {
                match++;
            }
        }
        return match;
    }

    public static void main(String[] args) {
        // List<List<String>> items = ({ "phone", "blue", "pixel" }, { "computer", "silver", "lenovo" }, { "phone", "gold", "iphone" });

        String ruleKey = "color", ruleValue = "silver";

        // System.out.println(countMatches(items, ruleKey, ruleValue));
    }

}
