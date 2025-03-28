package src.Strings;

public class MagicalString {
    public static int magicalString(int n) {
        if (n == 0) return 0;
        if (n <= 3) return 1; // "122" has only one '1' in first 3 chars

        // Initialize the sequence with the first three numbers
        StringBuilder magical = new StringBuilder("122");
        int countOnes = 1;  // Count of '1' in the sequence
        int index = 2;      // Points to the number that tells us how many times to append

        while (magical.length() < n) {
            int lastDigit = magical.charAt(magical.length() - 1) - '0';  // Get last digit
            int newDigit = (lastDigit == 1) ? 2 : 1;  // Toggle between 1 and 2
            int repeat = magical.charAt(index) - '0'; // How many times to add newDigit

            // Append the new number 'repeat' times
            for (int i = 0; i < repeat; i++) {
                magical.append(newDigit);
                if (newDigit == 1 && magical.length() <= n) {
                    countOnes++;  // Count '1's only within the first n characters
                }
            }

            index++; // Move to the next controlling number
        }

        return countOnes;
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Number of '1's in first " + n + " characters: " + magicalString(n));
        // Output: 3 (because "122112" has three '1's)
    }
}
