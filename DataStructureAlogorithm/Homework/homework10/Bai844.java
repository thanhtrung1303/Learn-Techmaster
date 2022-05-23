package Homework.homework10;

import java.util.Stack;

public class Bai844 {
    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> processedS = processed(S);
        Stack<Character> processedT = processed(T);
        return processedS.equals(processedT);
    }

    private static Stack<Character> processed(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '#') {
                st.push(str.charAt(i));
            } else if (!st.isEmpty()) {
                st.pop();
            }
        }
        return st;
    }

    public static void main(String[] args) {
        String S1 = "ab#c", T1 = "ad#c";
        System.out.println(backspaceCompare(S1, T1));

        String S2 = "a#c", T2 = "b";
        System.out.println(backspaceCompare(S2, T2));

    }
}
