package Onlab.onlab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Bai500 {
    // public String[] findWords(String[] words) {
    //     final Set<Character> row1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
    //     final Set<Character> row2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
    //     final Set<Character> row3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));
    //     final List<Set<Character>> setList = Arrays.asList(row1, row2, row3);
    //     List<String> wordList = new ArrayList<>();
    //     for (String word : words) {
    //         String lowerCaseWord = word.toLowerCase();
    //         boolean can = true;
    //         for (Set<Character> row : setList) {
    //             for (char c : lowerCaseWord.toCharArray()) {
    //                 if (!row.contains(c)) {
    //                     can = false;
    //                     break;
    //                 }
    //             }
    //             if (can) {
    //                 wordList.add(word);
    //                 break;
    //             }
    //             can = true;
    //         }
    //     }
    //     String[] result = new String[wordList.size()];
    //     for (int i = 0; i < wordList.size(); i++) {
    //         result[i] = wordList.get(i);
    //     }
    //     return result;
    // }

    public String[] findWords(String[] words) {
        Set<Character> row1 = new HashSet<Character>();
        Set<Character> row2 = new HashSet<Character>();
        Set<Character> row3 = new HashSet<Character>();
        String str1 = "qwertyuiop", str2 = "asdfghjkl", str3 = "zxcvbnm";
        for (char c : str1.toCharArray()) {
            row1.add(c);
        }
        for (char c : str2.toCharArray()) {
            row2.add(c);
        }
        for (char c : str3.toCharArray()) {
            row3.add(c);
        }
        List<String> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String wordsi = words[i].toLowerCase();
            char[] c = wordsi.toCharArray();
            List<Character> word = new ArrayList<>();
            for (char cc : c) {
                word.add(cc);
            }
            if (row1.containsAll(word) || row2.containsAll(word) || row3.containsAll(word)) {
                result.add(words[i]);
            }
        }
        String[] res = new String[result.size()];
        int ind = 0;
        for (String s : result) {
            res[ind] = s;
            ind++;
        }

        return res;
    }
}
