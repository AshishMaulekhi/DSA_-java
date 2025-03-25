package src.Strings;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        int num1 = 58;
        System.out.println("Roman numeral of " + num1 + " is: " + intToRoman(num1)); // Output: LVIII

        int num2 = 1994;
        System.out.println("Roman numeral of " + num2 + " is: " + intToRoman(num2)); // Output: MCMXCIV
    }
}
