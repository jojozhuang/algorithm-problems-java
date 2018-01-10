package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution255;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution255Test {
    
    public Solution255Test() {
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
     * Test of verifyPreorder method, of class Solution255.
     */
    @Test
    public void testVerifyPreorder() {
        System.out.println("verifyPreorder");
        int[] preorder = null;
        Solution255 instance = new Solution255();
        boolean expResult = false;
        boolean result = instance.verifyPreorder(preorder);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.verifyPreorder(new int[]{4,1,2,3,6,5,8}));
        assertEquals(true, instance.verifyPreorder(new int[]{4,1,3,2,6,5,8}));
        assertEquals(false, instance.verifyPreorder(new int[]{4,1,2,3,6,8,5}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
