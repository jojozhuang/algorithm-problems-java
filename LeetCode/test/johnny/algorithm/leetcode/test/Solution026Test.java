package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution026;

import static org.junit.Assert.*;


/**
 *
 * @author Johnny
 */
public class Solution026Test {
    
    public Solution026Test() {
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
     * Test of removeDuplicates method, of class Solution026.
     */
    @Test
    public void testRemoveDuplicates() {
        System.out.println("removeDuplicates");
        Solution026 instance = new Solution026();

        assertEquals(0, instance.removeDuplicates(null));
        
        assertEquals(0, instance.removeDuplicates(new int[]{}));
        assertEquals(1, instance.removeDuplicates(new int[]{1}));
        assertEquals(2, instance.removeDuplicates(new int[]{1,2}));
        assertEquals(4, instance.removeDuplicates(new int[]{1,1,2,3,4}));
        assertEquals(2, instance.removeDuplicates(new int[]{1,1,1,1,3}));
        assertEquals(4, instance.removeDuplicates(new int[]{1,1,3,3,4,4,5}));
        assertEquals(7, instance.removeDuplicates(new int[]{1,2,3,4,5,6,7}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}