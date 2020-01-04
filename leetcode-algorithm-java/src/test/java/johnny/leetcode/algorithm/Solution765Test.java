package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution765Test extends JunitBase {

    @Test
    public void test() {
        System.out.println("minSwapsCouples");
        Solution765 instance = new Solution765();

        assertEquals(1, instance.minSwapsCouples(new int[] {0, 2, 1, 3}));
        assertEquals(0, instance.minSwapsCouples(new int[] {3, 2, 0, 1}));
    }
}
