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
        Solution365 instance = new Solution365();

        assertEquals(true, instance.canMeasureWater(0, 0, 0));
        assertEquals(true, instance.canMeasureWater(3, 5, 4));
        assertEquals(false, instance.canMeasureWater(2, 6, 5));
    }
}
