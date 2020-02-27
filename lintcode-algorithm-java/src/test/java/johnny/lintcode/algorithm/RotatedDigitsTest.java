package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class RotatedDigitsTest extends JunitBase {

    /**
     * Test of rotatedDigits method, of class RotatedDigits.
     */
    @Test
    public void testRotatedDigits() {
        System.out.println("testRotatedDigits");
        RotatedDigits instance = new RotatedDigits();

        assertEquals(4, instance.rotatedDigits(10));
        assertEquals(2, instance.rotatedDigits(5));
    }
}
