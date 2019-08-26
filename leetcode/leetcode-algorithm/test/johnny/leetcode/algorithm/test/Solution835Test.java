package johnny.leetcode.algorithm.test;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution835;

public class Solution835Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("isRectangleOverlap");
        Solution835 instance = new Solution835();

        int[][] A1 = {
            {1,1,0},
            {0,1,0},
            {0,1,0}
        };
        int[][] B1 = {
            {0,0,0},
            {0,1,1},
            {0,0,1}
        };
        assertEquals(3, instance.largestOverlap(A1, B1));
    }
}
