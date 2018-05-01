package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution741;

public class Solution741Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("cherryPickup");
        Solution741 instance = new Solution741();

        int[][] grid1 = {
            {0, 1, -1},
            {1, 0, -1},
            {1, 1,  1}
        };
        assertEquals(5, instance.cherryPickup(grid1));
    }
}
