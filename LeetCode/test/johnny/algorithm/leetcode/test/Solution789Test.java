package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution789;

public class Solution789Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("escapeGhosts");
        Solution789 instance = new Solution789();

        assertEquals(true, instance.escapeGhosts(new int[][] {{1, 0}, {0, 3}}, new int[] {0, 1}));
        assertEquals(false, instance.escapeGhosts(new int[][] {{1, 0}}, new int[] {2, 0}));
        assertEquals(false, instance.escapeGhosts(new int[][] {{2,0}}, new int[] {1, 0}));
    }
}
