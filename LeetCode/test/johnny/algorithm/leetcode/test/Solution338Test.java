package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution338;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution338Test {
    
    public Solution338Test() {
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
     * Test of countBits method, of class Solution338.
     */
    @Test
    public void testCountBits() {
        System.out.println("countBits");
        int num = 0;
        Solution338 instance = new Solution338();
        int[] expResult = new int[1];
        int[] result = instance.countBits(num);
        assertArrayEquals(expResult, result);
        
        assertArrayEquals(new int[]{0,1,1,2,1,2,2,3}, instance.countBits(7));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
