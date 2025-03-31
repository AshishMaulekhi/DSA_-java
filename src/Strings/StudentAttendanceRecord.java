package src.Strings;

public class StudentAttendanceRecord {
    public static boolean checkRecord(String s) {
        return s.chars().filter(c -> c == 'A').count() < 2 && !s.contains("LLL");
    }

    public static void main(String[] args) {
        System.out.println(checkRecord("PPALLP")); // Output: true
    }
}
