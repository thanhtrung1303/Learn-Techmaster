package Homework.homework3;

class Bai387 {

    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    count++;
                    break;
                }
            }
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar1(String s) {
        for (int i = 0; i < s.length(); i++) {
            char chr = s.charAt(i);
            // so sánh vị trí đầu tiên xuất hiện của phần tử với vị trí xuất hiện cuối cùng của phần tử,
            // nếu trùng nhau thì phần tử chỉ xuát hiện 1 lần trong chuỗi và in ra vị trí của nó.
            if (s.indexOf(chr) == s.lastIndexOf(chr)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String s = "leetcode";
        System.out.println(firstUniqChar(s));

        String s2 = "loveleetcode";
        System.out.println(firstUniqChar1(s2));

        String s3 = "aabb";
        System.out.println(firstUniqChar(s3));
    }
}