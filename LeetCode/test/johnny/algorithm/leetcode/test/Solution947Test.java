package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution947;

public class Solution947Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("removeStones");
        Solution947 instance = new Solution947();

        assertEquals(5, instance.removeStones(new int[][] {{0,0},{0,1},{1,0},{1,2},{2,1},{2,2}}));
        assertEquals(3, instance.removeStones(new int[][] {{0,0},{0,2},{1,1},{2,0},{2,2}}));
        assertEquals(0, instance.removeStones(new int[][] {{0,0}}));
    }
}
