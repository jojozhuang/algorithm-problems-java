package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class ReverseIntegerTest extends JunitBase {

    /**
     * Test of reverseInteger method, of class ReverseInteger.
     */
    @Test
    public void testReverseInteger() {
        System.out.println("ReverseInteger");
        ReverseInteger instance = new ReverseInteger();

        assertEquals(321, instance.reverseInteger(123));
        assertEquals(-321, instance.reverseInteger(-123));

    }
}
