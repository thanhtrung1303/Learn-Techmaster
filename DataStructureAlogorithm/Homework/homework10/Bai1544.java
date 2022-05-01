package homework10;

import java.util.Stack;

public class Bai1544 {
    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.add(c);
            } else {
                if (Character.toLowerCase(stack.peek()) == Character.toLowerCase(c)) {
                    if ((Character.isLowerCase(stack.peek()) && Character.isUpperCase(c))) {
                        stack.pop();
                    } else if (Character.isUpperCase(stack.peek()) && Character.isLowerCase(c)) {
                        stack.pop();
                    } else {
                        stack.add(c);
                    }
                } else {
                    stack.add(c);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s1 = "leEeetcode";
        System.out.println(makeGood(s1));

        String s2 = "abBAcC";
        System.out.println(makeGood(s2));

        String s3 = "s";
        System.out.println(makeGood(s3));
    }
}
