package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution685Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findRedundantDirectedConnection");
        Solution685 instance = new Solution685();

        assertArrayEquals(new int[] {2,3}, instance.findRedundantDirectedConnection(new int[][] {{1,2}, {1,3}, {2,3}}));
        assertArrayEquals(new int[] {4,1}, instance.findRedundantDirectedConnection(new int[][] {{1,2}, {2,3}, {3,4}, {4,1}, {1,5}}));
    }
}
