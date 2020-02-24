package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1360Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("daysBetweenDates");
        SolutionA1360 instance = new SolutionA1360();
        assertEquals(1, instance.daysBetweenDates("2019-06-29", "2019-06-30"));
        assertEquals(15, instance.daysBetweenDates("2020-01-15", "2019-12-31"));
        assertEquals(4, instance.daysBetweenDates("1983-01-12", "1983-01-08"));
        assertEquals(33485, instance.daysBetweenDates("2074-09-12", "1983-01-08"));
        assertEquals(28, instance.daysBetweenDates("2074-02-01", "2074-03-01"));
    }
}
