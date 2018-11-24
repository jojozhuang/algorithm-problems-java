package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution908;

public class Solution908Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("smallestRangeI");
        Solution908 instance = new Solution908();

        assertEquals(0, instance.smallestRangeI(new int[] {1}, 0));
        assertEquals(6, instance.smallestRangeI(new int[] {0,10}, 2));
        assertEquals(0, instance.smallestRangeI(new int[] {1,3,6}, 3));
        assertEquals(3, instance.smallestRangeI(new int[] {2,7,2}, 1));
    }
}
