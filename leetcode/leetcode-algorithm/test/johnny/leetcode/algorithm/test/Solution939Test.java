package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution939;

public class Solution939Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minAreaRect");
        Solution939 instance = new Solution939();

        assertEquals(4, instance.minAreaRect(new int[][] {{1,1},{1,3},{3,1},{3,3},{2,2}}));
        assertEquals(2, instance.minAreaRect(new int[][] {{1,1},{1,3},{3,1},{3,3},{4,1},{4,3}}));
    }
}
