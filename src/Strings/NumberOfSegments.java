package src.Strings;

public class NumberOfSegments {
    public static int countSegments(String s) {
        String[] segments = s.trim().split("\\s+");
        return s.trim().isEmpty() ? 0 : segments.length;
    }

    public static void main(String[] args) {
        System.out.println(countSegments("Hello, my name is John")); // Output: 5
        System.out.println(countSegments("")); // Output: 0
    }
}
