package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution190;

public class Solution190Test extends JunitBase {

    @Test
    public void testReverseBits() {
        System.out.println("reverseBits");
        Solution190 instance = new Solution190();

        assertEquals(0, instance.reverseBits(0));
        assertEquals(964176192, instance.reverseBits(43261596));
        assertEquals(-2, instance.reverseBits(2147483647));
        assertEquals(1, instance.reverseBits((int)2147483648l));
    }
}
