package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution834Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("sumOfDistancesInTree");
        Solution834 instance = new Solution834();

        int[][] edges1 = new int[][]{{0,1},{0,2},{2,3},{2,4},{2,5}};
        int[] expect1 = new int[] {8,12,6,10,10,10};
        assertArrayEquals(expect1, instance.sumOfDistancesInTree(6, edges1));
    }
}
