package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class SwapBitsTest extends JunitBase {

    /**
     * Test of swapOddEvenBits method, of class SwapBits.
     */
    @Test
    public void testSwapOddEvenBits() {
        System.out.println("swapOddEvenBits");
        SwapBits instance = new SwapBits();

        assertEquals(0, instance.swapOddEvenBits(0));
        assertEquals(10, instance.swapOddEvenBits(5));
        assertEquals(-3, instance.swapOddEvenBits(-2));
    }
}
