package src.Strings;


import java.util.*;
public class RemoveDuplicateLetters {
    public static String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        boolean[] visited = new boolean[26];
        for (char c : s.toCharArray()) count[c - 'a']++;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            count[c - 'a']--;
            if (visited[c - 'a']) continue;
            while (!stack.isEmpty() && stack.peek() > c && count[stack.peek() - 'a'] > 0) {
                visited[stack.pop() - 'a'] = false;
            }
            stack.push(c);
            visited[c - 'a'] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);
        return sb.toString();
    }
    public static void main(String[] args) {
        String input = "cbacdcbc";
        System.out.println(removeDuplicateLetters(input));
    }
}

