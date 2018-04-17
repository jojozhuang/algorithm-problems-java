package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution302;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution302Test {
    
    public Solution302Test() {
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
     * Test of minArea method, of class Solution302.
     */
    @Test
    public void testMinArea() {
        System.out.println("minArea");
        char[][] image = null;
        int x = 0;
        int y = 0;
        Solution302 instance = new Solution302();
        int expResult = 0;
        int result = instance.minArea(image, x, y);
        assertEquals(expResult, result);
        
        char[][] image2 = new char[][] {
            {'0','0','1','0'},
            {'0','1','1','0'},
            {'0','1','0','0'}
        };
        assertEquals(6, instance.minArea(image2, 0, 2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}