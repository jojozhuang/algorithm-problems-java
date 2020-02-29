package johnny.leetcode.algorithm;

/**
 * 1185. Day of the Week
 *
 * Given a date, return the corresponding day of the week for that date.
 *
 * The input is given as three integers representing the day, month and year respectively.
 *
 * Return the answer as one of the following values {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.
 *
 * Example 1:
 * Input: day = 31, month = 8, year = 2019
 * Output: "Saturday"
 *
 * Example 2:
 * Input: day = 18, month = 7, year = 1999
 * Output: "Sunday"
 *
 * Example 3:
 * Input: day = 15, month = 8, year = 1993
 * Output: "Sunday"
 *
 * Constraints:
 *
 * The given dates are valid dates between the years 1971 and 2100.
 */
public class SolutionA1185 {
    public String dayOfTheWeek(int day, int month, int year) {
        String[] days = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
        int curr = daysFromStart(27, 2, 2020);
        int cnt = daysFromStart(day, month, year);
        return days[((cnt - curr) % 7 + 7) % 7];
    }

    private int daysFromStart(int day, int month, int year) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;
        for (int i = 1971; i < year; i++) {
            sum += 365;
            if (isLeapYear(i)) {
                sum++;
            }
        }
        for (int i = 1; i < month; i++) {
            sum += months[i - 1];
            if (i == 2 && isLeapYear(year)) {
                sum++;
            }
        }
        sum += day - 1;
        return sum;
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
