package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 *
 * @author Johnny
 */
public class MatrixZigzagTraversalTest extends JunitBase {

    /**
     * Test of printZMatrix method, of class MatrixZigzagTraversal.
     */
    @Test
    public void testPrintZMatrix() {
        System.out.println("printZMatrix");
        int[][] matrix = null;
        MatrixZigzagTraversal instance = new MatrixZigzagTraversal();
        int[] expResult = new int[]{};
        int[] result = instance.printZMatrix(matrix);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{1,2}, instance.printZMatrix(new int[][]{{1,2}}));
        assertArrayEquals(new int[]{1,2,3,4,5,6}, instance.printZMatrix(new int[][]{{1,2,3,4,5,6}}));
        assertArrayEquals(new int[]{1,2,3,4,5}, instance.printZMatrix(new int[][]{{1},{2},{3},{4},{5}}));
        
        int[][] matrix2 = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
        };
        assertArrayEquals(new int[]{1, 2, 5, 9, 6, 3, 4, 7, 10, 11, 8, 12}, instance.printZMatrix(matrix2));
    }
}
