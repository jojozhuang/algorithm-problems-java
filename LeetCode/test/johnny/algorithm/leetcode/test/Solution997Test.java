package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.algorithm.leetcode.Solution997;

public class Solution997Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("findJudge");
        Solution997 instance = new Solution997();

        assertEquals(2, instance.findJudge(2, new int[][] {{1,2}}));
        assertEquals(3, instance.findJudge(3, new int[][] {{1,3},{2,3}}));
        assertEquals(-1, instance.findJudge(3, new int[][] {{1,3},{2,3},{3,1}}));
        assertEquals(-1, instance.findJudge(3, new int[][] {{1,2},{2,3}}));
        assertEquals(3, instance.findJudge(4, new int[][] {{1,3},{1,4},{2,3},{2,4},{4,3}}));

    }
}
