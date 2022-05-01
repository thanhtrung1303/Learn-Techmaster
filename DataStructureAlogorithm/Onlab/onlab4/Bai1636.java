import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Bai1636 {

    public static class MyNumber {
        public int value;
        public int freq;

        public MyNumber(int value, int freq) {
            this.value = value;
            this.freq = freq;
        }

        @Override
        public String toString() {
            return "{ " + this.value + " - " + this.freq + " }";
        }
    }

    public static int[] frequencySort(int[] a) {
        int[] kq = new int[a.length];
        // !
        int[] count = new int[201];
        for (int i = 0; i < a.length; i++) {
            count[a[i] + 100]++;
        }

        List<MyNumber> myList = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            // count[100] = 1
            // => 0 xuat hien 1 lan
            // count[102] = 2
            // => 2 xuat hien 2 lan
            if (count[i] != 0) {
                MyNumber x = new MyNumber(i, i);
                x.value = i - 100;
                x.freq = count[i];
                myList.add(x);
            }
        }

        Collections.sort(myList, new Comparator<MyNumber>() {

            @Override
            public int compare(MyNumber o1, MyNumber o2) {
                if (o1.freq == o2.freq) {
                    return Integer.compare(o1.value, o2.value);
                }
                return Integer.compare(o1.freq, o2.freq);
            }
        });
        return kq;
    }

    public static void main(String[] args) {
        int[] input = { 1, 1, 2, 2, 2, 3 };
        System.out.println(Arrays.toString(frequencySort(input)));
    }

}
