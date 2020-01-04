package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution313Test extends JunitBase {

    @Test
    public void testNthSuperUglyNumber() {
        System.out.println("nthSuperUglyNumber");
        Solution313 instance = new Solution313();

        assertEquals(0, instance.nthSuperUglyNumber(0, null));
        assertEquals(32, instance.nthSuperUglyNumber(12, new int[]{2, 7, 13, 19}));
    }
}
