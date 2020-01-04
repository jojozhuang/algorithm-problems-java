package johnny.leetcode.algorithm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Solution309Test extends JunitBase {

    @Test
    public void testMaxProfit() {
        System.out.println("maxProfit");
        Solution309 instance = new Solution309();

        //assertEquals(0, instance.maxProfit(null));
        assertEquals(3, instance.maxProfit(new int[]{1, 2, 3, 0, 2}));
        assertEquals(4, instance.maxProfit(new int[]{1, 2, 5, 0, 2}));
    }
}
