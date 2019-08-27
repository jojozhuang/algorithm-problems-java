package johnny.hackerrank.algorithm.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.hackerrank.algorithm.DuplicatedInMatrix;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class DuplicatedInMatrixTest {
    
    public DuplicatedInMatrixTest() {
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
     * Test of duplicated method, of class DuplicatedInMatrix.
     */
    @Test
    public void testDuplicated() {
        System.out.println("duplicated");
        int[][] matrix = null;
        DuplicatedInMatrix instance = new DuplicatedInMatrix();
        boolean expResult = false;
        boolean result = instance.duplicated(matrix, 0);
        assertEquals(expResult, result);
        
        int[][] matrix2 = new int[2][2];
        matrix2[0] = new int[]{1, 2};
        matrix2[1] = new int[]{3, 4};
        assertEquals(false, instance.duplicated(matrix2, 2));
        
        int[][] matrix3 = new int[3][3];
        matrix3[0] = new int[]{1,2,3};
        matrix3[1] = new int[]{4,5,6};
        matrix3[2] = new int[]{5,8,9};
        assertEquals(true, instance.duplicated(matrix3, 2));
        
        int[][] matrix4 = new int[3][3];
        matrix4[0] = new int[]{1,2,5};
        matrix4[1] = new int[]{4,3,6};
        matrix4[2] = new int[]{5,8,9};
        assertEquals(false, instance.duplicated(matrix4, 2));
        
        int[][] matrix5 = new int[3][3];
        matrix5[0] = new int[]{1,2,3};
        matrix5[1] = new int[]{4,5,6};
        matrix5[2] = new int[]{5,8,9};
        assertEquals(false, instance.duplicated(matrix5, 1));
        
        int[][] matrix6 = new int[3][3];
        matrix6[0] = new int[]{1,2,3};
        matrix6[1] = new int[]{4,8,6};
        matrix6[2] = new int[]{5,5,9};
        assertEquals(true, instance.duplicated(matrix6, 1));
        
        int[][] matrix7 = new int[4][3];
        matrix7[0] = new int[]{1,2,3};
        matrix7[1] = new int[]{4,5,6};
        matrix7[2] = new int[]{7,8,9};
        matrix7[3] = new int[]{10,11,12};
        assertEquals(false, instance.duplicated(matrix7, 2));

        int[][] matrix8 = new int[4][3];
        matrix8[0] = new int[]{1,2,3};
        matrix8[1] = new int[]{4,5,6};
        matrix8[2] = new int[]{7,8,11};
        matrix8[3] = new int[]{10,11,12};
        assertEquals(true, instance.duplicated(matrix8, 2));
    }
}
