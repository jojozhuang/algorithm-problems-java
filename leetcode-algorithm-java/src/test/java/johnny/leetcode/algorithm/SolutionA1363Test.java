package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1363Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("largestMultipleOfThree");
        SolutionA1363 instance = new SolutionA1363();

        assertEquals("8760", instance.largestMultipleOfThree(new int[]{8,6,7,1,0}));
        assertEquals("", instance.largestMultipleOfThree(new int[]{5,8}));
        assertEquals("981", instance.largestMultipleOfThree(new int[]{8,1,9}));
        assertEquals("", instance.largestMultipleOfThree(new int[]{1}));
        assertEquals("0", instance.largestMultipleOfThree(new int[]{0,0,0,0,0,0}));
        assertEquals("111", instance.largestMultipleOfThree(new int[]{1,1,1,2}));
        assertEquals("966", instance.largestMultipleOfThree(new int[]{9,8,6,8,6}));
        assertEquals("3", instance.largestMultipleOfThree(new int[]{3,1,4}));
        assertEquals("6", instance.largestMultipleOfThree(new int[]{6,2,5}));
    }
}
