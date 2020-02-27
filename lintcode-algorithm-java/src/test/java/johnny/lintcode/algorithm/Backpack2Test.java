package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class Backpack2Test extends JunitBase {

    /**
     * Test of backPack2 method, of class Backpack2.
     */
    @Test
    public void testBackPack2() {
        System.out.println("backPack2");
        int m = 0;
        int[] A = null;
        int[] V = null;
        Backpack2 instance = new Backpack2();
        int expResult = 0;
        int result = instance.backPack2(m, A, V);
        assertEquals(expResult, result);
        
        assertEquals(9, instance.backPack2(10, new int[]{2,3,5,7}, new int[]{1,5,2,4}));
    }
}
