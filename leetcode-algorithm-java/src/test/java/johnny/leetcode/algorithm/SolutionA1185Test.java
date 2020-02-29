package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1185Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("dayOfTheWeek");
        SolutionA1185 instance = new SolutionA1185();

        assertEquals("Saturday", instance.dayOfTheWeek(31, 8, 2019));
        assertEquals("Sunday", instance.dayOfTheWeek(18, 7, 1999));
        assertEquals("Sunday", instance.dayOfTheWeek(15, 8, 1993));
        assertEquals("Thursday", instance.dayOfTheWeek(27, 2, 2020));
    }
}
