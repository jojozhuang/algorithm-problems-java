package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution851;

public class Solution851Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("loudAndRich");
        Solution851 instance = new Solution851();

        int[][] richer1 = new int[][]{{1,0},{2,1},{3,1},{3,7},{4,3},{5,3},{6,3}};
        int[] quiet1 = new int[] {3,2,5,4,6,1,7,0};
        assertArrayEquals(new int[] {5,5,2,5,4,5,6,7}, instance.loudAndRich(richer1, quiet1));
    }
}
