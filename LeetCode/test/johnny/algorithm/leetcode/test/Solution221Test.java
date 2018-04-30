package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution221;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution221Test {
    
    public Solution221Test() {
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
     * Test of maximalSquare method, of class Solution221.
     */
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
