package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution882;

public class Solution882Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("reachableNodes");
        Solution882 instance = new Solution882();

        int[][] edges1 = new int[][]{{0,1,10},{0,2,1},{1,2,2}};
        assertEquals(13, instance.reachableNodes(edges1,6,3));
        
        int[][] edges2 = new int[][]{{0,1,4},{1,2,6},{0,2,8},{1,3,1}};
        assertEquals(23, instance.reachableNodes(edges2,10,4));
    }
}
