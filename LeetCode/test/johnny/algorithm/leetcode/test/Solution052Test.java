package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution052;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution052Test {
    
    public Solution052Test() {
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
     * Test of totalNQueens method, of class Solution052.
     */
    @Test
    public void testTotalNQueens() {
        System.out.println("totalNQueens");
        Solution052 instance = new Solution052();

        assertEquals(0, instance.totalNQueens(0));
        assertEquals(1, instance.totalNQueens(1));
        assertEquals(0, instance.totalNQueens(2));
        assertEquals(0, instance.totalNQueens(3));
        assertEquals(2, instance.totalNQueens(4));
    }
}
