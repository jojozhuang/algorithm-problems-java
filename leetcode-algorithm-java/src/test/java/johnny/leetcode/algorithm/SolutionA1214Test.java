package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1214Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("daysBetweenDates");
        SolutionA1214 instance = new SolutionA1214();
        assertEquals("111", instance.largestMultipleOfThree(new int[]{1,1,1,2}));
        assertEquals("", instance.largestMultipleOfThree(new int[]{5,8}));
        assertEquals("981", instance.largestMultipleOfThree(new int[]{8,1,9}));
        assertEquals("8760", instance.largestMultipleOfThree(new int[]{8,6,7,1,0}));
        assertEquals("", instance.largestMultipleOfThree(new int[]{1}));
        assertEquals("0", instance.largestMultipleOfThree(new int[]{0,0,0,0,0,0}));
    }
}
