package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution598;

public class Solution598Test extends JunitBase {

    @Test
    public void testMaxCount() {
        System.out.println("maxCount");
        Solution598 instance = new Solution598();

        int[][] ops = null;
        assertEquals(12, instance.maxCount(3, 4, ops));

        int[][] ops2 = new int[][]{{1,2}};
        assertEquals(2, instance.maxCount(3, 4, ops2));

        int[][] ops3 = new int[][]{{1,2},{3,2}};
        assertEquals(2, instance.maxCount(3, 3, ops3));

        int[][] ops4 = new int[][]{{2,2},{3,3}};
        assertEquals(4, instance.maxCount(3, 3, ops4));

        int[][] ops5 = new int[][]{{}};
        assertEquals(9, instance.maxCount(3, 3, ops5));
    }
}
