package src.Strings;

import java.util.*;
public class MinimumTimeDifference {
    public static int findMinDifference(List<String> timePoints) {
        List<Integer> minutes = new ArrayList<>();
        for (String time : timePoints) {
            String[] parts = time.split(":");
            int totalMinutes = Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
            minutes.add(totalMinutes);
        }
        Collections.sort(minutes);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < minutes.size(); i++) {
            minDiff = Math.min(minDiff, minutes.get(i) - minutes.get(i - 1));
        }
        int lastDiff = 1440 + minutes.get(0) - minutes.get(minutes.size() - 1);
        return Math.min(minDiff, lastDiff);
    }
    public static void main(String[] args) {
        List<String> timePoints = Arrays.asList("23:59", "00:00");
        System.out.println(findMinDifference(timePoints));
    }
}

