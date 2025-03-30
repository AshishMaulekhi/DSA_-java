package src.Strings;

import java.util.HashMap;

public class BullsAndCows {
    public static String getHint(String secret, String guess) {
        int bulls = 0, cows = 0;
        int[] secretCount = new int[10], guessCount = new int[10];

        for (int i = 0; i < secret.length(); i++) {
            char s = secret.charAt(i), g = guess.charAt(i);
            if (s == g) {
                bulls++;
            } else {
                secretCount[s - '0']++;
                guessCount[g - '0']++;
            }
        }

        for (int i = 0; i < 10; i++) {
            cows += Math.min(secretCount[i], guessCount[i]);
        }

        return bulls + "A" + cows + "B";
    }

    public static void main(String[] args) {
        System.out.println(getHint("1807", "7810")); // Output: "1A3B"
        System.out.println(getHint("1123", "0111")); // Output: "1A1B"
    }
}

