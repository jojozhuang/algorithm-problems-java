package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution303;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution303Test {
    
    public Solution303Test() {
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
     * Test of sumRange method, of class Solution303.
     */
    @Test
    public void testSumRange() {
        System.out.println("sumRange");
        int i = 0;
        int j = 0;
        Solution303 instance = new Solution303(new int[]{});
        int expResult = 0;
        int result = instance.sumRange(i, j);
        assertEquals(expResult, result);
        
        Solution303 instance2 = new Solution303(new int[]{1});
        assertEquals(1, instance2.sumRange(0, 0));
        assertEquals(0, instance2.sumRange(0, 1));
        
        Solution303 instance3 = new Solution303(new int[]{1,2,3,4,5});
        assertEquals(3, instance3.sumRange(0, 1));
        assertEquals(6, instance3.sumRange(0, 2));
        assertEquals(9, instance3.sumRange(3, 4));
        
        Solution303 instance4 = new Solution303(new int[]{-2, 0, 3, -5, 2, -1});
        assertEquals(1, instance4.sumRange(0, 2));
        assertEquals(-1, instance4.sumRange(2, 5));
        assertEquals(-3, instance4.sumRange(0, 5));
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
