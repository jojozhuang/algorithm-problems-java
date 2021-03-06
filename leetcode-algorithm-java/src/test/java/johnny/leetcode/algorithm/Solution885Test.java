package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution885Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("spiralMatrixIII");
        Solution885 instance = new Solution885();

        int[][] expect1 = new int[][]{{0,0},{0,1},{0,2},{0,3}};
        assertArrayEquals(expect1, instance.spiralMatrixIII(1,4,0,0));
        
        int[][] expect2 = new int[][]{{1,4},{1,5},{2,5},{2,4},{2,3},{1,3},{0,3},{0,4},{0,5},{3,5},{3,4},{3,3},{3,2},{2,2},{1,2},{0,2},{4,5},{4,4},{4,3},{4,2},{4,1},{3,1},{2,1},{1,1},{0,1},{4,0},{3,0},{2,0},{1,0},{0,0}};
        assertArrayEquals(expect2, instance.spiralMatrixIII(5,6,1,4));
    }
}
