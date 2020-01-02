package johnny.lintcode.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class KthSmallestNumberinSortedMatrixTest {
    
    public KthSmallestNumberinSortedMatrixTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

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
