package johnny.algorithm.leetcode.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution365;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class Solution365Test {
    
    public Solution365Test() {
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
     * Test of canMeasureWater method, of class Solution365.
     */
    @Test
    public void testCanMeasureWater() {
        System.out.println("canMeasureWater");
        int x = 0;
        int y = 0;
        int z = 0;
        Solution365 instance = new Solution365();
        boolean expResult = true;
        boolean result = instance.canMeasureWater(x, y, z);
        assertEquals(expResult, result);
        
        assertEquals(true, instance.canMeasureWater(3, 5, 4));
        assertEquals(false, instance.canMeasureWater(2, 6, 5));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
