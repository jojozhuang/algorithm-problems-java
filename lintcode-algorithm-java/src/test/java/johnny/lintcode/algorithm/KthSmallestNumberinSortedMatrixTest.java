package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class KthSmallestNumberinSortedMatrixTest extends JunitBase {

    /**
     * Test of kthSmallest method, of class KthSmallestNumberinSortedMatrix.
     */
    @Test
    public void testKthSmallest() {
        System.out.println("kthSmallest");
        int[][] matrix = null;
        int k = 0;
        KthSmallestNumberinSortedMatrix instance = new KthSmallestNumberinSortedMatrix();
        int expResult = Integer.MIN_VALUE;
        int result = instance.kthSmallest(matrix, k);
        assertEquals(expResult, result);
        
        int[][] matrix2 = new int[][] {
            {1 ,5 ,7},
            {3 ,7 ,8},
            {4 ,8 ,9}
        };
        assertEquals(5, instance.kthSmallest(matrix2, 4));
        assertEquals(1, instance.kthSmallest(matrix2, 1));
        assertEquals(9, instance.kthSmallest(matrix2, 9));
        assertEquals(8, instance.kthSmallest(matrix2, 7));
    }
}
