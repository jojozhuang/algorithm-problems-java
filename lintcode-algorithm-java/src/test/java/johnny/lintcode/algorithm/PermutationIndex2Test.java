package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Johnny
 */
public class PermutationIndex2Test extends JunitBase {

    /**
     * Test of permutationIndex2 method, of class PermutationIndex2.
     */
    @Test
    public void testPermutationIndex2() {
        System.out.println("permutationIndex2");
        int[] A = null;
        PermutationIndex2 instance = new PermutationIndex2();
        long expResult = 0L;
        long result = instance.permutationIndex2(A);
        assertEquals(expResult, result);
        
        assertEquals(1, instance.permutationIndex2(new int[]{1,2}));
        assertEquals(2, instance.permutationIndex2(new int[]{2,1}));
        assertEquals(1, instance.permutationIndex2(new int[]{1,2,3}));
        assertEquals(2, instance.permutationIndex2(new int[]{1,3,2}));
        assertEquals(3, instance.permutationIndex2(new int[]{2,1,3}));
        assertEquals(4, instance.permutationIndex2(new int[]{2,3,1}));
        assertEquals(5, instance.permutationIndex2(new int[]{3,1,2}));
        assertEquals(6, instance.permutationIndex2(new int[]{3,2,1}));
        assertEquals(12, instance.permutationIndex2(new int[]{2,4,3,1}));
        assertEquals(1263957845766L, instance.permutationIndex2(new int[]{22,7,15,10,11,12,14,8,9,1,2,3,6,5,4}));
        assertEquals(1, instance.permutationIndex2(new int[]{1,1}));
        assertEquals(1, instance.permutationIndex2(new int[]{1,1,2}));
        assertEquals(2, instance.permutationIndex2(new int[]{1,2,1}));
        assertEquals(3, instance.permutationIndex2(new int[]{2,1,1}));
        assertEquals(3, instance.permutationIndex2(new int[]{1,4,2,2}));
    }
}
