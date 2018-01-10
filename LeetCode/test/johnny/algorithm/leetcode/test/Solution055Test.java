package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution055;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution055Test {
    
    public Solution055Test() {
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
     * Test of canJump method, of class Solution055.
     */
    @Test
    public void testCanJump() {
        System.out.println("canJump");
        Solution055 instance = new Solution055();

        assertEquals(false, instance.canJump(null));
        assertEquals(true, instance.canJump(new int[]{0}));
        assertEquals(true, instance.canJump(new int[]{1}));
        assertEquals(true, instance.canJump(new int[]{1,2}));
        assertEquals(true, instance.canJump(new int[]{1,2,3}));
        assertEquals(false, instance.canJump(new int[]{3,2,1,0,0}));
        assertEquals(true, instance.canJump(new int[]{2,3,1,1,4}));
        assertEquals(false, instance.canJump(new int[]{3,2,1,0,4}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
