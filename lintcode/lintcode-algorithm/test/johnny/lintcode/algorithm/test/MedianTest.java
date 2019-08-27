package johnny.lintcode.algorithm.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import johnny.lintcode.algorithm.Median;

import static org.junit.Assert.*;

/**
 *
 * @author Johnny
 */
public class MedianTest {
    
    public MedianTest() {
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
     * Test of median method, of class Median.
     */
    @Test
    public void testMedian() {
        System.out.println("median");
        int[] nums = null;
        Median instance = new Median();
        int expResult = -1;
        int result = instance.median(nums);
        assertEquals(expResult, result);
        
        assertEquals(3, instance.median(new int[] {4, 5, 1, 2, 3}));
        assertEquals(5, instance.median(new int[] {7, 9, 4, 5}));
    }
}
