package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class MedianTest extends JunitBase {

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
