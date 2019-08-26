package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution913;

public class Solution913Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("catMouseGame");
        Solution913 instance = new Solution913();

        assertEquals(0, instance.catMouseGame(new int[][]{{2,5},{3},{0,4,5},{1,4,5},{2,3},{0,2,3}}));
    }
}
