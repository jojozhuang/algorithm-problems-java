package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution684Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findRedundantConnection");
        Solution684 instance = new Solution684();

        assertArrayEquals(new int[] {2,3}, instance.findRedundantConnection(new int[][] {{1,2}, {1,3}, {2,3}}));
        assertArrayEquals(new int[] {1,4}, instance.findRedundantConnection(new int[][] {{1,2}, {2,3}, {3,4}, {1,4}, {1,5}}));
    }
}
