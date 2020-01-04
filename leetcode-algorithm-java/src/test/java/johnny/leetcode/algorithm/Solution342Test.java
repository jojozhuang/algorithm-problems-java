package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution342Test extends JunitBase {

    @Test
    public void testIsPowerOfFour() {
        System.out.println("isPowerOfFour");
        Solution342 instance = new Solution342();

        assertEquals(false, instance.isPowerOfFour(0));
        assertEquals(false, instance.isPowerOfFour(2));
        assertEquals(true, instance.isPowerOfFour(4));
        assertEquals(false, instance.isPowerOfFour(5));
        assertEquals(false, instance.isPowerOfFour(8));
        assertEquals(true, instance.isPowerOfFour(16));
        assertEquals(true, instance.isPowerOfFour(64));
    }
}
