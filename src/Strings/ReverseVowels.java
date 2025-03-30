package src.Strings;

import java.util.HashSet;

public class ReverseVowels {
    public static String reverseVowels(String s) {
        HashSet<Character> vowels = new HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray()) {
            vowels.add(c);
        }

        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;

        while (left < right) {
            while (left < right && !vowels.contains(chars[left])) left++;
            while (left < right && !vowels.contains(chars[right])) right--;

            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello")); // Output: "holle"
        System.out.println(reverseVowels("leetcode")); // Output: "leotcede"
    }
}

