package onlab14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bai1122 {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        // put elemts into the map for counting
        for (int n : arr2) {
            map.put(n, 0);
        }
        for (int n : arr1) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                list.add(n);
            }
        }
        int[] result = new int[arr1.length];
        int index = 0;
        // combine them together
        for (int n : arr2) {
            for (int i = 0; i < map.get(n); i++) {
                result[index++] = n;
            }
        }
        // sort the rest of elements. using mergeSort built-in in Collections tool.
        Collections.sort(list, (o1, o2) -> o1.compareTo(o2));
        for (int n : list) {
            result[index++] = n;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19 }, arr2 = { 2, 1, 4, 3, 9, 6 };
        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));

        int[] arr3 = { 28, 6, 22, 8, 44, 17 }, arr4 = { 22, 28, 8, 6 };
        System.out.println(Arrays.toString(relativeSortArray(arr3, arr4)));
  
    }
}
