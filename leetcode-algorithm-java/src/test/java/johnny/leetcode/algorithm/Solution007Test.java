package johnny.leetcode.algorithm;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.leetcode.algorithm.Solution007;

public class Solution007Test extends JunitBase {

    @Test
    public void testReverse() {
        System.out.println("reverse");
        Solution007 instance = new Solution007();

        assertEquals(0, instance.reverse(0));
        assertEquals(321, instance.reverse(123));
        assertEquals(2, instance.reverse(2));
        assertEquals(0, instance.reverse(0));
        assertEquals(-1, instance.reverse(-1));
        assertEquals(1, instance.reverse(100));
        assertEquals(-9, instance.reverse(-900));
        assertEquals(-6007488, instance.reverse(-8847006));
        assertEquals(0, instance.reverse(2147483647));
        assertEquals(2143847412, instance.reverse(2147483412));
        assertEquals(0, instance.reverse(-2147483648));
        assertEquals(-2143847412, instance.reverse(-2147483412));
    }
}
