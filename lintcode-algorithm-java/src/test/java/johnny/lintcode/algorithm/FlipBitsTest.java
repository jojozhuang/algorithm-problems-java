package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class FlipBitsTest extends JunitBase {

    /**
     * Test of bitSwapRequired method, of class FlipBits.
     */
    @Test
    public void testBitSwapRequired() {
        System.out.println("bitSwapRequired");
        int a = 0;
        int b = 0;
        int expResult = 0;
        int result = FlipBits.bitSwapRequired(a, b);
        assertEquals(expResult, result);
        
        assertEquals(1, FlipBits.bitSwapRequired(1, 3));
        assertEquals(2, FlipBits.bitSwapRequired(1, 2));
        assertEquals(3, FlipBits.bitSwapRequired(3, 4));
        assertEquals(2, FlipBits.bitSwapRequired(31, 14));
    }
}
