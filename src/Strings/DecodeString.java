package src.Strings;

import java.util.Stack;

public class DecodeString {
    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> resultStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');  // Convert multi-digit numbers
            } else if (ch == '[') {
                countStack.push(k);
                resultStack.push(currentString.toString());
                currentString = new StringBuilder();
                k = 0;
            } else if (ch == ']') {
                int repeatTimes = countStack.pop();
                StringBuilder temp = new StringBuilder(resultStack.pop());
                temp.append(currentString.toString().repeat(repeatTimes));
                currentString = temp;
            } else {
                currentString.append(ch);
            }
        }

        return currentString.toString();
    }

    public static void main(String[] args) {
        String input1 = "3[a]2[bc]";
        System.out.println("Decoded String: " + decodeString(input1)); // Output: "aaabcbc"

        String input2 = "3[a2[c]]";
        System.out.println("Decoded String: " + decodeString(input2)); // Output: "accaccacc"

        String input3 = "2[abc]3[cd]ef";
        System.out.println("Decoded String: " + decodeString(input3)); // Output: "abcabccdcdcdef"
    }
}

