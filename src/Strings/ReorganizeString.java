package src.Strings;

import java.util.*;

public class ReorganizeString {
    public static String reorganizeString(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;

        PriorityQueue<Character> pq = new PriorityQueue<>((a, b) -> freq[b - 'a'] - freq[a - 'a']);
        for (char c = 'a'; c <= 'z'; c++) if (freq[c - 'a'] > 0) pq.add(c);

        StringBuilder result = new StringBuilder();
        while (pq.size() > 1) {
            char first = pq.poll();
            char second = pq.poll();
            result.append(first).append(second);
            if (--freq[first - 'a'] > 0) pq.add(first);
            if (--freq[second - 'a'] > 0) pq.add(second);
        }
        if (!pq.isEmpty()) {
            char last = pq.poll();
            if (freq[last - 'a'] > 1) return "";
            result.append(last);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reorganizeString("aab")); // Output: "aba"
    }
}
