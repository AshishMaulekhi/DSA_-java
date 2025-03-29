package src.Strings;

public class MaxProductWordLengths {
    public static int maxProduct(String[] words) {
        int[] masks = new int[words.length];
        int maxProduct = 0;
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) masks[i] |= 1 << (c - 'a');
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((masks[i] & masks[j]) == 0) {
                    maxProduct = Math.max(maxProduct, words[i].length() * words[j].length());
                }
            }
        }
        return maxProduct;
    }
    public static void main(String[] args) {
        String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        System.out.println(maxProduct(words));
    }
}

