package src.Arrays;


import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    static int maxActivities(int[] start, int[] finish) {
        int n = start.length;

        // Step 1: Create an array of activities (pairs of start & finish times)
        int[][] activities = new int[n][2];
        for (int i = 0; i < n; i++) {
            activities[i][0] = start[i];
            activities[i][1] = finish[i];
        }

        // Step 2: Sort activities by finish time
        Arrays.sort(activities, Comparator.comparingInt(a -> a[1]));

        // Step 3: Select the first activity
        int count = 1;
        int lastFinishTime = activities[0][1];

        // Step 4: Iterate through remaining activities
        for (int i = 1; i < n; i++) {
            if (activities[i][0] >= lastFinishTime) { // If start time >= last finish time
                count++;
                lastFinishTime = activities[i][1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9};

        System.out.println("Maximum activities: " + maxActivities(start, finish));
    }
}
