package johnny.lintcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 *
 * @author Johnny
 */
public class InterleavingPositiveandNegativeNumbersTest extends JunitBase {

    /**
     * Test of rerange method, of class InterleavingPositiveandNegativeNumbers.
     */
    @Test
    public void testRerange() {
        System.out.println("rerange");
        int[] A = null;
        InterleavingPositiveandNegativeNumbers instance = new InterleavingPositiveandNegativeNumbers();
        instance.rerange(A);
        
        int[] A2 = new int[] {-33,-19,30,26,21,-9};
        instance.rerange(A2);
        int[] expected2 = new int[] {-33,30,-19,26,-9,21};
        assertArrayEquals(expected2, A2);
    }
}
