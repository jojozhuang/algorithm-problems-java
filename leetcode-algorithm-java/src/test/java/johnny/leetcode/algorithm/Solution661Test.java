package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class Solution661Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("imageSmoother");
        Solution661 instance = new Solution661();

        int[][] m1 = new int[][] {
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        int[][] result1 = new int[][] {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };
        assertArrayEquals(result1, instance.imageSmoother(m1));
    }
}
