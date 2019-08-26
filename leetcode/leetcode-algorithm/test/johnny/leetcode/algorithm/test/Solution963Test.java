package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution963;

public class Solution963Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("leastOpsExpressTarget");
        Solution963 instance = new Solution963();

        assertEquals(2.00000, instance.minAreaFreeRect(new int[][] {{1,2},{2,1},{1,0},{0,1}}), 0.001);
        assertEquals(1.00000, instance.minAreaFreeRect(new int[][] {{0,1},{2,1},{1,1},{1,0},{2,0}}), 0.001);
        assertEquals(0.00000, instance.minAreaFreeRect(new int[][] {{0,3},{1,2},{3,1},{1,3},{2,1}}), 0.001);
        assertEquals(2.00000, instance.minAreaFreeRect(new int[][] {{3,1},{1,1},{0,1},{2,1},{3,3},{3,2},{0,2},{2,3}}), 0.001);
    }
}
