package src.Strings;

public class MonotonicArray {
    public static boolean isMonotonic(int[] nums) {
        boolean increasing = true, decreasing = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) decreasing = false;
            if (nums[i] < nums[i - 1]) increasing = false;
        }
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        System.out.println(isMonotonic(new int[]{1, 2, 2, 3})); // Output: true
    }
}
