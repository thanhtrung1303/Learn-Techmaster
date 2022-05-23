package onlab14;

class Bai2185 {
    public static int prefixCount(String[] words, String pref) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith(pref)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = { "pay", "attention", "practice", "attend" };
        String pref = "at";
        System.out.println(prefixCount(words, pref));

        String[] words2 = { "leetcode", "win", "loops", "success" };
        String pref2 = "code";
        System.out.println(prefixCount(words2, pref2));

    }
}