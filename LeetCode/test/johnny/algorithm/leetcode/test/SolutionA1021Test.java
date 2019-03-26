package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.SolutionA1021;

public class SolutionA1021Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numPairsDivisibleBy60");
        SolutionA1021 instance = new SolutionA1021();

        assertEquals(9, instance.maxScoreSightseeingPair(new int[] {3,7,2,3}));
        assertEquals(9, instance.maxScoreSightseeingPair(new int[] {3,2,7,3}));
        assertEquals(3, instance.maxScoreSightseeingPair(new int[] {1,2,2}));
        assertEquals(17, instance.maxScoreSightseeingPair(new int[] {7,8,8,10}));
        assertEquals(14, instance.maxScoreSightseeingPair(new int[] {7,2,6,6,9,4,3}));
    }
}
