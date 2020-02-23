package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SolutionA1213Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("daysBetweenDates");
        SolutionA1213 instance = new SolutionA1213();
        assertArrayEquals(new int[]{3,3}, instance.closestDivisors(8));
        assertArrayEquals(new int[]{5,25}, instance.closestDivisors(123));
        assertArrayEquals(new int[]{25,40}, instance.closestDivisors(999));
    }
}
