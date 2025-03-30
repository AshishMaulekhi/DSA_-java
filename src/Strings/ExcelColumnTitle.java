package src.Strings;

public class ExcelColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--;
            result.append((char) ('A' + columnNumber % 26));
            columnNumber /= 26;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));   // Output: "A"
        System.out.println(convertToTitle(28));  // Output: "AB"
        System.out.println(convertToTitle(701)); // Output: "ZY"
    }
}

