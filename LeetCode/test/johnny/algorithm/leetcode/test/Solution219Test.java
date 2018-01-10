package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution219;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution219Test {
    
    public Solution219Test() {
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
     * Test of containsNearbyDuplicate method, of class Solution219.
     */
    @Test
    public void testContainsNearbyDuplicate() {
        System.out.println("containsNearbyDuplicate");
        Solution219 instance = new Solution219();

        assertEquals(false, instance.containsNearbyDuplicate(null, 0));
        
        assertEquals(false, instance.containsNearbyDuplicate(new int[]{1,2}, 1));
        assertEquals(false, instance.containsNearbyDuplicate(new int[]{1,2,1}, 1));
        assertEquals(true, instance.containsNearbyDuplicate(new int[]{1,2,1}, 2));
        assertEquals(true, instance.containsNearbyDuplicate(new int[]{1,2,3,4,5,1}, 5));
        assertEquals(false, instance.containsNearbyDuplicate(new int[]{1,2,3,4,5,1}, 3));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
