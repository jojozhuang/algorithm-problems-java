package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution064Test extends JunitBase {

    @Test
    public void testMinPathSum() {
        System.out.println("minPathSum");
        Solution064 instance = new Solution064();

        assertEquals(0, instance.minPathSum(null));
        assertEquals(0, instance.minPathSum(new int[][]{}));
        assertEquals(0, instance.minPathSum(new int[][]{{}}));
        assertEquals(1, instance.minPathSum(new int[][]{{1}}));
        assertEquals(6, instance.minPathSum(new int[][]{{1,2,3}}));
        assertEquals(9, instance.minPathSum(new int[][]{{2},{3},{4}}));
        assertEquals(12, instance.minPathSum(new int[][]{{1,2,3},{4,5,6}}));
        assertEquals(7, instance.minPathSum(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
    }
}
