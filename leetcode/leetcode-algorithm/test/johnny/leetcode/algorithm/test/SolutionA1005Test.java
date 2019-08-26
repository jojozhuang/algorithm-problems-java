package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.SolutionA1005;

public class SolutionA1005Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("largestSumAfterKNegations");
        SolutionA1005 instance = new SolutionA1005();

        assertEquals(5, instance.largestSumAfterKNegations(new int[] {4,2,3}, 1));
        assertEquals(6, instance.largestSumAfterKNegations(new int[] {3,-1,0,2}, 3));
        assertEquals(13, instance.largestSumAfterKNegations(new int[] {2,-3,-1,5,-4}, 2));
        assertEquals(20, instance.largestSumAfterKNegations(new int[] {5,6,9,-3,3}, 2));

    }
}
