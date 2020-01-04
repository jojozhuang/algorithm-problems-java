package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionA1014Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxScoreSightseeingPair");
        SolutionA1014 instance = new SolutionA1014();

        assertEquals(9, instance.maxScoreSightseeingPair(new int[] {3,7,2,3}));
        assertEquals(9, instance.maxScoreSightseeingPair(new int[] {3,2,7,3}));
        assertEquals(3, instance.maxScoreSightseeingPair(new int[] {1,2,2}));
        assertEquals(17, instance.maxScoreSightseeingPair(new int[] {7,8,8,10}));
        assertEquals(14, instance.maxScoreSightseeingPair(new int[] {7,2,6,6,9,4,3}));
    }
}
