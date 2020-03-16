package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1383Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxPerformance");
        SolutionA1383 instance = new SolutionA1383();

        assertEquals(60, instance.maxPerformance(6, new int[]{2,10,3,1,5,8}, new int[]{5,4,3,9,7,2}, 2));
        assertEquals(68, instance.maxPerformance(6, new int[]{2,10,3,1,5,8}, new int[]{5,4,3,9,7,2}, 3));
        assertEquals(72, instance.maxPerformance(6, new int[]{2,10,3,1,5,8}, new int[]{5,4,3,9,7,2}, 4));

    }
}
