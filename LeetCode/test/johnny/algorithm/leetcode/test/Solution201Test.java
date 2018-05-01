package johnny.algorithm.leetcode.test;

import static org.junit.Assert.*;
import org.junit.Test;

import johnny.algorithm.leetcode.Solution201;

public class Solution201Test extends JunitBase {

    @Test
    public void testRangeBitwiseAnd() {
        System.out.println("rangeBitwiseAnd");
        Solution201 instance = new Solution201();

        assertEquals(0, instance.rangeBitwiseAnd(0, 0));
        assertEquals(4, instance.rangeBitwiseAnd(5, 7));
        assertEquals(2, instance.rangeBitwiseAnd(2, 3));
        assertEquals(0, instance.rangeBitwiseAnd(0, Integer.MAX_VALUE));
    }
}
