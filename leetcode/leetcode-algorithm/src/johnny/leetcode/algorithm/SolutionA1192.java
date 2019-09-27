package johnny.leetcode.algorithm;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Johnny
 */
public class SolutionA1192 {
    public String dayOfTheWeek(int day, int month, int year) {

        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        Calendar c = Calendar.getInstance();
        c.set(year, month - 1, day, 0, 0);
        return sdf.format(c.getTime());
    }
}
