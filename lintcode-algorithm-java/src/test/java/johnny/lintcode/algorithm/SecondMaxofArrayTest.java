package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class SecondMaxofArrayTest extends JunitBase {

    /**
     * Test of secondMax method, of class SecondMaxofArray.
     */
    @Test
    public void testSecondMax() {
        System.out.println("secondMax");
        SecondMaxofArray instance = new SecondMaxofArray();
        
        assertEquals(Integer.MIN_VALUE, instance.secondMax(null));
        assertEquals(1, instance.secondMax(new int[]{1}));
        assertEquals(3, instance.secondMax(new int[]{1,3,2,4}));
        assertEquals(1, instance.secondMax(new int[]{1,2}));
    }
}
