package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution363Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("maxSumSubmatrix");
        Solution363 instance = new Solution363();

        int[][] matrix1 = new int[][] {
            {1,  0, 1},
            {0, -2, 3}
        };
        assertEquals(2, instance.maxSumSubmatrix(matrix1, 2));
    }
}
