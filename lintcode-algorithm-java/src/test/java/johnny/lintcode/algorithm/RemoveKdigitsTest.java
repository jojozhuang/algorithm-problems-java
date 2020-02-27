package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class RemoveKdigitsTest extends JunitBase {

    /**
     * Test of removeKdigits method, of class RemoveKdigits.
     */
    @Test
    public void testRemoveKdigits() {
        System.out.println("testRemoveKdigits");
        RemoveKdigits instance = new RemoveKdigits();

        assertEquals("1219", instance.removeKdigits("1432219", 3));
        assertEquals("200", instance.removeKdigits("10200", 1));
        assertEquals("0", instance.removeKdigits("10", 2));
        assertEquals("0", instance.removeKdigits("637824056", 8));
    }
}
