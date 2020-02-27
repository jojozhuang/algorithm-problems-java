package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class DecodeWaysTest extends JunitBase {

    /**
     * Test of numDecodings method, of class DecodeWays.
     */
    @Test
    public void testNumDecodings() {
        System.out.println("numDecodings");
        String s = "";
        DecodeWays instance = new DecodeWays();
        int expResult = 0;
        int result = instance.numDecodings(s);
        assertEquals(expResult, result);
        
        assertEquals(0, instance.numDecodings("0"));
        assertEquals(1, instance.numDecodings("10"));
        assertEquals(0, instance.numDecodings("19261001"));
        assertEquals(2, instance.numDecodings("12"));
        assertEquals(5, instance.numDecodings("1213"));
        assertEquals(47923200, instance.numDecodings("2226252724242221201918171615141311108787876761721201211012111989898911918293"));
    }
}
