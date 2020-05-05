package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution201Test extends JunitBase {

    @Test
    public void testRangeBitwiseAnd() {
        System.out.println("rangeBitwiseAnd");
        Solution201 instance = new Solution201();

        assertEquals(0, instance.rangeBitwiseAnd(0, 0));
        assertEquals(4, instance.rangeBitwiseAnd(5, 7));
        assertEquals(2, instance.rangeBitwiseAnd(2, 3));
        assertEquals(0, instance.rangeBitwiseAnd(0, Integer.MAX_VALUE));
        assertEquals(Integer.MAX_VALUE - 1, instance.rangeBitwiseAnd(Integer.MAX_VALUE - 1, Integer.MAX_VALUE));
    }
}
