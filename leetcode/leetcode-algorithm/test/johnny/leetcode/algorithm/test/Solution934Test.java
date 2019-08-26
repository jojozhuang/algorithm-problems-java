package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution934;

public class Solution934Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("shortestBridge");
        Solution934 instance = new Solution934();

        assertEquals(1, instance.shortestBridge(new int[][]{{0,1},{1,0}}));
        assertEquals(2, instance.shortestBridge(new int[][]{{0,1,0},{0,0,0},{0,0,1}}));
        assertEquals(1, instance.shortestBridge(new int[][]{{1,1,1,1,1},{1,0,0,0,1},{1,0,1,0,1},{1,0,0,0,1},{1,1,1,1,1}}));
    }
}
