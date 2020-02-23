package johnny.leetcode.algorithm;

/**
 * @author Johnny
 */
public class SolutionA1209 {
    public int daysBetweenDates(String date1, String date2) {
        String[] arr1 = date1.split("-");
        int day1 = helper(Integer.parseInt(arr1[0]), Integer.parseInt(arr1[1]), Integer.parseInt(arr1[2]));
        String[] arr2 = date2.split("-");
        int day2 = helper(Integer.parseInt(arr2[0]), Integer.parseInt(arr2[1]), Integer.parseInt(arr2[2]));
        return Math.abs(day1-day2);
    }

    private int helper(int year, int month, int day) {
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int total = 0;
        for (int i = 1970; i < year; i++) {
            if (isLeap(i)) {
                total += 366;
            } else {
                total += 365;
            }
        }
        for (int i = 0; i < month - 1; i++) {
            if (i == 1 && isLeap(year)) {
                total += 29;
            } else {
                total += days[i];
            }
        }
        total += day;
        return total;
    }

    private boolean isLeap(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }
}
