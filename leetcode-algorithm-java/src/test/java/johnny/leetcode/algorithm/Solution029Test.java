package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution029Test extends JunitBase {

    @Test
    public void testDivide() {
        System.out.println("divide");
        Solution029 instance = new Solution029();

        assertEquals(0, instance.divide(0, 1));
        assertEquals(Integer.MAX_VALUE, instance.divide(13, 0));
        assertEquals(6, instance.divide(13, 2));
        assertEquals(0, instance.divide(1, 2));
        assertEquals(1, instance.divide(4, 4));
        assertEquals(1, instance.divide(7, 4));
        assertEquals(4, instance.divide(4, 1));
        assertEquals(15, instance.divide(63, 4));
        assertEquals(-15, instance.divide(63, -4));
        assertEquals(12, instance.divide(63, 5));
        assertEquals(Integer.MAX_VALUE, instance.divide(Integer.MAX_VALUE, 1));
        assertEquals(-Integer.MAX_VALUE, instance.divide(Integer.MAX_VALUE, -1));
        assertEquals(Integer.MIN_VALUE, instance.divide(Integer.MIN_VALUE, 1));
        assertEquals(Integer.MAX_VALUE, instance.divide(Integer.MIN_VALUE, -1));
    }
}
