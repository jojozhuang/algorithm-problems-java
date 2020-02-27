package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class UglyNumber2Test extends JunitBase {
    /**
     * Test of nthUglyNumber method, of class UglyNumber2.
     */
    @Test
    public void testNthUglyNumber() {
        System.out.println("nthUglyNumber");
        int n = 0;
        UglyNumber2 instance = new UglyNumber2();
        int expResult = 1;
        int result = instance.nthUglyNumber(n);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.nthUglyNumber(1));
        assertEquals(2, instance.nthUglyNumber(2));
        assertEquals(5, instance.nthUglyNumber(5));
        assertEquals(10, instance.nthUglyNumber(9));
        assertEquals(150, instance.nthUglyNumber(41));
    }
}
