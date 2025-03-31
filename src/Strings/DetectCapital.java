package src.Strings;

public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]+");
    }

    public static void main(String[] args) {
        System.out.println(detectCapitalUse("USA")); // Output: true
    }
}
