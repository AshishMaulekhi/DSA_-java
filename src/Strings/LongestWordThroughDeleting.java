package src.Strings;

import java.util.*;

public class LongestWordThroughDeleting {
    public static String findLongestWord(String s, List<String> dictionary) {
        String longest = "";
        for (String word : dictionary) {
            if (isSubsequence(word, s)) {
                if (word.length() > longest.length() || (word.length() == longest.length() && word.compareTo(longest) < 0)) {
                    longest = word;
                }
            }
        }
        return longest;
    }

    private static boolean isSubsequence(String word, String s) {
        int i = 0, j = 0;
        while (i < word.length() && j < s.length()) {
            if (word.charAt(i) == s.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == word.length();
    }

    public static void main(String[] args) {
        List<String> dictionary = Arrays.asList("ale", "apple", "monkey", "plea");
        System.out.println(findLongestWord("abpcplea", dictionary)); // Output: "apple"
    }
}
