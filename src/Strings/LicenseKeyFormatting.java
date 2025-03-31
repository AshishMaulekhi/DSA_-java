package src.Strings;

public class LicenseKeyFormatting {
    public static String licenseKeyFormatting(String s, int k) {
        s = s.replaceAll("-", "").toUpperCase();
        StringBuilder sb = new StringBuilder(s);
        for (int i = sb.length() - k; i > 0; i -= k) {
            sb.insert(i, '-');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("5F3Z-2e-9-w", 4)); // Output: "5F3Z-2E9W"
    }
}

