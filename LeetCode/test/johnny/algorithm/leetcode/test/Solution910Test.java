package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution910;

public class Solution910Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("smallestRangeII");
        Solution910 instance = new Solution910();

        assertEquals(0, instance.smallestRangeII(new int[] {1}, 0));
        assertEquals(6, instance.smallestRangeII(new int[] {0,10}, 2));
        assertEquals(3, instance.smallestRangeII(new int[] {1,3,6}, 3));
    }
}
