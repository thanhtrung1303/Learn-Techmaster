public class Bai1295 {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            int sophantu = timsophantu(i);
            if (sophantu % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int timsophantu(int i) {
        int demsophantu = 0;
        int kq = i;
        while (kq != 0) {
            kq = i / 10;
            i = kq;
            demsophantu++;
        }
        return demsophantu;
    }

    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };

        System.out.println(findNumbers(nums));
    }
}
