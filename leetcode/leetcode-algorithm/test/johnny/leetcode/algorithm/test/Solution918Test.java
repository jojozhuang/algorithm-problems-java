package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution918;

public class Solution918Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxSubarraySumCircular");
        Solution918 instance = new Solution918();

        assertEquals(3, instance.maxSubarraySumCircular(new int[] {1,-2,3,-2}));
        assertEquals(10, instance.maxSubarraySumCircular(new int[] {5,-3,5}));
        assertEquals(4, instance.maxSubarraySumCircular(new int[] {3,-1,2,-1}));
        assertEquals(3, instance.maxSubarraySumCircular(new int[] {3,-2,2,-3}));
        assertEquals(-1, instance.maxSubarraySumCircular(new int[] {-2,-3,-1}));
    }
}
