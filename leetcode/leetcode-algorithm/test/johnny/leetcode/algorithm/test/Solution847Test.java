package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution847;

public class Solution847Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("shortestPathLength");
        Solution847 instance = new Solution847();

        int[][] graph1 = new int[][]{{1,2,3},{0},{0},{0}};
        assertEquals(4, instance.shortestPathLength(graph1));

        int[][] graph2 = new int[][]{{1},{0,2,4},{1,3,4},{2},{1,2}};
        assertEquals(4, instance.shortestPathLength(graph2));
    }
}
