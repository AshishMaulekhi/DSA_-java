package src.Strings;

public class FirstOccurrence {
    public static int strStr(String haystack, String needle) {
        int m = haystack.length(), n = needle.length();
        for (int i = 0; i <= m - n; i++) {
            if (haystack.substring(i, i + n).equals(needle)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));  // Output: 2
        System.out.println(strStr("aaaaa", "bba")); // Output: -1
        System.out.println(strStr("abc", "c"));     // Output: 2
    }
}
