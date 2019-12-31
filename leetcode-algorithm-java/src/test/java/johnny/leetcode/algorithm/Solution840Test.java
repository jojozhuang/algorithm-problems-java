package johnny.leetcode.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

import johnny.leetcode.algorithm.Solution840;

public class Solution840Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("numMagicSquaresInside");
        Solution840 instance = new Solution840();

        int[][] grid1 = new int[][] {{4,3,8,4},
                                     {9,5,1,9},
                                     {2,7,6,2}};
        assertEquals(1, instance.numMagicSquaresInside(grid1));
        
        int[][] grid2 = new int[][] {{10,3,5},
                                     {1,6,11},
                                     {7,9,2}};
        assertEquals(0, instance.numMagicSquaresInside(grid2));
    }
}
