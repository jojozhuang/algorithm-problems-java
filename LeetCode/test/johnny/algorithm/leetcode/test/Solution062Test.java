package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution062;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution062Test {
    
    public Solution062Test() {
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
     * Test of uniquePaths method, of class Solution062.
     */
    @Test
    public void testUniquePaths() {
        System.out.println("uniquePaths");
        int m = 0;
        int n = 0;
        Solution062 instance = new Solution062();
        int expResult = 0;
        int result = instance.uniquePaths(m, n);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.uniquePaths(1, 1));
        assertEquals(1, instance.uniquePaths(3, 1));
        assertEquals(1, instance.uniquePaths(1, 4));
        assertEquals(2, instance.uniquePaths(2, 2));
        assertEquals(3, instance.uniquePaths(3, 2));
        assertEquals(3, instance.uniquePaths(2, 3));
        assertEquals(6, instance.uniquePaths(3, 3));
        assertEquals(86493225, instance.uniquePaths(19, 13));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
