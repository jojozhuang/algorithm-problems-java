package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution565;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution565Test {
    
    public Solution565Test() {
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
     * Test of arrayNesting method, of class Solution565.
     */
    @Test
    public void testArrayNesting() {
        System.out.println("arrayNesting");
        int[] nums = null;
        Solution565 instance = new Solution565();
        int expResult = 0;
        int result = instance.arrayNesting(nums);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.arrayNesting(new int[]{0}));
        assertEquals(1, instance.arrayNesting(new int[]{1}));
        assertEquals(1, instance.arrayNesting(new int[]{0,1,2,3,4,5}));
        assertEquals(2, instance.arrayNesting(new int[]{2,1,0}));
        assertEquals(3, instance.arrayNesting(new int[]{1,2,0}));
        assertEquals(4, instance.arrayNesting(new int[]{5,4,0,3,1,6,2}));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
