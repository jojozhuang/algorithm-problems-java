package johnny.lintcode.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class LargestRectangleinHistogramTest {
    
    public LargestRectangleinHistogramTest() {
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
     * Test of largestRectangleArea method, of class LargestRectangleinHistogram.
     */
    @Test
    public void testLargestRectangleArea() {
        System.out.println("largestRectangleArea");
        int[] height = null;
        LargestRectangleinHistogram instance = new LargestRectangleinHistogram();
        int expResult = 0;
        int result = instance.largestRectangleArea(height);
        assertEquals(expResult, result);
        
        assertEquals(2, instance.largestRectangleArea(new int[]{2,0,2}));
        assertEquals(8, instance.largestRectangleArea(new int[]{5,4,1,2}));
        assertEquals(12, instance.largestRectangleArea(new int[]{5,5,1,7,1,1,5,2,7,6}));
    }
}
