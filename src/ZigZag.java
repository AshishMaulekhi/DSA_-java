public class ZigZag {
    public static void main(String[] args) {
        java.lang.String s = "PAYPALISHIRING";
        int nrow = 3;
        String result = convert(s, nrow);
        System.out.println(result);
    }

    public static String convert(String s, int nRows) {
        if (s == null || s.length() <= nRows || nRows == 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nRows; i++) {
            int index = i;
            while (index < s.length()) {
                sb.append(s.charAt(index));

                int diagIndex = index + 2 * (nRows - i - 1);

                // Condition to ensure diagonal elements exist
                if (i > 0 && i < nRows - 1 && diagIndex < s.length()) {
                    sb.append(s.charAt(diagIndex));
                }

                index += 2 * (nRows - 1);
            }
        }

        return sb.toString();
    }
}
