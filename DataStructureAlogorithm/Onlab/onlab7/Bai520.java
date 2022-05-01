public class Bai520 {
    public static boolean detectCapitalUse(String word) {
        char[] a = word.toCharArray(); // Phương thức toCharArray() được sử dụng để chuyển đổi chuỗi thành các mảng ky tự. 
        // Nó trả về một mảng ký từ có độ dài tương đương độ dài của chuỗi.
        int count = 0;
        for (char c : a)
            if (c <= 'Z')
                count++;

        if (count == 1 && a[0] <= 'Z')
            return true;
        if (count == a.length || count == 0)
            return true;

        return false;
    }

    public static void main(String[] args) {
        String word1 = "USA";
        System.out.println(detectCapitalUse(word1));

        String word2 = "FlaG";
        System.out.println(detectCapitalUse(word2));
    }
}

