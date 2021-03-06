package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution085Test extends JunitBase {

    @Test
    public void testMaximalRectangle() {
        System.out.println("maximalRectangle");
        Solution085 instance = new Solution085();

        assertEquals(0, instance.maximalRectangle(null));

        char[][] matrix2 = new char[][] {
            {'0','0','1','0'},
            {'0','0','0','1'},
            {'0','1','1','1'},
            {'0','0','1','1'}
        };
        assertEquals(4, instance.maximalRectangle(matrix2));

        char[][] matrix3 = new char[][] {
            {'0','0','0'},
            {'0','0','0'},
            {'0','0','0'},
            {'0','0','0'}
        };
        assertEquals(0, instance.maximalRectangle(matrix3));
    }
}
