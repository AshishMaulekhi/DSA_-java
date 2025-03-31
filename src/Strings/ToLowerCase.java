package src.Strings;

public class ToLowerCase {
    public static String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append((char) (c + 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello")); // Output: "hello"
        System.out.println(toLowerCase("LOVELY")); // Output: "lovely"
    }
}
