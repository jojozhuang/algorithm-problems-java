package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution356;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution356Test {
    
    public Solution356Test() {
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
     * Test of isReflected method, of class Solution356.
     */
    @Test
    public void testIsReflected() {
        System.out.println("isReflected");
        int[][] points = null;
        Solution356 instance = new Solution356();
        boolean expResult = false;
        boolean result = instance.isReflected(points);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.isReflected(new int[][]{{1,1},{-1,1}}));
        assertEquals(false, instance.isReflected(new int[][]{{1,1},{-1,-1}}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
