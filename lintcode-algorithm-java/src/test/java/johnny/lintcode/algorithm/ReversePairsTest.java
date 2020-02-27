package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class ReversePairsTest extends JunitBase {

    /**
     * Test of reversePairs method, of class ReversePairs.
     */
    @Test
    public void testReversePairs() {
        System.out.println("reversePairs");
        ReversePairs instance = new ReversePairs();

        assertEquals(0, instance.reversePairs(null));
        assertEquals(0, instance.reversePairs(new int[]{1}));
        assertEquals(1, instance.reversePairs(new int[]{2,1}));
        assertEquals(0, instance.reversePairs(new int[]{2,3}));
        assertEquals(3, instance.reversePairs(new int[]{2,4,1,3,5}));
    }
}
