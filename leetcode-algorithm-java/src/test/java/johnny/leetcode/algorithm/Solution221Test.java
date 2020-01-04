package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution221Test extends JunitBase {

    @Test
    public void testMaximalSquare() {
        System.out.println("maximalSquare");
        Solution221 instance = new Solution221();

        assertEquals(0, instance.maximalSquare(null));

        char[][] matrix2 = new char[][] {
            {'1', '0', '1', '0', '0'},
            {'1', '0', '1', '1', '1'},
            {'1', '1', '1', '1', '1'},
            {'1', '0', '0', '1', '0'},
        };
        assertEquals(4, instance.maximalSquare(matrix2));

         char[][] matrix3 = new char[][] {
            {'1', '1', '1', '1'},
            {'1', '1', '1', '1'},
            {'1', '1', '1', '1'}
        };
        assertEquals(9, instance.maximalSquare(matrix3));
    }
}
