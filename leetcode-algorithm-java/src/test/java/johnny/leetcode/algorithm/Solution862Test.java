package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution862;

public class Solution862Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("shortestSubarray");
        Solution862 instance = new Solution862();

        assertEquals(1, instance.shortestSubarray(new int[] {1}, 1));
        assertEquals(-1, instance.shortestSubarray(new int[] {1,2}, 4));
        assertEquals(3, instance.shortestSubarray(new int[] {2,-1,2}, 3));
    }
}
