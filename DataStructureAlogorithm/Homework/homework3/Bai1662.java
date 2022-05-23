package Homework.homework3;

class Bai1662 {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String str1 = String.join("", word1);
        String str2 = String.join("", word2);
        if (str1.equals(str2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String[] word1 = { "ab", "c", };
        String[] word2 = { "a", "bc" };
        System.out.println(arrayStringsAreEqual(word1, word2));

        String[] word3 = { "a", "cb" };
        String[] word4 = { "ab", "c" };
        System.out.println(arrayStringsAreEqual(word3, word4));

        String[] word5 = { "abc", "d", "defg" };
        String[] word6 = { "abcddefg" };
        System.out.println(arrayStringsAreEqual(word5, word6));
    }
}